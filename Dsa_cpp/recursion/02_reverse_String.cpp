#include<iostream>
using namespace std;

//own swap function
void swaps(char& a,char& b){
    a=a^b;
    b=a^b;
    a=a^b;
}
//reverse recursion
void reverserec(string& s,int start,int end){
    //base case
    if(start>=end){
        return;
    }
    swaps(s[start],s[end]);
    reverserec(s,start+1,end-1);
    
}
int main(){
    string s="abcdefg";
    int start = 0;
    int end = s.length()-1;
    reverserec(s,start,end);
    cout<<s<<endl; //gfedcba
}