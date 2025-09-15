#include <bits/stdc++.h>
using namespace std;

struct Point
{
    int y, x;
};

int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int N;
    int temp;
    cin >> N;

    int height = 0;
    int answer = 0;

    vector<vector<int>> arr(N, vector<int>(N, 0));
    queue<Point> q;
    queue<Point> q_2;

    for (int i = 0; i < N; i++)
    {
        for (int r = 0; r < N; r++)
        {
            cin >> temp;
            arr[i][r] = temp;
            if (temp > height)
            {
                height = temp;
            }
        }
    }
    int d_y[] = {0, 0, -1, 1};
    int d_x[] = {-1, 1, 0, 0};
    // N = y
    // M = x
    while (height > -1)
    {
        vector<vector<bool>> visited(N, vector<bool>(N, false));
        for (int i = 0; i < N; i++)
        {
            for (int r = 0; r < N; r++)
            {

                if (arr[i][r] > height - 1)
                {
                    q.push({i, r});
                }
            }
        }
        int cnt = 0;
        while (!q.empty())
        {
            Point point = q.front();
            q.pop();

            if (!visited[point.y][point.x])
            {
                visited[point.y][point.x] = true;
                q_2.push({point.y, point.x});
                cnt++;
                while (!q_2.empty())
                {
                    Point search = q_2.front();
                    q_2.pop();
                    for (int i = 0; i < 4; i++)
                    {
                        int n_y = search.y + d_y[i];
                        int n_x = search.x + d_x[i];

                        if (n_y >= 0 && n_y < N && n_x >= 0 && n_x < N)
                        {
                            if (!visited[n_y][n_x] && arr[n_y][n_x] > height - 1)
                            {
                                visited[n_y][n_x] = true;
                                q_2.push({n_y, n_x});
                            }
                        }
                    }
                }
            }
        }
        if (cnt > answer)
        {
            answer = cnt;
        }
        height--;
    }

    cout << answer;

    return 0;
}