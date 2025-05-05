#include <stdio.h>
#include <unistd.h>  // For fork()
#include <sys/types.h>  // For pid_t

int main() {
    pid_t c1, c2;
    c2 = 0;  
    c1 = fork();  // First fork
    if (c1 == 0)
        c2 = fork();  // Second fork, executed by first child only
    if (c2 > 0)
        fork();  // Third fork, executed if c2 > 0
    printf("1");
    fflush(stdout);  // Flush output to ensure proper display
    return 0;
}
