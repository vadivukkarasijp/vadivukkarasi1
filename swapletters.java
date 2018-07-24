import java.util.Scanner;
public class Guvinine {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	char b[]=a.toCharArray();
	int i=0;
	int count=0;
char d;
	for(i=0;i<b.length;i++){
		for(int j=i+1;j<b.length;j++){
		d=b[i];
		count++;
		b[i]=b[j];
		b[j]=d;
		if(count!=2)
		System.out.print(b[i]+" "+b[j]+" ");
		}
		break;
	}
	
}
}
