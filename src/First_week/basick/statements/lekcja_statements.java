//package First_week.basick.statements;
//
//import java.util.Scanner;
//
//public class lekcja_statements {
//
//
//    /*
//    postać instrukcji warunkowej IF:
//
//    if (warunek){
//        zrobCos1;
//        zrobCos2;
//        ...
//        zrobCosX;
//    }
//    else{
//        zrobCosInnego1;
//        zrobCosInnego2;
//        ...
//        zrob CosInnegoX;
//    }
//     */
//
//    public static void main(String[] args) {

//        boolean stan = true;
//
//        if (stan) {
//            System.out.println("Wykonała się instrukcja IF.");
//        } else {
//            System.out.println("Wykonała się instrukcja ELSE.");
//        }
//
//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj swój wiek");
//        int wiek = skaner.nextInt();
//
//        if(wiek >=18) {
//            System.out.println("Jesteś pełnoletni");
//        }
//        else {
//            System.out.println("Jesteś niepełnoleni");
//
//
//    }

//        System.out.println("Podaj liczbe: ");
//
//        int liczba = skaner.nextInt();
//
//        if (10 < liczba && liczba < 20) {
//            System.out.println("Liczba miesci sie w zakresie.");
//        } else {
//            System.out.println("Liczba NIE miesci sie w zakresie.");
//        }
//
//        System.out.println("Podaj liczbe całkowitą A: ");
//        int a = skaner.nextInt();
//
//        System.out.println("Podaj liczbe całkowitą B: ");
//        int b + skaner.nextInt();
//
//        if(a > b){
//            System.out.println("A jest wieksze od B.");
//        }
//        if(a < b){
//            System.out.println("A jest mniejsze od B");
//        }
//        if(a == b){
//            System.out.println("A jest równe B");
//        }
//


//        char charA = 'A';
//        char charB = 'B';
//
//        if (charA > charB){
//            System.out.println("cahrA ma wieksza wartosc od cahrB w tabeli ASCII.");
//        }
//        else {
//            System.out.println("charA ma mniejsza wartos od charB w tabeli ASCII");
//        }
//
//        String hello = "hello";
//        String world = "world";
//
//        if (hello.equals(world)){
//            System.out.println("hello jest równe world");
//        }
//        else {
//            System.out.println("hello nie jest równe world");
//        }

//        System.out.println("Podaj swój wybór (1, 2): ");
//        int x = skaner.nextInt();
//
//        switch (x){
//            case 1:
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case 2:
//                System.out.println("Pypadek drugi.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//
//        System.out.println("Podaj swój wybór (A, B): ");
//        String y = skaner.nextInt();
//
//        switch (y){
//            case "1":
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case "2":
//                System.out.println("Przypadek drugi.");
//                break;
//            case "A":
//                System.out.println("Przypadek A.");
//                break;
//            case "B":
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//        System.out.println("Podaj swój wybór (A, B): ");
//        char z= skaner.next(.charAt(0);
//
//        switch (z){
//            case "1":
//                System.out.println("Przypadek pierwszy.");
//                break;
//            case "2":
//                System.out.println("Przypadek drugi.");
//                break;
//            case "A":
//                System.out.println("Przypadek A.");
//                break;
//            case "B":
//                System.out.println("Przypadek B.");
//                break;
//            default:
//                System.out.println("Nie wybrano poprawnej opcji.");
//                break;
//        }
//    }
//}
