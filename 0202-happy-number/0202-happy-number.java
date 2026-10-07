class Solution {
    public  int fun(int n ){
        int sum = 0;
        while(n > 0){
             int d = n % 10; // this will give me the last digit of the no eg 58 i will store 8 in d
             n = n/10;
             sum = sum + d * d;

        }
        return sum;
       


    }
    public boolean isHappy(int n) {

      int slow = n;
      int fast = n;
   

        while(fast != 1){
                  slow = fun(slow);
         fast = fun(fast);
        fast = fun(fast);

        if(slow == fast && slow != 1){// this means it has entered into a endless cycle

            return false;
        }

        }
        return true;
        
    }
}