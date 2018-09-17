package com.restClientDemo.osloCityBike.service;

import com.restClientDemo.osloCityBike.service.repository.OsloCityBikeResourcesBundle;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

/**
 * TODO
 *
 * @author Atila Ekimci
 */
public class OsloCityBikeServiceGenerator {
    public static final OsloCityBikeResourcesBundle OSLO_CITY_BIKE_RESOURCES_BUNDLE = new OsloCityBikeResourcesBundle();
    public static final String BASE_URL = OSLO_CITY_BIKE_RESOURCES_BUNDLE.getBaseUrl();
    public static final String APIKEY_NAME = OSLO_CITY_BIKE_RESOURCES_BUNDLE.getApiKey_Name();
    public static final String APIKEY_VALUE = OSLO_CITY_BIKE_RESOURCES_BUNDLE.getApiKey_Value();

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
        @Override
        public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
            Request original = chain.request();

            // Request customization: add request headers
            Request.Builder requestBuilder = original.newBuilder()
                    .header(APIKEY_NAME, APIKEY_VALUE);

            Request request = requestBuilder.build();
            return chain.proceed(request);
        }
    });

    private static OkHttpClient client = httpClient.build();

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client.newBuilder().build())
            .build();

    public static <S> S createService(Class<S> serviceClass) {
        return retrofit.create(serviceClass);
    }
}
