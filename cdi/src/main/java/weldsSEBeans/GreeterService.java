package weldsSEBeans;

import javax.inject.Inject;

public class GreeterService {
    @Inject
    Greetable greetable;

    public Greetable getJustGreeter() {
        return greetable;
    }

    public void doSmth(String param) {
        System.out.println(greetable.greet(param));
    }
}
