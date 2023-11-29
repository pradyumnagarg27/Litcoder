#include <iostream>
#include <string>
using namespace std;

int main(){
    string text,pattern;
    cin>>text>>pattern;
    int res=0,c1=0,c2=0;
    for(char c:text){
        if(c==pattern[1]){
            res+=c1;
            c2++;
        }
        if(c==pattern[0]){
            c1++;
        }
    }
    cout<<res+max(c1,c2);
    return 0;
}
                                                                                                                            