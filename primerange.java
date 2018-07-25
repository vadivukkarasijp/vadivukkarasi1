import java.util.Scanner;
public class primerange {
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int i,j;
	int count=0,count1=0;
	for(i=a;i<=b;i++){
		count=0;
		for(j=2;j<=i;j++){
			if(i%j==0){
				count++;
			}
		}
		if(count==1){
			count1++;
		}
	}
	System.out.println(count1);
}
}
