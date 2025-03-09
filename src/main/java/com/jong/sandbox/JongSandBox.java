package com.jong.sandbox;

import java.util.concurrent.CompletableFuture;

import javax.annotation.PostConstruct;

import org.springframework.core.task.TaskRejectedException;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JongSandBox {


    @PostConstruct
    public void executeSandBox(){
        try {
            CompletableFuture.supplyAsync(this::methodAsync)
                             .exceptionally(e -> {
                                 log.warn(e.getMessage());
                                 log.warn("[Jong SandBox] exceptionally clause");
                                 return null;
                             });
        } catch(TaskRejectedException ex) {
            log.warn("[Jong SandBox] try-catch clause");
        }
    }

    private Long methodAsync(){
        throw new TaskRejectedException("test");
    }
}
