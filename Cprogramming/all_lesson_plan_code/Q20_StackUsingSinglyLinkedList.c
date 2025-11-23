#include <stdio.h>
#include <stdlib.h>

// Node structure for Stack
struct Node {
    int data;
    struct Node* next;
};

// Function to push a value onto the stack
void push(struct Node** top, int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    newNode->data = data;
    newNode->next = *top;
    *top = newNode;
}

// Function to pop a value from the stack
int pop(struct Node** top) {
    if (*top == NULL) {
        printf("Stack is empty.\n");
        return -1;
    }

    struct Node* temp = *top;
    int poppedValue = temp->data;
    *top = (*top)->next;
    free(temp);
    return poppedValue;
}

// Function to check if the stack is empty
int isEmpty(struct Node* top) {
    return top == NULL;
}

// Function to print the stack
void printStack(struct Node* top) {
    struct Node* temp = top;
    while (temp != NULL) {
        printf("%d ", temp->data);
        temp = temp->next;
    }
    printf("\n");
}

int main() {
    struct Node* top = NULL;

    push(&top, 10);
    push(&top, 20);
    push(&top, 30);
    push(&top, 40);

    printf("Stack: ");
    printStack(top);

    printf("Popped: %d\n", pop(&top));
    printf("Stack after pop: ");
    printStack(top);

    return 0;
}
/*Stack Using a Singly Linked List:

The stack is implemented using a singly linked list, where the top pointer represents the top of the stack.
The push function adds a new node at the top of the stack.
The pop function removes the node from the top of the stack and returns its value.
The isEmpty function checks if the stack is empty.*/