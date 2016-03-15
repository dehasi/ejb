
import magic.HelloService;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class EntryPoint {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        HelloService service = container.instance().select(HelloService.class).get();
        service.doSmth("R2D2");
        weld.shutdown();
    }
}
