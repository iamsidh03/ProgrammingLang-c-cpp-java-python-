// Online C++ compiler to run C++ program online
#include <iostream>
#include <vector>
using namespace std;
int main() {
    
    int arr[]={2,4,6,8};
    int  sizearr=sizeof(arr)/sizeof(int);
    int brr[]={1,3,7};
    int sizebrr=sizeof(brr)/sizeof(int);
    
    vector<int> urr;
    for(int i=0;i<sizearr;i++){
        urr.push_back(arr[i]);
    }
    for(int i=0;i<sizebrr;i++){
        urr.push_back(brr[i]);
    }
    cout << "Printing union array"<<endl;
    for(int i=0;i<urr.size();i++){
        cout<<urr[i]<< " ";
    }
    
    

    return 0;
}