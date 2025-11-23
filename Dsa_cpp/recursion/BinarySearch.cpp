#include<iostream>
#include<vector>
using namespace std;

int bs(vector<int> &arr,int low,int high,int tar){
    int mid=low+(high-low)/2;
    if(low>high) {return -1;}
    
    if(arr[mid]==tar){
        return mid;

    }
    else if(arr[mid]<tar){
        return bs(arr,mid+1,high,tar);
    }
    else if(arr[mid]>tar){
        return bs(arr,low,mid-1,tar);
    }
    
}
int main(){
    vector<int> arr={1,2,3,4,5,6,7,8,9};
    int low=0;
    int high=arr.size()-1;
    int tar=50;
    cout<<bs(arr,low,high,tar);
    return 0;
}