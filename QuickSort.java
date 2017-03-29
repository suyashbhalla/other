import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		int N = scan.nextInt();
		
		int ar[]=new int[N];
		
		for(int i=0;i<N;i++){
			ar[i]=scan.nextInt();
		}
		
		quicksort(ar,0,N-1);
		
		System.out.println(Arrays.toString(ar));

		scan.close();
	}

	
	public static void quicksort(int ar[],int low,int high){
		if(low>=high){
			return;
		}
		int p=partition(ar,low,high);
		quicksort(ar, low, p-1);
		quicksort(ar, p+1, high);
	}


	private static int partition(int[] ar, int low, int high) {
		// TODO Auto-generated method stub
		int p=low;
		
		for(int i=low;i<high;i++){
			if(ar[i]<ar[high]){
				swap(ar,i,p);
				p++;
			}
		}
		swap(ar,p,high);
		return p;
	}


	private static void swap(int ar[],int i, int j) {
		// TODO Auto-generated method stub
		int x=ar[i];
		ar[i]=ar[j];
		ar[j]=x;
	}
}
