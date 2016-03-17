package servlets;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletUtils {
    public static void sendStringResoponse(HttpServletResponse resp, String message) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

}
