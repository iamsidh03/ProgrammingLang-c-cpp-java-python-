#include<iostream>
using namespace std;
bool checkpalindrome(string &s,int st,int end){
    //base case
    if(st>=end) return true;
    if(s[st]!=s[end]) return false;
     return checkpalindrome(s,st+1,end-1);
}
int main(){
    string s;
    cin>>s; //abcba
    int st = 0;
    int end = s.length()-1;
    bool ans = checkpalindrome(s,st,end);
    if(ans){
        cout<<"yes"<<endl;
    }else{
        cout<<"no"<<endl;
    }
    return 0;
}