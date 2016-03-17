package beans;

import ejbbeans.Salutation;
import org.apache.tomee.embedded.EmbeddedTomEEContainer;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SalutaionTest {

    private Context context;
    private EJBContainer ejbContainer;
    @Before
    public void init () {
        final Properties props = new Properties();
        props.setProperty(EJBContainer.PROVIDER, "tomee-embedded");
        props.setProperty(EmbeddedTomEEContainer.TOMEE_EJBCONTAINER_HTTP_PORT, "-1"); // random port
        props.setProperty(EmbeddedTomEEContainer.APP_NAME, "just_name");
        props.setProperty(EJBContainer.MODULES, "target\\ejbExamples.war");

        ejbContainer = EJBContainer.createEJBContainer(props);

        context = ejbContainer.getContext();
    }

    @Test
    public void salutationTest() throws NamingException {

        Salutation salutation = (Salutation) context.lookup("java:global/ejbExamples/SalutationImpl");
        assertNotNull(salutation);

        String expected = "Dear R2 D2";

        String actual = salutation.getFormalSalutation("R2 D2");
        assertNotNull(actual);
        assertTrue(actual.endsWith(expected));
    }

    @After
    public void shutDown () {
        ejbContainer.close();
    }
}
