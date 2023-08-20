package ua.klunniy.springcore.testBean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Serhii Klunniy
 */
public class Main {
    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean springBean = context.getBean("springBean", TestBean.class);

        System.out.println(springBean);
    }
}
