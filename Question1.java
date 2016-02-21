public class Question1 {
 // For an n x n matrix of ints, wherein numbers increase across any row (L->R) and down any column...
    // e.g.,
    // | 1  3  5 |
    // | 3  7  8 |
    // | 5 12 15 |
    // Compose a O(n) search fxn.

 public static String boxSearch(int[][] box, int target){
 }
 
 public static void main(String[] args){
	 int[][] matrix = {{1,3,5}, {3,7,8}, {5,12,15}};
	 System.out.println(boxSearch(matrix, 7));
	 System.out.println(boxSearch(matrix, 3));
	 System.out.println(boxSearch(matrix, 5));
	 System.out.println(boxSearch(matrix, 12));
	 int[][] matrix = {{1,3,5,7}, {3,7,8,11}, {5,12,15,20}, {7,57,62,85}};
	 System.out.println(boxSearch(matrix, 7));
	 System.out.println(boxSearch(matrix, 3));
	 System.out.println(boxSearch(matrix, 20));
	 System.out.println(boxSearch(matrix, 85));
}
