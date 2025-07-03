#include <iostream>
#include <vector>
using namespace std;

int bruteforce(vector<int> &nums){  //O(n2)
    int count=0;
    for(int i=0;i<nums.size();i++){
        count=0;
        for(int j=0;j<nums.size();j++){
            if(nums[j]==nums[i]){
                count++;
            }
        }
        if(count>(nums.size()/2)) return nums[i];
    }
    return -1;
}

/* Moor's voting algorithm */
int optimal(vector<int> &nums) //O(n)
{
    int idx=0;
    int  count=0;
    int  ele=nums[idx];
    while (idx !=nums.size())
    {
       
        if(nums[idx]==ele){
            count++;
        }
        else{
            count--;
        }
        if(count==0){
            ele=nums[idx+1];
        }
        idx++;  
    }
    if(count>0){
        return ele;
    }
   return -1;
}
int main()
{
    vector<int> nums = {2,2,2,2,1, 1, 2, 1, 1, 0,2,2};
    int ansoptimal =optimal(nums);
    int ansbruteforce =bruteforce(nums);
    cout<<ansoptimal<<endl;
    cout<<ansbruteforce<<endl;
    // for (int i = 0; i < nums.size(); i++)
    // {
    //     cout << nums[i] << " ";
    // }
    return 0;
}