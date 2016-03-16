package servlets;

import beans.banks.Bank;
import beans.qualifiers.Sber;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DoubleBankServlet extends HttpServlet {
    @Inject @Sber Bank bank1;
    @Inject @Sber Bank bank2;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletUtils.sendBankNameResoponse(req, resp, bank1);
        ServletUtils.sendBankNameResoponse(req, resp, bank2);
    }
}
