import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>();
        for (int i = 0; i <= 10; i++)
            inputList.add("Word" + i);
        inputList.add("Word1");
        inputList.add("Word1");
        inputList.add("Word1");
        inputList.add("Word2");
        inputList.add("Word2");
        inputList.add("Word3");
        countOccurrence(inputList, "Word2");


        int[] i = new int[]{
                1, 2, 3
        };
        System.out.println(toList(i));

        List<Integer> inputListFindUnique = new ArrayList<>();
        for (int j = 0; j <= 10; j++)
            inputListFindUnique.add(j);
        inputListFindUnique.add(5);
        inputListFindUnique.add(6);
        System.out.println(findUnique(inputListFindUnique));

        calcOccurrence(inputList);
    }

    public static void countOccurrence(List<String> inputList, String inputStr) {
        System.out.println(inputList.stream().filter(inputStr::equals).count());
    }

    public static List<Integer> toList(int[] input) {
        List<Integer> outputList = new ArrayList<>();
        for (int i = 0; i <= (input.length) - 1; i++)
            outputList.add(input[i]);

        return outputList;
    }

    public static List<Integer> findUnique(List<Integer> inputList) {
        List<Integer> outputList = new ArrayList<>();
        for (Integer items : inputList) {
            if (inputList.stream().filter(items::equals).count() == 1) {
                outputList.add(items);
            }
        }
        return outputList;
    }

    public static void calcOccurrence(List<String> inputList) {
        List<String> uniqueItems = new ArrayList<>();
        for (String items : inputList)
            if (inputList.stream().filter(items::equals).count() == 1) {
                uniqueItems.add(items);
            }
        int counter = 0;
        List<String> uniq = inputList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniq);
        for (String items : uniq) {
            System.out.println(items + ": " + inputList.stream().filter(items::equals).count());
        }
    }

    public static void findOccurrence(){

    }
}