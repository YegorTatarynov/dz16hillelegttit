package dz16hillel;

public class Lesson23 {
    public static void main(String[] args) {
        //пример1
        //String x = "hello";
        //x.toUpperCase();  // <- не поменяет размер строки
        //                  // Для этого переопределим х
        //x = x.toUpperCase();
        //System.out.println(x);

        //пример2
        //String string1 = "Hello";
        //String string2 = " my ";
        //String string3 = "friend";
        //String stringAll = string1+string2+string3;
        //System.out.println(stringAll);

        //пример3
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my ").append("friend");
        System.out.println(sb.toString());

    }
}
