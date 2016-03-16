package servlets;


import beans.banks.Bank;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AllBanks  extends HttpServlet {
    @Inject
    @Any
    Instance<Bank> banks;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (Bank bank : banks) {
            ServletUtils.sendBankNameResoponse(req, resp, bank);
        }
    }

}
