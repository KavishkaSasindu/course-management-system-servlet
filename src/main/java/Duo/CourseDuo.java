package Duo;

import Model.Course;
import db.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CourseDuo {

    Connection conn = null;

    public CourseDuo()throws SQLException{
        conn = DbConnection.getConnection();
    }

    public void addCourse(Course course) throws SQLException {
        String sqlQuery = "INSERT INTO course(course,owner,institute,category,duration) VALUES(?,?,?,?,?)";

       try{
           PreparedStatement stmt = conn.prepareStatement(sqlQuery);
           stmt.setString(1,course.getCourse());
           stmt.setString(2, course.getOwner());
           stmt.setString(3,course.getInstitute());
           stmt.setString(4,course.getCategory());
           stmt.setString(5, course.getDuration());

           int insertRow = stmt.executeUpdate();
           if(insertRow>0){
               System.out.println("Course Added Success");
           }else{
               System.out.println("Course not added");
           }
       }catch(Exception e){
           e.printStackTrace();
           System.out.println(e.getMessage());
       }
    }
}
