package servlets;

import beans.banks.Bank;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SberServlet extends HttpServlet {

    @Inject
    @Named("SberBank")
    Bank bank;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.sendBankNameResoponse(req, resp, bank);
    }
}
