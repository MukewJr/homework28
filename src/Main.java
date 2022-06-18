import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] array = new Integer[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
        }
        System.out.print(Arrays.toString(array));
        System.out.println();
        ArrayList<Integer> evenNumberSqrt = (ArrayList<Integer>) Stream.of(array).filter(x -> x % 2 == 0).map(x -> x * x).collect(Collectors.toList());
        System.out.print("Squares of array even numbers are: "+evenNumberSqrt);
        Optional<Integer> maxNumber=evenNumberSqrt.stream().max(Comparator.comparing(Integer::valueOf));
        System.out.println("\n max value of square: " + maxNumber);
    }
}