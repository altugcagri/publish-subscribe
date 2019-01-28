package com.publish.subscribe.example.publishsubscribe;

import com.publish.subscribe.example.ServiceA;
import com.publish.subscribe.example.ServiceB;
import com.publish.subscribe.example.ServiceC;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component
public class PublishSubscribeApplication {

  private static final ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();


  public static void main(String[] args) {
    taskScheduler.initialize();
    taskScheduler.setWaitForTasksToCompleteOnShutdown(true);
    final ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(PublishSubscribeConfig.class);
    final ServiceA serviceA = context.getBean(ServiceA.class);
    final ServiceB serviceB = context.getBean(ServiceB.class);
    final ServiceC serviceC = context.getBean(ServiceC.class);
    taskScheduler.execute(serviceA);
    taskScheduler.execute(serviceB);
    taskScheduler.execute(serviceC);
    taskScheduler.shutdown();
  }

}

