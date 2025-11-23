#include <iostream>
#include <vector>
using namespace std;
int main(){
    vector<vector<int>> arr={{1,2,3,4},
                             {5,6,7,8},
                             {9,10,11,12},
                             {13,14,15,16},
                             {17,18,19,20}
                            };
    int row=arr.size(); //5
    int col=arr[0].size(); //4

    int target=10;
    int s=0;int e=row*col-1;
    while(s<=e){
        int mid=s+(e-s)/2;
        int rowIdx=mid/col;
        int colIdx=mid%col;
        if(arr[rowIdx][colIdx]==target){
            cout<<"Target element found at "<<rowIdx<<" "<<colIdx<<endl;
            int oneDIndex = col * rowIdx + colIdx;
            cout << "In terms of a 1D array, our target element is at index " << oneDIndex << endl;
            break;
    }
    else if(arr[rowIdx][colIdx]>target){
        e=mid-1;
    }
    else{
        s=mid+1;
    }
    
}
//c*i+j 
//c--> number of columns
//i--> row index
//j--> column index

return 0;
}