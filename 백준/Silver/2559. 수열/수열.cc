#include <bits/stdc++.h>
using namespace std;

int main()
{
    	ios_base::sync_with_stdio(false);
	cin.tie(NULL);cout.tie(NULL);
    int N, K, num, lastIdx, temp, ret=0, startIdx=0;
    int arr [100001] = {};
    cin >> N >> K;
    
    for (int i = 0; i < N; i++){
        cin >> arr[i];
    }

    for (int i = 0; i < K; i++){
        ret += arr[i];
    }
    
    temp = ret;
    for (int i = K; i < N; i++){
        
        temp = temp - arr[startIdx] + arr[i];
        if (temp > ret){
            ret = temp;
        }
        startIdx += 1;
    }

    cout << ret;



    return 0;
}
