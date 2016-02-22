public class Question2 {
  // For an array of integers 1 to n...
    // If 1 num duplicated & 1 num missing,
    // e.g.,
    // [ 2, 1, 2, 4 ]  is missing 3
    // Compose a function to find the missing number in linear ( O(n) ) run time and using constant ( O(1) ) additional space
    // ( Array modification is allowed, but creating a temporary array is not.)
    
    public static String findMissing(int[] list){
    	int numToChange = list[0];
    	int min = list[0];
    	int minIndex = 0;
	for (int indexToChange = 0; indexToChange < list.length; indexToChange++){
		numToChange = list[indexToChange];
		min = numToChange;
		minIndex = indexToChange;
		for (int i = indexToChange; i < list.length; i++){
			if (list[i] < list[minIndex]){
				minIndex = i;
				min = list[minIndex];
			}
			list[indexToChange] = min;
			list[minIndex] = numToChange;
		}
	}
	String str = "";
	for (int i = 0; i < list.length; i++){
		str += list[i] + ", ";
	}
	System.out.println("[" + str + "]");
	for (int i = list.length - 1; i > -1; i--){
		if (list[i] != (i + 1)){
				return "The number missing is " + (i + 1);
			}
	}
	return "-1";
    }
    
    public static void main(String[] args){
	    int[] list = {1,2,2,4};
	    System.out.println(findMissing(list) + " (should be 3)");
	    int[] list2 = {1,3,1,4};
	    System.out.println(findMissing(list2) + " (should be 2)");
    }
}
