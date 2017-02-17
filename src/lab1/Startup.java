package lab1;

/**
 *
 * @author FA
 */
public class Startup {

    public static void main(String[] args) {
        IntroToProgrammingCourse prg = new IntroToProgrammingCourse();

        AdvancedJavaCourse adv = new AdvancedJavaCourse();
        
        IntroJavaCourse intJava = new IntroJavaCourse();
        
        College col =new College(prg);
        prg.setCourseNum("123445");
        System.out.println(adv.getCourseName()+" "+prg.getCourseName()+" "+intJava.getCourseName());
        System.out.println(adv.getCourseName()+prg.getCourseName()+prg.declareCoursePrerequisites());
        System.out.println(prg.getCourseNum());
    }
}
