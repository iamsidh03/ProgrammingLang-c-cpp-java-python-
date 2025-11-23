
/*Left rotate an array by one*/
#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<int> arr{1,45,56,2,4,6,71,0,568};
    int first=arr[0];
    for(int i=0;i<arr.size();i++){
      arr[i]=arr[i+1];
    }
    arr[arr.size()-1]=first;
    for(auto value: arr){
        cout<< value << " ";
    }
    return 0;
}