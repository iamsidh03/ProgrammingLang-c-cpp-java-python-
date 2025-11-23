#include <iostream>
#include <vector>
using namespace std;
#include <set>
#include <algorithm>

vector<vector<int>> threeSumBetterSol(vector<int> &nums){
    set<vector<int>> st;
    int n=nums.size();
    for(int i=0;i<n;i++){
        set<int> hashset;
        for(int j=i+1;j<n;j++){
            int k= -(nums[i]+nums[j]);
            if(hashset.find(k)!=hashset.end()){  //if k is present in hashset
                // we have found a triplet
                vector<int> temp={nums[i],nums[j],nums[k]};
                st.insert(temp);
            }
            hashset.insert(nums[j]);
        }
    }
    vector<vector<int>> ans(st.begin(),st.end());
    return ans;
}
vector<vector<int>> threeSumBruteForce(vector<int> &nums)
{
    int n=nums.size()-1;
    set<vector<int>> st;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(nums[i]+nums[j]+nums[k]==0){
                    vector<int> temp={nums[i],nums[j],nums[k]};
                    sort(temp.begin(),temp.end());
                    st.insert(temp);

                }
            }
        }
    }
    vector<vector<int>> ans(st.begin(), st.end());
    return ans;


}
int main()
{
    vector<int> nums = {-1,0,1,2,-1,-4}; //{{-1,-1,2},{0,-1,1}}
    vector<vector<int>> ans = threeSumBruteForce(nums);
    for (int i = 0; i < ans.size(); i++)
    {
        for (int j = 0; j < ans[i].size(); j++)
        {
            cout << ans[i][j] << " ";
        }
        cout << endl;
    }
    // for (int i = 0; i < nums.size(); i++)
    // {
    //     cout << nums[i] << " ";
    // }
    return 0;
}