package ejbbeans;

import javax.ejb.Remote;

@Remote
public interface Salutation {
    String getFormalSalutation(String name);

    String getInformalSalutation(String name);
}
