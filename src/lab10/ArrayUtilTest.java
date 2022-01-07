package lab10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayList<LocalDate> lD = new ArrayList<>();
        lD.add(LocalDate.of(1999,8,2));
        lD.add(LocalDate.of(1999,7,2));
        lD.add(LocalDate.of(1999,8,1));
        ArrayList<LocalDate> lD_copy = new ArrayList<>(lD);
        System.out.println(ArrayUtil.isSorted(lD));
        Collections.sort(lD);
        System.out.println(ArrayUtil.isSorted(lD));

        ArrayList<Integer> i = new ArrayList<>();
        i.add(4);
        i.add(8);
        i.add(2);
        i.add(6);
        i.add(2);
        i.add(1);
        i.add(2);
        i.add(8);
        i.add(5);
        ArrayList<Integer> i_copy = new ArrayList<>(i);
        System.out.println(ArrayUtil.isSorted(i));
        Collections.sort(i);
        System.out.println(ArrayUtil.isSorted(i) + "\n");

        System.out.println(ArrayUtil.binSearch(i,8));
        System.out.println(ArrayUtil.binSearch(i,10));
        System.out.println(ArrayUtil.binSearch(lD,LocalDate.of(1999,8,1)));
        System.out.println(ArrayUtil.binSearch(lD,LocalDate.of(1999,1,2)) + "\n");

//        ArrayList<Integer> i_copy2 = new ArrayList<>(i_copy);
//        ArrayList<LocalDate> lD_copy2 = new ArrayList<>(lD_copy);
        ArrayUtil.selectionSort(lD_copy);
        ArrayUtil.selectionSort(i_copy);
//        ArrayUtil.mergeSort(lD_copy2);
//        ArrayUtil.mergeSort(i_copy2);
        System.out.println(lD_copy);
        System.out.println(i_copy);
//        System.out.println(lD_copy2);
//        System.out.println(i_copy2);
    }
}
