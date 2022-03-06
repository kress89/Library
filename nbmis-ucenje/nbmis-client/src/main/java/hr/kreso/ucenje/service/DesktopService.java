package hr.kreso.ucenje.service;

import hr.kreso.ucenje.facade.UcenjeFacade;
import hr.kreso.ucenje.model.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
public class DesktopService {
    private static Logger log = LoggerFactory.getLogger(DesktopService.class);

    @Autowired
    UcenjeFacade ucenjeFacade;

    @Async("desktopTaskExecutor")
    public CompletableFuture<Book> selectByPrimaryKey(Map<String, Object> params, long millis ){
        String threadName = Thread.currentThread().getName();

        log.info("Execute method asynchronously - " + threadName);

        try{
            Thread.sleep(millis);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        List<Book> book = ucenjeFacade.fetchBooksByCriteria(params);
        CompletableFuture<Book> completableFuture = new CompletableFuture<>();
        completableFuture.complete((Book) book);

        log.info("Thread " + threadName + " finished ");

        return completableFuture;

    }
}
