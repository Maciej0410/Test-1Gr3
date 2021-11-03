import java.util.Scanner;
import java.util.Random;
import java.lang.StringBuffer;
import java.lang.String;

//zadanie1

//public class Main {
//
//    public static void showPrimes(int[] tab){
//
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]%2!=0)
//            {
//                System.out.println("Liczby nieparzyste -> "+tab[i]);
//            }
//        }
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n -> ");
//        int n=sc.nextInt();
//
//        int[] tab=new int[n];
//
//        for(int i=0;i<tab.length;i++)
//        {
//            tab[i]=i;
//            System.out.println("Tablica -> "+tab[i]+", ");
//        }
//        System.out.println("\n");
//
//        showPrimes(tab);
//    }
//}


//zadanie2

//public class Main {
//
//    public static int maksimum(int[] tab)
//    {
//        int maks=0;
//
//        for(int i=0;i<tab.length;i++)
//        {
//            if(tab[i]>maks)
//            {
//                maks=tab[i];
//            }
//        }
//        return maks;
//    }
//
//    public static int maksimum_ile_razy(int[] tab, int maks)
//    {
//        int licznik=0;
//
//        for(int j=0;j<tab.length;j++)
//        {
//            if(tab[j]==maks)
//            {
//                licznik++;
//            }
//        }
//        return licznik;
//
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Podaj liczbe calkowita n -> ");
//        int n=sc.nextInt();
//
//        int[] tab=new int[n];
//
//        Random r=new Random();
//
//        for(int i=0;i<tab.length;i++)
//        {
//            tab[i]=r.nextInt(100)-50;
//            System.out.println("Tablica -> "+tab[i]+", ");
//        }
//        System.out.println("\n");
//        int maks=maksimum(tab);
//        System.out.println("Element o najwyzszej wartosci -> "+maks);
//        System.out.println("Element o najwyzszej wartosci wystepuje w tablicy -> "+maksimum_ile_razy(tab,maks)+" razy");
//
//
//
//    }
//}

//zadanie3

public class Main {

    public static String delete(String napis, char znak)
    {
        StringBuffer tmp =new StringBuffer(napis);
        StringBuffer tmp_2=new StringBuffer();



        for(int i=0;i<tmp.length();i++)
        {
            if(tmp.charAt(i)==znak);
            {
                tmp_2.append(tmp.deleteCharAt(i));
            }

        }
        return tmp_2.toString();
    }

    public static void main(String[] args) {

        String napis="ohhoo";
        char znak='o';

        System.out.println("Napis -> "+delete(napis,znak));
        System.out.println("Nie dziala tak jak powinien");

    }
}