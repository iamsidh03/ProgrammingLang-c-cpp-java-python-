#include<iostream>
using namespace std;

int a1(int arr[],int n){
    for (int i = 0; i < n - 1; i++){
        if (arr[i] > arr[i + 1]){
            return i+1;
    }
    

}
return -1;
}
int a2(int arr[],int n){
    int s=0;
    int e=n-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        if(arr[mid]>arr[mid+1]){
            return mid+1;
        }
        else if(arr[mid]<arr[mid-1]){
            return mid;
        }
        else if(arr[s]<=arr[mid]){
            s=mid+1;            
        }
        else{
            e=mid-1;
        }
    }
    return 0;
}

int main() {
    int arr[]={4,5,6,7,0,1,2,3};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout<<"Optimised approach, peak element index is "<<a2(arr,n)<<endl;
    cout<<"brute force approach, peak element index is "<<a1(arr,n)<<endl;
    return 0;
}