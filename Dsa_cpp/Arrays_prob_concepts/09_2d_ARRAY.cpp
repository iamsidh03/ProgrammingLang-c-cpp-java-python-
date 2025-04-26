#include<iostream>
using namespace std;
// int main() {
//     int brr[3][3]={{1,2,3},{3,4},{5,6,7}};
//     for(int i=0;i<3;i++){
//     for(int j=0;j<3;j++){
//         cout<<brr[j][i]<<" ";
//     }
//     cout<<endl;
//     }
//     return 0;
// }

void rowSum(int brr[][3],int row,int col){
    int sum=0;    
cout<<"printting row sum of an array"<<endl;
for(int i=0;i<row;i++){
    for(int j=0;j<col;j++){

        sum+=brr[i][j];
    }
    cout<< i<< "th row sun is "<<sum<<endl;
    sum=0;
    
    }
}
void findkey(int brr[][3],int row,int col,int key){
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(brr[i][j]==key){
                cout<<"key found at "<<i<<"th row and "<<j<<"th column"<<endl;
            }
        }
    }
}
int max(int brr[][3],int row,int col){
    int max[0][0];
    
}
int main() {
    int brr[5][3]={{1,2,3},{3,4,5},{5,6,7},{8,9,10},{11}};
    int row=5,col=3;
    rowSum(brr,row,col);  
    findkey(brr,row,col,5);  
    // int row=4,col=3;
    // int brr[row][col];
    // for(int i=0;i<row;i++){
    // for(int j=0;j<col;j++){
    //     cin>>brr[i][j];
    
    // }
    // cout<<"taking columnwise input in array"<<endl;
    // int row=4,col=3;
    // int brr[row][col];
    // for(int i=0;i<row;i++){
    // for(int j=0;j<col;j++){
    //     cin>>brr[j][i];
    
    // }
    

//cout<<"printing rowise array"<<endl;

return 0;
}