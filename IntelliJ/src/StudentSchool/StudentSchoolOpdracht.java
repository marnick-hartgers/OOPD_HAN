package StudentSchool;

import processing.core.PApplet;

public class StudentSchoolOpdracht extends PApplet {

    public void setup() {
        School deSchool = new School("ICA");
        Student s1 = new Student("hanneke", 1, "ICA");
        Student s2 = new Student("femke", 2, "ICA");
    }

}
