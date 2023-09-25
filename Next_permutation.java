//https://leetcode.com/submissions/detail/1058849287/

public int maxProfit(int[] prices) {
        
        
      int min_so_far= prices[0];
      int ans=0;
        
      for(int i=1; i<prices.length;i++){
          
          int curr_profit= prices[i]-min_so_far;
          ans= Math.max(ans, curr_profit);
          
          min_so_far= Math.min(prices[i], min_so_far);
          
          
      }
       
        return ans;
    
    }
