package weldsSEBeans;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class EntryPoint {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        GreeterService service = container.instance().select(GreeterService.class).get();
        service.doSmth("R2 D2");
        weld.shutdown();
    }
}
