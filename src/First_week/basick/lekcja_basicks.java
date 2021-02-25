package First_week.basick;

public class lekcja_basicks {




    // to jest nasza metoda główna
    public static void main(String[] args) {
        //liczby całkowite
        int myIntA = 1;
        int myIntB = -32;
        int myIntC = 77;

        // Dokumentowanie zmiennych
        int  sum = myIntA + myIntB + myIntC;
        System.out.print("Dodawanie wynik:  " + sum );

        // Odejmowanie zmiennych
        sum = myIntA - myIntB - myIntC;
        System.out.println("odejmowanie wynik:  " + sum);

        // Mnożenie zmennych
        sum = myIntA * myIntB * myIntC;
        System.out.println("Mnożenie wynik:  " + sum);

        //Dzielenie zmiennych
        sum = myIntB / 2;
        System.out.println("Dzielenie B przez :  " + sum);

        //float / double
        double myDoubleA = 1.65;
        double myDoubleB = 1.44;

        double  sumDouble;
        sumDouble = myDoubleA * myDoubleB;

        System.out.println(sumDouble);





        // znaki (characters)

        char myCharA = 'F';
        char myCharB = 'T';
        char myCharC = '$';

        System.out.println("mOJA ULUBIONA LITERKA TO: " + myCharA);
        System.out.println("moj ulubiony znakto: " + myCharC);

        int sumChar = myCharA + myCharB + myCharC;
        System.out.println("Suma znaków to: " + sumChar);

        //string ciagi zakom slowa i wyrazy
        String myStringA = "Antoni";
        String myStringB = "wole naleśniki";
        String myStringC = "z dzemem";

        System.out.println(myStringA + "\n\n\n\n\n" + myStringB + myStringC);


        //boolean
        boolean myBoolean = true;

        System.out.println(!myBoolean);





    }



}
