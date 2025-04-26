#include <iostream>
#include <vector>
using namespace std;

int main(){
    vector<int> arr{1, 2, 4, 2, 1, 3, 6, 5, 5, 6, 4};
    int max=-1;
    for(int i=0;i<arr.size(); i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    vector<int> frr(max+1,0);
    for(int i=0;i<arr.size();i++){
        frr[arr[i]]++;
    }
    for(int i=0;i<arr.size();i++){
        if(frr[arr[i]]==1){
            cout<<arr[i];
            return 0;
        }
    }
    cout<<-1;
    return 0;
    }
