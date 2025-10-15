import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsTask {

    public static void main(String[] args) {
        int n = 7;
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(101);
        }
        System.out.println("a) Исходный массив случайных чисел:");
        System.out.println(Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        System.out.println("b) Список, созданный на основе массива:");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("c) Список, отсортированный по возрастанию:");
        System.out.println(list);

        Collections.reverse(list);
        System.out.println("d) Список, отсортированный в обратном порядке:");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println("e) Перемешанный список:");
        System.out.println(list);

        Collections.rotate(list, 1);
        System.out.println("f) Список после циклического сдвига на 1 элемент вправо:");
        System.out.println(list);

        List<Integer> listForDuplicates = new ArrayList<>(list);

        Set<Integer> uniqueElements = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(uniqueElements);
        System.out.println("g) Список, содержащий только уникальные элементы:");
        System.out.println(list);

        Set<Integer> duplicates = listForDuplicates.stream()
                .filter(i -> Collections.frequency(listForDuplicates, i) > 1)
                .collect(Collectors.toSet());
        System.out.println("h) Элементы, которые дублируются в списке:");
        System.out.println(duplicates);

        Integer[] finalArray = list.toArray(new Integer[0]);
        System.out.println("i) Массив, полученный из списка уникальных элементов:");
        System.out.println(Arrays.toString(finalArray));

        Map<Integer, Long> frequencyMap = Arrays.stream(array)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("j) Количество вхождений каждого числа в исходный массив:");
        frequencyMap.forEach((number, count) -> System.out.println("Число " + number + " встречается " + count + " раз"));
    }
}