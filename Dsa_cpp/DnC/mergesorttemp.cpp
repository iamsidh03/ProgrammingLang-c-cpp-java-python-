#include<iostream>
using namespace std;
#include<vector>
void merge(vector<int> &arr,int low,int mid,int high){
    vector<int> temp;
    int i=low;
    int j=mid+1;
    while(i<=mid && j<=high){
        if(arr[i]<arr[j]){
            temp.push_back(arr[i]);
            i++;
        }else{ //arr[i]>=arr[j]
            temp.push_back(arr[j]);
            j++;

        }
    }
    while(i<=mid){
        temp.push_back(arr[i]);
        i++;
    }
    while(j<=high){
        temp.push_back(arr[j]);
        j++;
    }
    //copying the temp element in our original array
    for(int k=low;k<=high;k++){
        arr[k]=temp[k-low];
    }


}
void mergesort(vector<int>&arr,int low,int high){
    if(low>=high) return;
    int mid=low+(high-low)/2;
    mergesort(arr,low,mid);
    mergesort(arr,mid+1,high);
    merge(arr,low,mid,high);
}
int main(){
    vector<int> a = {5, 4, 3, 2, 1};
    int n = 5;
    mergesort(a, 0, n - 1);
    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    return 0;
}