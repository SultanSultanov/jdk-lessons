package school;

public class SchoolMember { // если класс один на всю программу, то интерфес не нужен
    // свойста
    private String name;
    private int age;
    private String subject;

    public SchoolMember(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() <= 2) return;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 6 || age >= 65) return;
        this.age = age;
    }

    public String getSubject() {

        return subject;
    }

    public void setSubject(String subject) {
        if (subject == null || subject.length() <= 3) return;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "SchoolMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                '}';
    }
}
