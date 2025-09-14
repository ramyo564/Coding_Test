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
    int M, N, K;
    int cnt = 0;
    

    cin >> M >> N >> K;
    int lx, ly, rx, ry;

    // M = y
    // N = x
    vector<vector<bool>> visited(M, vector<bool>(N, false));
    vector<int> ret;
    for (int i = 0; i < K; i++)
    {
        cin >> lx >> ly >> rx >> ry;

        for (int r = ly; r < ry; r++)
        {
            for (int t = lx; t < rx; t++)
            {
                visited[r][t] = true;
            }
        }
    }
    int d_y[] = {0, 0, -1, 1};
    int d_x[] = {-1, 1, 0, 0};
    // M = y
    // N = x
    for (int y = 0; y < M; y++)
    {
        for (int x = 0; x < N; x++)
        {
            if (!visited[y][x])
            {
                cnt++;
                int extent = 1;
                visited[y][x] = true;

                queue<Point> q;
                q.push({y, x});

                while (!q.empty())
                {
                    Point search = q.front();
                    q.pop();

                    for (int i = 0; i < 4; i++)
                    {
                        int n_y = search.y + d_y[i];
                        int n_x = search.x + d_x[i];

                        if (n_y >= 0 && n_y < M && n_x >= 0 && n_x < N)
                        {
                            if (!visited[n_y][n_x])
                            {
                                visited[n_y][n_x] = true;
                                q.push({n_y, n_x});
                                extent++;
                            }
                        }
                    }
                }
                ret.push_back(extent);
            }
        }
    }
    cout << cnt << '\n';
    sort(ret.begin(), ret.end());
    for(int i = 0; i < ret.size(); i++){
        
        cout << ret[i] << " ";
        
    }
    return 0;
}