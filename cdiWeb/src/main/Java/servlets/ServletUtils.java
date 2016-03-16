package servlets;

import beans.banks.Bank;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletUtils {
    public static void sendBankNameResoponse (HttpServletRequest req, HttpServletResponse resp, Bank bank) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + bank.getName() + "</h1>");
    }

}
