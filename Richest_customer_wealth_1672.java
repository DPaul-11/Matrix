package Leetcode;

public class Richest_customer_wealth_1672 {
    public static void main(String[] args) {
        int[][] accounts={{1,2,3},{3,2,1}};
        Richest_customer_wealth_1672 ob=new Richest_customer_wealth_1672();
        System.out.println(ob.maximumWealth(accounts));
    }
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++)
        {
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                wealth+=accounts[i][j];
                maxwealth=Math.max(maxwealth,wealth);
            }
        }
        return maxwealth;
    }
}
