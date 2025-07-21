# secure-random
SecureRandom



In Java, secure random number generation is provided by the java.security.SecureRandom class. This class offers a cryptographically strong random number generator (RNG) that is suitable for security-sensitive applications, such as generating keys, passwords, or cryptographic nonces.
Here are key aspects of SecureRandom:

    Cryptographically Strong:
    Unlike java.util.Random, SecureRandom is designed to produce highly unpredictable and non-deterministic output, meeting the requirements for cryptographic security. It aims to be resistant to various attacks, including seed guessing and prediction of future numbers.
    Entropy Source:
    SecureRandom utilizes sources of entropy to generate its random numbers. This entropy can come from various unpredictable inputs, such as operating system-provided entropy sources (e.g., /dev/urandom on Unix-like systems), hardware-based entropy, or system events like timing and interrupts.
    Usage:
        Instantiation: You can create a SecureRandom instance using new SecureRandom() (which uses a default algorithm like "SHA1PRNG" or a platform-specific default) or by explicitly specifying an algorithm and optionally a provider using SecureRandom.getInstance("AlgorithmName") or SecureRandom.getInstance("AlgorithmName", "ProviderName").
        Generating Random Data: Use methods like nextBytes(byte[] bytes) to fill a byte array with random bytes, or nextInt(), nextLong(), etc., for specific primitive types. 
    Seeding:
    While SecureRandom automatically seeds itself using entropy sources, you can also explicitly provide a seed using setSeed(byte[] seed) or by passing a seed to the constructor. However, SecureRandom intelligently combines the provided seed with its internal entropy sources to maintain unpredictability.
    Reseeding:
    Some SecureRandom implementations support reseeding using the reseed() method, which reads more entropy input to refresh the internal state.
