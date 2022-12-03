package com.cpp.Brcm;
import javafx.application.Application;

import javafx.application.Platform;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;


public class BrcmApplicationJavaFX extends Application {
	private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {

        applicationContext = new SpringApplicationBuilder(BrcmApplication.class).run();
    }
    
    @Override
    public void start(Stage stage) {
        applicationContext.publishEvent(new StageReadyEvent(stage));
    }
    
    
    static class StageReadyEvent extends ApplicationEvent {
    	public StageReadyEvent(Stage stage) {
    		super(stage);
    	}

		public Stage getStage() {
			// TODO Auto-generated method stub
			return ((Stage) getSource());
		}
    }
    @Override
    public void stop() {
        applicationContext.close();
        Platform.exit();
    }
    
}
