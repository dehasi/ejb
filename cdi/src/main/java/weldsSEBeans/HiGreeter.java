package weldsSEBeans;

import javax.enterprise.inject.Default;

@Default
public class HiGreeter implements Greetable {
    public String greet(String name) {
        return "Hi " + name + "!";
    }
}
