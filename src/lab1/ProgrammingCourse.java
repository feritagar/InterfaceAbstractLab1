/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author FA
 */
public abstract class ProgrammingCourse {
    
    private String courseName;
    private String courseNum;
    private int credits;
    private String prerequisites;
    

    private String courseInfo() {
        return courseName + " " + courseNum + " " + credits;

    }
    
    public abstract String declareCoursePrerequisites();
    

    public String getCourseName() {
        return courseName;
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

}
