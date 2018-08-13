import java.util.Scanner;
public class rightshift {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int k=sc.nextInt();
	int i,j;
	int a[]=new int[n];
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	if(n>k){
	int b[]=new int[n];
	for(i=0;i<a.length-k;i++){
		b[i+k]=a[i];
	}
	 int l=0;
	for(j=a.length-k;l<k;j++){
		b[l]=a[j];
		l++;
	}
	for(i=0;i<b.length;i++){
		System.out.print(b[i]+" ");
	}
	}
	else{
		for(i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}}
}
