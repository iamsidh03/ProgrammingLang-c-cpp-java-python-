//return the first occurence of an element in an array
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;
int firstoccurence(vector<int> arr, int n, int key){
    int s=0;
    int e=arr.size()-1;
    int mid;
    int ans=-1;
    while(s<=e){
        mid=s+(e-s)/2;
        if(key==arr[mid]){
            ans=mid;
            e=mid-1;
        }
        else if(key>arr[mid]){
            s=mid+1;
        }
        else{
           e=mid-1; 
        }
}
return ans;

}
int lastoccurence(vector<int> arr, int n, int key){
    int s=0;
    int e=arr.size()-1;
    int mid;
    int ans=-1;
    while(s<=e){
        mid=s+(e-s)/2;
        if(key==arr[mid]){
            ans=mid;
            s=mid+1;
        }
        else if(key>arr[mid]){
            s=mid+1;
        }
        else{
           e=mid-1; 
        }
}
return ans;

}
//find total number of occurence
int main(){
    vector<int> arr = {1, 2, 3,3,3,3,3,3,4,4,4,4,4,4,4, 5};
    int size=arr.size();
    int tar=3;
    int ans_first=firstoccurence(arr,size,tar);
    int ans_last=lastoccurence(arr,size,tar);
    cout<<ans_first<<endl;
    cout<<ans_last<<endl;

    /*using inbuilt function*/
    auto ans_lower=lower_bound(arr.begin(),arr.end(),tar);
    auto ans_upper=upper_bound(arr.begin(),arr.end(),tar);
    cout<<"using inbuilt function finding first occurence:  "<<ans_lower-arr.begin()<<endl;
    cout<<"using inbuilt function finding last occurence:   "<<ans_upper-arr.begin()<<endl;
   
return 0;
}