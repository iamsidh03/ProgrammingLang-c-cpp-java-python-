#include<iostream>
using namespace std;
#include<vector>
/*
approach 1-- run two loops 
outer loop i 
inner loop check that i is present in the array or not

approach 2  suing hash map

 */

 int hash_map(int arr[],int size){
    vector<int>hash(size+1,0);
    for(int i=0;i<size;i++){
        hash[arr[i]]++;
    }
    for(int i=1;i<hash.size();i++){
        if(hash[i]==0) return i;
    }
    return -1;

 }
int add_approach(int arr[],int size){
    int sum=0;
    for(int i=0;i<size;i++){
        sum+=arr[i];
    }
    int ans=(((size+1)*(size+2))/2)-sum;
    return ans;
}

int main(){
    int arr[]={1,4,2,5,6,7};
    int size=sizeof(arr)/sizeof(arr[0]);
    
   cout<<add_approach(arr,size)<<endl;
cout<<hash_map(arr,size)<<" ";
}