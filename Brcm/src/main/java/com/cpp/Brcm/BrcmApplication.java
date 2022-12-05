
  package com.cpp.Brcm;
  
  import org.springframework.boot.SpringApplication;  

<<<<<<< HEAD


@SpringBootApplication
public class BrcmApplication  {

	  
	public static void main(String[] args) {
		SpringApplication.run(BrcmApplication.class, args);
		//System.out.println(Greeting.greeting());
		//System.out.println();
	}
	
	

}
=======
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
  
  
>>>>>>> cda194bb1eae013a39b8f964dd37ab9c340e35c3
