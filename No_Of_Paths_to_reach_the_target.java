public class No_Of_Paths_to_reach_the_target {
    public static void main(String[] args) {
        System.out.println(path_count(4, 4));
        
    }

    static int path_count(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
            // Base Condition, target reached
        }

        int left_recursion = path_count(row - 1, column);
        // Here we keep on reducing rows and keep going down
        int right_recursion = path_count(row, column - 1);
        // Here we keep on reducing columns and keep going right
        return left_recursion + right_recursion;
    } 
    
}
