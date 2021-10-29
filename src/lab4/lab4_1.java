package lab4;

//import java.util.Scanner;

public class lab4_1 {
    public static void main(String[] args){
//        Scanner Obj = new Scanner(System.in);
//        System.out.print("napis: ");
//        String str = Obj.next();
//        System.out.print("znak: ");
//        char c = Obj.next().charAt(0);
        // a
        System.out.println("Wystapien: " + countChar("test", 't'));
        // b
        System.out.println("Wystapien: " + countSubStr("siema123siesiema", "siema"));
        // c
        System.out.println(middle("test12"));
        // d
        // String strd = Obj.next();
        // System.out.println(repeat(strd, 3));
        System.out.println(repeat("ho", 3));
        // e
        wypisz(where("siema123siesiema", "siema"));
    }

    public static int countChar(String str, char c){
        int suma = 0;
        for (int i = 0; i < str.length(); i++) if (str.charAt(i) == c) suma++;
        return suma;
    }

    public static int countSubStr(String str, String subStr){
        int lastIndex = 0;
        int suma = 0;
        while (lastIndex != -1){
            lastIndex = str.indexOf(subStr, lastIndex);
            if (lastIndex == -1) break;
            suma++;
            lastIndex += subStr.length();
        }
        return suma;
    }

    public static String middle(String str){
        String temp = "";
        if (str.length() % 2 == 0) {
            temp = temp + str.charAt(str.length()/2-1) + str.charAt(str.length()/2);
        }
        else temp = temp + str.charAt(str.length()/2);
        return temp;
    }

    public static String repeat(String str, int n){
        String temp = "";
        for (int i = 0; i < n; i++){
            temp = temp.concat(str);
        }
        return temp;
    }

    public static int[] where(String str, String subStr){
        int[] tab = new int[countSubStr(str, subStr)];
        int lastIndex = 0;
        int i = 0;
        while (lastIndex != -1){
            lastIndex = str.indexOf(subStr, lastIndex);
            if (lastIndex == -1) break;
            tab[i] = lastIndex;
            i++;
            lastIndex += subStr.length();
        }
        return tab;
    }

    public static void wypisz(int[] tab){
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
