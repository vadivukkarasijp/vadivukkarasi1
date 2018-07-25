import java.util.Scanner;
public class differ{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String e=sc.next();
	char c[]=e.toCharArray();
	char b[]=a.toCharArray();
	int count=0;
	String d="";
	int count1=0;
	for(int i=0;i<=b.length;i++){
		for(int j=i+1;j<b.length;j++){
			count++;
			if((( count<b.length-1 )&&b[i]==c[j])) {	
				d="yes";
				count1++;
			}
			if(((count==b.length-1) && b[i]!=c[j]) && count1!=0){
				d="yes";
			}
			else if(count1==0){
				d="no";
			}
		}
	}
	System.out.println(d);
}
}
