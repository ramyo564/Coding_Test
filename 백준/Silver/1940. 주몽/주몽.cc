#include <bits/stdc++.h>
using namespace std;

int N, target;

int main(){
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	cin >> N >> target;
	vector<int> arr(N);	
	for (int i = 0; i < N; i++){
		cin >> arr[i];
	}
	
	sort(arr.begin(), arr.end());
	
	int left = 0;
	int right = arr.size()-1;
	int ret = 0;
	while(left != right){
		if (arr[left] + arr[right] < target){
			left ++;
		}
		else if (arr[left] + arr[right] > target){
			right --;
		}else{
			left ++;
			ret ++;
		}
	}
	cout << ret << '\n';
	
    return 0;
}