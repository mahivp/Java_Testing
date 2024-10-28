import javax.print.attribute.standard.MediaSize;

public class College {
    String name;
    int students = 2000;
    boolean isPublic = true;

    College() {

    }
    College(int studentsCount){ students = studentsCount; }


    public static void main(String[] args) {
        College Engneering = new College();
        System.out.println(Engneering.students);

        College Arts = new College( 1000);
        System.out.println(Arts.students);

        College MBA = new College();
        System.out.println(MBA.students);
        College Medical = new College(4000);
        System.out.println(Medical.students);

    }
}
