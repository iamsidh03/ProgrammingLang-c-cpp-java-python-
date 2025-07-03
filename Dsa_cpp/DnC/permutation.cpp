#include<iostream>
#include<vector>
using namespace std;
void permutation(vector<int>&num,int index,vector<vector<int>>&ans,int start){
    if(start==num.size()){
        ans.push_back(start);
        return;
    }
    for(int i=index;i<num.size();i++){
        start
    }
}
int main(){
    vector<int>num={1,2,3};
    vector<vector<int>> ans;
    vector<int> start;
    permutation(num,0,ans,start);
    return 0;
}