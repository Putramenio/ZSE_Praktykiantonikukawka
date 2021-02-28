package First_week.basick.zadania.zadania2;

import java.util.Scanner;

public class zadania2 {

    public static void main(String[] args) {


        Scanner zadanie1 = new Scanner(System.in);
        System.out.println("podaj liczbę: ");
        int x = zadanie1.nextInt();

        if (x > 0) {
            System.out.println("liczba jest większa od 0");
        } else {
            System.out.println("liczba jest mniejsza od 0");
        }


        Scanner zadanie2 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę: ");
        int a = zadanie2.nextInt();
        System.out.println("podaj drugą liczbę: ");
        int b = zadanie2.nextInt();
        System.out.println("podaj trzecią liczbę: ");
        int c = zadanie2.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("największa liczba to: " + a);
            }
        }
        if (a < b) {
            if (c < b) {
                System.out.println("największa liczba to: " + b);
            }
        }
        if (a > b) {
            if (a < c) {
                System.out.println("największa liczba to: " + c);
            }
        }


        Scanner zadanie3 = new Scanner(System.in);
        System.out.println("podaj login: ");
        String login = zadanie3.next();
        System.out.println("podaj hasło: ");
        String hasło = zadanie3.next();

        if (login.equals("admin")) {
            if (hasło.equals("tajnehaslo")) {
                System.out.println("zalogowano pomyślnie ");
            } else {
                System.out.println("niezautoryzowany użytkownik ");
            }
        } else {
            System.out.println("niezautoryzowany użytkownik ");
        }


        Scanner zadanie4 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę: ");
        int aa = zadanie4.nextInt();
        System.out.println("podaj drugą liczbę: ");
        int bb = zadanie4.nextInt();
        System.out.println("podaj trzecią liczbę: ");
        int cc = zadanie4.nextInt();
        if (aa > bb) {
            if (bb > cc) {
                System.out.println("kolejność malejąca");
            }
        }
        if (aa < bb) {
            if (bb < cc) {
                System.out.println("kolejność rosnąca");
            }
        }
        if (aa > bb) {
            if (bb < cc) {
                System.out.println("brak kolejności");
            }
        } else {
            System.out.println("brak kolejności");
        }


        Scanner zadanie5 = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę: ");
        double xx = zadanie5.nextDouble();
        System.out.println("podaj drugą liczbę: ");
        double yy = zadanie5.nextDouble();
        System.out.println("podaj swój wybór (+,- ,* ,/): ");
        char wybor = zadanie5.next().charAt(0);

        switch (wybor) {
            case '+':
                double sum = xx + yy;
                System.out.println("dodawanie = " + sum);
                break;
            case '-':
                double odejm = xx - yy;
                System.out.println("odejmowanie = " + odejm);
                break;
            case '*':
                double mnoz = xx * yy;
                System.out.println("mnożenie = " + mnoz);
                break;
            case '/':
                double dziel = xx / yy;
                System.out.println("dzielenie = " + dziel);
                break;
        }

    }

}