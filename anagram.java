public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	public static String[] anagram(String[] arr){
	    //int i=0, j=1;  
	    HashMap<String,String> hm = new HashMap<String,String>();
	    for( i=0;i<n;i++){
	        for(int j=i+1;j<n;j++){
	            if(isAnagram(arr[i],arr[j])){
	                if(hm.containsKey(arr[i] || hm.containsKey(arr)[j]))){
	                    String str = hm.get(arr[i]);
	                    hm.put(arr[i], str + "," arr[j]);
	                }
	                else {
	                    hm.put(arr[i],arr[j])
	                }
	            }
	        }
	    }
	    System.out.print("[ ")
	    for(HashMap.Entry<String,String> entry : hm.entrySet()){
	        String key = entry.getKey(), value = entry.getValue();
	        
	        System.out.print(" [" + key + "," + value+ "]" + " ,");
	    }
	    System.out.print("]");
	}
	public static boolean isAnagram(String s1, String s2){
	    int arr1[] = s1.toArray();
	    int arr2[] = s2.toArray();
	    
	    if(arr1.length == arr2.length){
	        for(int i=0;i<arr1.length;i++){
	            if(arr1[i]!=arr2[i]){
	                return false ;
	            }
	        }
	    }
	    else {
	        return false;
	    }
	    return true;
	}
	
}