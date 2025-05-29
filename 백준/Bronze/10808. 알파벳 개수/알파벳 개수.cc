#include <bits/stdc++.h>
using namespace std;

string str;
int arr[26];
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	cin >> str;
	
	for (char s : str){
		arr[s-'a'] ++;
	}
	
	for (int n:arr) cout << n <<" ";

	return 0;
}
