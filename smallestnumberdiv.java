import java.util.Scanner;
public class smallestnumberdiv {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int l=sc.nextInt();
	int r=sc.nextInt();
	int count=0;
	for(int i=1;i<10000 && count==0;i++){
		if(i%l==0 && i%r==0){
			System.out.println(i);
			count++;
		}
	}
}
}
