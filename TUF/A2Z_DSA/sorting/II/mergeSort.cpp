#include <iostream>
#include <vector>
using namespace std;

void merge(int A[], int low, int mid, int high){
	vector<int> tmp;

	int left = low, right = mid+1;
	while(left<=mid && right<=high){
		if(A[left] <= A[right]){
			tmp.push_back(A[left]);
			left++;
		}
		else{
			tmp.push_back(A[right]);
			right++;
		}
	}

	while(left<=mid){
		tmp.push_back(A[left]);
		left++;
	}
	while(right<=high){
		tmp.push_back(A[right]);
		right++;
	}

	for(int i=low; i<=high; i++)
		A[i] = tmp[i-low];
}

void mergeSort(int A[], int low, int high){
	if(low>=high)
		return;

	int mid = (low+high)/2;

	mergeSort(A, low, mid);
	mergeSort(A, mid+1, high);
	merge(A, low, mid, high);
}

int main(){
	int n;
	cin >> n;

	int A[n];
	for(int i=0; i<n; i++)
		cin >> A[i];

	mergeSort(A, 0, n-1);
	for(int i=0; i<n; i++)
		cout << A[i] << ", ";

	return 0;
}
