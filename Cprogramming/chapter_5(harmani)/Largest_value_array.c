#include<stdio.h>
#include<string.h>
int large_value( int *arr,int size){
    int *max=&arr[0];
    int i=0;
    for(;i<size;i++){
        if(arr[i]>*max){
            max=&arr[i]; //update max to point the largest integer value


        }
        
    }
    return *max; //(derefernce and return )
    

}
int main(){
        int arr[]={3,4,542,546,67676};
        int size=sizeof(arr)/sizeof(arr[0]);
        
        printf("largest value: %d\n",large_value(arr,size));
        return 0;
}

/*
 max=&arr[i];
Sure, let's break down that line in detail:

### **Line:**
```c
max = &arr[i];
```

### **What is happening:**
- `arr[i]` refers to the `i`-th element in the array (the value at the `i`-th index).
- `&arr[i]` is the **address** of the `i`-th element in the array. So, `&arr[i]` gives the memory location where that element is stored.

### **Context in the Code:**
- `max` is a pointer to an integer, initially pointing to the first element of the array (`&arr[0]`).
- During the loop, we compare each element `arr[i]` with the value pointed to by `max` (which is `*max`).
- If `arr[i]` is greater than `*max`, we update the `max` pointer to point to the current element `arr[i]` by assigning `max = &arr[i];`.
  
### **Explanation:**
- `max = &arr[i]` means:
  - "Set the pointer `max` to point to the address of the `i`-th element of the array."
  - By doing this, you are updating the `max` pointer to **"track"** the element with the largest value found so far in the array.
  
### **Why Use Pointers Here?**
- Since the goal is to **use pointers** to find the largest value, you need to manipulate the pointer to point to the largest element as you go through the array.
- Instead of directly using array indexing to access the largest element, you use the pointer `max` to reference the element with the largest value.

### **Visual Example:**
Let's visualize this with the array `arr = {3, 4, 542, 546, 67676}`.

1. Initially:
   ```c
   max = &arr[0];  // max points to arr[0], which is 3
   ```
   - `max` points to the first element (`arr[0] = 3`).

2. In the first loop iteration (`i = 1`):
   - Compare `arr[1] = 4` with `*max = 3`.
   - Since `4 > 3`, we update `max` to point to `arr[1]`.
     ```c
     max = &arr[1];  // max now points to arr[1], which is 4
     ```

3. In the second loop iteration (`i = 2`):
   - Compare `arr[2] = 542` with `*max = 4`.
   - Since `542 > 4`, we update `max` to point to `arr[2]`.
     ```c
     max = &arr[2];  // max now points to arr[2], which is 542
     ```

4. In the third loop iteration (`i = 3`):
   - Compare `arr[3] = 546` with `*max = 542`.
   - Since `546 > 542`, we update `max` to point to `arr[3]`.
     ```c
     max = &arr[3];  // max now points to arr[3], which is 546
     ```

5. In the fourth loop iteration (`i = 4`):
   - Compare `arr[4] = 67676` with `*max = 546`.
   - Since `67676 > 546`, we update `max` to point to `arr[4]`.
     ```c
     max = &arr[4];  // max now points to arr[4], which is 67676
     ```

### **At the end:**
- After the loop completes, `max` points to `arr[4]`, which is the largest value (`67676`).
- The value `*max` (dereferencing `max`) will give the largest value (`67676`).

---

### **Summary:**
- `max = &arr[i]` updates the pointer `max` to point to the **address** of the `i`-th element in the array.
- This allows `max` to track the current largest value during the loop.
- At the end, dereferencing `max` (`*max`) gives you the largest value.

Let me know if this clears things up!
*/