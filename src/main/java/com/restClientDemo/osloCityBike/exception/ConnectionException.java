package com.restClientDemo.osloCityBike.exception;

/**
 * Exception thrown if the library recieves an unexpected HTTP response code.
 */
public class ConnectionException extends RuntimeException {
  public ConnectionException() {
    super();
  }

  public ConnectionException(String message) {
    super(message);
  }

  public ConnectionException(String message, Throwable cause) {
    super(message, cause);
  }
}
