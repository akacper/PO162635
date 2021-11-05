package lab5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lab5 {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>(
                Arrays.asList(1, 4, 9, 16));
        ArrayList<Integer> b = new ArrayList<Integer>(
                Arrays.asList(9, 7, 4, 9, 11));
        printArrayList(a);
        printArrayList(b);
        System.out.println();
        //a.forEach(x -> System.out.print(x + " "));
        // 1
        printArrayList(append(a,b));
        // 2
        printArrayList(merge(a,b));
        // 3
        printArrayList(mergeSorted(a,b));
        // 4
        printArrayList(reversed(a));
        // 5
        reverse(a);
        printArrayList(a);
    }

    public static void printArrayList(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(a);
        newList.addAll(b);
        return newList;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        int rozmiarA = a.size();
        int rozmiarB = b.size();
        int krotsza;
        if (rozmiarA > rozmiarB) krotsza = rozmiarB;
        else krotsza = rozmiarA;
        int i;
        for (i = 0; i < krotsza; i++){
            newList.add(a.get(i));
            newList.add(b.get(i));
        }
        if (krotsza == rozmiarB)
            for (int j = 0; j < rozmiarA - rozmiarB; j++)
                newList.add(a.get(i + j));
        else
            for (int j = 0; j < rozmiarB - rozmiarA; j++)
                newList.add(b.get(i + j));
        return newList;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        newList = append(a,b);
        Collections.sort(newList);
        return newList;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = a.size() - 1; i >= 0 ; i--)
            newList.add(a.get(i));
        return newList;
    }

    public static void reverse(ArrayList<Integer> a)
    {
        ArrayList<Integer> temp = new ArrayList<>(a);
        int index = 0;
        for (int i = a.size() - 1; i >= 0 ; i--) {
            a.set(index, temp.get(i));
            index++;
        }
    }
}
