#include <iostream>
using namespace std;

void loopN(int i, int n){
	if(i>n) return;
	
	cout << i << ", ";
	loopN(++i, n);
}

int main(){
	int n;
	cout << "Enter n:" << endl;
	cin >> n;
	loopN(1, n);
}
