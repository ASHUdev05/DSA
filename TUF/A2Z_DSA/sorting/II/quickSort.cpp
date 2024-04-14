#include <iostream>
using namespace std;

int partition(int A[], int low, int high){
	int pivot = A[low];
	int i = low;
	int j = high;
	while(i<j) {
		while(A[i] <= pivot && i <= high - 1){
			i++;
		}

		while(A[j] > pivot && j >= low + 1){
			j--;
		}
		if(i<j)
			swap(A[i], A[j]);
	}
	swap(A[low], A[j]);
	return j;
}

void quickSort(int A[], int low, int high){
	if(low<high){
		int pId = partition(A, low, high);
		quickSort(A, low, pId - 1);
		quickSort(A, pId + 1, high);
	}
}

int main(){
	int n;
	cin >> n;

	int A[n];
	for(int i=0; i<n; i++)
		cin >> A[i];

	quickSort(A, 0, n-1);
	for(int i=0; i<n; i++)
		cout << A[i] << ", ";

	return 0;
}
