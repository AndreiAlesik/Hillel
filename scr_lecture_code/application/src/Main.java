import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Cafe cafe1=new Cafe("1","11",12);
        Cafe cafe2=new Cafe("2","22",22);

        List<Cafe> cafeList=new ArrayList<>();

        cafeList.add(cafe1);
        cafeList.add(cafe2);
        System.out.println(findFirst(cafeList));
        System.out.println();

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
}