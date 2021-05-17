import java.util.Scanner;
class pyramid
{
 public static void main(String[]args)
  {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
       for(int j=n;j>i;j--)
        {
           System.out.print(" ");
         }
       for(int k=0;k<2*i+1;k++)
         {
            if((i==0)||(i==n-1))
              System.out.print("*");
            else
            {
               if((k==0)||(k==2*i))
                {
                  System.out.print("*");
                 }
               else
               {
                 System.out.print(" ");
               }
            }
          }
          System.out.println();
       }
   }
}