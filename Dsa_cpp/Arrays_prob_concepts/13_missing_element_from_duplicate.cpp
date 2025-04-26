#include <bits/stdc++.h>
#include <iostream>
#include <vector>
using namespace std;
// int main(){
    
//     vector<int> arr={1,3,3,3,4};
//     int n=arr.size();
//     for(int i=0;i<n;i++){
//         int index=abs(arr[i]);
//         if(arr[index-1]<n){
//         arr[index-1]*=-1;
//     }
//     }
//     for(int i=0;i<n;i++){
//         if(arr[i]>0){
//             cout<< "Missing element is: "<<i+1<<endl;
//             //break;
//         }
//     }
//     return 0;
// }


//using sorting+swaping approach
int main(){
   // vector<int> arr={1,3,3,3,4};
    vector<int> arr={1,3,3,4,3};
     int n=arr.size();
     //sort(arr.begin(),arr.end());
     int i=0;
     while(n>i){
        int index=arr[i]-1;
        if(arr[i]!=arr[index]){
            swap(arr[i],arr[index]);
        }
        else{
            ++i;
        }
     }
     for(int i=0;i<n;i++){
        if(arr[i]!=i+1){
            cout<<i+1<< " ";
        }
     }
     cout<<endl;
    return 0;
}