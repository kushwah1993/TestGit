package test;

public class Hello{	
	
	
	void show() {
		System.out.println("Hello show");
	}
	
	
	public static void main(String[] args){
		int arr[] = {21,11,34,57,40,89,16};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			for(int k=0;k<arr.length;k++) {
				System.out.print(arr[k]+",");
			}
			System.out.println();
		}
		System.out.println("Final");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}
