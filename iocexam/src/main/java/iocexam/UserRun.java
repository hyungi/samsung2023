package iocexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import iocexam.config.UserConfig;
import iocexam.controller.UserController;

public class UserRun {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
		
		UserController controller = context.getBean(UserController.class);
		controller.joinUser();
	}

}
