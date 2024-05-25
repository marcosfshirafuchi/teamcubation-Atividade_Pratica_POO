import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {
    public static void main(String[] args) {
        List<Integer> lista1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<String> lista2 = Arrays.asList("5", "6", "7", "8");

//        List<Integer> interseccao = lista1.stream().filter(item1 -> {
//            return lista2.stream().filter(item2 -> new Integer(item2).equals(item1)).findAny().isPresent();
//        }).collect(Collectors.toList());
//
//        System.out.println(interseccao);
    }
}
