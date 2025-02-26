package objectOrientation.association.domain;

public class Seminar {
    private String title;
    private Localization localization;
    private Student[] students;



    public Seminar(String title, Localization localization) {
        this.title = title;
        this.localization = localization;
    }

    public Seminar(String title, Localization localization, Student[] students) {
        this.title = title;
        this.localization = localization;
        this.students = students;
    }

    public void print() {
        System.out.println("Título: " + this.title);
        System.out.println("Localização: " + this.localization.getAddress());
        System.out.println("Alunos: ");
        for (int i = 0; i < this.students.length; i++) {
            System.out.println(this.students[i].getName());
        }
    }

    public Localization getLocalization() {
        return localization;
    }

    public void setLocalization(Localization localization) {
        this.localization = localization;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
