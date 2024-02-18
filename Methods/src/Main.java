import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //////////////////////// NUMBER 1//////////////////////////////////
//        checkmin();
        //////////////////////// NUMBER 2//////////////////////////////////
//        checknum();
        //////////////////////// NUMBER 3//////////////////////////////////
        Scanner s = new Scanner(System.in);
        System.out.println("Input a password:");
        String password = s.next();
        if(checkpass(password)){
            System.out.println("Password is valid: " + password);
        }
        else{
            System.out.println("Password is Invalid: " + password);
        }
    }

    //////////////////////// NUMBER 3//////////////////////////////////
    public static boolean checkpass(String str){

      if(str.length()<10) {
        System.out.println("Password should be at least 10 characters ");
        return false;

      }

      char c ;
      int digit = 0 ;
      for (int i = 0; i < str.length(); i++) {
            c=str.charAt(i);

      if(Character.isDigit(c)){
          digit++;
                              }
      }
        if(digit<2){
            System.out.println("Password should contain at least 2 digits");
            return false;
        }

        if(!str.matches("[a-zA-Z0-9]+")){
            System.out.println("Password should contain only letters and digits");
            return false;
        }
        return true;
    }



    //////////////////////// NUMBER 1//////////////////////////////////
    public static void checkmin(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = s.nextInt();
        System.out.println("Enter second number : ");
        int n2 = s.nextInt();
        System.out.println("Enter third number: ");
        int n3 = s.nextInt();
        if (n1<=n2 && n1<=n3){
        System.out.println(n1 + " is the smallest number ");
        }
        else if (n2<=n1 && n2<=n3){
            System.out.println(n2 + " is the smallest number ");
        }
        else{
            System.out.println(n3 + " is the smallest number ");
        }
    }
    //////////////////////// NUMBER 2//////////////////////////////////
    public static void checknum(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = s.nextInt();
        if (n>0){
            System.out.println(n + " is a positive number ");
        }
        else if (n<0){
            System.out.println(n + " is a negative number ");
        }
        else{
            System.out.println(n + " is a zero ");
        }
    }






    public static String[] hobby(String a , String b , String c ){
        ArrayList <String> h = new ArrayList<String>();
        h.add(a);
        h.add(b);
        h.add(c);
        System.out.println(h);
        return new String[] {a,b,c};
    }
    public static void check(int n ){
        if (n%2==0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
    public static void checkarray(String[] arr, String c){
      for (String s : arr){
          if(s.contains(c)){
              System.out.println(s);
          }
        }
    }
    public static void checkgrade(int[] g){
        for (int i : g){
            if(i>=60){
                System.out.println(i + " - Pass");
            }
            else{
                System.out.println(i + " - Fail");
            }
        }
    }
}