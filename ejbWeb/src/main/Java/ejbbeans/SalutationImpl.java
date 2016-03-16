package ejbbeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class SalutationImpl implements Salutation {

    public String getFormalSalutation(String name) {
        return "Dear " + name;
    }

    public String getInformalSalutation(String name) {
        return "Hi " + name;
    }
}
