//problem statement
/*
Given an array arr[] consisting of only 0s, 1s, and 2s. The task is to sort the array, i.e., put all 0s first, then all 1s and all 2s in last.

This problem is the same as the famous “Dutch National Flag problem”. The problem was proposed by Edsger Dijkstra.

*/
/*
Approach 1:
 1. count all zero's,one's,two's
 2. put that number of zeros 1st then ones then two's in the array respectively.
 3. print the array
*/
#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> arr{0,1,1,0,1,2,1,2,0,0,0,1};
    
    int ctz=0,cto=0,ctt=0;
    for(int i=0;i<arr.size();i++){
        if(arr[i]==0){
            ctz++;
        }
        if(arr[i]==1){
            cto++;
        }
        if(arr[i]==2){
            ctt++;
        }
    }
    for(int i=0;i<ctz;i++){
        arr[i]=0;
    }
    for(int i=ctz;i<ctz+cto;i++){
        arr[i]=1;
    }
    for(int i=ctz+cto;i<ctz+cto+ctt;i++){
        arr[i]=2;
    }
    for(int i=0;i<arr.size();i++){
        cout<<arr[i]<<" ";
    }
    return 0;   
}