// https://takeuforward.org/plus/dsa/problems/longest-subarray-with-sum-k
#include <iostream>
#include <vector>
using namespace std;

// Function to find the longest subarray with sum equal to k
//bruteforce
int func(int vector<int>& arr,int tar){
    int n=arr.size();
    int len=-1;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n-1;j++){
            int s=0;
            for(int k=i;k<=j;k++){
                s+=arr[k];
            }
            if(s==tar){
                len=max(len,j-i+1);
            }
        }
    }
    return len;
}
int main(){
    
    return 0;
}