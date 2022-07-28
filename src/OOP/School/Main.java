package OOP.School;

public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Akın", "555", "TRH");
        Teacher teacher2 = new Teacher("Erkan", "666", "FZK");
        Teacher teacher3 = new Teacher("Zümrüt", "777", "BIO");

        Course history = new Course("Tarih", "101", "TRH");
        Course historyVerbalNote = new Course("Tarih", "101", "TRH");

        Course physiscs = new Course("Fizik", "102", "FZK");
        Course physicsVerbalNote = new Course("Fizik", "102", "FZK");

        Course biology = new Course("Biyoloji", "103", "BIO");
        Course biologyVerbalNote = new Course("Biyoloji", "103", "BIO");

        history.addTeacher(teacher1);
        physiscs.addTeacher(teacher2);
        biology.addTeacher(teacher3);

        history.printTeacher();
        physiscs.printTeacher();
        biology.printTeacher();
        System.out.println("======================================");


        Student student1 = new Student("Öğrenci Akın", "148", "11-B", history, physiscs, biology, historyVerbalNote, physicsVerbalNote, biologyVerbalNote);
        Student student2 = new Student("Öğrenci Öykü", "100", "0-B", history, physiscs, biology, historyVerbalNote, physicsVerbalNote, biologyVerbalNote);

        student1.addBulkExamNote(100, 80, 100, 100, 90, 90);
        student1.printNote();
        student2.addBulkExamNote(60, 80, 34, 50, 98, 90);
        student2.printNote();


    }
}
