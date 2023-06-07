import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("//Задание 1");
        Predicate<Integer> checkNumber = new Predicate<Integer>() {
            @Override
            public boolean check(Integer number) {
                return number > 0;
            }
        };

        System.out.println(checkNumber.check(10));
        System.out.println(checkNumber.check(-100));

        Predicate<Integer> checkNumber2 = (number -> number > 0);
        System.out.println(checkNumber2.check(10));
        System.out.println(checkNumber2.check(-100));

        //Задание 2
        System.out.println("//Задание 2");
        Consumer<String> printName = new Consumer<String>() {
            @Override
            public void print(String name) {
                System.out.println("Hi " + name);
            }
        };

        printName.print("LoLO");

        Consumer<String> printName2 = (name -> System.out.println("Hi " + name));
        printName2.print("BoBo");

        //Задание 3
        System.out.println("//Задание 3");
        Function<Double, Long> round = new Function<Double, Long>() {
            @Override
            public Long apply(Double number) {
                return number.longValue();
            }
        };

        System.out.println(round.apply(103.5));

        Function<Double, Long> round2 = (rnd -> rnd.longValue());
        System.out.println(round2.apply(105.5));


        //Задание 4
        System.out.println("//Задание 4");
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100) + 1;
            }
        };
        System.out.println(supplier.get());

        Supplier<Integer> random2 = () -> new Random().nextInt(100)+1;
        System.out.println(random2.get());

    }


}

@FunctionalInterface
interface Predicate<Integer> {
    boolean check(Integer t);
}
@FunctionalInterface
interface Consumer<String> {
    void print(String b);

}
interface Supplier<Integer> {
    Integer get();
}
interface Function<Double, Long> {
    Long apply(Double number);
}