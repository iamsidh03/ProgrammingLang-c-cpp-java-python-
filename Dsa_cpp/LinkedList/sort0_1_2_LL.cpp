#include <iostream>
using namespace std;

class node
{
public:
    int data;
    node *next;
    node(int data)
    {
        this->data = data;
        this->next = NULL;
    }
};
void printlist(node *head)
{
    node *temp = head;
    while (temp != NULL)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}
node *sortZeroOneTwo(node *&head)
{
    if (!head || !head->next)
        return head;
    node *temp = head;
    int cntzero = 0, cntone = 0, cnttwo = 0;
    while (temp)
    {
        if (temp->data == 0)
            cntzero++;
        if (temp->data == 1)
            cntone++;
        if (temp->data == 2)
            cnttwo++;
        temp = temp->next;
    }
    temp = head;
    int i = 0;
    while (i != cntzero)
    {
        temp->data = 0;
        temp = temp->next;
        i++;
    }
    i = 0;
    while (i != cntone)
    {
        temp->data = 1;
        temp = temp->next;
        i++;
    }

    while (cnttwo--)
    {
        temp->data = 2;
        temp = temp->next;
    }
    return head;
}
node *sortDummyApproach(node *head)
{
    node *zerohead = new node(-1);
    node *onehead = new node(-1);
    node *twohead = new node(-1);
    node *zerodummy = zerohead;
    node *onedummy = onehead;
    node *twodummy = twohead;
    node *temp = head;
    while (temp)
    {
        if (temp->data == 0)
        {
            zerodummy->next = new node(0);
            zerodummy = zerodummy->next;
            // temp=temp->next;
        }
        else if (temp->data == 1)
        {
            onedummy->next = new node(1);
            onedummy = onedummy->next;
            // temp=temp->next;
        }
        else if (temp->data == 2)
        {
            twodummy->next = new node(2);
            twodummy = twodummy->next;
            // temp=temp->next;
        }
        temp = temp->next;
    }
    node *del = zerohead;
    zerohead = zerohead->next;
    del->next = NULL;
    delete (del);
    node *del1 = onehead;
    onehead = onehead->next;
    del1->next = NULL;
    delete (del1);
    zerodummy->next = onehead;
    node *del2 = twohead;
    twohead = twohead->next;
    del2->next = NULL;
    delete (del2);
    onedummy->next = twohead;
    return zerohead;
}
node *sort2(node *&head)
{
    if(!head || !head->next) return head;
    node *zerohead = new node(-1);
    node *zerotail = zerohead;

    node *onehead = new node(-1);
    node *onetail = onehead;

    node *twohead = new node(-1);
    node *twotail = twohead;
    // traverse
    node *curr = head;
    while (curr)
    {
        if (curr->data == 0)
        {
            // take out the zero node
            node *temp = curr;
            curr = curr->next;
            temp->next = NULL;

            zerotail->next = temp;
            zerotail = temp;
        }
        else if (curr->data == 1)
        {
            // take out the zero node
            node *temp = curr;
            curr = curr->next;
            temp->next = NULL;

            onetail->next = temp;
            onetail = temp;
        }
        else if (curr->data == 2)
        {
            // take out the two node
            node *temp = curr;
            curr = curr->next;
            temp->next = NULL;

            twotail->next = temp;
            twotail = temp;
        }
    }
    // 3o ll ready hai
    //  remove dummy nodes
    node *temp = onehead;
    ;
    onehead = onehead->next;
    temp->next = NULL;
    delete (temp);

    temp = twohead;
    twohead = twohead->next;
    temp->next = NULL;
    delete (temp);

    if (onehead != NULL)
    {
        zerotail->next = onehead;
        if (twohead != NULL)
        {
            onetail->next = twohead;
        }
    }
    else
    {
        if (twohead != NULL)
        {
            zerotail->next = twohead;
        }
    }
    temp = zerohead;
    zerohead = zerohead->next;
    temp->next = NULL;
    delete (temp);

    return zerohead;
}

int main()
{
    node *first = new node(0);
    node *second = new node(0);
    node *third = new node(1);
    node *forth = new node(1);
    node *fifth = new node(1);
    node *sixth = new node(1);
    node *seventh = new node(1);
    node *head = first;
    first->next = second;
    second->next = third;
    third->next = forth;
    forth->next = fifth;
    fifth->next = sixth;
    sixth->next = seventh;
    seventh->next = NULL;
    printlist(head);
    // node *sortedlist = sortZeroOneTwo(head);
    // node* sortedlist=sortDummyApproach(head);
    node *sortedlist = sort2(head);
    printlist(sortedlist);
    // printlist(head);
}