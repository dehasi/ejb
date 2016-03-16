package servlets;


import beans.banks.Bank;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class AllBanks  extends HttpServlet {
    List<Bank> banks;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        for (Bank bank : banks) {
            ServletUtils.sendBankNameResoponse(req, resp, bank);
        }
    }

}
