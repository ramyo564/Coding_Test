#include <bits/stdc++.h>
using namespace std;

int N, M;
struct Point
{
    int y, x, z;
};
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    cin >> N >> M;
    int arr[N][M] = {};
    bool visited[N][M] = {};

    for (int i = 0; i < N; i++)
    {
        string temp;
        cin >> temp;
        for (int j = 0; j < M; j++)
        {
            arr[i][j] = temp[j] - '0';
        }
    }

    queue<Point> q;
    q.push({0, 0, 0});
    visited[0][0] = true;
    while (!q.empty())
    {
        Point temp = q.front();
        q.pop();
        
        if (temp.y == N - 1 && temp.x == M - 1)
        {
            cout << temp.z + 1;
            break;
        }

        // 아래
        if (temp.y + 1 >= 0 && temp.y + 1 < N && temp.x < M && temp.x >= 0)
        {
            if (!visited[temp.y + 1][temp.x] && arr[temp.y + 1][temp.x] == 1)
            {
                q.push({temp.y + 1, temp.x, temp.z + 1});
                visited[temp.y + 1][temp.x] = true;
            }
        }

        // 위
        if (temp.y - 1 >= 0 && temp.y - 1 < N && temp.x < M && temp.x >= 0)
        {
            if (!visited[temp.y - 1][temp.x] && arr[temp.y - 1][temp.x] == 1)
            {
                q.push({temp.y - 1, temp.x, temp.z + 1});
                visited[temp.y - 1][temp.x] = true;
            }
        }

        // 왼쪽
        if (temp.y >= 0 && temp.y < N && temp.x - 1 < M && temp.x - 1 >= 0)
        {
            if (!visited[temp.y][temp.x - 1] && arr[temp.y][temp.x - 1] == 1)
            {
                q.push({temp.y, temp.x - 1, temp.z + 1});
                visited[temp.y][temp.x-1] = true;
            }
        }

        // 오른쪽
        if (temp.y >= 0 && temp.y < N && temp.x + 1 < M && temp.x + 1 >= 0)
        {
            if (!visited[temp.y][temp.x + 1] && arr[temp.y][temp.x + 1] == 1)
            {
                q.push({temp.y, temp.x + 1, temp.z + 1});
                visited[temp.y][temp.x+1] = true;
            }
        }
    }

    return 0;
}