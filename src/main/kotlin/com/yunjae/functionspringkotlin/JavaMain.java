package com.yunjae.functionspringkotlin;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

public class JavaMain {
    /*public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(FunctionSpringKotlinApplication.class)
                .initializers(new ApplicationContextInitializer<GenericApplicationContext>() {
                    @Override
                    public void initialize(GenericApplicationContext gac) {

                        for (int i = 0; i < 10; i++) {
                            gac.registerBean("name_" + i , ApplicationRunner.class, indexRunner(i));
                        }


                        *//*if (Math.random() > .5) {
                            gac.registerBean(ApplicationRunner.class, new Supplier<ApplicationRunner>() {
                                @Override
                                public ApplicationRunner get() {
                                    return new ApplicationRunner() {
                                        @Override
                                        public void run(ApplicationArguments args) throws Exception {
                                            System.out.println("hello world");
                                        }
                                    };
                                }
                            });
                        }*//*

                    }
                })
                .run(args);
    }

    private static Supplier<ApplicationRunner> indexRunner(int i) {
        return () -> (ApplicationRunner) args -> System.out.println("hello, " + i);
    }*/


 /*   @Bean
    ApplicationRunner runner() {
        return args -> System.out.println("hello world");
    }*/
}
