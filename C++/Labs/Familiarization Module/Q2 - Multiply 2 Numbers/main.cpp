#include <iostream>
#include <cstdio>
using namespace std;

int mulNumbers(int a, int b){
    return a * b;
}

int main() {
    int a, b, c, d;
    scanf("%d %d", &a, &b);
    int ans = mulNumbers(a, b);
    printf("%d", ans);
    
    return 0;
}
                                                                                                                            