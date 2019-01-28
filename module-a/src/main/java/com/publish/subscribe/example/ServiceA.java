package com.publish.subscribe.example;

import com.publish.subscribe.example.events.CustomEvent;
import com.publish.subscribe.example.events.CustomEventB;
import com.publish.subscribe.example.events.CustomEventC;
import com.publish.subscribe.example.publisher.CustomEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceA implements Runnable {

  @Autowired
  private CustomEventPublisher publisher;

  private void doSomethingAndPublish(CustomEvent event) {
    publisher.publishEvent(event);
  }

  @Override
  public void run() {
    final CustomEvent eventB = new CustomEventB(this, "Custom Event B");
    doSomethingAndPublish(eventB);
    final CustomEvent eventC = new CustomEventC(this, "Custom Event C");
    doSomethingAndPublish(eventC);
  }
}
