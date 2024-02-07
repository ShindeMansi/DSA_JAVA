public class Solution {
    
    public static int[] getSecondOrderElements(int n, int []a) {
      int ans[]=new int[2];
      int ssmallest=Integer.MAX_VALUE;
      int small=a[0];
      for(int i=0;i<n;i++)
      {
          if(a[i]<small)
          {
              ssmallest=small;
              small=a[i];
          }
          else if(a[i]<ssmallest && a[i] != small)
          {
              ssmallest=a[i];
          }
      }
      int slargest=-1;
      int large=a[0];
      for(int i=0;i<n;i++)
      {
          if(a[i]>large)
          {
              slargest=large;
              large=a[i];
          }
          else if(a[i]>slargest && a[i] !=large)
          {
              slargest=a[i];
          }
      }
      ans[0]=slargest;
      ans[1]=ssmallest;
      return ans;
    }
}