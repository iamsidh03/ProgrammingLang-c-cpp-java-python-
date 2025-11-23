#include <stdio.h>
#include <stdlib.h>

// Node structure for Circular Linked List
struct Node {
    int data;
    struct Node* next;
};

// Function to add a node at the end
void append(struct Node** head, int data) {
    struct Node* newNode = (struct Node*)malloc(sizeof(struct Node));
    struct Node* temp = *head;
    newNode->data = data;
    newNode->next = *head;

    if (*head == NULL) {
        *head = newNode;
        newNode->next = *head;  // Point to itself to make it circular
        return;
    }

    while (temp->next != *head) {
        temp = temp->next;
    }

    temp->next = newNode;
}

// Function to print the circular linked list
void printList(struct Node* head) {
    if (head == NULL) {
        printf("List is empty.\n");
        return;
    }

    struct Node* temp = head;
    do {
        printf("%d -> ", temp->data);
        temp = temp->next;
    } while (temp != head);
    printf("(back to head)\n");
}

int main() {
    struct Node* head = NULL;

    append(&head, 10);
    append(&head, 20);
    append(&head, 30);

    printf("Circular Linked List: ");
    printList(head);

    return 0;
}
