package Second_week.peentle;

    public class {
        public static void main(String[] args) {

            System.out.println("zadanie 1 \t");
            for (int number1 = 0; number1 < 20; number1 += 2) {
                System.out.println(number1);
            }

            System.out.println("zadanie 2\t");
            for (int number2 = 30; number2 > 0; number2 -= 3) {
                System.out.println(number2);
            }

            System.out.println("zadanie 3\t");
            for (int i = 1; i < 11; i++){
                System.out.println(i + " przejście pętli");
                for(int j = 1; j < 11; j++){
                    System.out.println("[i:"+ i + "]"+"[j:"+ j +"]\t" + i +" * " + j + " = " + i * j +"\t");
                    if ((i*j)%2==0){
                        System.out.println("liczba jest parzysta");
                    }
                    else{
                        System.out.println("Liczba jest nieparzysta");
                    }
                }
            }

            System.out.println("Zadanie 4 \t");
            for (int number3 =-40; number3 <= 40;number3++){
                if (number3 % 4 == 0){
                    System.out.println(number3);
                }
            }

            System.out.println("zadanie 5 \t");
            System.out.println("zadanie 1 - przeróbka \t");

            int number4 = 0;
            while (number4 < 20){
                System.out.println(number4);
                number4 +=2;
            }
            System.out.println("zadanie 2 - przeróbka \t");

            int number5 = 30;
            do{
                System.out.println(number5);
                number5 -= 3;
            }while(number5 > 0);

        }

    }


