#include <iostream>
using namespace std;

void selectionSort(int A[], int n){
	for(int i=0; i<=n-2; i++){
		int mini = i;
		for(int j=i; j<=n-1; j++){
			if(A[j] < A[mini])
				mini = j;
		}
		swap(A[mini], A[i]);
	}
}

int main() {
	int n;
	cin >> n;
	int A[n];

	for(int i=0; i<n; i++)
			cin >> A[i];

	selectionSort(A, n);
	for(int i=0; i<n; i++)
		cout << A[i] << ", ";

	return 0;
}
