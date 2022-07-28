package OOP.School;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double note;
    int verbalNote;


    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
    }

    public void addTeacher(Teacher courseTeacher) {
        if (this.prefix.equals(courseTeacher.branch)) {
            this.courseTeacher = courseTeacher;
            //  System.out.println("İşlem başarılı.");
        } else {
            System.out.println("İşlem başarısız!");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni: " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır!");
        }
    }
}
