#include <bits/stdc++.h>
using namespace std;

int N, M, temp, ret;

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;
    int arr[N] = {};

    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }

    for (int i = 0; i < M; i++)
    {
        temp += arr[i];
    }

    ret = temp;
    int idx = 0;
    for (int i = M; i < N; i++){
        temp -= arr[idx];
        temp += arr[i];
        if(temp > ret){
            ret = temp;
        }
        idx++;
    }

    cout << ret;

    return 0;
}