package hr.kreso.ucenje;

import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.Author;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Ovo je samo za testiranje!!
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/config/ucenje-context.xml");
        UcenjeFacade ucenjeFacade = (UcenjeFacade) ctx.getBean("ucenjeFacade");

        Map<String, Object> params = new HashMap<>();
        params.put("id", 2);
        List<Author> authors = ucenjeFacade.fetchAuthorsByCriteria(params);




        System.out.println(authors);
    }
}
