#include<iostream>
using namespace std;
#include<vector>
bool Odds(int arr[], int n) {
    int j,k;
    for(int i=0;i<n-2;i++){
        j=i+1;
        k=j+1;
        if(arr[i]%2!=0 && arr[j]%2!=0 && arr[k]%2!=0){
            return true;
        }
        
        
    

    }
    return false;
}
int main(){
    int arr[] ={1,1,3,4,5};
    int n=sizeof(arr)/sizeof(arr[0]);
    if(Odds(arr,n)){
        cout<< "true";
    }else{
        cout<<"false"<<endl;
    }
    

}