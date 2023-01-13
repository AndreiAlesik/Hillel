import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        Cafe cafe1=new Cafe("1","11",12);
        Cafe cafe2=new Cafe("2","22",22);
        Cafe cafe3=new Cafe("2","22",22);

        List<Cafe> cafeList=new ArrayList<>();

        cafeList.add(cafe1);
        cafeList.add(cafe2);
        cafeList.add(cafe3);
        System.out.println(findFirst(cafeList));
        System.out.println();
        System.out.println();

        System.out.println("-----------Homework------------");
        System.out.println("Element is exist: "+isExist(cafeList, "3"));
        System.out.println("Element is exist: "+isExist(cafeList, "2"));
        System.out.println("Items number: "+listLength(cafeList));
        System.out.println("Is duplicated "+isDuplicatedItemsExist(cafeList));
    }
    public static Cafe findFirst(List<Cafe> cafeList) throws Exception {
        try{
            checkIsEmpty(cafeList);
            Cafe returnCafe=(Cafe) cafeList.get(0);
            System.out.println("Collection is not empty");
            return returnCafe;
        }
        catch (Exception e){
            throw new Exception("Collection is empty");

        }
    }
    public static int listLength(List<Cafe> cafeList){
        int count=0;
        for(Cafe cafe: cafeList){
            count++;
        }
        return count;
    }
    public static boolean checkIsEmpty(List<Cafe> cafeList){
        Iterator<Cafe> itr=cafeList.iterator();
        boolean check=itr.hasNext();
        return check;
    }
    public static boolean isExist(List<Cafe> cafeList, String cafeName){
        boolean answer=false;
        for(Cafe items: cafeList){
            if(items.getName().equals(cafeName))
                answer=true;
        }
        return answer;
    }

    public static boolean isDuplicatedItemsExist(List<Cafe> cafeList){
        List<Cafe> uniqueItems = new ArrayList<>();
        int count=0;
        for (Cafe items : cafeList)
            //finding unique Structures and add to unique list
            if (cafeList.stream().filter(items::equals).count() == 1) {
                uniqueItems.add(items);
            }
        List<Cafe> uniq = cafeList.stream().distinct().collect(Collectors.toList());
        for (Cafe items : uniq) {
            //set Occurrence in Structures and print them
            count=((int) (cafeList.stream().filter(items::equals).count()));


        }
        if(count==1)
            return false;
        else
            return true;
    }
}