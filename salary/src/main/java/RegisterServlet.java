import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从Request获取参数
        String name = req.getParameter("name");
        String birthDayString = req.getParameter("birthday");
        Date birthDay = null;
        try {
            birthDay = new SimpleDateFormat("yyyy-MM-dd").parse(birthDayString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        User user = new User();
        user.setBirthDay(birthDay);
        user.setName(name);
        System.out.println("Name is " + name + " and birDay is " + birthDay);

        req.setAttribute("user", user);
        req.getRequestDispatcher("/views/user.jsp").forward(req, resp);

    }
}
