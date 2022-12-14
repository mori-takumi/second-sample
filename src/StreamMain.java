import java.util.stream.IntStream;

public class StreamMain {

    public static void main(String[] args) {


        IntStream.range(0, 50).forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("最大値");
        System.out.println(IntStream.range(0, 50).max());
        System.out.println("----------------------------------------");

        System.out.println("平均値");
        System.out.println(IntStream.range(0, 50).average());
        System.out.println("-----------------------------------------");

        System.out.println("最小値");
        System.out.println(IntStream.range(0, 50).min());
        System.out.println("------------------------------------------");

        System.out.println("0~10までの合計");
        System.out.println(IntStream.range(0, 10).sum());
    }

}
