package school;

public class School {
    private  Teacher[] teachers = new Teacher[4];
    private Pupil[] pupils = new Pupil[3];

    public boolean addTeacher(Teacher teacher){    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.teachers.length; i++) {
            if (this.teachers[i] == null){
                this.teachers[i] = teacher;
                return true;
            }
        }
        return false;
    }
    public boolean addPupil(Pupil pupil){    //  добавление учителя в массив и проверка ячейки на свободную
        for (int i = 0; i < this.pupils.length; i++) {
            if (this.pupils[i] == null){
                this.pupils[i] = pupil;
                return true;
            }
        }
        return false;
    }
    public void schoolDay(){
        for (Teacher teacher: this.teachers) { // перебирает массив
            for (Pupil pupil: this.pupils){
                if (teacher.getSubject().equals(pupil.getSubject()));{
                    teacher.teach(pupil);
                }
            }

        }
    }
}
