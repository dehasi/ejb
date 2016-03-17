package ejbbeans;

import javax.ejb.Stateless;
import javax.interceptor.ExcludeClassInterceptors;
import javax.interceptor.Interceptors;


@Stateless
@Interceptors(LoggingInterceptor.class)
public class InterceptBean {

    public String sayHello(String name){
        return "Hello " + name;
    }

    @ExcludeClassInterceptors
    public String sayName() {
        return "My name is " + this.getClass().getSimpleName();
    }
}