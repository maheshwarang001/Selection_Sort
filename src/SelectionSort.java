public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {3, 1, 7, 4, 2, 5};
        int n = a.length;

        // One by one move boundary of unsorted subarray
        for (int x = 0; x < n - 1; x++) {

            int min_index = x;

            // Find the minimum element in unsorted array
            for (int y = x ; y < n; y++) {
                if (a[y] < a[min_index]) {
                    min_index = y;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = a[x];
            a[x] = a[min_index];
            a[min_index] = temp;

        }

        for (int e : a) {
            System.out.print(e + " ");
        }
    }
}
