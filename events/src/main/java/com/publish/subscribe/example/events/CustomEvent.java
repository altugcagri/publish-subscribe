package com.publish.subscribe.example.events;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

  private final String eventMessage;

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   * @param eventMessage
   */
  public CustomEvent(Object source, String eventMessage) {
    super(source);
    this.eventMessage = eventMessage;
  }

  public String getEventMessage() {
    return eventMessage;
  }

}
