import java.util.Scanner;
public class vowelconsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	      System.out.print("Enter the character :");
	      boolean x=false;
	      int ch=sc.next().charAt(0);
	      if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')) {
	       x=true;
	      }
	      if(x==true) {
	       System.out.println("It is a vowel");
	      }else {
	       System.out.println("It is a consonant");
	      }
	}

}
