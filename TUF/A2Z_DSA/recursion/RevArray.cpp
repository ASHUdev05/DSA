#include <iostream>
using namespace std;

void revArr(int A[], int id, int size){
	if(id > size/2 - 1)
		return;

	swap(A[id], A[size - id - 1]);
	revArr(A, ++id, size);
}

int main(){
	int n=0;
	cin >> n;

	int A[n];

	for(int i=0; i<n; i++){
		cin >> A[i];
	}
	revArr(A, 0, n);

	for(auto el: A)
		cout << el <<", ";

	return 0;
}
