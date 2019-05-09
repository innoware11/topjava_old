package ru.javawebinar.topjava;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.javawebinar.topjava.repository.mock.MockUserRepository;
import ru.javawebinar.topjava.service.UserMealServiceImpl;

import java.util.Arrays;

public class SpringMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext appCtx = new ClassPathXmlApplicationContext("spring/spring-app.xml");
        System.out.println("\n" + Arrays.toString(appCtx.getBeanDefinitionNames()) + "\n");
        MockUserRepository mockUserRepository = (MockUserRepository) appCtx.getBean("mockUserRepository");
        mockUserRepository = appCtx.getBean(MockUserRepository.class);

        UserMealServiceImpl userMealService = appCtx.getBean(UserMealServiceImpl.class);
        System.out.println();
        System.out.println(userMealService.getRepository());

        appCtx.close();
    }
}
