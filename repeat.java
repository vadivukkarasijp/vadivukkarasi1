import java.util.Scanner;
public class repeat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int d=0,count=0,count1=0;
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		count=0;
		for(int j=0;j<n;j++){
			if(a[i]==a[j]){
				count++;
			}
		}
		if(count==1){
			System.out.println(a[i]);
		}
	}
	
}
}
