import java.util.Scanner;
public class squaredigit {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	long b=0;
	while(a!=0){
		b+=(long)Math.pow((a%10),2);
		a/=10;
	}
	System.out.println(b);	
}
}
