import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(20);
        arrayList.add(28);
        arrayList.add(30);
        arrayList.add(35);
        arrayList.add(60);
        arrayList.add(15);
        //Filter divisible by 2
        List<Integer> collect = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(collect);
        // Add 2 to all elements of list
        List<Integer> collect1 = arrayList.stream().map(i -> i + 2).collect(Collectors.toList());
        System.out.println("Updated marks"+collect1);
        // filter + map
        List<Integer> count = arrayList.stream().filter(i -> i <= 35).map(i -> i + 5).sorted((i1,i2)->((i1<i2)?1:(i1>i2)?-1:0)).collect(Collectors.toList());
        System.out.println(count);

        //sorting by name alphabet
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Achala");//5
        arrayList1.add("Shraddha");//2
        arrayList1.add("Pranali");//3
        arrayList1.add("Pallavi");//4
        arrayList1.add("Pratiksha");//1
        arrayList1.add("Sayli");//6
        List<String> collect2 = arrayList1.stream().sorted((s1,s2)-> -(s1.compareTo(s2))).collect(Collectors.toList());
        System.out.println(collect2);

        //sorting by increasing length order
        List<String> collect3 = arrayList1.stream().sorted((s1, s2) -> (s1.length() < s2.length()) ? 1 : (s1.length() > s2.length() ? -1 : s1.compareTo(s2))).collect(Collectors.toList());
        System.out.println(collect3);

        //to get min and max element for ascending order
        Integer integerAsc = arrayList.stream().min((i1, i2) -> (i1.compareTo(i2))).get();
        System.out.println("Min value"+integerAsc);
        Integer integerMaxASC = arrayList.stream().max((i1, i2) -> (i1.compareTo(i2))).get();
        System.out.println("max value"+integerMaxASC);

        //to get min and max element for descending order
        Integer integer = arrayList.stream().min((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).get();
        System.out.println("Min value"+integer);
        Integer integerMax = arrayList.stream().max((i1, i2) -> ((i1 < i2) ? 1 : (i1 > i2) ? -1 : 0)).get();
        System.out.println("max value"+integerMax);

        arrayList1.stream().forEach(System.out::println);
    }
}
