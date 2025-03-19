#include <bits/stdc++.h>
using namespace std;
	
	char letter;
	
int main(){
	string name;
	
	getline(cin, name);
	string result(name.length(), ' '); 
	
	for (int i = 0; i < name.length(); i++){
		letter = name[i];
		if (65<= letter && letter <= 90){
			if(77 < letter){
				result[i] = 'A' + letter - 78;
			}
			else{
				result[i] = letter + 13;
			}
		}
		else if (97 <= letter && letter <= 122){
			if(109 < letter){
				result [i] = 'a' + letter - 110;
			}
			else {
				result [i] = letter + 13;
			}
		}
		else {
			result[i] = letter;
		}
	}
	
	cout << result << endl;

    return 0;
}