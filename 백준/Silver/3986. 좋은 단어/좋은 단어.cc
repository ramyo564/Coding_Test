#include <iostream>
#include <string>
#include <stack>

using namespace std;

int main() {
    // 입출력 속도 향상 (백준에서는 필수)
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int N;
    cin >> N;

    int good_word_count = 0;
    for (int i = 0; i < N; i++) {
        string word;
        cin >> word;

        // 단어 길이가 홀수이면 절대 좋은 단어가 될 수 없음
        if (word.length() % 2 != 0) {
            continue;
        }

        stack<char> s;
        for (char c : word) {
            // 스택이 비어있지 않고, top의 문자가 현재 문자와 같다면 pop (짝을 찾음)
            if (!s.empty() && s.top() == c) {
                s.pop();
            }
            // 그렇지 않다면 push
            else {
                s.push(c);
            }
        }

        // 모든 문자를 처리한 후 스택이 비어있으면 좋은 단어
        if (s.empty()) {
            good_word_count++;
        }
    }

    cout << good_word_count;
    return 0;
}