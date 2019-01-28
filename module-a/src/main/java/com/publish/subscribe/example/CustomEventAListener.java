package com.publish.subscribe.example;

import com.publish.subscribe.example.events.CustomEventA;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventAListener implements ApplicationListener<CustomEventA> {

  @Override
  public void onApplicationEvent(CustomEventA event) {
    System.out.println("CustomEventAListener: Custom Event Occurred:" + event.getEventMessage());
  }
}
