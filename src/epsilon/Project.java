package epsilon;

/**
 * Created by ronald on 08/01/17.
 */
public class Project {

    public Project() {

        Developer developer = new Developer();
        developer.developerMethod(this);
    }

    public static void main(String[] args) {
        Project project = new Project();
    }
}
/**
 * This is called passing an object of class into another class's method WITHOUT interface or inheritance!!!
 */
