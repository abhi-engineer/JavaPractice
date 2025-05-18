    ### 1. What is `HashSet` in Java?

`HashSet` is a collection class that implements the `Set` interface. It stores **unique elements** only and does **not maintain any order** of elements. Internally, it uses a `HashMap` to store elements as keys, ensuring uniqueness and fast access.

---

### 2. How does `HashSet` ensure uniqueness of elements?

`HashSet` uses a `HashMap` internally. Each element you add to the `HashSet` becomes a **key** in this `HashMap` with a constant dummy value. Since `HashMap` keys must be unique, duplicates are not allowed in the `HashSet`.

---

### 3. What is the internal implementation of `HashSet`?

Internally, `HashSet` contains a `HashMap` instance:

```java
private transient HashMap<E,Object> map;
private static final Object PRESENT = new Object();
```

When you add an element, it is stored as a key in the map with `PRESENT` as its value.

---

### 4. What happens if you add duplicate elements in a `HashSet`?

When you add a duplicate element, the `put()` method of the underlying `HashMap` returns the old value, and the set does not add the new duplicate element. Hence, the `HashSet` remains unchanged.

---

### 5. Can a `HashSet` store null values?

Yes. A `HashSet` can contain **one null element**. This is because the underlying `HashMap` allows a single null key.

---

### 6. Is `HashSet` ordered? Does it maintain insertion order?

No. `HashSet` does **not guarantee any order** of elements. If order matters, use `LinkedHashSet` which maintains insertion order.

---

### 7. Is `HashSet` thread-safe?

No, `HashSet` is **not thread-safe**. Multiple threads modifying a `HashSet` concurrently can cause data inconsistency. To make it thread-safe, you can use:

```java
Set s = Collections.synchronizedSet(new HashSet<>());
```

Or use concurrent collections like `CopyOnWriteArraySet`.

---

### 8. What is the time complexity of basic operations in `HashSet`?

* `add()`: Average O(1), worst O(n) if resizing or collisions occur.
* `remove()`: Average O(1)
* `contains()`: Average O(1)

Because `HashSet` uses hashing, these operations are generally very fast.

---

### 9. What is the load factor in a `HashSet`?

The load factor is a measure that decides when to increase the capacity of the underlying `HashMap` to maintain efficient hashing. Default load factor is **0.75**, meaning the table will resize when 75% full.

---

### 10. What if custom objects are added to a `HashSet` without overriding `hashCode()` and `equals()`?

The default `hashCode()` and `equals()` from `Object` class are used, which compare memory addresses. This can cause logically equal objects to be treated as different, allowing duplicates in the set. Always override both methods properly to maintain uniqueness.

---

### 11. How does `HashSet` handle collisions internally?

When two keys produce the same hash index (collision), the underlying `HashMap` stores entries in a linked list (chaining). From Java 8 onwards, if the list gets too long (>8), it is converted to a balanced red-black tree to improve lookup performance.

---

### 12. What is the difference between `HashSet` and `TreeSet`?

* `HashSet` uses hashing, no order guaranteed, faster operations (O(1) average).
* `TreeSet` uses a Red-Black tree, elements are sorted, operations have O(log n) time complexity.

---

### 13. How to iterate over a `HashSet`?

You can use:

* Enhanced for loop:

  ```java
  for (E element : hashSet) { ... }
  ```
* Iterator:

  ```java
  Iterator<E> it = hashSet.iterator();
  while(it.hasNext()) { ... }
  ```

---

### 14. What interfaces does `HashSet` implement?

* `Set`
* `Collection`
* `Iterable`
* `Cloneable`
* `Serializable`

---

### 15. How to remove all elements from a `HashSet`?

Use the `clear()` method, which removes all elements and resets size to zero.

---

If you want, I can provide sample code examples or interview coding questions for HashSet next!
