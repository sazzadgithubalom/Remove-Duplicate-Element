public class RemoveDuplicateElement{
	public static void main (String args[]){
		int arr[]={10,2,15,12,10,15,15,20,18,152,14,13,13,25,15,10,2};
		int temp[] = new int[arr.length];
		int visited = -1;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++ ){
				if(arr[i]==arr[j]){
				temp[j] = visited;
			}
		}	
	}
	for(int i=0; i<temp.length; i++){
	if(temp[i] != visited){
		System.out.print(" "+arr[i]);	
	}	
	}
    }


}