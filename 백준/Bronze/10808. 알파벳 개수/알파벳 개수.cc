#include <bits/stdc++.h>
using namespace std;

int main(){
	string alphabet = "abcdefghijklmnopqrstuvwxyz";
    unordered_map<string, int> mydict = {
        {"a", 0}, {"b", 0}, {"c", 0}, {"d", 0}, {"e", 0},
        {"f", 0}, {"g", 0}, {"h", 0}, {"i", 0}, {"j", 0},
        {"k", 0}, {"l", 0}, {"m", 0}, {"n", 0}, {"o", 0},
        {"p", 0}, {"q", 0}, {"r", 0}, {"s", 0}, {"t", 0},
        {"u", 0}, {"v", 0}, {"w", 0}, {"x", 0}, {"y", 0}, {"z", 0}
    };

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	string target;
	cin >> target;
	
    for (int i = 0; i < target.size(); i++) {
        mydict[string(1, target[i])]++; 
    }
	
	for (int i = 0; i < alphabet.size(); i++){
		cout << mydict[string(1, alphabet[i])] << " ";
	}
	
	
	return 0;
}