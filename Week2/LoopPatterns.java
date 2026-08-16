
public class LoopPatterns 
{void patternA(){
   for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
        {
            System.out.print("*");
        }
        System.out.println();
    }  
}
   void patternB()
   {
      for(int i=0;i<4;i++)
        {
        for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
         System.out.println();
        }
   }
   void patternC()
   {
      for(int i=0;i<4;i++)
        {
        for(int j=0;j<=i;j++)
            {
                System.out.print(j+1);
            }
        System.out.println();
        }
   }
   void patternD()  
   {
      for(int i=4;i>0;i--)
        {
        for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
        System.out.println();
        }
   }
   void patternE()
   {
        for(int i=0;i<4;i++)
        {
        for(int j=0;j<=i;j++)
            {
                System.out.print(i+1);
            }
         System.out.println();
        }
   }
}