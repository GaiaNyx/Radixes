import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Choose a number-base: ");
        int numBase = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = input2.nextInt();
        Bases numBase1 = new Bases(numBase);
        System.out.println("The number in " + numBase + "-base: " + numBase1.numInNewBase(num));

    }

}