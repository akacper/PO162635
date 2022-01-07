package lab10;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayUtil {
    public static <T extends Comparable<? super T>> boolean isSorted(ArrayList<T> tab){
        ArrayList<T> temp = new ArrayList<>(tab);
        Collections.sort(temp);
        return tab.equals(temp);
    }

    public static <T extends Comparable<? super T>> int binSearch(ArrayList<T> tab, T a){
        if (ArrayUtil.isSorted(tab)){
            int left = 0;
            int right = tab.size() - 1;
            while (left <= right) {
                int temp = (left + right) / 2;
                if (tab.get(temp).equals(a))
                    return temp;
                if (tab.get(temp).compareTo(a) < 0)
                    left = temp + 1;
                else
                    right = temp - 1;
            }
        }
        else throw new IllegalArgumentException("Lista nie jest posortowana");
        return -1;
    }

    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> tab){
        T temp;
        for (int i = 0; i < tab.size()-1; i++)
            for (int j = i+1; j < tab.size(); j++){
                if (tab.get(i).compareTo(tab.get(j)) > 0){
                    temp = tab.get(i);
                    tab.set(i, tab.get(j));
                    tab.set(j, temp);
                }
            }
    }

    public static <T extends Comparable<? super T>>  void mergeSort(ArrayList<T> tab){
    // do zrobienia
    }
}
