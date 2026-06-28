class Solution {
    public boolean isPalindrome(int x) {
         int digit = x ;
        if(x<0){
            return false ;
        }
         int lastdigit = 0 ;
         int reverse = 0 ;
         while(x!=0){
             lastdigit = x%10;
             reverse = reverse*10+lastdigit;
             x=x/10;
         }
         if(reverse==digit){
            return true;
         }
         else{
            return false ;
         }
    }
}