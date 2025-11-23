#include <iostream>
using namespace std;
int peak1(int arr[],int n){ //Brute force approach
    for(int i=0;i<n;i++){
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
            //return arr[i];
            return i;
        }
        
            }
            return -1;
}
int peak2(int arr[],int n){ //Optimised approach
    int low=0,high=n-1;
    int mid;
    while(low<high){
        mid=low+(high-low)/2;
        if(arr[mid]<arr[mid+1]){
            low=mid+1;
        }else if(arr[mid]>arr[mid+1]){
            high=mid;
        }

    }
    return arr[high];
}
int main(){
    int arr[]={10,20,30,31,32,33,39,40,37,35,25,15,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    cout<<"peak element is "<<peak1(arr,n)<<endl; //Time complexity O(n)
    
    cout<<peak2(arr,n)<<" ";
    
    return 0;

}