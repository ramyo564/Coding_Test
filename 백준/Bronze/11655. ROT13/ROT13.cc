#include <bits/stdc++.h>
using namespace std;
	
	string name, result;
	char letter;
	
int main(){

	getline(cin, name);
	for (int i = 0; i < name.length(); i++){
		letter = name[i];
		if (65<= letter && letter <= 90){
			if(77 < letter){
				result += 'A' + letter - 78;
			}
			else{
				result += letter + 13;
			}
		}
		else if (97 <= letter && letter <= 122){
			if(109 < letter){
				result += 'a' + letter - 110;
			}
			else {
				result += letter + 13;
			}
		}
		else {
			result += letter;
		}
	}
	
	cout << result << endl;

    return 0;
}