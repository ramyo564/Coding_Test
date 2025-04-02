#include <bits/stdc++.h>
using namespace std;

int N, A;
string item, genre;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	cin >> N;
	
	for (int i = 0; i < N; i++){
		map<string, int> myMap;
		int ret = 1;
		cin >> A;
		for (int j = 0; j < A; j++){
			cin >> item >> genre;
			myMap[genre] ++;
		}
		
		for (const auto& pair : myMap) {
	        ret *= (pair.second + 1);
	    }
	    
	    cout << ret -1 <<'\n';
			
	}

    return 0;
}