package weldsSEBeans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JustGreeter {
    public String greet(String name) {
        return "Hello " + name + "!";
    }

    @PostConstruct
    public void init() {
        System.out.println("@PostConstruct is called...");
    }

    @PreDestroy
    public void dispose() {
        System.out.println("@PreDestroy is called...");
    }
}
