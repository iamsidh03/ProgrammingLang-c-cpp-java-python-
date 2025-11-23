#include<iostream>
using namespace std;
/*
you have given an array of size n , you have to find the element which occurs odd number of times.
*/
int a1(int arr[],int n){ // works only when element are arrange in sorted order.
    for(int i=0;i<n;i=i+2){
        if(arr[i]!=arr[i+1]){
            return arr[i];
        }
}
return -1;
}
int a2(int arr[],int n){
    int res=0;
    for(int i=0;i<n;i++){
        res^=arr[i];
    }
    return res;
}
int main(){
    int arr[]={1,1,2,2,3,3,4,4,3,600,600,4,4};
    int n=sizeof(arr)/sizeof(int);
    cout<<"Brute force approach of finding odd occurence is "<<a1(arr,n)<<endl;
    cout<<"Optimised approach of finding odd occurence is "<<a2(arr,n)<<endl;
    
    return 0;
}
