package com.cpp.Brcm;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;

import java.io.IOException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import com.cpp.Brcm.BrcmApplicationJavaFX.StageReadyEvent;

@Component
public class PrimaryStageInitializer implements ApplicationListener<StageReadyEvent> {

   // private final FxWeaver fxWeaver;
    @Value("classpath:/FXML/LandingPageController.fxml")
	private Resource homePageResource;
	private String applicationTitle;
	private ApplicationContext applicationContext;
	
	public PrimaryStageInitializer(@Value("${spring.application.ui.title}") String applicationTitle, ApplicationContext applicationContext) {
		this.applicationTitle = applicationTitle;
		this.applicationContext = applicationContext;
	}

    //@Autowired
    //public PrimaryStageInitializer(FxWeaver fxWeaver) { //(1)
    //    this.fxWeaver = fxWeaver;
    //}

    @Override
    public void onApplicationEvent(StageReadyEvent event) { //(2)
        Stage stage = event.getStage();
        
        try {
			FXMLLoader fxmlLoader = new FXMLLoader(homePageResource.getURL());
		
			//fxmlLoader.setControllerFactory(aClass -> applicationContext.getBean(aClass));
        Parent parent = fxmlLoader.load();
		stage.setScene(new Scene(parent, 800, 600));
		stage.setTitle(applicationTitle);
		stage.show();
        } catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException();
		}
        //Scene scene = new Scene(fxWeaver.loadView(HomePageController.class), 400, 300); //(3)
        //stage.setScene(scene);
        //stage.show();
    }
}