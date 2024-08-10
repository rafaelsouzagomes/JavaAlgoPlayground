package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Ana", "Bruno", "Alice", "Carlos", "André", "Amanda");

        List<String> nomesComA = nomes.stream()         
                                      .filter(nome -> nome.startsWith("A"))  
                                      .map(String::toUpperCase)              
                                      .collect(Collectors.toList());         

    }
}
