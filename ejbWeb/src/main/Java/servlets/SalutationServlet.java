package servlets;

import ejbbeans.Salutation;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SalutationServlet extends HttpServlet {
    @EJB
    private Salutation salutation;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.sendStringResoponse( resp, salutation.getFormalSalutation("R2 D2"));
    }

}
