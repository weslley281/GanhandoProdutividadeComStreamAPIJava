import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "R", "C#", "Ruby", "GoLang");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() >= 5;
        Predicate<String> menorQueDuasCaracteres = palavra -> palavra.length() <= 2;

        palavras.stream().filter(maisDeCincoCaracteres).forEach(System.out::println);
        System.out.println("__________________________________________");
        palavras.stream().filter(menorQueDuasCaracteres).forEach(System.out::println);
    }
}
