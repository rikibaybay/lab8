public class lab8 {
    public static void main(String[] args) {
        people people =  new people("Николай","Оконешников",19);
        people.walk();
        people.run();
        people.voice();
        student student = new student("Иван","Абрамов",20);
        student.walk();
        student.learn();
        teacher teacher = new teacher("Никита","Винокуров",45);
        teacher.voice();
        teacher.teach();
    }
}
