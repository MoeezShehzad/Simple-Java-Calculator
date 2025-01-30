import java.util.Scanner;

class Calculator {
    Scanner scan = new Scanner(System.in);
    int a;
    int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return a + b;
    }

    public int sub() {
        return a - b;
    }

    public int mul() {
        return a * b;
    }

    public int div(){
        if(b==0){
            System.out.println("Cannot divide by zero, Syntax Error");
            return 0;
        }else{
            return a/b;
        }
    }

    public void getVal() {
        System.out.print("Enter 1st number: ");
        a = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        b = scan.nextInt();
    }
}

public class Calc {

    public static void main(String[] args) {
        
        Calculator c = new Calculator(0, 0);
        Scanner scan = new Scanner(System.in);
        boolean keepRunning = true;
        
       while(keepRunning){ 
        System.out.println("\nWelcom to Calculator");
        System.out.println("**************");
        System.out.println("Enter choice \n1.Addition \n2.Subtrraction \n3.Multiplication \n4.Division \n5.Exit");
        System.out.println("**************");
        
        int n = scan.nextInt();
        switch (n) {
            case 1:
                c.getVal();
                System.out.print(c.add());
                break;
            case 2:
                c.getVal();
                System.out.print(c.sub());
                break;
            case 3:
                c.getVal();
                System.out.print(c.mul());
                break;
            case 4:
                c.getVal();
                System.out.print(c.div());
                break;
            case 5:
                System.out.println("Exiting...");
                keepRunning = false;
                break;
            default:
                System.out.println("Wrong choice, Please select from above options");
        }
    }
        scan.close();
    }
}
