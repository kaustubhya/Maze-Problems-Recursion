public class Backtracking_All_direction_maze {
    public static void main(String[] args) { 

        boolean[][] board = {
            {true, true, true},
            {true, true, true},
            {true, true, true}
        };
        paths("", board, 0, 0);
        
    }

    static void paths(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if(!maze[r][c]) {
            return;
        }

        // I am considering this block in my path
        maze[r][c] = false;

        if(r > 0) {
            // Arrays start from zero
            paths(p + "U", maze, r - 1, c);
        }

        if(c > 0) {
            paths(p + "L", maze, r, c - 1);
        }

        if (r < maze.length - 1) {
            paths(p + "D", maze, r + 1, c);
        }

        if(c < maze[0].length - 1) {
            paths(p + "R", maze, r, c + 1);
        }

        // This line tells us that the function ends and we exit one recursion call and move on to the next one,
        //  hence we are reverting back all the changes that we've made
        maze[r][c] = true;
    }


}