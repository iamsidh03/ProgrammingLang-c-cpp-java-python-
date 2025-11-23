#include <iostream>
#include <vector>
using namespace std;

int bettersol(vector<int> &nums)
{
    int n=nums.size();
    for(int i=0;i<n;i++){
        int idx=abs(nums[i]);
        if(nums[idx-1]<n){
            nums[idx-1]*= -1;
        }
    }
    for(int i=0;i<n;i++){
        if(nums[i]>0){
            return i+1;
        }
    }
    return -1;
}
int optimal1(vector<int> &nums){
    int n=nums.size()-1;
    int sum=0;
    for(int i=0;i<=n;i++){
        sum+=nums[i];
    }
    int sum2= (n*(n+1))/2;
    int diff=sum2-sum;
    return diff;
}
int main()
{
    vector<int> nums = {4,3,6,2,1,1};
    // cout<<bettersol(nums)<<" ";
    cout<<optimal1(nums)<<" ";
    // for (int i = 0; i < nums.size(); i++)
    // {
    //     cout << nums[i] << " ";
    // }
    return 0;
}