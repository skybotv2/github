package github; // if this causes a mismatch with your folder layout, you can remove this line

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A simple servlet that shows a form and echoes user input.
 *
 * Map this servlet to /echo in web.xml (recommended for WebLogic 12c/14c),
 * or add a @WebServlet annotation if your WebLogic version supports it.
 */
public class TestChatGPT extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // Show the form page
        req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String input = req.getParameter("input");
        req.setAttribute("input", input);
        // Show the result page
        req.getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
