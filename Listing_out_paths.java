public class Listing_out_paths {
    public static void main(String[] args) {
        path("", 4, 4);
        
    }

    static void path(String processed, int row, int column) {
        if(row == 1 && column ==1) {
            System.out.println(processed);
            return;
        }

        if(row > 1) {
            path(processed + "D", row - 1, column);
        }

        if(column > 1) {
            path(processed + "R", row, column - 1);
        }
    }
    
}
