#include <iostream>
using namespace std;

int fact(int num, int id, int prod){
	if(id>num)
		return prod;

	return fact(num, ++id, prod*id);
}


int main(){
	int n=0;
	cin >> n;

	cout << fact(n, 1, 1);

	return 0;
}
