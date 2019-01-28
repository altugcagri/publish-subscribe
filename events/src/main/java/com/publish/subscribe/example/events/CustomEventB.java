package com.publish.subscribe.example.events;

public class CustomEventB extends CustomEvent {

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   */
  public CustomEventB(Object source, String eventMessage) {
    super(source, eventMessage);
  }
}
