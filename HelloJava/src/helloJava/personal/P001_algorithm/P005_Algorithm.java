package helloJava.personal.P001_algorithm;


//배열의 중복값 제거
public class P005_Algorithm {

    public static void main(String[] args) {

		int[] arr ={0,0,1,1,1,2,2,3,3,4}; 
		int len = arr.length-1;
		int count=1; 

		for(int i=0; i<len; i++){
			
			if(arr[i] != arr[i+1]){
				arr[count++] = arr[i+1]; 
			}
		}

		for(int i=0; i<count; i++){
			System.out.print(arr[i]+" ");
		}
	
	}
    
}
