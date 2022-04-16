/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	public static int coupleEntry(int[] arr ){
	    int n = arr.length();
	    HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
	    for(int i=0;i<n;i++){
	        if(hm.containsKey(arr[i])){
	            int temp = hm.get(arr[i]);
	            hm.put(arr[i],temp+1);
	        }
	        else{
	            hm.put(arr[i],1);
	        }
	    }
	    //Now iterating over hashmap to find the possible pairs 
	    int count =0;
	    for(HashMap.Entry<Integer,Integer> entry : hm.entrySet()){
	        int key = entry.getKey(), value = entry.getValue();
	        if(value >=2){
	            count = count+(value(value-1))/2;
	        }
	        
	    }
	    return count;
	}
}
