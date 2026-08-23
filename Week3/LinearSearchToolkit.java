public class LinearSearchToolkit {

    public static boolean contains(int[] values, int target) {
        if (values == null || values.length == 0) {
            System.err.println("Nothing inside the array passed.");
            return false;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int firstIndexOf(int[] values, int target) {
        if (values == null || values.length == 0) {
            System.err.println("Nothing inside the array passed, it is either null or empty.");
            return -1;
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int lastIndexOf(int[] values, int target) {
        if (values == null || values.length == 0) {
            System.err.println("Nothing inside the array passed, it is either null or empty.");
            return -1;
        }
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int countOccurrences(int[] values, int target) {
        if (values == null || values.length == 0) {
            return 0;
        }
        int count = 0;
        for (int val : values) {
            if (val == target) {
                count++;
            }
        }
        return count;
    }
}
