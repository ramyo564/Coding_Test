#include <bits/stdc++.h>
using namespace std;

int main(){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	string target;
	cin >> target;
	string a(target.rbegin(),target.rend());
	
	if (a == target){
		cout << 1;
	} else {
		
		cout << 0;
	}
	
	
	return 0;
}