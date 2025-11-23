#include <iostream>
#include <vector>
using namespace std;

int missingNumber(vector<int>& nums, int n) {
    int s=0;
    int e=n-1;
    int mid;
    while(s<=e){
        mid=s+(e-s)/2;
        if(nums[mid]!=mid+1){
            e=mid-1;
        }else{
            s=mid+1;
        }
    }
    return s+1;
}
int main() {
    vector<int> v{1,2,3,4,6,7,8,9,10};
    int n = v.size();
    int ans=missingNumber(v,n);
    cout<<ans;    
    return 0;
}