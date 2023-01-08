import java.util.List;

public class BubbleSort {
    public static <T extends Comparable<T>> List<T> sort(List<T> input) {
        if (input == null) {
            throw new RuntimeException("Input list cannot be null");
        }

        int n = input.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (input.get(j) == null) {
                    continue;
                }
                if (input.get(j).compareTo(input.get(j+1)) > 0 && input.get(j) != null && input.get(j+1) != null ) {
                    T temp = input.get(j);
                    input.set(j, input.get(j+1));
                    input.set(j+1, temp);
                }
            }
        }
        return input;
    }
}