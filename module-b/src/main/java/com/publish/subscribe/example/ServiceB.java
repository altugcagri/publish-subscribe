package com.publish.subscribe.example;

import com.publish.subscribe.example.events.CustomEvent;
import com.publish.subscribe.example.events.CustomEventA;
import com.publish.subscribe.example.events.CustomEventC;
import com.publish.subscribe.example.publisher.CustomEventPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceB implements Runnable{

  @Autowired
  private CustomEventPublisher publisher;

  private void doSomethingAndPublish(CustomEvent event) {
    publisher.publishEvent(event);
  }

  @Override
  public void run() {
    final CustomEvent eventA =new CustomEventA(this, "Custom Event A");
    doSomethingAndPublish(eventA);
    final CustomEvent eventC =new CustomEventC(this, "Custom Event C");
    doSomethingAndPublish(eventC);
  }
}
