class P5
{
     public static void main(String args[])
     {
       int i,j;
       int space =20;
       for(i=1;i<=9;i++)
       {
         for(j=1;j<=space;j++)
         {
            System.out.print(" ");
         }
         for(j=1;j>1;j--)
         {
            System.out.print((10-j)+" ");
         }
         space--;
         space--;
         for(j=1;j<=i;j++)
         {
              System.out.print((10-j)+" ");
         }
        System.out.println();
      }
     }
 }      