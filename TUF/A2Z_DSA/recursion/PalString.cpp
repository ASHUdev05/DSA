#include <iostream>
#include <string>
using namespace std;

string isPal(string s, int id){
	int size = s.size();

	if(id>size/2 - 1)
		return s;

	swap(s[id], s[size-id-1]);
	return isPal(s, ++id);
}

int main(){
	string s="";
	getline(cin, s);

	string res = s.compare(isPal(s, 0)) == 0 ? "Pallindrome" : "Not";
	cout << res << endl;

	return 0;
}
