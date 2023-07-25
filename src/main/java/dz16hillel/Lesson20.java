package dz16hillel;

public class Lesson20 {
    public static void main(String[] args) {

        //Human human1 = new Human("Bob");

        //Human h1 = new Human("Bob", 30);
        //h1.setName("Tom");

        Human h1 = new Human("Bob", 40);
        Human h2 = new Human("Tom", 40);
        //Human.description = "Nice";
        //h1.getAllField();
        //h2.getAllField();
        ////Human.getDescription();
        //Human.description = "Bad";
        //h1.getAllField();
        //h2.getAllField();

        //System.out.println(Math.pow(2,4));
        //System.out.println(Math.PI);

        h1.printNumberOfPeople();
        h2.printNumberOfPeople();

        Human h3 = new Human("Rob", 50)
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}

class Human {
    private String name;
    private int age;

    //public static String description;

    //public static int x;

    //public static final double PI = 3.1415;

    private int countPeople;

    public Human(String  name, int age){
        //System.out.println("Привет из третьего конструктора");
        this.age = age;
        this.name = name;
        countPeople++;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    //public static void getDescription() {
    //    System.out.println(description);
    //}

    //public Human() {
    //    //System.out.println("Привет из первого конструктора");
    //    this.name = "Имя по умолчанию";
    //    this.age = 0;
    //}
    //public Human(String name){
    //    System.out.println("Привет из второго конструктора");
    //    this.name = name;
    //}

    //public void getAllField() {
    //    System.out.println(name + "," + age + "," + description);
    //}

    //public static void printAllFields(){
    //    System.out.println();
    //}

    public void printNumberOfPeople(){
        System.out.println("Number of people: - " + countPeople);
    }
}
