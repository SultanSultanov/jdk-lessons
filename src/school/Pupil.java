package school;

public class Pupil extends SchoolMember implements IPupil {
    private int knowledAmount = 1;



    public Pupil(String name) { // вызвать конструктор родителя
        super(name);
        this.setSubject("химия");
    }

    public Pupil(String name, String subject) {
        super(name);
        this.setSubject(subject);
    }

    @Override
    public void setAge(int age) {
        if (age >= 18) return;
        super.setAge(age);
    }

    public int getKnowledAmount() {
        return knowledAmount;
    }


    @Override
    public void changeKnowledAmount() {
        this.knowledAmount += (int) (Math.random() * 6);
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "knowledAmount=" + knowledAmount +
                '}';
    }
}