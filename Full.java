class Full
{
    public static void main(String args[])
    {
      for(int i=1;i<=6;i++)
      {
        for(int j=6;j>=i;j--)
        {
          System.out.print(" ");
        }
      for(int r=1;r<=i;r++)
      {
        System.out.print(" *");
      }
       System.out.println();
      }
    }
}