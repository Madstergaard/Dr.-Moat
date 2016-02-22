public class Question2 {
  // For an array of integers 1 to n...
    // If 1 num duplicated & 1 num missing,
    // e.g.,
    // [ 2, 1, 2, 4 ]  is missing 3
    // Compose a function to find the missing number in linear ( O(n) ) run time and using constant ( O(1) ) additional space
    // ( Array modification is allowed, but creating a temporary array is not.)
    
    public static String findMissing(int[] list){
    	int numToChange = list[0];
    	int indexToChange = 0;
    	int min = list[0];
    	int minIndex = 0;
	for (indexToChange; indexToChange < list.length; indexToChange++){
		for (i = indexToChange; i < list.length; i++){
			numToChange = list[i];
			min = numToChange;
			minIndex = indexToChange;
			if (list[i] < list[minIndex]){
				minIndex = i;
				min = list[minIndex];
			}
			list[indexToChange] = min;
			list[minIndex] = numToChange;
			if (min != (indexToChange + 1)){
				return "The number missing is " + indexToChange + 1;
			}
		}
	}
    }
    
    public static void main(String[] args){
	    int[] list = {1,2,2,4};
	    System.out.println(findMissing(list));
	    int[] list2 = {1,3,1,4};
	    System.out.println(findMissing(list2));
    }
}
