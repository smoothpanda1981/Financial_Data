package com.yan.wang.financialdata.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ywang on 07.05.16.
 */
public class App {
    public static void main(String[] args) {

        String springConfig = "spring/batch/job-report.xml";

        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

    }
}
