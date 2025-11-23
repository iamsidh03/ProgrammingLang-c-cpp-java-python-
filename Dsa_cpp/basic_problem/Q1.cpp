#include<bits/stdc++.h>
using namespace std;

int main(){
    string str="#####*****";

    int size=str.length();
    int cnt=0;
    for(int i=0;i<size;i++){
        if(str[i]=='#') cnt--;
        else cnt++;
    }
    if(cnt>0){
        cout<<"positive"<<cnt;
    }else if(cnt <0){
        cout<<"negitive"<<cnt;
    }
    else{
        cout<<"Neutral"<<cnt;
    }
    return 0;
}