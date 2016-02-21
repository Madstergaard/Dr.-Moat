public class Question2 {
  // For an array of integers 1 to n...
    // If 1 num duplicated & 1 num missing,
    // e.g.,
    // [ 2, 1, 2, 4 ]  is missing 3
    // Compose a function to find the missing number in linear ( O(n) ) run time and using constant ( O(1) ) additional space
    // ( Array modification is allowed, but creating a temporary array is not.)
    
    public static int findMissing(int[] list){}
    
    public static void main(String[] args){
	    int[] list = {1,2,2,4};
	    System.out.println(findMissing(list));
	    int[] list2 = {1,3,1,4};
	    System.out.println(findMissing(list2));
    }
}
