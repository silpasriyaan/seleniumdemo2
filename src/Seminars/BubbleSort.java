package Seminars;
public class BubbleSort {
	static void bubbleSort(int[] arr) {  
		int n = arr.length;  
		//int temp = 0;  
		for(int i=0; i < n; i++){  
			for(int j=1; j < (n-i); j++){  
				if(arr[j-1] > arr[j]){  
					//swap elements  
//					temp = arr[j-1];  //c=b;
//					arr[j-1] = arr[j];  //b=a;
//					arr[j] = temp;  //a=c;
					//without temp vriable
					arr[j]=arr[j]+arr[j-1];  //a=a+b;+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
					arr[j-1]=arr[j]-arr[j-1];//b=a-b;
					arr[j]=arr[j]-arr[j-1];//a=a-b;
				}  
			}  
		}  
	}  
	public static void main(String[] args) {  
		int arr[] ={1,3,0,6,9,7};  

		System.out.println("Array Before Bubble Sort");  
		
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  
		System.out.println();  
        bubbleSort(arr);//sorting array elements using bubble sort  
        System.out.println("Array After Bubble Sort");  
		for(int i=0; i < arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  

	}  
}  

