#include <bits/stdc++.h>
using namespace std;

vector<string> split(const string& input, string delimiter) {
    vector<string> result;
    auto start = 0;
    auto end = input.find(delimiter);
    while (end != string::npos) {
        result.push_back(input.substr(start, end - start));
        start = end + delimiter.size();
        end = input.find(delimiter, start);
    }
    result.push_back(input.substr(start));
    return result;
}

string target, temp;
int num;
string first_word, second_word;

int main() {
    cin >> num;
    cin >> target;
    
    vector<string> targets = split(target, "*");
    first_word = targets[0];
    second_word = targets[1];
    
    string result[num];
    
    for (int i = 0; i < num; i++) {
        cin >> temp;
        
        bool flag = true; // flag는 여기서 매번 초기화
        if (temp.length() < first_word.length() + second_word.length()) {
            flag = false; // 길이가 부족하면 무조건 false
        } else {
            for (int j = 0; j < first_word.length(); j++) {
                if (temp[j] != first_word[j]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                for (int k = 0; k < second_word.length(); k++) {
                    if (temp[temp.length() - second_word.length() + k] != second_word[k]) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if (flag) {
            result[i] = "DA";
        } else {
            result[i] = "NE";
        }
    }

    for (int i = 0; i < num; i++) {
        cout << result[i] << endl;
    }

    return 0;
}
