public class people {
    protected String name;
    protected String lastname;
    protected int age;
    people(){
        name = "none";
        lastname = "none";
        age = 18;
    }
    people(String nameP, String lastnameP, int ageP){
        name = nameP;
        lastname = lastnameP;
        age = ageP;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                '}';
    }

    void walk(){
        System.out.println(name + " Ходит");
    }
    void voice(){
        System.out.println(name + " говорит");
    }
    void run(){
        System.out.println(name + " бегает");
    }
}
