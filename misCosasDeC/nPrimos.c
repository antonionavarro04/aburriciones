#include <stdio.h>

int main(){
    int n, i, j, primo;
    printf("Introduce un numero: ");
    scanf("%d", &n);
    for(i=2; i<=n; i++){
        primo = 1;
        for(j=2; j<=i/2; j++){
            if(i%j==0){
                primo = 0;
                break;
            }
        }
    }
    return 0;
}