#include<iostream>
#include<vector>
using namespace std;
 void helper(vector<string>&arr,string str,int n,int open,int close){
            if(open==n && close ==n) {
                arr.push_back(str);
                return;
            }
            if(close==open){
                helper(arr,str+'(',n,open+1,close);
            }
            if(open>close){
                helper(arr,str+'(',n,open+1,close);
                helper(arr,str+')',n,open,close+1);
            }
            
    }
int main(){
    int n = 3;
    vector<string> arr;
    helper(arr,"",n,0,0);
    for(auto s: arr) {
        cout << s << endl;
    }
    return 0;
}