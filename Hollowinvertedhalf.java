class HollowInvertedHalf
{
     public static void main(String args[])
     {
       for(int i=1;i<=6;i++)
       { 
         System.out.print("* ");
       }
      System.out.println();
     for(int j=5;j>=1;j--)
     {
      for(int i=1;i<=j;i++)
      {
       if(i == 1 || i == j)
       {
         System.out.print("* ");
       }
       else
       {
        System.out.print(" ");
       }
      }
      System.out.println();
     }
    }
   }
