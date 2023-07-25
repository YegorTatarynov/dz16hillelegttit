package dz16hillel;

public class Lesson22 {
    public static void main(String[] args) {
        final int X = 10;
        System.out.println(X);
        // X = 5; ошибка
    }
}

class Test{
    public static final int CONSTANT = 0;

    //public Test (int CONSTANT){
    //    this.CONSTANT = CONSTANT;
    //}

    // public void setCONSTANT(int x){
    //     this.CONSTANT = x;
    // //Будет выводить ошибку так как, CONSTANT
    // //уже инициализирована, а здесь мы пытаемся её изменить.
    // }



}
