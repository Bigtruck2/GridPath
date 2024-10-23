public class Main {
    public static void main(String[] args) {
        int[][] grid  = {{12, 3, 4, 13,5},{11,21,2,14,16},
                {7,8,9,15,0},{10,17,20,19,1},{18,22,30,25,6}};
        GridPath gridPath = new GridPath(grid);
        Location location = gridPath.getNextLoc(4,3);
        System.out.println(gridPath.sumPath(1,1));
    }
}