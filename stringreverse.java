package programs;
import java.util.Scanner;
public class stringreverse{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
			StringBuffer sb=new StringBuffer(a);  
			sb.reverse();
			System.out.println(sb);
			}}
