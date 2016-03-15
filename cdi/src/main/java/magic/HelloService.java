package magic;

import beans.JustGreeter;

import javax.inject.Inject;

public class HelloService {
    @Inject
    JustGreeter justGreeter;
    public void doSmth(String param) {
        System.out.println(justGreeter.greet(param));
    }
}
