  //common element in 3 sorted array
  #include <iostream>
  #include <vector>
  #include <algorithm>
  using namespace std;
  #include <set>


  /*
  int removeDuplicates(int arr[], int n) {
    sort(arr, arr + n); // Sort first
    int j = 0; // Unique element index

    for (int i = 0; i < n - 1; i++)
        if (arr[i] != arr[i + 1])
            arr[j++] = arr[i];
    
    arr[j++] = arr[n - 1]; // Last element

    return j; // New size
}
    */



//   int main(){
//     // vector<int> arr={1,5,10,20,40,80};
//     // vector<int> brr={6,7,20,80,100};
//     // vector<int> crr={3,4,15,20,40,70,80,120};
//     vector<int> arr={3,3,3};
//     vector<int> brr={3,3,3};
//     vector<int> crr={3,3,3};
//     set<int> st;
//     int i=0,j=0,k=0;

//     while(i<arr.size() && j<brr.size() && k<crr.size()){
//         if(arr[i]==brr[j] && brr[j]==crr[k]){
//             //cout<<arr[i]<<" ";
//             st.insert(arr[i]);
//             i++;j++;k++;
//         }
//         else if(arr[i]<brr[j]){
//             i++;
//         }
//         else if(brr[j]<crr[k]){
//             j++;
//         }
//         else{
//             k++;
//         }
 
//     }
//     for(auto value: st){
//         cout<<value<<" ";
//     }
//     return 0;
// }


/*without using set*/

void removeDuplicates(vector<int> &arr) {
    if (arr.empty()) return; // Edge case: empty array

    sort(arr.begin(), arr.end()); // Sort first
    int j = 0; // Index for unique elements

    for (int i = 1; i < arr.size(); i++) {
        if (arr[i] != arr[j]) {
            j++;
            arr[j] = arr[i];
        }
    }

    arr.resize(j + 1); // Resize to remove unwanted elements
}
int main(){
    // vector<int> arr={1,5,10,20,40,80};
    // vector<int> brr={6,7,20,80,100};
    // vector<int> crr={3,4,15,20,40,70,80,120};
    vector<int> arr={3,3,3};
    vector<int> brr={3,3,3};
    vector<int> crr={3,3,3};
    removeDuplicates(arr);
    removeDuplicates(brr);
    removeDuplicates(crr);

    
    int i=0,j=0,k=0;

    while(i<arr.size() && j<brr.size() && k<crr.size()){
        if(arr[i]==brr[j] && brr[j]==crr[k]){
            cout<<arr[i]<<" ";
            
            i++;j++;k++;
        }
        else if(arr[i]<brr[j]){
            i++;
        }
        else if(brr[j]<crr[k]){
            j++;
        }
        else{
            k++;
        }
 
    }
    
    return 0;
}