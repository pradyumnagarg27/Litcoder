#include <iostream>
#include <vector>
#include <sstream>
using namespace std;

int main() {
    string input;
    getline(cin,input);
    istringstream iss(input);
    string item;
    vector<string> a,b;
    while(getline(iss,item,',')){
        char operation=item[0];
        if(operation=='1'){
            b=a;
            string characters=item.substr(2);
            for(char c:characters){
                string charStr(1,c);
                a.push_back(charStr);
            }
        } else if(operation=='2'){
            b=a;
            int k=stoi(item.substr(2));
            int newSize=a.size()-k;
            if(newSize>=0){
                for(int i=0;i<k;i++){
                    a.pop_back();
                }
            }
        } else if(operation=='3'){
            b=a;
            int k=stoi(item.substr(2));
            if(k<=a.size()){
                cout<<a[k-1]<<endl;
            }
        } else if(operation=='4'){
            a=b;
        }
    }
    return 0;
}
                                                                                                                            