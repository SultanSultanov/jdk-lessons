package school;

public class Main {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil("Илья");
        Pupil pupil2 = new Pupil("Андрей", "биология");
        Pupil pupil3 = new Pupil("Елена", "рисование");

        pupil1.setAge(8);
        pupil2.setAge(16);
        pupil3.setAge(11);

        Teacher teacher1 = new Teacher("Анна К.", "химия");
        Teacher teacher2 = new Teacher("Галина С.", "биология");
        Teacher teacher3 = new Teacher("Татьяна Г.", "рисование");
        Teacher teacher4 = new Teacher("Ксения К.", "рисование");

        teacher1.setAge(30);
        teacher2.setAge(33);
        teacher3.setAge(26);
        teacher3.setAge(37);

        teacher1.setSalar(30000);
        teacher2.setSalar(33000);
        teacher3.setSalar(35000);
        teacher4.setSalar(50000);


        School school = new School(); // добавляем учеников в школу
        school.addPupil(pupil1);
        school.addPupil(pupil2);
        school.addPupil(pupil3);

        school.addTeacher(teacher1); // добавляем учителей в школу
        school.addTeacher(teacher2);
        school.addTeacher(teacher3);
        school.addTeacher(teacher4);

        school.schoolDay();
        System.out.println();
    }

}
