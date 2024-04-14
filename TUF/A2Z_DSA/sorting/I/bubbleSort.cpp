#include <iostream>
using namespace std;

void bubbleSort(int A[], int n){
	for(int i=n-1; i>=0; i--)
		for(int j=0; j<i; j++)
			if(A[j]>A[j+1])
				swap(A[j], A[j+1]);
}

int main(){
	int n;
	cin >> n;

	int A[n];
	for(int i=0; i<n; i++)
		cin >> A[i];

	bubbleSort(A, n);
	for(int i=0; i<n; i++)
		cout << A[i] << ", ";

	return 0;
}
