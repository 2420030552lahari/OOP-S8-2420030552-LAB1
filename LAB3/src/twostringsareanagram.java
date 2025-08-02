import java.util.Arrays;
public class twostringsareanagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str1 = "listen";
		        String str2 = "silent";

		        char[] a = str1.toCharArray();
		        char[] b = str2.toCharArray();

		        Arrays.sort(a);
		        Arrays.sort(b);

		        if (Arrays.equals(a, b)) {
		            System.out.println("Anagrams");
		        } else {
		            System.out.println("Not Anagrams");
	}
	}}

