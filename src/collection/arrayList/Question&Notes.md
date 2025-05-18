### 1. **What is `ArrayList` in Java?**

`ArrayList` is a **resizable array** implementation of the `List` interface in Java. It allows **duplicate elements**, maintains **insertion order**, and is **not synchronized** by default.

---

### 2. **How is `ArrayList` different from an array?**

| Feature     | Array            | ArrayList         |
| ----------- | ---------------- | ----------------- |
| Size        | Fixed            | Dynamic           |
| Type        | Can be primitive | Only objects      |
| Performance | Faster           | Slower (overhead) |
| Flexibility | Less             | More (methods)    |

---

### 3. **What is the default capacity of an `ArrayList`?**

The default capacity of an `ArrayList` is **10**, which increases dynamically as elements are added.

---

### 4. **How does `ArrayList` grow internally?**

When the capacity is exceeded, `ArrayList` creates a **new array** with **50% more capacity** (`newCapacity = oldCapacity + (oldCapacity >> 1)`), and **copies** the old elements.

---

### 5. **Is `ArrayList` thread-safe?**

No, `ArrayList` is **not thread-safe**. Use `Collections.synchronizedList()` or `CopyOnWriteArrayList` for thread-safe operations.

---

### 6. **Can `ArrayList` store `null` values?**

Yes, `ArrayList` can store multiple `null` values since it allows duplicate and null entries.

---

### 7. **What is the time complexity of operations in `ArrayList`?**

| Operation     | Time Complexity |
| ------------- | --------------- |
| Access (get)  | O(1)            |
| Add (end)     | Amortized O(1)  |
| Insert/delete | O(n)            |
| Search        | O(n)            |

---

### 8. **Difference between `ArrayList` and `LinkedList`?**

| Feature       | ArrayList     | LinkedList          |
| ------------- | ------------- | ------------------- |
| Backed by     | Array         | Doubly Linked List  |
| Access time   | Fast (O(1))   | Slow (O(n))         |
| Insert/delete | Slow (O(n))   | Fast (O(1)) at ends |
| Memory        | Less overhead | More overhead       |

---

### 9. **How to make an `ArrayList` thread-safe?**

```java
List<String> syncList = Collections.synchronizedList(new ArrayList<>());
```

Or use:

```java
CopyOnWriteArrayList<String> safeList = new CopyOnWriteArrayList<>();
```

---

### 10. **Difference between `remove(int index)` and `remove(Object o)`?**

* `remove(int index)`: Removes element at specified index.
* `remove(Object o)`: Removes the **first occurrence** of the specified object.

---

### 11. **How to convert `ArrayList` to array and vice versa?**

```java
// ArrayList to Array
String[] arr = list.toArray(new String[0]);

// Array to ArrayList
List<String> list = new ArrayList<>(Arrays.asList(arr));
```

---

### 12. **How to iterate over an `ArrayList`?**

```java
for (String s : list) {
    System.out.println(s);
}

// Or
list.forEach(System.out::println);
```

---

### 13. **How to sort an `ArrayList`?**

```java
Collections.sort(list); // Ascending
Collections.sort(list, Collections.reverseOrder()); // Descending
```

---

### 14. **How to remove all elements from an `ArrayList`?**

```java
list.clear(); // Removes all elements
```

---

### 15. How to check if an `ArrayList` contains a specific element?

```java
if (list.contains("Java")) {
    System.out.println("Found");
}
```

### 16 Internal Implementation of Arraylist
The ArrayList in Java is implemented using a dynamic array.
When an ArrayList is created without specifying an initial capacity, the initial size of this array is typically 10.

# Size vs. Capacity:
    size: Tracks the number of elements currently stored in the ArrayList.
    capacity: The total size of the underlying array (elementData).
    The size is always less than or equal to the capacity.

# Adding Elements (add()):
    Ensure Capacity: Before adding an element, the ArrayList checks if there is enough space in the underlying array. If the size is equal to the capacity, the array needs to be resized.
    Grow Array: The grow() method is called to increase the capacity of the array. The new capacity is typically calculated as 1.5 times the old capacity (oldCapacity + (oldCapacity / 2)). A new array with the increased capacity is created, and the elements from the old array are copied to the new array.
    Add Element: The new element is added to the array at the index indicated by the size, and the size is incremented.

# Removing Elements (remove()):
    When an element is removed, the elements to the right of the removed element are shifted to the left to fill the gap.
    The size is decremented.

# Getting Elements (get()):
    Accessing an element at a specific index is a constant-time operation (O(1)) because it directly accesses the element in the underlying array.

# Resizing:
    Resizing the array is an expensive operation because it involves creating a new array and copying all the elements from the old array.
    To minimize the number of resizes, it's often a good practice to specify an initial capacity when creating an ArrayList if you have an estimate of the number of elements it will hold.

# Performance:
    Adding or removing elements at the end of the list is usually fast (amortized O(1) time complexity).
    Adding or removing elements at the beginning or middle of the list is slower (O(n) time complexity) because it requires shifting elements.
    Accessing elements by index is very fast (O(1) time complexity).