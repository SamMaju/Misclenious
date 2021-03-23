package misclenious;

public class TestSort {

	static void bublesort() {
		int[] arr1= {2,5,34,65,5,1,7};
		int temp=0;
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=1;j<arr1.length-i;j++) {
				if(arr1[j-1]<arr1[j]) {
					temp=arr1[j-1];
					arr1[j-1]=arr1[j];
					arr1[j]=temp;
				}
			}
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}
	
	
	static void puzzle() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bublesort();
	}

}


//Compare and ComapreTo