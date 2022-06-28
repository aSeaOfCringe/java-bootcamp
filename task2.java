import java.util.*;

public class task2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("2nd day of Accenture java bootcamp\r\n\r\nTask 1\r\n");
        /*
        1) Ask user to input two numbers, compare them and output result:
   Input:
       Enter value a: 10
       Enter value b: 10
   Expected output:
       is 10 equal to 10? - true
       is 10 less than 10? - false
       is 10 less or equal to 10? - true
       is 10 greater than 10? - false
       is 10 greater or equal to 10? - true
         */
        System.out.print("Please, enter first whole number: x = ");
        if (sc.hasNextInt()){
            int x = sc.nextInt();
            System.out.print("Please, enter second whole number: y = ");
            if (sc.hasNextInt()){
                int y = sc.nextInt();
                boolean equal = false;
                if (x==y) equal = true;
                System.out.println("Is " + x + " equal to " + y + "? - " + equal);
                equal = false;
                if (x<y) equal = true;
                System.out.println("Is " + x + " less than " + y + "? - " + equal);
                if (x<=y) equal = true;
                System.out.println("Is " + x + " less or equal to " + y + "? - " + equal);
                equal = false;
                if (x>=y) equal = true;
                System.out.println("Is " + x + " greater or equal to " + y + "? - " + equal);

                System.out.println("\r\nTask2");
                /*
                2) Ask user to input two boolean values and compare them.
    Input:
       Enter b1: true
       Enter b2: false

    Expected output:
       Is b1 and b2 equal? - false

                 */
                System.out.print("Please, enter true or false: ");
                if (sc.hasNextBoolean()){
                    boolean bool1 = sc.nextBoolean();
                    System.out.print("Please, enter 2nd choice true or false: ");
                    if (sc.hasNextBoolean()){
                        boolean bool2 = sc.nextBoolean();
                        equal = false;
                        if (bool1==bool2) equal = true;
                        System.out.println("Is " + bool1 + " and " + bool2 + " equal? - " + equal);
                        System.out.println("\r\nTask3");
                        /*
                        3) Ask user to input a whole number and output true,
                        if it is even number and false if it is odd number
                        Hint: use remainder operator to divide number by two and get reminder
                        (if reminder is 0 then it means it is even number)
                         */
                        System.out.print("\r\nPlease, enter a whole number: ");
                        if (sc.hasNextInt()){
                            int a = sc.nextInt();
                            boolean even = false;
                            if (a%2==0) even = true;
                            System.out.println("Is " + a + " even number? - " + even);
                            System.out.println("\r\nTask 4");
                            /*
                            4) Ask user to input a whole number and output false,
                            if it is even number and true if it is odd number
                             */
                            System.out.print("\r\nPlease, enter a whole number: ");
                            if (sc.hasNextInt()){
                                int b = sc.nextInt();
                                boolean odd = false;
                                if (b%2!=0) odd = true;
                                System.out.println("Is " + b + " an odd number? - " + odd);
                                System.out.println("\r\nTask 5");
                                /*
                                5) Write a program which reads boolean value from user and prints out
                                the opposite value:
                                Example input: Enter boolean value: true
                                Expected output: Opposite of "true" is "false"
                                 */
                                System.out.print("\r\nPlease enter true or false: ");
                                if (sc.hasNextBoolean()){
                                    boolean bool = sc.nextBoolean();
                                    boolean oppos = false;
                                    if (bool==false) oppos = true;
                                    else oppos = false;
                                    System.out.println("The opposite of " + bool + " is " + oppos);

                                    System.out.println("\r\nTask 6");
                                    /*
                                    6) Write a program which asks the user to input two whole numbers a and b.
                                    Output "true", if one of this condition is true:
                                    1) a and b is equal
                                    2) a is less than 0 and b is greater than 0
                                    3) both of them are greater than 100 otherwise output "false":
                                    Examples:
                                    a is -1 and b is -2 -> false
                                    a is -2 and b is 1 -> true
                                    a is -1 and b is -1 -> true
                                    a is 101 and b is 102 -> true
                                    a is 99 and b is 200 -> false
                                     */
                                    System.out.print("\r\nPlease, enter first whole number: ");
                                    if (sc.hasNextInt()){
                                        int num1 = sc.nextInt();
                                        System.out.print("Please, enter second whole number: ");
                                        if (sc.hasNextInt()){
                                            int num2 = sc.nextInt();
                                            bool = false;
                                            if (num1==num2 || (num1<0 && num2>0) || (num1>100 && num2>100)) bool = true;
                                            System.out.println("1st number is " + num1 + " and 2nd number is " + num2 + " --> " + bool);
                                        }
                                        else {
                                            System.out.println("Error, invalid data. You had to enter a whole number.\r\nProgram end.");
                                            sc.close();
                                        }
                                    }
                                    else {
                                        System.out.println("Error, invalid data. You had to enter a whole number.\r\nProgram end.");
                                        sc.close();
                                    }
                                }
                            }
                            else {
                                System.out.println("Error, invalid data. You had to enter a whole number.\r\nProgram end.");
                                sc.close();
                            }
                        }
                        else {
                            System.out.println("Error, invalid data. You had to enter a whole number.\r\nProgram end.");
                            sc.close();
                        }
                    }
                    else {
                        System.out.println("Error, invalid data. You had to enter true or false.\r\nProgram end.");
                        sc.close();
                    }
                }
                else {
                    System.out.println("Error, invalid data. You had to enter true or false.\r\nProgram end.");
                    sc.close();
                }
            }
            else {
                System.out.println("Error, invalid data. You hat to enter a whole number.\r\nProgram end.");
                sc.close();
            }
        }
        else {
            System.out.println("Error, invalid data. You had to enter a whole number.\r\nProgram end.");
            sc.close();
        }


    }
}
