public class Math {
    public static double average(int n , int m){
        double result= sum(n,m);
        System.out.println("The Average is : "+ result/2);
        return result;
    }
    public static int sum(int n , int m){
        return n+m;
    }

    public static int subtract(int n , int m){
        System.out.println("The subtraction is : "+ (n-m));
        return n-m;
    }
}
