#include <bits/stdc++.h>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	string str; 
	cin >> str;

	string ret = str;

	reverse(ret.begin(), ret.end());

	if(str == ret){
		cout << 1;
	}else {
		cout << 0;
	}

	return 0;
}
