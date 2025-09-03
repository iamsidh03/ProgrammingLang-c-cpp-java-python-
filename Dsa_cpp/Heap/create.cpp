#include<iostream>
#include <vector>

using namespace std;

class MinHeap{
    vector<int> heap;
    int parent(int i) {return (i-1)/2;}
    int leftChild(int i) {return 2*i+1;}
    int rightChild(int i) {return 2*i+2;}

public:
    void insert(int value){
        heap.push_back(value);
        int idx=heap.size()-1;

        while(idx>0 && heap[idx]<heap[parent(idx)]){
            swap(heap[idx],heap[parent(idx)]);
            idx=parent(idx);

        }
    }
    void printHeap(){
        for(int val:heap) cout<<val<<" ";
        cout<<endl;
    }
};
class maxHeap{
     vector<int> heap;
    int parent(int i) {return (i-1)/2;}
    int leftChild(int i) {return 2*i+1;}
    int rightChild(int i) {return 2*i+2;}
    public:
    void insert(int value){
       heap.push_back(value);
       int idx=heap.size()-1;

       while(idx>0 && heap[idx]> heap[parent(idx)]){
           swap(heap[idx],heap[parent(idx)]);
           idx=parent(idx);
       }}
       void printHeap(){
        for(int val:heap) cout<<val<<" ";
        cout<<endl;
    }

};

int main(){
    MinHeap h;
    
    h.insert(4);
    h.insert(5);
    h.insert(1);
    h.insert(2);
    h.insert(3);
    h.insert(6);
    h.printHeap();


    maxHeap hmax;
    
    hmax.insert(4);
    hmax.insert(5);
    hmax.insert(1);
    hmax.insert(2);
    hmax.insert(3);
    hmax.insert(6);
    hmax.printHeap();
    return 0;
}