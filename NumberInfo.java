import java.util.Scanner;
public class NumberInfo{
    public static void main(String[]args){
        System.out.println("exp.java");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        even(a);
        prime(a);
        DivisibleBy(a);
    }
    public static int even(int a){
        int b = a%2 ;
        if (b == 0){
            System.out.println("Number is Even ");
        } else {
            System.out.println("Number is Odd");
        }
        return 0;
    }

    public static boolean prime(int a){
        if (a>2){
            if (a%2 == 0){
                System.out.println("Composite : ");
            }else {
                double b = a/2 - 0.5;
                int c = 0;
                for (int i = 2; i < b+1; i++) {
                    c = a%i;
                    if (c == 0) {
                        System.out.println("Composite");
                        return false;
                    }
                }
                System.out.println("Prime");
            }
        }else if (a==2){
            System.out.println("Prime");
            return true;
        }
        return true;
    }

    public static boolean DivisibleBy(int a){
        System.out.print("Divisible ");
        for (int i = 1 ; i<a ; i++){
            int b = a%i;
            if (b == 0){
                System.out.print(i + " ");
            }
        }
        return true;
    }
}