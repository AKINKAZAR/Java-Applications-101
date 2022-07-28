package OOP.School;

public class Student {
    Course history;
    Course physics;
    Course biology;
    Course historyVerbalNote;
    Course physicsVerbalNote;
    Course biologyVerbalNote;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course history, Course physics, Course biology, Course historyVerbalNote, Course physicsVerbalNote, Course biologyVerbalNote) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.history = history;
        this.physics = physics;
        this.biology = biology;
        this.historyVerbalNote = historyVerbalNote;
        this.physicsVerbalNote = physicsVerbalNote;
        this.biologyVerbalNote = biologyVerbalNote;
        calcAverage();
        this.isPass = false;
    }

    public void addBulkExamNote(double history, double historyVerbalNote, double physics, double physicsVerbalNote, double biology, double biologyVerbalNote) {
        if ((history >= 0 && history <= 100) && (historyVerbalNote >= 0 && historyVerbalNote <= 100)) {
            this.history.note = (history * 0.80 + historyVerbalNote* 0.20);
        }

        if ((physics >= 0 && physics <= 100) && (physicsVerbalNote >= 0 && physicsVerbalNote <= 100)) {
            this.physics.note = (physics * 0.80 + physicsVerbalNote* 0.20);
        }

        if ((history >= 0 && history <= 100) && (biologyVerbalNote >= 0 && biologyVerbalNote <= 100)){
            this.biology.note = (biology * 0.80 + biologyVerbalNote* 0.20);
        }
    }

    public void calcAverage() {
        this.average = (this.history.note + this.biology.note + this.physics.note) / 3.0;
    }

    public void isPass() {
        if (this.average >= 55) {
            isPass = true;
            System.out.println("Öğrenci Sınıfı Geçti.");
        } else {
            System.out.println("Öğrenci Sınıfı Geçemedi!");
        }

    }

    public void printNote() {
        calcAverage();
        System.out.println(this.name + " Ortalaması: " + average);
        isPass();
        System.out.println("---------------------------------------");
    }
}
