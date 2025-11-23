#include <iostream>
#include <vector>
using namespace std;

void sortColors(vector<int> &nums)
{
    int start = 0, end = nums.size() - 1, idx = 0;
    while (idx <= end)
    {
        if (nums[idx] == 0)
        {
            swap(nums[start], nums[idx]);
            start++;
            idx++;
        }
        else if (nums[idx] == 2)
        {
            swap(nums[idx],nums[end]);
            end--;
        }
        else
        {
            idx++;
        }
    }
}
int main()
{
    vector<int> nums = {2, 1, 2, 1, 1, 0};
    sortColors(nums);
    for (int i = 0; i < nums.size(); i++)
    {
        cout << nums[i] << " ";
    }
    return 0;
}