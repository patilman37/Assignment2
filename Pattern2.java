class Pattern2
{
    public static void main(String args[])
    {
      for(int i=1;i<=9;i++)
      {
        for(int j=9;j>=i;j--)
        {
          System.out.print(" ");
        }
      for(int r=1;r<=i;r++)
      {
        System.out.print(" "+r);
      }
      System.out.println();
     }
    }
}