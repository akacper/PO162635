package lab4;

//import java.util.Scanner;

import java.util.Locale;

public class  lab4_1 {
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
        // f
        System.out.println(change("1Siema123"));
        // g
        System.out.println(nice("10000"));
        // h
        System.out.println(nice2("10000", '#', 2));
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

    public static String change(String str){
        StringBuffer temp = new StringBuffer();
        for (int i = 0; i < str.length(); i++){
            if (Character.isDigit(str.charAt(i))) temp.append(str.charAt(i));
            else if (Character.isLowerCase(str.charAt(i))) temp.append(Character.toUpperCase(str.charAt(i)));
            else temp.append(Character.toLowerCase((str.charAt(i))));
        }
        return temp.toString();
    }

    public static String nice(String str){
        if (str.length() > 3) {
            StringBuffer temp = new StringBuffer();
            int licz = 1;
            for (int i = str.length()-1; i>=0; i--) {
                temp.append(str.charAt(i));
                if (licz % 3 == 0 && i != 0) temp.append("'");
                licz++;

            }

            StringBuffer odwroc = new StringBuffer();
            for (int i = temp.length()-1; i >= 0; i--) {
                odwroc.append(temp.charAt(i));
            }
            return odwroc.toString();
        }
        else return str;
    }

    public static String nice2(String str, char znak, int n){
        if (str.length() > n) {
            StringBuffer temp = new StringBuffer();
            int licz = 1;
            for (int i = str.length()-1; i>=0; i--) {
                temp.append(str.charAt(i));
                if (licz % n == 0 && i != 0) temp.append(znak);
                licz++;

            }

            StringBuffer odwroc = new StringBuffer();
            for (int i = temp.length()-1; i >= 0; i--) {
                odwroc.append(temp.charAt(i));
            }
            return odwroc.toString();
        }
        else return str;
    }
}
