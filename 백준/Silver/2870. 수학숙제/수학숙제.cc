#include <bits/stdc++.h>
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int N;
    cin >> N;

    vector<string> vt;

    while (N--) {
        string s;
        cin >> s;

        string cur;
        for (char c : s) {
            if (isdigit(static_cast<unsigned char>(c))) {
                cur += c;
            } else {
                if (!cur.empty()) {
                    // 앞의 0 제거 (단, 전부 0이면 하나 남김)
                    int i = 0;
                    while (i + 1 < (int)cur.size() && cur[i] == '0') ++i;
                    vt.push_back(cur.substr(i));
                    cur.clear();
                }
            }
        }
        if (!cur.empty()) {
            int i = 0;
            while (i + 1 < (int)cur.size() && cur[i] == '0') ++i;
            vt.push_back(cur.substr(i));
        }
    }


    if (!vt.empty())
    {

        sort(vt.begin(), vt.end(),
             [](const auto &a, const auto &b)
             {
                 if (a.size() != b.size())
                     return a.size() < b.size();
                 return a < b;
             });

        for (const string &n : vt)
        {
            cout << n << '\n';
        }
    }
    return 0;
}