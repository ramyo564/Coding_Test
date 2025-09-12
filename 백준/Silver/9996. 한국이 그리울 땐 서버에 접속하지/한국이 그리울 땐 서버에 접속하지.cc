#include <bits/stdc++.h>
using namespace std;

int main()
{
    int N;
    string target, temp, front, back;

    cin >> N >> target;
    size_t pos = target.find('*');
    front = target.substr(0, pos);
    back = target.substr(pos + 1);

    for (int i = 0; i < N; i++)
    {
        cin >> temp;
        if (temp.size() < front.size() + back.size())
        {
            cout << "NE" << "\n";
            continue;
        }
        if (temp.substr(0, front.size()) != front || temp.substr(temp.size() - back.size()) != back)
        {
            cout << "NE" << "\n";
        }
        else {
            cout << "DA" << "\n";
        }
    }

    return 0;
}
