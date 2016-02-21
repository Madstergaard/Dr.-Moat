public class Question1 {
 // For an n x n matrix of ints, wherein numbers increase across any row (L->R) and down any column...
    // e.g.,
    // | 1  3  5 |
    // | 3  7  8 |
    // | 5 12 15 |
    // Compose a O(n) search fxn.

 public static String boxSearch(int[][] box, int target){
 	int n = box.length;
 	int col = box.length - 1;
 	int row = 0;
 	int current = box[row][col];
	if (current == target){
	    return "Target aquired: (" + row + ", " + col + ")";
	}
 	for (row = 0; row < n; row++){
 		if (target < current){
 			while (current != target){
 				col--;
 				current = box[row][col];
 			}
 			return "Target aquired: (" + row + ", " + col + ")";
 		}
 		else {
 			row++;
 			current = box[row][col];
 		}
 	
 	}
 }
 
 public static void main(String[] args){
	 int[][] matrix = {{1,3,5}, {3,7,8}, {5,12,15}};
	 System.out.println(boxSearch(matrix, 7));
	 System.out.println(boxSearch(matrix, 3));
	 System.out.println(boxSearch(matrix, 5));
	 System.out.println(boxSearch(matrix, 12));
	 int[][] matrix2 = {{1,3,5,7}, {3,7,8,11}, {5,12,15,20}, {7,57,62,85}};
	 System.out.println(boxSearch(matrix2, 7));
	 System.out.println(boxSearch(matrix2, 3));
	 System.out.println(boxSearch(matrix2, 20));
	 System.out.println(boxSearch(matrix2, 85));
}

}
