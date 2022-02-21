// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] arr;
    int max = Integer.MIN_VALUE;
    int longestCommonSubstr(String S1, String S2, int n, int m){
        String a1[]=S1.split("");
        String a2[] = S2.split("");
        arr = new int[n+1][m+1];
        for(int i =0;i<n+1;i++){
            for(int j=0;j<m+1;j++){
                if(i==0 || j==0){
                    arr[i][j]=0;
                    continue;
                }
                if(a1[i-1].equals(a2[j-1])){
                    arr[i][j]=1+arr[i-1][j-1];
                    if(arr[i][j]>max)
                        max=arr[i][j];
                }else
                    arr[i][j]=0;
            }
        }
        return  max==Integer.MIN_VALUE?0:max;
    }
}
