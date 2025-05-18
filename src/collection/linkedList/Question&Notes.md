### ✅ **1. What is a LinkedList in Java?**

A `LinkedList` is a linear data structure where elements are stored in **nodes**, and each node points to the next (and previous in case of doubly linked list). Java’s `LinkedList` class is a **doubly linked list** implementation.

---

### ✅ **2. How is LinkedList different from ArrayList?**

| Feature       | ArrayList               | LinkedList            |
| ------------- | ----------------------- | --------------------- |
| Internal      | Dynamic array           | Doubly linked list    |
| Access Time   | O(1)                    | O(n)                  |
| Insert/Delete | O(n) (shift)            | O(1) at ends          |
| Memory        | Less (no node overhead) | More (extra pointers) |

---

### ✅ **3. How does LinkedList store data internally?**

* Uses a doubly linked list.
* Each node contains: `data`, `next`, and `prev` references.

```java
transient Node<E> first;
transient Node<E> last;

private static class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;
}
```

---

### ✅ **4. What are the time complexities of common operations?**

| Operation       | Time Complexity |
| --------------- | --------------- |
| `addFirst()`    | O(1)            |
| `addLast()`     | O(1)            |
| `add(index)`    | O(n)            |
| `get(index)`    | O(n)            |
| `removeFirst()` | O(1)            |
| `remove(index)` | O(n)            |

---

### ✅ **5. When should you use LinkedList over ArrayList?**

Use `LinkedList` when:

* Frequent insertions/deletions are needed.
* You don't need fast random access.

---

### ✅ **6. Is LinkedList synchronized?**

No, `LinkedList` is **not thread-safe**. Use `Collections.synchronizedList(new LinkedList<>())` for synchronization.

---

### ✅ **7. Can LinkedList contain null values?**

Yes, it can store multiple `null` values.

---

### ✅ **8. Does LinkedList implement Queue and Deque interfaces?**

Yes, `LinkedList` implements both:

* `Queue` → FIFO behavior
* `Deque` → allows insertion/removal at both ends

---

### ✅ **9. How do you iterate through a LinkedList?**

```java
for (String s : list) { ... } // enhanced for loop

Iterator<String> it = list.iterator(); // using iterator

ListIterator<String> lit = list.listIterator(); // bidirectional
```

---

### ✅ **10. How does `remove(Object o)` work internally?**

* Traverses from head.
* Compares using `equals()`.
* Removes the first match.

---

### ✅ **11. What is the difference between `poll()`, `remove()`, and `peek()`?**

| Method     | Behavior                                                             |
| ---------- | -------------------------------------------------------------------- |
| `poll()`   | Retrieves and removes head; returns `null` if empty                  |
| `remove()` | Retrieves and removes head; throws `NoSuchElementException` if empty |
| `peek()`   | Retrieves but does not remove head; returns `null` if empty          |

---

### ✅ **12. How is memory managed in LinkedList?**

Each node uses extra memory for `prev` and `next` pointers, increasing overhead compared to arrays.

---

### ✅ **13. Is LinkedList fail-fast?**

Yes. It throws `ConcurrentModificationException` if structurally modified while iterating (except through iterator's own methods).

---

### ✅ **14. Can LinkedList be used as a stack or queue?**

Yes:

* As Stack: `push()`, `pop()`
* As Queue: `offer()`, `poll()`
* As Deque: `addFirst()`, `addLast()`, etc.

---

### ✅ **15. How is element retrieval optimized in LinkedList?**

If `index < size/2`, traverse from head.
Else, traverse from tail.
t to find a specific item later, you don’t need to search every shelf. You just generate the code you assigned to it. So, if you’re looking for a book, you know it’s on a shelf labeled “B”. This approach allows you to quickly locate what you require, bypassing the need to search through every shelf and saving valuable time.