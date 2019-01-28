package com.publish.subscribe.example.events;

public class CustomEventA extends CustomEvent {

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   */
  public CustomEventA(Object source, String eventMessage) {
    super(source, eventMessage);
  }
}
