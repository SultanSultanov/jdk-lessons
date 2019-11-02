package school;

public class Teacher extends SchoolMember implements ITeacher {


    private int salar;

    public Teacher(String name, String subject) {
        super(name);
        this.setSubject(subject);
    }

    @Override
    public void setSubject(String subject) {
        super.setSubject(subject);
    }

    public int getSalar() {
        return salar;
    }

    public void setSalar(int salar) {
        this.salar = salar;
    }

    @Override
    public void setAge(int age) {
        if (age <= 23) return;
        super.setAge(age);
    }

    @Override
    public void teach(Pupil pupil) {
        System.out.println("Учитель " + this.getName() + " обучает ученика" + this.getName() + " предмету: " + this.getSubject());

        pupil.changeKnowledAmount();
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "salar=" + salar +
                '}';
    }
}
