#include <iostream>
#include <string>
#include <cctype>
#include <iomanip>
using namespace std;

void x(const string& email){
    int u=0,l=0,d=0,s=0;
    int total=email.length();
    for(char ch:email){
        if(isupper(ch)){
            u++;
        } else if(islower(ch)){
            l++;
        } else if(isdigit(ch)){
            d++;
        } else {
            s++;
        }
    }
    double up=static_cast<double>(u)*100/total;
    double lp=static_cast<double>(l)*100/total;
    double dp=static_cast<double>(d)*100/total;
    double sp=static_cast<double>(s)*100/total;
    cout<<fixed<<setprecision(3);
    cout<<up<<"%"<<endl<<lp<<"%"<<endl<<dp<<"%"<<endl<<sp<<"%";
}
int main(){
    string e;
    cin>>e;
    x(e);
}
                                                                                                                            