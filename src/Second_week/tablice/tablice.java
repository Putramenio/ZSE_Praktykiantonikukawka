package Second_week.tablice;

public class tablice {
//    public static void main(String[] args) {
//        int[][] twoDarray=new int[5][5];
//        int value=0;
//        for (int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//                twoDarray[i][j]=value;
//                value+=5;
//                System.out.print(twoDarray[i][j]+"\t");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        int[][][][] arr=new int[3][3][3][3];
//        int value=0;
//        for (int i=0;i<3;i++){
//            for (int j=0;j<3;j++){
//                for (int k=0;k<3;k++){
//                    for (int l=0;l<3;l++){
//                        arr[i][j][k][l]=value;
//                        value+=2;
//                        System.out.println("["+i+"]"+"["+j+"]"+"["+k+"]"+"["+l+"] = "+arr[i][j][k][l]+ "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//    }
    public static void main(String[] args) {
        int[][][][][] arr=new int[2][2][2][2][2];
        int value=0;
        for (int i=0;i<2;i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            arr[i][j][k][l][m] = value;
                            value++;
                            System.out.println("[" + i + "]" + "[" + j + "]" + "[" + k + "]" + "[" + l + "]" + "[" + m + "] = " + arr[i][j][k][l][m] + "\t");
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
