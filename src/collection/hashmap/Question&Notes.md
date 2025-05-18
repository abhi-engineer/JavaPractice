### 1. **What is `HashMap` in Java?**

`HashMap` is a part of `java.util` package. It stores key-value pairs and allows **null keys and null values** (only one null key). It is **not thread-safe** and does **not maintain insertion order**.

---

### 2. **How does `HashMap` work internally?**

Internally, `HashMap` uses an **array of Node\<K,V>** (buckets). Each entry is stored as a node with `hash`, `key`, `value`, and `next`.

* The hash code of the key determines the bucket index.
* If multiple keys map to the same index (collision), entries are stored in a **linked list** (or tree from Java 8).
* On retrieval, it calculates the hash, then compares keys using `.equals()`.

---

### 3. **What is the default capacity and load factor of a HashMap?**

* **Default capacity:** 16
* **Default load factor:** 0.75
  This means resizing happens when 75% of the capacity is filled (i.e., 12 entries for default capacity).

---

### 4. **How does HashMap handle collisions?**

Via **chaining**: multiple entries with the same hash are stored in a linked list (or a balanced tree if the list gets too long in Java 8+).

---

### 5. **What changes were introduced in Java 8 for `HashMap`?**

* If a bucket has **more than 8 entries**, the linked list is converted into a **Red-Black tree** for faster lookup.
* If entries fall below 6, it’s converted back to a list.

---

### 6. **What are the time complexities of `HashMap` operations?**

* **get() / put():** O(1) average, O(log n) worst (with trees), O(n) in rare extreme cases.
* **remove():** O(1) average.

---

### 7. **Why should `hashCode()` and `equals()` be overridden for custom keys?**

To ensure proper bucket placement and accurate key comparison. If not overridden, custom objects may not behave correctly (e.g., duplicates allowed).

---

### 8. **Can we store null keys and null values in a HashMap?**

Yes:

* Only **one null key** is allowed.
* **Multiple null values** are allowed.

---

### 9. **What happens if two keys have the same hashCode()?**

A **collision** occurs. The `HashMap` stores them in the same bucket, but differentiates them using `.equals()` during retrieval.

---

### 10. **What is rehashing in HashMap?**

Rehashing is the process of **resizing** the internal array (doubling its size) and **recalculating** hash indexes for existing keys. It occurs when the number of entries crosses the threshold (capacity × load factor).

---

### 11. **How is capacity calculated after resizing?**

New capacity = 2 × current capacity. All keys are rehashed into new bucket positions.

---

### 12. **Difference between `HashMap` and `Hashtable`?**

| Feature       | HashMap                        | Hashtable          |
| ------------- | ------------------------------ | ------------------ |
| Thread-safe   | No                             | Yes (synchronized) |
| Performance   | Faster                         | Slower             |
| Nulls allowed | One null key, many null values | None allowed       |
| Introduced in | Java 1.2                       | Java 1.0           |

---

### 13. **How is a key retrieved in `HashMap`?**

1. Compute hash of key
2. Locate the bucket using `(n - 1) & hash`
3. Traverse the list/tree in that bucket
4. Use `.equals()` to find the correct entry

---

### 14. **What are `hashCode()` and `equals()` contracts?**

* Equal objects must have equal hash codes.
* If two objects are equal by `equals()`, they **must** return the same `hashCode()`.

---

### 15. **What happens if hashCode is the same but equals returns false?**

They’ll be placed in the same bucket (due to hashCode), but considered different keys because `equals()` returns false.

---

### 16. **Why is initial capacity a power of 2?**

To optimize the bucket index calculation:

```java
index = (n - 1) & hash
```

This bitwise operation works best when `n` (capacity) is a power of 2.

---

### 17. **How to make HashMap thread-safe?**

* Use `Collections.synchronizedMap(new HashMap<>())`
* Use `ConcurrentHashMap` (recommended for high concurrency)

---

### 18. **What is the threshold in HashMap?**

Threshold = capacity × load factor
Once this is crossed, the map resizes.

---

### 19. **What are the constructors of HashMap?**

```java
HashMap()
HashMap(int initialCapacity)
HashMap(int initialCapacity, float loadFactor)
HashMap(Map<? extends K, ? extends V> m)
```

---

### 20. **What are the alternatives to HashMap?**

* **LinkedHashMap:** maintains insertion order
* **TreeMap:** sorted based on keys (Red-Black tree)
* **ConcurrentHashMap:** thread-safe version of HashMap

### Explain the FailFast iterator and FailSafe iterator along with examples for each.

A FailFast iterator is an iterator that throws a ConcurrentModificationException if it detects that the underlying collection has been modified while the iterator is being used. This is the default behavior of iterators in the Java Collections Framework. For example, the iterator for a HashMap is FailFast.
A FailSafe iterator does not throw a ConcurrentModificationException if the underlying collection is modified while the iterator is being used. Alternatively, it creates a snapshot of the collection at the time the iterator is created and iterates over the snapshot. For example, the iterator for a ConcurrentHashMap is FailSafe.


### Internal implementation of hashmap
The internal implementation of a HashMap involves using an array of buckets (also called bins), where each bucket is a linked list. When adding a key-value pair, the put() method calculates a hash code for the key, which is then used to determine the index of the bucket where the pair will be stored. If a collision occurs (multiple keys map to the same bucket), the key-value pair is added to the linked list at that bucket.

1. Buckets and Linked Lists: The HashMap uses an array of buckets (initially of size 16), and each bucket is a linked list.
2. Hash Code: When you add a key-value pair using put(key, value), the hashCode() method is used to calculate a hash code for the key
3. Bucket Index: The hash code is then transformed into an index within the range of the bucket array (using modulo or masking operations).
4. Storage: If the calculated index is empty, the key-value pair is stored there. If the index already contains a value (collision), the key-value pair is added to the linked list at that index.
5. Collisions: If a collision occurs (multiple keys hash to the same index), the linked list at that index is used to store the key-value pairs, as described by Medium.
6. Resizing: As more elements are added, the HashMap may resize its array to maintain efficiency. This resizing happens when the number of elements exceeds a threshold determined by the load factor (default: 0.75).
7. Retrieval: To retrieve a value, the get(key) method calculates the hash code of the key, finds the corresponding bucket, and then iterates through the linked list at that bucket to find the matching key.

Example for the implementation of hashmap
Imagine you have a big storage room with many shelves, each labeled with a unique number. Now, you want to store some items like books, shoes, and toys. Instead of randomly placing them on shelves, you use a special code for each item based on its type. For example, books might get a code like “B” and shoes “S” etc.
When you wan