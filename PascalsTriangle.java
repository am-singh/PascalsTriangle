import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * PascalsTriangle
 * 
 * Simple demonstration of pascals triangle.<br>
 * <br><br>
 * Time complexity = {@code O(numberOfRows^2)}
 * <br><br>
 * Space complexity = {@code O(numberOfRows^2)}
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println("- Executing pascals triangle now -");
        List<List<Integer>> pascalsTriangle = generate(10);

        for (List<Integer> row : pascalsTriangle) {
            System.out.println(Arrays.toString(row.toArray()));
        }
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> curr = new ArrayList<>();

            curr.add(1);
            for (int j = 1; j < i; j++) {
                curr.add(prev.get(j - 1) + prev.get(j));
            }
            curr.add(1);
            triangle.add(curr);
        }
        return triangle;
    }

}