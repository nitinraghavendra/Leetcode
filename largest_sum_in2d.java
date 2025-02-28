

public class largest_sum_in2d{
    public static void main(String[] args) {
        int[][] accounts = {
            {34,3,5,3,7},
            {6,4},
            {11,2,3,3},
        };
        System.out.println(maximumWealth(accounts));
        
    }
    public static int maximumWealth(int[][] accounts) {
        int wealth = 0 ;
        for(int i = 0 ; i < accounts.length; i++){
            int sum = 0 ;
            
            for(int j = 0 ; j < accounts[i].length;j++){
                
                sum += accounts[i][j];
            }

            
            if(sum > wealth ){
                wealth = sum;
            }


        }

        return wealth;
    }

}