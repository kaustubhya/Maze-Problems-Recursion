public class going_down_right_diagnolly {
    public static void main(String[] args) {
        pathDiag("", 4, 4);       
    }
    

    static void pathDiag(String processed, int row, int column) {
        if(row == 1 && column ==1) {
            System.out.println(processed);
            return;
        }

        if(row > 1) {
            pathDiag(processed + "D", row - 1, column);
        }

        if(column > 1) {
            pathDiag(processed + "R", row, column - 1);
        }

        if(row > 1 && column > 1) {
            pathDiag(processed + "S", row - 1, column - 1);
            // S means slanting i.e. diagnolly
        }
    }
}
