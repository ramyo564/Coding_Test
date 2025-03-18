#include <bits/stdc++.h>
using namespace std;
	
	int A,B,C, a,b, cnt[101], ret;
int main(){

	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	cin >> A >> B >> C;
	
	for (int i=0; i< 3; i++){
		cin >> a >> b;
		for (int i = a; i < b; i++){
			cnt[i] ++;
		}
	}
	
	for (int i = 0; i < 101; i++){
		if(cnt[i] == 1){
			ret += cnt[i] * A;
		}
		else if(cnt[i] == 2){
			ret += cnt[i] * B;
		}
		else if(cnt[i] == 3){
			ret += cnt[i] * C;
		}
		
	}
	
	cout << ret << "\n";

    return 0;
}