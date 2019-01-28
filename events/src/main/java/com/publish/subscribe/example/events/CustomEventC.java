package com.publish.subscribe.example.events;

public class CustomEventC extends CustomEvent{

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   */
  public CustomEventC(Object source, String eventMessage) {
    super(source, eventMessage);
  }
}
