package arquillianBeans;

/**
 * Created by Rafa on 16.03.2016.
 */
public class MathImpl implements Math{
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
