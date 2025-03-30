#include <bits/stdc++.h>
using namespace std;
	

int main(){
    	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	int N, M, Start;
	Start = 1;
	string name;
	cin >> N >> M;
	
	map<int, string> myMap;
	map<string, int> myMap2;
	
	for (int i = 0; i < N; i++){
		cin >> name;
		myMap[Start] = name;
		myMap2[name] = Start;
		Start++;
	}
	

	for (int i = 0; i<M ; i++){
		cin >> name;
		if(atoi(name.c_str()) == 0){
			cout << myMap2[name] << "\n";
		} else {
			cout << myMap[atoi(name.c_str())] << "\n";
		}
	}
	
    return 0;
}