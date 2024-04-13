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

	int t=0;
	cin >> t;
	cout << ump[t];

	return 0;
}
