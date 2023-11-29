#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main() {
    int tar;
    cin>>tar;
    vector<int> a;
    string input;
    cin.ignore();
    getline(cin,input);
    size_t pos=0;
    while((pos=input.find(' '))!=string::npos){
        string token=input.substr(0,pos);
        a.push_back(stoi(token));
        input.erase(0,pos+1);
    }
    a.push_back(stoi(input));
    int count=0;
    for(size_t i=0;i<a.size()-1;++i){
        vector<bool> ch;
        for(int j:a){
            if(j>tar){
                ch.push_back(true);
            } else{
                ch.push_back(false);
            }
        }
        if(find(ch.begin(),ch.end(),false)!=ch.end()){
            sort(a.begin(),a.end());
            int ele=a[0]+2*a[1];
            a.erase(a.begin());
            a.erase(a.begin());
            a.insert(a.begin(),ele);
            count++;
        } else{
            break;
        }
    }
    cout<<count+1;
}
                                                                                                                            