import java.util.Scanner;


public class friendsPairing {
    
    public static int friendpairing(int n){
        if(n == 1 ||n ==2){
            return n;
        }

        // we have 2 choices 1- Friend wants to be single 2- Friend wants to make pair 

        // 1- Friend wants to be single
        int singlefriend = friendpairing(n-1);

        // 2- Friend wants to make pair
        int pairfriend = friendpairing(n-2);
        int ways = (n-1) * pairfriend;

        // total ways of pairing
        int totalpair = ways + singlefriend;

        return totalpair;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Friends!!:");
        int n = sc.nextInt();

        System.out.println("Total number of for " +n+" friends are: " +friendpairing(n));
    }
}
