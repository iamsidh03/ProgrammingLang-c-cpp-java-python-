### **LAB011: Programming on Dynamic Memory Allocation**

Dynamic memory allocation allows you to allocate memory during runtime using functions like `malloc()`, `calloc()`, `realloc()`, and `free()` in C. This can be particularly useful for creating dynamic data structures such as linked lists and trees, where the number of elements is not known in advance.

In this lab, we will cover:
1. **Creating a linked list with dynamic memory allocation**.
2. **Creating a binary tree with dynamic memory allocation**.

---

### **1. Creating a Linked List with Dynamic Memory Allocation**

In a linked list, each node dynamically allocates memory to store its data and the address of the next node.

#### **Program Name**: `LinkedListDynamicMemory.c`

```c
#include <stdio.h>
#include <stdlib.h>

// Define the structure for a node
struct Node {
    int data;
    struct Node* next;
};

// Function to create a new node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node)); // Dynamic memory allocation
    if (newNode == NULL) {
        printf("Memory allocation failed.\n");
        exit(1);
    }
    newNode->data = data;
    newNode->next = NULL;
    return newNode;
}

// Function to print the linked list
void printList(struct Node* head) {
    struct Node* temp = head;
    while (temp != NULL) {
        printf("%d -> ", temp->data);
        temp = temp->next;
    }
    printf("NULL\n");
}

int main() {
    struct Node* head = NULL;
    struct Node* second = NULL;
    struct Node* third = NULL;

    // Allocate memory for three nodes
    head = createNode(10);
    second = createNode(20);
    third = createNode(30);

    // Link the nodes
    head->next = second;
    second->next = third;

    // Print the linked list
    printList(head);

    // Free dynamically allocated memory
    free(head);
    free(second);
    free(third);

    return 0;
}
```

### **Explanation of Linked List Example**:
- **Dynamic Memory Allocation**: Each node is created using `malloc()`, which allocates memory for that node during runtime.
- **Linked List Construction**: Nodes are linked by setting the `next` pointer of each node to point to the next node.
- **Memory Deallocation**: We free the dynamically allocated memory at the end of the program using `free()`.

---

### **2. Creating a Binary Tree with Dynamic Memory Allocation**

A binary tree consists of nodes where each node has a left and right child. We dynamically allocate memory for each node using `malloc()`.

#### **Program Name**: `BinaryTreeDynamicMemory.c`

```c
#include <stdio.h>
#include <stdlib.h>

// Define the structure for a tree node
struct Node {
    int data;
    struct Node* left;
    struct Node* right;
};

// Function to create a new tree node
struct Node* createNode(int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node)); // Dynamic memory allocation
    if (newNode == NULL) {
        printf("Memory allocation failed.\n");
        exit(1);
    }
    newNode->data = data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

// Function to print the tree (Inorder Traversal)
void inorderTraversal(struct Node* root) {
    if (root != NULL) {
        inorderTraversal(root->left);  // Traverse left subtree
        printf("%d ", root->data);     // Visit root node
        inorderTraversal(root->right); // Traverse right subtree
    }
}

int main() {
    // Create nodes dynamically
    struct Node* root = createNode(10);
    struct Node* node1 = createNode(20);
    struct Node* node2 = createNode(30);

    // Link nodes to form the tree
    root->left = node1;
    root->right = node2;

    node1->left = createNode(40);
    node1->right = createNode(50);

    node2->left = createNode(60);
    node2->right = createNode(70);

    // Print the tree using Inorder Traversal
    printf("Inorder Traversal of Binary Tree: ");
    inorderTraversal(root);
    printf("\n");

    // Free dynamically allocated memory
    free(root->left->left);
    free(root->left->right);
    free(root->right->left);
    free(root->right->right);
    free(node1);
    free(node2);
    free(root);

    return 0;
}
```

### **Explanation of Binary Tree Example**:
- **Dynamic Memory Allocation**: Each node of the tree is created using `malloc()`, which allocates memory for each node.
- **Tree Construction**: The nodes are linked by setting the `left` and `right` pointers.
- **Inorder Traversal**: The `inorderTraversal()` function prints the tree nodes in an inorder sequence (left subtree, root, right subtree).
- **Memory Deallocation**: After the program finishes, the dynamically allocated memory is freed using `free()`.

---

### **Key Concepts**:
1. **Dynamic Memory Allocation**:
   - **`malloc(size)`**: Allocates memory of a specified size during runtime and returns a pointer to the allocated memory.
   - **`free(pointer)`**: Deallocates memory that was previously allocated by `malloc()`, `calloc()`, or `realloc()`.
2. **Linked List**:
   - A linked list is a dynamic data structure where each node points to the next node in the sequence. Memory is allocated dynamically to store the nodes.
3. **Binary Tree**:
   - A binary tree is a tree structure in which each node has at most two children (left and right). Dynamic memory allocation is used to allocate memory for each node.
   
---

### **Compiling and Running the Programs**:

To compile the programs, use the following commands:

```bash
gcc -o LinkedListDynamicMemory LinkedListDynamicMemory.c
gcc -o BinaryTreeDynamicMemory BinaryTreeDynamicMemory.c
```

To run the programs:

```bash
./LinkedListDynamicMemory
./BinaryTreeDynamicMemory
```

---

### **Expected Output**:

For **LinkedListDynamicMemory**:

```
10 -> 20 -> 30 -> NULL
```

For **BinaryTreeDynamicMemory** (Inorder Traversal):

```
Inorder Traversal of Binary Tree: 40 20 50 10 60 30 70
```

---

### **Summary**:

- In this lab, you learned how to create a **linked list** and a **binary tree** using **dynamic memory allocation** in C.
- You saw how `malloc()` is used to allocate memory for each node during runtime, and how `free()` is used to deallocate memory at the end of the program.
- These concepts help in creating flexible and efficient data structures when the size of the data is not known in advance.

Let me know if you need any further explanations or modifications!