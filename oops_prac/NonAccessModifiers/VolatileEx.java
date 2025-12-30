// public class VolatileEx {
    
// }

// ========= Notes on Volatile Keyword in Java =======
// 1. The `volatile` keyword tells the JVM that this variable may be modified by multiple threads.
// 2. It ensures **visibility** — all threads always read the latest value directly from main memory.
// 3. Without `volatile`, threads may cache the variable and never see updates from other threads.

// 4. Prevents threads from caching the value of the variable; always fetches the latest value from memory.
