
  package com.cpp.Brcm;
  
  import org.springframework.boot.SpringApplication;  

  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import javafx.application.Application;
  
  import javafx.application.Application;
  import javafx.scene.Node;
  import net.rgielen.fxweaver.core.FxControllerAndView;
  import net.rgielen.fxweaver.core.FxWeaver;
  import net.rgielen.fxweaver.spring.InjectionPointLazyFxControllerAndViewResolver;
  import net.rgielen.fxweaver.spring.SpringFxWeaver;
  import org.springframework.beans.factory.InjectionPoint;
  import org.springframework.beans.factory.config.ConfigurableBeanFactory;
  import org.springframework.context.ConfigurableApplicationContext;
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Scope;
  
  @SpringBootApplication 
  public class BrcmApplication {
  
  public static void main(String[] args) {
  //SpringApplication.run(BrcmApplication.class, args);
	  
	 //BrcmApplicationJavaFX.main(args);
	  Application.launch(BrcmApplicationJavaFX.class, args);
  //System.out.println(Greeting.greeting()); 
  }
  @Bean
  public FxWeaver fxWeaver(ConfigurableApplicationContext applicationContext) {
      // Would also work with javafx-weaver-core only:
      // return new FxWeaver(applicationContext::getBean, applicationContext::close);
      return new SpringFxWeaver(applicationContext); 
  }
  
  }
  
 
