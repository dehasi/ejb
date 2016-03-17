package servlets;

import ejbbeans.SimpleBean;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class InterceptiorServlet extends HttpServlet {

    @EJB
    SimpleBean bean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ServletUtils.sendStringResoponse(resp, bean.sayName());
        ServletUtils.sendStringResoponse(resp, bean.sayHello("he;;p"));
    }
}
