public class Maze_with_obstacles {
    
    public static void main(String[] args) {
        boolean[][] board = {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
        pathRestrictions("", board, 0, 0);
        
    }



    static void pathRestrictions(String p, boolean[][] maze, int r, int c) {
        if(r == maze.length - 1 && c == maze[0].length - 1) {
        System.out.println(p);
        return;
        }

    

      if(!maze[r][c]) {
        return;
        // obstacle condition, here if we get false then we have to return the recursion call empty
      }

      if(r < maze.length - 1) {
        pathRestrictions(p + "D", maze, r + 1, c);
        // here we go from 0 to 2 hence we do r + 1
    
      }

    if(c < maze.length - 1) {
        pathRestrictions(p + "R", maze, r , c + 1);
        // here we go from 0 to 2 hence we do c + 1

    }
}
}

    
    
   

