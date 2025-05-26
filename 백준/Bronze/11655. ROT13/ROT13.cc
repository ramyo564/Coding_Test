#include <bits/stdc++.h>
using namespace std;

int arr[26];
string str;
string ret;
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	// A-Z 65 ~ 90
	// a-z 97 ~ 122
	getline(cin, str);

	// cout << str;

	for (char s : str)
	{
		// 대문자
		if (s >= 'A' && s <= 'Z')
		{
			ret += (s-'A' + 13) %26 + 'A';
		}
		// 소문자
		else if (s >= 'a' && s <= 'z')
		{
			ret += (s-'a' +13) % 26 +'a';
		}
		else
		{
			ret += s;
		}
	}
	cout << ret;
	return 0;
}
