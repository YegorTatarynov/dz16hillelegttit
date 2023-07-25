package dz16hillel;

public class Lesson25 {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Bob", 40);
        h1.toString();
        System.out.println(h1 );
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2(String  name, int age){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return name+","+age;
    }
}
