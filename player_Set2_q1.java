import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String Saturday,Sunday;
    if (s.equals("Saturday")||s.equals("Sunday")||s.equals("saturday")||s.equals("sunday"))
    {
        System.out.println("yes");
        
    }
    else
    System.out.println("no");

    
	}
  }
