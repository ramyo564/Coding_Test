#include <bits/stdc++.h>
using namespace std;
	

int main(){
	int N, K;
	cin >> N >> K;
	vector<int> arr(N);
	for (int i=0; i<N; i++){
		cin >> arr[i];
	}
	
	int temp = 0;
	for (int i = 0; i < K; i++){
		temp += arr[i];
	}
	
	int temp_idx = K-1;
	int second_temp = temp;
	
	for (int i = 0; i < N-K; i++){
		second_temp -= arr[i];
		temp_idx += 1;
		second_temp += arr[temp_idx];
		if (temp < second_temp) temp = second_temp;
	}

	cout << temp;
	
    return 0;
}