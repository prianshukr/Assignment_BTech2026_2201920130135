import java.util.*;

interface divSum { int divisor_sum(int n); }

class AdvancedArithmetic implements divSum { public int divisor_sum(int n){ int sum = 0; for(int i=1; i<=n; i++) { if(n%i==0) sum = sum + i; } return(sum); } }

public class Solution {

public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    AdvancedArithmetic a = new AdvancedArithmetic();
    int ans = a.divisor_sum(n);
    System.out.println("I implemented: "+a.getClass().getName());
    System.out.print(ans);
}
}
