package com.alfy.hello;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Author: Alan Created: 12/3/2014.
 */

@XmlRootElement
public class Json {
  private String message;

  public Json() {
  }

  public Json(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
