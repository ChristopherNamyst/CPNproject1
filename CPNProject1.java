 import java.util.Scanner;
    class CPN{
        public static void main(String[] args) {

            int num = 0;

            int reversenum = 0;
            System.out.print("Hello you filthy animal, please enter a number to reverse:");

            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            while (num != 0) {

                reversenum = reversenum * 10;
                reversenum = reversenum + num % 10;
                num = num / 10;
            }

            System.out.println("Your answer is:" +reversenum );
        }
    }


