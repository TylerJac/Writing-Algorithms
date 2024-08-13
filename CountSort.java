public class CountSort {

    // Function to perform counting sort on arr[]
    public static void main(String[] args) {
        String s = "edsab";
        System.out.println(countingSort(s));
    }

    public static String countingSort(String s) {
        int n = 5;
        int[] count = new int[26]; // Array to store the frequency of each character

        // Count the frequency of each character in the string
        for (int i = 0; i < n; i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Build the sorted string
        StringBuilder sortedString = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                sortedString.append((char) (i + 'a'));
                count[i]--;
            }
        }

        return sortedString.toString();
    }
}

