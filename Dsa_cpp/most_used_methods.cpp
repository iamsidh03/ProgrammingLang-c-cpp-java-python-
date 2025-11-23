/*
Sure! Here's a list of the **most frequently used built-in methods/functions in C++**, grouped by category, with **clear and simple explanations** for each one.

---

## 🧵 1. **String Functions (from `<string>`)**

| Method                        | Use / Meaning                                                        |
| ----------------------------- | -------------------------------------------------------------------- |
| `s.length()` / `s.size()`     | Returns number of characters in the string.                          |
| `s.empty()`                   | Returns `true` if the string is empty.                               |
| `s.front()`                   | Returns first character of the string.                               |
| `s.back()`                    | Returns last character of the string.                                |
| `s.push_back(char)`           | Adds a character at the end.                                         |
| `s.pop_back()`                | Removes the last character.                                          |
| `s.substr(pos, len)`          | Returns substring starting at `pos` with length `len`.               |
| `s.find(str)`                 | Finds position of `str` in `s`. Returns `string::npos` if not found. |
| `s.rfind(str)`                | Finds last occurrence of `str`.                                      |
| `s.erase(pos, len)`           | Removes `len` characters from position `pos`.                        |
| `s.insert(pos, str)`          | Inserts `str` at position `pos`.                                     |
| `s.replace(pos, len, str)`    | Replaces `len` characters from `pos` with `str`.                     |
| `s.compare(str)`              | Compares strings: returns 0 if equal, >0 if greater, <0 if smaller   |
| `reverse(s.begin(), s.end())` | Reverses the string.                                                 |

---

## 📚 2. **Vector Functions (from `<vector>`)**

| Method                        | Use / Meaning                                |
| ----------------------------- | -------------------------------------------- |
| `v.size()`                    | Returns number of elements in the vector.    |
| `v.empty()`                   | Returns `true` if vector is empty.           |
| `v.push_back(x)`              | Adds element `x` at the end.                 |
| `v.pop_back()`                | Removes last element.                        |
| `v.front()`                   | Returns first element.                       |
| `v.back()`                    | Returns last element.                        |
| `v.clear()`                   | Removes all elements.                        |
| `v.insert(pos, val)`          | Inserts `val` at position `pos`.             |
| `v.erase(pos)`                | Removes element at position `pos`.           |
| `v.begin()` / `v.end()`       | Returns iterator to beginning/end of vector. |
| `sort(v.begin(), v.end())`    | Sorts vector in ascending order.             |
| `reverse(v.begin(), v.end())` | Reverses the vector.                         |

---

## 📘 3. **Array Functions (from `<algorithm>`)**

| Method                           | Use / Meaning                               |
| -------------------------------- | ------------------------------------------- |
| `sort(arr, arr + n)`             | Sorts array of size `n` in ascending order. |
| `reverse(arr, arr + n)`          | Reverses array.                             |
| `max_element(arr, arr + n)`      | Returns pointer to the maximum element.     |
| `min_element(arr, arr + n)`      | Returns pointer to the minimum element.     |
| `accumulate(arr, arr+n, 0)`      | Sum of all elements (from `<numeric>`).     |
| `count(arr, arr+n, val)`         | Counts occurrences of `val`.                |
| `binary_search(arr, arr+n, val)` | Checks if `val` exists in sorted array.     |
| `find(arr, arr+n, val)`          | Finds position of `val` in array.           |

---

## 🔁 4. **STL Algorithms (from `<algorithm>`)**

| Method               | Use / Meaning                            |
| -------------------- | ---------------------------------------- |
| `sort()`             | Sorts elements.                          |
| `reverse()`          | Reverses elements.                       |
| `next_permutation()` | Moves to next lexicographic permutation. |
| `prev_permutation()` | Moves to previous permutation.           |
| `unique()`           | Removes consecutive duplicates.          |
| `rotate()`           | Rotates the elements in the range.       |

---

## 📒 5. **Map & Set Functions (from `<map>`, `<set>`)**

### `map` and `unordered_map`:

| Method         | Use / Meaning                      |
| -------------- | ---------------------------------- |
| `m[key]`       | Access or insert key-value pair.   |
| `m.count(key)` | Returns 1 if key exists, 0 if not. |
| `m.find(key)`  | Returns iterator to key if found.  |
| `m.erase(key)` | Removes the key-value pair.        |
| `m.clear()`    | Clears the map.                    |

### `set` and `unordered_set`:

| Method        | Use / Meaning             |
| ------------- | ------------------------- |
| `s.insert(x)` | Adds element `x`.         |
| `s.count(x)`  | Checks if `x` is present. |
| `s.find(x)`   | Finds iterator to `x`.    |
| `s.erase(x)`  | Deletes `x`.              |

---

## ⏲️ 6. **Time-related (from `<chrono>`)**

| Method                                                      | Use / Meaning |
| ----------------------------------------------------------- | ------------- |
| `auto start = chrono::high_resolution_clock::now()`         | Start timing  |
| `auto stop = chrono::high_resolution_clock::now()`          | Stop timing   |
| `duration_cast<chrono::microseconds>(stop - start).count()` | Get time diff |

---

## 🛠️ 7. **Math Functions (from `<cmath>`)**

| Method                   | Use / Meaning              |
| ------------------------ | -------------------------- |
| `pow(a, b)`              | a raised to power b        |
| `sqrt(x)`                | Square root of x           |
| `abs(x)`                 | Absolute value             |
| `ceil(x)`                | Smallest int ≥ x           |
| `floor(x)`               | Largest int ≤ x            |
| `log(x)`                 | Natural logarithm (base e) |
| `log10(x)`               | Base-10 logarithm          |
| `sin(x), cos(x), tan(x)` | Trigonometric functions    |

---

## 🧮 8. **Other Useful Utilities**

| Function          | Use / Meaning                         |
| ----------------- | ------------------------------------- |
| `stoi(s)`         | Convert string to integer             |
| `to_string(n)`    | Convert integer to string             |
| `getline(cin, s)` | Reads an entire line into string `s`. |
| `swap(a, b)`      | Swaps values of a and b.              |
| `isalpha(c)`      | Checks if `c` is a letter             |
| `isdigit(c)`      | Checks if `c` is a digit              |

---

## ✅ Want to Learn by Practice?

If you'd like, I can give you:

* Quiz questions on each category ✅
* Small C++ programs using these functions ✅
* Project ideas using them ✅

Let me know how you'd like to continue!

*/