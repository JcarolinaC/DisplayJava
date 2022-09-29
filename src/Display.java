import java.util.Scanner;

public class Display {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println(" What is the number?: ");
            String number = userInput.next();
            if (number.equals("0,0")) break;
            int timesItRepeats = Integer.parseInt(number.split(",")[0]);
            String decimal = number.split(",")[1];


            int[] arrayOfNumbers = new int[decimal.length()];
            int i;
            for (i = 0; i < decimal.length(); i++) {
                arrayOfNumbers[i] = Integer.parseInt(String.valueOf(decimal.charAt(i)));
                System.out.println(arrayOfNumbers[i]);
            }
            String[][] displayArray = new String[decimal.length()][7];
            for (i = 0; i < decimal.length(); i++) {
                switch (arrayOfNumbers[i]) {
                    case 0: {
                        displayArray[i][0] = "--";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 1: {
                        displayArray[i][0] = "  ";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 2: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = " ";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 3: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 4: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 5: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 6: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 7: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 8: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 9: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    default:
                        System.out.println("The number is invalidate");
                }
            }
            for (int j = 0; j < timesItRepeats; j++) {

                for (i = 0; i < decimal.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][0]);
                }
                System.out.println("");
                for (i = 0; i < decimal.length(); i++) {
                    System.out.printf("%s   %s ", displayArray[i][1], displayArray[i][2]);
                }
                System.out.println("");
                for (i = 0; i < decimal.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][3]);
                }
                System.out.println("");
                for (i = 0; i < decimal.length(); i++) {
                    System.out.printf("%s   %s ", displayArray[i][4], displayArray[i][5]);
                }
                System.out.println("");
                for (i = 0; i < decimal.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][6]);
                }
                System.out.println("");
                System.out.println("\n");
            }
        }
    }
}

