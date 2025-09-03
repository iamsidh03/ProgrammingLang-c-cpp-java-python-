#include<iostream>
using namespace std;
#include<stack>

int main(){
    string str="abcd";
    string rev="";
    stack<char> s;
    for(int i=0;i<str.size();i++){
        s.push(str[i]);
    }
    while(!s.empty()){
        rev+=s.top();
        s.pop();
    }

    cout<<rev<<endl;


}