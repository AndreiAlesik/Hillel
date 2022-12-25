import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //task 1
        System.out.println("task 1");
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
        System.out.println();

        //task 2
        System.out.println("task 2");
        int[] i = new int[]{
                1, 2, 3
        };
        System.out.println(toList(i));
        System.out.println();

        //task 3
        System.out.println("task 3");
        List<Integer> inputListFindUnique = new ArrayList<>();
        for (int j = 0; j <= 10; j++)
            inputListFindUnique.add(j);
        inputListFindUnique.add(5);
        inputListFindUnique.add(6);
        System.out.println(findUnique(inputListFindUnique));
        calcOccurrence(inputList);
        System.out.println();

        //task 4
        System.out.println("task 4");
        List<Structure> structuresList = new ArrayList<>();
        structuresList.add(new Structure("bird"));
        structuresList.add(new Structure("fox"));
        structuresList.add(new Structure("cat"));
        structuresList.add(new Structure("bird"));
        System.out.println(structuresList);
        findOccurrence(structuresList);
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
        List<String> uniq = inputList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniq);
        for (String items : uniq) {
            System.out.println(items + ": " + inputList.stream().filter(items::equals).count());
        }
    }

    public static void findOccurrence(List<Structure> inputList) {
        List<Structure> uniqueItems = new ArrayList<>();
        for (Structure items : inputList)
            //finding unique Structures and add to unique list
            if (inputList.stream().filter(items::equals).count() == 1) {
                uniqueItems.add(items);
            }
        List<Structure> uniq = inputList.stream().distinct().collect(Collectors.toList());
        for (Structure items : uniq) {
            //set Occurrence in Structures and print them
            items.setOccurrence((int) (inputList.stream().filter(items::equals).count()));
            System.out.println(items);
        }
    }
}