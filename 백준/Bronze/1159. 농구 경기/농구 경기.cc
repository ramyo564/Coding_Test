#include <bits/stdc++.h>
using namespace std;
	
	int people, cnt[26];
	string name, result;
	char lastName;
	
int main(){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	cin >> people;
	
	for (int i = 0; i<people; i++){
		cin >> name;
		lastName = name[0];
		cnt[lastName - 'a'] ++;
	}
	
	for (int i = 0; i<26; i++){
		
		if(cnt[i] > 4) {
			result += (char)(i+'a');	
		}
	}
	
	if (result.empty()){
		cout << "PREDAJA" << "\n";
	}
	else{
		cout << result << "\n";
	}


    return 0;
}