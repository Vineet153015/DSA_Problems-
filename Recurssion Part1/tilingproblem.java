// Given a "2xn" board and tile of the size "2x1", count the number of the ways to tile the given board using the "2x1" tiles. 
// (A tile can either be placed horizontally or vertically)




public class tilingproblem {
    
    public static int tilingproblem(int n){   // 2 x n size of the floor

        // Base Case 
        if(n == 0 || n == 1){
            return 1;
    }

    // // vertical choice
    // int verticalTile = tilingproblem(n-1);

    // // horizontal choice
    // int horizontalTile = tilingproblem(n-2);

    // int totalways = verticalTile + horizontalTile;
    // return totalways;


    // optimised case 
    return tilingproblem(n-1) + tilingproblem(n-2);
    }

    public static void main(String[] args) {
        System.out.println(tilingproblem(3));
    }
}
