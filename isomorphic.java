import java.util.Scanner;
public class isomorphic {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	String a=sc.next();
	String b=sc.next();
	String d="";
	int count=0,count1=0,count2=0;
	char ch[]=a.toCharArray();
	char ch1[]=b.toCharArray();
	for(int i=0;i<ch.length;i++){
		for(int j=i+1;j<ch.length;j++){
		if(ch[i]==ch[j]){
			if(ch1[i]==ch1[j]){
				d="yes";
				count++;
			}
		}
		}
		if((a.substring(0,2)).equals(b.substring(0,2))&& count==0){
			d="yes";
			count1++;
		}
		if((a.charAt(0))==(b.charAt(0)) && count1==0 && count==0){
			d="yes";
			count2++;
		}
		else if(count==0 && count1==0&& count2==0){
			d="no";
		}
}
	System.out.println(d);
}
}
