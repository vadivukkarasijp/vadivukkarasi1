import java.util.Scanner;
public class alphareverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String b=sc.next();
	char ch[]=b.toCharArray();
	String d="";
	int count=0,count1=0;
	char c[]={'a','e','i','o','u','A','E','I','O','U'};
	for(int i=0;i<a;i++){
		count=0;
		count1=0;
		for(int j=0;j<c.length;j++){
			if(ch[i]==c[j]){
				count++;
			}
		}
		if(count==0 && count1==0){
				d+=ch[i];
				count1++;
			}
		}
	StringBuffer sb=new StringBuffer(d);
	System.out.println(sb.reverse());	
}
}
