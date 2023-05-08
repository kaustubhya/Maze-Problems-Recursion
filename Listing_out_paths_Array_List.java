import java.util.ArrayList;

public class Listing_out_paths_Array_List {


    public static void main(String[] args) {
        System.out.println(pathRet("", 4, 4));
        
    }

    static ArrayList<String> pathRet (String processed, int row, int column) {
        if(row == 1 && column == 1) {
         ArrayList<String> list = new ArrayList<>();
         list.add(processed);
         return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        if(row > 1) {
            ans.addAll(pathRet(processed + "D", row - 1, column));
        
        }

        if(column > 1 ) {
            ans.addAll(pathRet(processed + "R", row, column -1));
        }

        return ans;
    } 
}
