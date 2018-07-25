import java.util.Scanner;
public class holiday {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
		if(a.equalsIgnoreCase("sunday") ||a.equalsIgnoreCase("saturday")){
			System.out.println("yes");
		}
		else 
			System.out.println("no");
		
		}
}

