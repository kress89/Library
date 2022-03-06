package hr.kreso.ucenje.util;

import hr.kreso.ucenje.facade.UcenjeFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public final class SpringFactory {

    private static UcenjeFacade ucenjeFacade;

    public static UcenjeFacade getUcenjeFacade() {
        if (ucenjeFacade == null) {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("/ucenje-context.xml");
            ucenjeFacade = (UcenjeFacade) ctx.getBean("ucenjeHttpInvoker");
        }
        return ucenjeFacade;
    }

    private SpringFactory() {
    }
}
