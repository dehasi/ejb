package weldsSEBeans;

import javax.inject.Inject;

public class GreeterService {
    @Inject
    JustGreeter justGreeter;

    public JustGreeter getJustGreeter() {
        return justGreeter;
    }

    public void doSmth(String param) {
        System.out.println(justGreeter.greet(param));
    }
}
