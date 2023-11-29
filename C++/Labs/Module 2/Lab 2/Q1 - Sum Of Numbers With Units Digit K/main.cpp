#include <iostream>
using namespace std;
int a(int num,int k){
    if(num==0){
        return 0;
    }
    int unit=num%10;
    for(int i=1;i<=10;++i){
        if((i*k)%10==unit){
            if(i*k<=num){
                return i;
            } else {
                break;
            }
        }
    }
    return -1;
}
int main(){
    int num,k;
    try{
        cin>>num>>k;
        cout<<a(num,k)<<endl;
    } catch (...){
        cout<<-1<<endl;
    }
    return 0;
}
                                                                                                                            