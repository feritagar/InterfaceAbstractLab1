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

        College col = new College();
        
        intJava.declareCoursePrerequisites();
        System.out.println(intJava.getPrerequisites());
        
    }
}
