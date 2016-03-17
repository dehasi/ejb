package ejbbeans;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class LoggingInterceptor {

    @AroundInvoke
    public Object intercept(
            InvocationContext ctx) throws Exception {

        System.err.println("LoggingInterceptor - before EJB method invoke: "
                + ctx.getMethod().getName());

        Object result = ctx.proceed();

        System.err.println("LoggingInterceptor - after EJB method invoke: "
                + ctx.getMethod().getName());

        return result;
    }
}