package Web;
import Duo.CourseDuo;
import Model.Course;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/add")
public class CourseServlet extends HttpServlet{


    public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
        String cou = request.getParameter("course");
        String owner = request.getParameter("owner");
        String institute = request.getParameter("institute");
        String category = request.getParameter("category");
        String duration = request.getParameter("duration");

        Course course = new Course(cou,owner,institute,category,duration);

        try {
            CourseDuo duo = new CourseDuo();
            duo.addCourse(course);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
