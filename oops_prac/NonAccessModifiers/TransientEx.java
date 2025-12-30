// ===== Notes on Serialization and Transient Keyword in Java =====
// 1. Serialization is the process of converting an object into a byte stream.
// 2. It is useful for saving an object to a file or sending it over a network.

// 3. The `transient` keyword prevents a variable from being serialized.
// 4. Any variable marked as `transient` will be skipped during the serialization process.
// 5. Use `transient` for:
//    - Sensitive data (e.g., passwords, PINs)
//    - Temporary values or cache fields
//    - Non-serializable objects
// 6. When an object is deserialized, transient fields will be initialized to their default values (e.g., `null` for objects, `0` for integers).
