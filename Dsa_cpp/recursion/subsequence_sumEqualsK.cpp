#include<iostream>
#include<vector>
#include<string>
using namespace std;

void helper(vector<vector<int>>&arr,vector<int> ans,vector<int>&nums,int sum,int idx){
    if(sum<=0){
        arr.push_back(ans);
        return;
    }
    if(nums[idx] > sum || idx >= nums.size()) {
        return;
    }
    ans.push_back(nums[idx]);
    helper(arr,ans,nums,sum-nums[idx],idx+1);
    ans.pop_back();
    helper(arr,ans,nums,sum,idx+1);

    
}
vector<vector<int>> subsequenceSumEqualsK(vector<int>& nums, int k) {
    vector<vector<int>> arr;
    vector<int> ans;
    helper(arr, ans, nums, k, 0);
    return arr;
}
int main(){
    vector<int> num = {1, 2, 3, 4, 5};
    int k = 5;
    vector<vector<int>> result = subsequenceSumEqualsK(num, k);
    
    for (const auto& vec : result) {
        cout<< "[ ";
        for (int val : vec) {
            cout << val << " ";
        }
        cout << "] ";
        cout << endl;
    }
    
    return 0; 
}