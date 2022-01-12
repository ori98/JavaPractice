import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        
    	// corner cases
    	if(x == 0)
    		return true;
    	
    	if(x < 0 || x % 10 == 0)
    		return false;
    	
    	
    	// only reverse the number till half and compare
    	// meanwhile modify the original no. to remove those digits
    	
    	int rev = 0;
    	
    	while(x > rev) {
    		rev = rev * 10 + x % 10;
    		x /= 10;
    	}
    	
    	// removing the middle digit in case of odd numbers 
    	// since eg: 121 will break out as 12 .. 1 
    	return ((rev == x) || (rev/10 == x));
    }
}

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Solution solution = new Solution();
		System.out.println(solution.isPalindrome(n));
		
		sc.close();
	}
}
