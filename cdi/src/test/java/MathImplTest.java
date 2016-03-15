import arquillianBeans.MathImpl;
import arquillianBeans.Math;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

@RunWith(Arquillian.class)

public class MathImplTest {
    /**
     * Since Arquillian actually creates JAR files under the covers, the @Deployment
     * is your way of controlling what is included in that Archive. Note, each
     * class utilized in your test case - whether directly or indirectly - must be
     * added to the deployment archive.
     */
    @Deployment
    public static JavaArchive createDeployment()
    {
        return ShrinkWrap.create(JavaArchive.class)
                .addClasses(Math.class, MathImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    // Arquillian enables @Inject directly in the test case class itself!
    @Inject
    Math m;

    @Test
    public void testAdd() throws Exception {
        assertEquals(5, m.add(2, 3));
    }

    public void testSubtract() throws Exception {
        assertEquals(-1, m.subtract(2, 3));
    }

}
