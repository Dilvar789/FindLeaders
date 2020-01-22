import java.util.Scanner;

public class FindLeaders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the no. elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i]) {
					flag=0;
					break;
				}
				else {
					flag=1;
				}
			}
			if(flag==1) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.print(arr[n-1]);
		sc.close();
	}
}