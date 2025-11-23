/*
Input: -12, 11, -13, -5, 6, -7, 5, -3, -6
Output: -12 -13 -5 -7 -3 -6 11 6 5
*/
#include <iostream>
#include <vector>
using namespace std;

void printarr(vector<int>arr){
    int size=sizeof(arr)/sizeof(arr[0]);
    cout<<"printing updated array"<<endl;
    for(int num:arr){
        cout<<num<<" ";
    }
    cout<<endl;
}
int main() {
    vector<int> arr {-12, 11, -13, -5, 6, -7, 5, -3, -6};
    int low=0;
    int high=arr.size()-1;
   while(low<high){
    if(arr[low]<0){
        low++;
    }
    else if(arr[high]>0){
        high++;
    }
    else{
        swap(arr[low],arr[high]);
        low++;
        high--;
    }
   }
   printarr(arr);

    return 0;
}
