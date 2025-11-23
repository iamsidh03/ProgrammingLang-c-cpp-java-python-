#include <iostream>
using namespace std;

#include <vector>

/*
tip: whenever you have to search in a searchspace ki pta hai is range me hw ans hai then 

take a variable (ans) store your ans and move ahead 
at the end you got you answer.

*/
int divide(int dividend,int divisor){
    int q=0;
    int s=0;
    int e=dividend;
    // q*divisor+rem<=dividend
    while(s<=e){
        int mid=s+(e-s)/2;
        if(abs(mid*divisor)==abs(dividend)){
            //cout<<mid<<endl;
            return mid;
            break;
        }
        if(abs(mid*divisor)>abs(dividend)){
            e=mid-1;
        }
        else if(abs(mid*divisor)<=abs(dividend)){
            q=mid;
            s=mid+1;
        }

    }
    if((divisor<0 && dividend>0) || (divisor>0 && dividend<0)) q=-q;    
    //cout<<q<<endl; 
    return q;
}
int main() {
    int divisor=-7;
    int dividend=abs(69);
    cout<<divide(dividend,divisor)<<endl;
     
    return 0;

}