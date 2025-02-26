package objectOrientation.association.domain;

public class Teacher {
    private String name;
    private String speciality;
    private Seminar[] seminars;

    public Teacher(String name, String speciality) {
        this.name = name;
        this.speciality = speciality;
    }

    public Teacher(String name, String speciality, Seminar[] seminars) {
        this.name = name;
        this.speciality = speciality;
        this.seminars = seminars;
    }

    public Seminar[] getSeminars() {
        return seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
