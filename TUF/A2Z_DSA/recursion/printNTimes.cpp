#include <iostream>
using namespace std;

void recurPrint(int n, int count){
	if(count == 0)
		return;
	cout << n << endl;
	recurPrint(n, --count);
}

int main(){
	int n, c;
	cout << "Enter n and count:" << endl;
	cin >> n >> c;
	recurPrint(n, c);
	return 0;
}
