import java.util.Scanner;
import java.util.Arrays;
public class repeatingletters {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String b=sc.nextLine();
	char c[]=b.toCharArray();
	int i;
	int a=0;
	int temp=0;
	char d=' ';
	int length=c.length-1;
	while(length!=0){
		temp=0;
		for(i=0;i<=length;i++){
			if(c[length]==c[i]){
				temp++;
			}
		}
			if(temp>a){
				a=temp;
				d=c[length];
				}
		
		length--;
	}
	System.out.println(d);
	}
}
