import java.util.Arrays;

public class FllodFillMain {
    public static void main(String[] args) {
        FloodFill sol = new FloodFill();

        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1, sc = 1, newColor = 2;

        int[][] result = sol.floodFill(image, sr, sc, newColor);

        System.out.println("Flood filled image:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}














