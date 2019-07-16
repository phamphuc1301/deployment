package org.ivu.deploy.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("file:/home/cuhp/cuhp.properties")
public class DeploymentApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DeploymentApplication.class, args);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        ComponentImpl component = (ComponentImpl) context.getBean("componentImpl");
        component.printValue();
    }

}
