import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                
                1) Стримди колдонуп жогорудагы листтин
                 элементтердин суммасын, орточо арифметикалык
                  санын жана канча жолу кайталанганын
                   консольго чыгарыныз
                """);
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        System.out.println("Summasy:");
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println("ortocho arifmeticalyk sany");
        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));
        System.out.println("kancha jolu kaitalandy!");

        Map<Integer,Long> map = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k,y) -> System.out.println(k + " : повторять -> " + y));
    }
}