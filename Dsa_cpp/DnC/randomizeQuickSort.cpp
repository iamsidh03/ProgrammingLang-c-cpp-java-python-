#include <iostream>
using namespace std;
#include <vector>
int partition(vector<int> &arr, int low, int high)
{
    /* Goal of partition is to place pivot element at there correct position 
    Element which is lesser then pivot are on the left side 
    and greater element are on the right side */
    int pivot = arr[high];
    int j = low - 1;
    for (int i = low; i < high; i++)
    {
        if (arr[i] <= pivot)
        {
            j++;
            swap(arr[i], arr[j]);
        }
    }
    swap(arr[j+1],arr[high]);
    return j + 1; //return the pivot index
}
int randomIdx(vector<int>&arr,int low,int high){
    int ridx=low+rand()%(high-low+1);
    swap(arr[ridx],arr[high]);/* In our partion logic our pivot element is at last index so wwe need to swap it with last index */
    return partition(arr, low, high);
}
int main()
{
    vector<int> a = {5, 4, 3, 2, 1};
    int n = 5;
    srand(time(0)); /* It generate different random number every time it runs */
    int low = 0, high = n - 1;
    int pivotIndex = randomIdx(a, low, high);
    
    cout << "Pivot Index: " << pivotIndex << endl;
    cout << "Array after partitioning: ";
    for (int i = 0; i < n; i++)
    {
        cout << a[i] << " ";
    }
    cout << endl;
    
    return 0;
}