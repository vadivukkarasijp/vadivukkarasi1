import java.util.Scanner;
public class camelcase{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.nextLine();
	String c="",d="";
	String b[]=a.split("\\s");
	int count1=0;
	for(int i=0;i<b.length;i++){
		for(int j=i+1;j<b.length;j++){
			 c=(b[i].substring(0,1)).toUpperCase()+b[i].substring(1);
			 d=(b[j].substring(0,1)).toUpperCase()+b[j].substring(1);
		}
		break;
		}
	System.out.println(c+" "+d);			
}
}
