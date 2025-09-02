#include <bits/stdc++.h>
using namespace std;


int N, M, cnt;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;

    int arr[N] = {} ;
    for (int i = 0; i < N; i++){
        cin >> arr[i];
    }

    sort(arr, arr + N);

    int right = N-1;
    int left = 0;

    while (right != left){
        if(arr[left] + arr[right] == M){
            cnt ++;
            left ++;
        }
        else if (arr[left] + arr[right] > M){
            right --;
        }else {
            left ++;
        }
    }
    cout << cnt;

    return 0;
}