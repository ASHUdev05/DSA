#include <iostream>
using namespace std;

int sum(int n, int id, int s){
	if(id>n)
		return s;

	return sum(n, ++id, s+id);
}

int main(){
	int n=0;
	cin >> n;

	int s = sum(n,0,0);
	cout << s;

	return 0;
}
