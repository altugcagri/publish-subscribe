package com.publish.subscribe.example.publisher;

import com.publish.subscribe.example.events.CustomEvent;

public interface CustomEventPublisher {

  void publishEvent(CustomEvent event);

}
