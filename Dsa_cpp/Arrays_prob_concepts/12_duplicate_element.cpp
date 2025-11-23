//https://leetcode.com/problems/find-the-duplicate-number/description/

// I/P : 1,3,4,2,2
 // O/P : 2



#include <iostream>
#include <vector>
using namespace std;
/*
int main(){
    vector<int> arr {1,3,4,2,2};
    int n=arr.size();
    vector<int> freq(n+1,0);
    
    for(int i=0;i<n;i++){
        freq[arr[i]]++;
        
    }
    for(int i=1;i<=n;i++){
        if(freq[i]>1){
            cout<< "duplicate element is: "<<i<<endl;
        }
        
    }
    return 0;
}
    */
   //negetive marking method

   int main(){
    vector<int> arr {1,3,4,2,2};
    int n=arr.size();
    int ans=-1;
    for(int i=0;i<n;i++){
        int index=abs(arr[i]);
        if(arr[index]<0){
            cout<<"Duplicate elememt is "<< index<<endl;
            break;
        }
        arr[index]*=-1;
    }
    
        
    
    return 0;
}
   
