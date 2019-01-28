package com.publish.subscribe.example;

import com.publish.subscribe.example.events.CustomEventC;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventCListener implements ApplicationListener<CustomEventC> {

  @Override
  public void onApplicationEvent(CustomEventC event) {
    System.out.println("CustomEventCListener: Custom Event Occurred:" + event.getEventMessage());
  }
}
