#include <iostream>
#include <stack>
#include <sstream>
#include <vector>
using namespace std;

void p(vector<string> q){
    stack<int> s1;
    stack<int> s2;
    for(const string& qy:q){
        istringstream iss(qy);
        string part;
        vector<string> p;
        while(iss>>part){
            p.push_back(part);
        }
        int t=stoi(p[0]);
        if(t==1){
            int v=stoi(p[1]);
            s1.push(v);
        } else if(t==2){
            if(s2.empty()){
                while(!s1.empty()){
                    s2.push(s1.top());
                    s1.pop();
                }
            }
            if(!s2.empty()){
                s2.pop();
            }
        } else if(t==3){
            if(s2.empty()){
                while(!s1.empty()){
                    s2.push(s1.top());
                    s1.pop();
                }
            }
            if(!s2.empty()){
                cout<<s2.top()<<endl;
            }
        }
    }
}
int main(){
    string input;
    getline(cin,input);
    istringstream iss(input);
    vector<string> tokens;
    string token;
    while(getline(iss,token,',')){
        tokens.push_back(token);
    }
    p(tokens);
    return 0;
}
                                                                                                                            