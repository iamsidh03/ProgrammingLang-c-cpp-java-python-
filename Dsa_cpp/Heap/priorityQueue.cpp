#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int main(){
    priority_queue<int>p; //by default max heap
    /* 
    .push()
    .pop()
    .top()
    .size()
    .empty()

    */
    p.push(1);
    p.push(2);
    p.push(3);
    p.push(4);
    p.push(5);
    p.push(6);
    p.push(7);
    p.push(8);
    p.push(9);
    p.push(10);
    while(!p.empty()){
        cout<<p.top()<<" ";
        p.pop();
    }
    cout<<endl;
    priority_queue<int,vector<int>,greater<int>>pq; //min heap
       pq.push(4);
    pq.push(5);
    pq.push(6);
    pq.push(7);
    pq.push(8);
    pq.push(9);
    pq.push(10);
    pq.push(1);
    pq.push(2);
    pq.push(3);
 
    while(!pq.empty()){
        cout<<pq.top()<<" ";
        pq.pop();
    }

}