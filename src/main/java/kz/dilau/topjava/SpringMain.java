package kz.dilau.topjava;

import kz.dilau.topjava.model.Role;
import kz.dilau.topjava.model.User;
import kz.dilau.topjava.repository.UserRepository;
import kz.dilau.topjava.service.UserService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx= new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("Bean definition names: " + Arrays.toString(appCtx.getBeanDefinitionNames()));
        UserRepository userRepository = appCtx.getBean(UserRepository.class);
        userRepository.getAll();
        UserService userService = appCtx.getBean(UserService.class);
        userService.create(new User(null, "userName", "email@mail.ru", "password", Role.ADMIN));

        appCtx.close();

    }

}
