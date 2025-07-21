import java.security.SecureRandom;

public class SecureRandomExample {
    public static void main(String[] args) {
        try {
            // Create a SecureRandom instance using the default algorithm
            SecureRandom secureRandom = new SecureRandom();

            // Generate a random byte array
            byte[] randomBytes = new byte[16];
            secureRandom.nextBytes(randomBytes);
            System.out.println("Random bytes: " + bytesToHex(randomBytes));

            // Generate a random integer
            int randomNumber = secureRandom.nextInt(100); // Random number between 0 (inclusive) and 100 (exclusive)
            System.out.println("Random number: " + randomNumber);

            // Create a SecureRandom instance with a specific algorithm (e.g., "NativePRNG")
            SecureRandom nativeSecureRandom = SecureRandom.getInstance("NativePRNG");
            byte[] moreRandomBytes = new byte[32];
            nativeSecureRandom.nextBytes(moreRandomBytes);
            System.out.println("More random bytes (NativePRNG): " + bytesToHex(moreRandomBytes));

        } catch (java.security.NoSuchAlgorithmException e) {
            System.err.println("Algorithm not found: " + e.getMessage());
        }
    }

    private static String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
