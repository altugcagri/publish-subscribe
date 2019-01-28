package com.publish.subscribe.example.publisher;

import com.publish.subscribe.example.events.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomEventPublisherImpl implements CustomEventPublisher {

  @Autowired
  private ApplicationEventPublisher applicationEventPublisher;

  @Override
  public void publishEvent(CustomEvent event) {
    applicationEventPublisher.publishEvent(event);
  }
}
