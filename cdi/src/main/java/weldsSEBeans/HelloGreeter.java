package weldsSEBeans;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.inject.Alternative;

@Alternative
public class HelloGreeter implements Greetable {
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
