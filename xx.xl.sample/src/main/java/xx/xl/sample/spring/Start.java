package xx.xl.sample.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("applicationContext.xml");
        FundService fundService = (FundService) beanFactory.getBean("fundServiceImpl");
        fundService.recharge(10l);
        System.out.println();
    }
}
