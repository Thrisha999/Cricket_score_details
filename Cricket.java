//cricket_scores_details
import java.util.Scanner;
class Cricket
{
  public static void main(String[] args)
  {
     int n=11,i;
     int r[] = new int[n];
     String s[] = new String[n];
     Scanner in = new Scanner(System.in);
     System.out.println("enter cricketer details:");
     for(i=0;i<n;i++)
     {
       System.out.println("enter"+(i+1)+"name");
       s[i] = in.nextLine();
       System.out.println("enter"+(i+1)+"score");
       r[i] = in.nextInt();
       in.nextLine();
     }
     System.out.println("Scorecard");
     for(i=0;i<n;i++)
     {
       System.out.print("s[i]");
       System.out.print(" "+r[i]);
       System.out.println();
     }
     int m=0;
     for(i=0;i<n;i++)
     {
       if(r[i]>r[m])
       m=i;
     }
     System.out.println("****highest scorer****");
     System.out.println(s[m]+" - "+r[m]+"runs");
  }
}
