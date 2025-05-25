#include <bits/stdc++.h>
using namespace std;

int arr[26];

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	

	int n;
	cin >> n;
	string str;

	string ret = "";
	for (int i = 0; i < n; i++){
		cin >> str;
		arr[str[0] -'a']++;
	}

	for (int i =0; i<26; i++){
		if ( 5 <= arr[i] ){
			ret += (i+'a');	
		}
	}

	if(ret.size()){
		cout << ret;
	}else{
		cout << "PREDAJA";
	}

	return 0;
}
