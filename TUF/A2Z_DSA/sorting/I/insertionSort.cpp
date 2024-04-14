#include <iostream>
using namespace std;

void insertionSort(int A[], int n){
	for(int i=0; i<n; i++)
		for(int j=i; j>0; j--)
			if(j==0) continue;
			else
				if(A[j-1] > A[j])
					swap(A[j-1], A[j]);
}

int main(){
	int n;
	cin >> n;

	int A[n];
	for(int i=0; i<n; i++)
		cin >> A[i];

	insertionSort(A, n);
	for(int i=0; i<n; i++)
		cout << A[i] << ", ";

	return 0;
}
