import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(0,1,2,3,4,5,6,7,8,9);

        Function<Integer, Integer> dobrar = numero -> numero * 2;

        List<Integer> numerosDobrados = numeros.stream().map(dobrar).collect(Collectors.toList());

        numerosDobrados.forEach(System.out::println);
    }
}
