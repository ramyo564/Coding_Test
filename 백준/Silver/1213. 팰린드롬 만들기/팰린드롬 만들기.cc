#include <bits/stdc++.h>
using namespace std;

string s, ret; 
int cnt[200], flag; 
char mid;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cin >> s;
	if (s.length() == 1) {
	
		cout << s;	
		return 0;
	}
	
	for (char i : s) cnt[i] ++;
	
	for (int i = 'Z'; i >= 'A'; i--) {
		if (cnt[i]){
			if (cnt[i] & 1){
				flag++;
				mid = char(i);
				cnt[i]--;
			}
			if(flag == 2){
				cout << "I'm Sorry Hansoo" << '\n';
				return 0;
			}
		
			for(int j = 0; j<cnt[i]; j += 2){
				ret = char(i) + ret;
				ret += char(i);
			}
		}
	}
	
	if(mid)ret.insert(ret.begin() + ret.size() / 2, mid);
	
	cout << ret << "\n";

    return 0;
}