public class HappyNumber {
    public static boolean isHappy(int n) {
        // Use a set to keep track of seen numbers to detect cycles
        Set<Integer> seen = new HashSet<>();

        while (n != 1) {
            // Calculate the sum of squares of digits
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }

            // If the sum is already seen, it's in a cycle, so return false
            if (seen.contains(sum)) {
                return false;
            }

            // Otherwise, mark the sum as seen and continue with the new sum
            seen.add(sum);
            n = sum;
        }

        // If we reach 1, it's a happy number
        return true;
    }

    public static void main(String[] args) {
        int num = 19;
        if (isHappy(num)) {
            System.out.println(num + " is a happy number.");
        } else {
            System.out.println(num + " is not a happy number.");
        }
    }
}
