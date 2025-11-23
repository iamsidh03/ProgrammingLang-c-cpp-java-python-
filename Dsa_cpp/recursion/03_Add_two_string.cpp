#include<iostream>
#include <algorithm>
using namespace std;


/* constraint you can't convert to int directly and just add and you have to return string */
//add two string using recursion
string addre(string s1,string s2,int p1,int p2,int carry=0){
    //base case
    if(p1<0&&p2<0){
        if(carry!=0){
            return string(1,carry+'0');
        }
        return "";
    }
    // one case
    int n1=((p1>=0)?s1[p1]:'0')-'0';
    int n2=((p2>=0)?s2[p2]:'0')-'0';
    int sum=n1+n2+carry;
    carry=sum/10;
    string ans="";
    int digit=sum%10;
    ans.push_back(digit+'0');
    // recursive call
    return ans+=addre(s1,s2,p1-1,p2-1,carry);
    }
string addString(string s1,string s2){
    int p1=s1.length()-1;
    int p2=s2.length()-1;
    string ans=addre(s1,s2,p1,p2);
    // reverse the string
    reverse(ans.begin(),ans.end());
    return ans;
}
int main(){
    string s1="123456789";
    string s2="987654321";
    string ans=addString(s1,s2);
    cout<<ans<<endl; //1111111110
    return 0;
}
    
