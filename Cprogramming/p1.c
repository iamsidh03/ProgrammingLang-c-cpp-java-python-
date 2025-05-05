

#include <stdio.h>

#include <stdlib.h>

int main() {

int *p = malloc(0);
 if (p == NULL) {
    printf("Allocation failed\n");
  }

  else {

printf("Allocation succeeded\n");
  }
return 0;

}