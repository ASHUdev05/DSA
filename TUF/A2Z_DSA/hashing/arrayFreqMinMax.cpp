#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
	int n=0;
	cin >> n;

	int A[n];
	for(int i=0; i<n; i++)
		cin >> A[i];
	
	unordered_map<int, int> ump;
	for(auto el: A)
		ump[el]++;

	int min=n, max=0;
	int minEl=0,maxEl=0;
	for(auto it: ump){
		if(min>it.second){
			min = it.second;
			minEl = it.first;
		}
		if(max<it.second){
			max=it.second;
			maxEl=it.first;
		}
	}

	cout << minEl << ", " << maxEl << endl;

	return 0;
}
