#include <iostream>
#include <vector>
using namespace std;
int main(){
    // int arr[]={2,4,6,8};
    // int  sizearr=sizeof(arr)/sizeof(int);
    // int brr[]={1,3,7};
    // int sizebrr=sizeof(brr)/sizeof(int);
    vector<int> arr{2,1,1,4,6,8};
    vector<int> brr{1,4,3,7};
    
    vector<int> ans;
    for(int i=0;i<arr.size();i++){
        int e=arr[i];
        for(int j=0;j<brr.size();j++){
            if(e==brr[j]){
                ans.push_back(e);
                brr[j]=INT_MIN;
            }
        }
    }
        for(auto value: ans){
            cout<< value << " ";
        }

return 0;
}