import java.util.Arrays;
public class Printing_paths_and_Showing_them_using_backtracking {
    
    public static void main(String[] args) { 

        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };

        int[][] path = new int [board.length][board[0].length];
        // Here we take the board length and not the final variable, hence we exclude the last -1 from here
        pathPrint("", board, 0, 0, path, 1);
        // first step is 1
        
    }

    static void pathPrint(String p, boolean[][] maze, int r, int c, int [][] path, int step) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            // the last step is also counted as a step here
            for(int[] arr: path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            // Printing the directions with the path here
            System.out.println();
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;

        // Adding steps to the path 
        path[r][c] = step;

        if(r > 0) {
            // Arrays start from zero
            pathPrint(p + "U", maze, r - 1, c, path, step + 1);
            // After each recursion call, step increments by 1
        }

        if(c > 0) {
            pathPrint(p + "L", maze, r, c - 1, path, step + 1);
        }

        if (r < maze.length - 1) {
            pathPrint(p + "D", maze, r + 1, c, path, step + 1);
        }

        if(c < maze[0].length - 1) {
            pathPrint(p + "R", maze, r, c + 1, path, step + 1);
        }

        // This line tells us that the function ends and we exit one recursion call and move on to the next one,
        //  hence we are reverting back all the changes that we've made
        maze[r][c] = true;

        // resetting the path to zero
        path[r][c] = 0;
    }
}



