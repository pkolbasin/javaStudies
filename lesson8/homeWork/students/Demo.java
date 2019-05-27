package lesson8.homeWork.students;

import java.util.Date;

public class Demo {

    Student student1 = new Student("Torry", "Black", 1, null);
    Student student2 = new Student("Sasha", "Grey", 1, null);
    Student student3 = new Student("Kayden", "Kross", 1, null);
    Student[] students1 = {student1, student2};
    Student[] students2 = {student2, student3};


    Course course1 = new Course(new Date(), "Math", 38, "Andrej", students1);
    Course course2 = new Course(new Date(), "Language", 40, "Iohan", students2);
    Course[] courses1 = {course1, course2};

    public Student createHighestParent() {
        Student student = new Student("Torry", "Black", 69, courses1);
        return student;
    }

    public SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent("John", "Lennon", 1, courses1, 12345, "jon@gmail.com");
        return specialStudent;
    }


}
