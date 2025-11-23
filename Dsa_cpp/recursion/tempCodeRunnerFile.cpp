#include<iostream>
using namespace std;


/*print all combination of subarray*/

void subarray(string& s,int st,int end){
    //base case
    if(end>=s.length()){
        return;
    }
    for(int i=0;i<=end;i++){
        cout<<s[i]<<" ";
    }
    cout<<endl;
    subarray(s,st,end+1);
}
void allsubarray(string& s,int st,int end){
  for(int i=0;i<=s.length()-1;i++){
    subarray(s,i,i);
  } 
}
int main(){
    string s;
    cin>>s; //abc
    int st = 0;
    int end = 0;
    //subarray(s,st,end);
    allsubarray(s,st,end);
    return 0;
}