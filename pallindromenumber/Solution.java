package pallindromenumber;

public class Solution {
    public boolean isPallindrome(int x) {
        if(x<0) return false;
        if(x==0) return true;
        int rev=0,rem = 0,temp=x;
        while(x!=0){
            rem = x%10;
            x=x/10;
            rev = rev*10 + rem;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isPallindrome(121));
    }

}