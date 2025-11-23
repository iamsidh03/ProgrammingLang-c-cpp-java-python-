/*
 we will be creating a thread to perform a task. In this task, we will
 display the sequence numbers from 1 to 5. The focus of this recipe is to learn how a 
thread is created and how the main thread is asked to wait until the thread finishes its
 task.
*/
#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>

void *runthread(void *agr){
    int i;
    printf("running Thread \n");
    for(int i=1;i<=5;i++){
        printf("%d  ",i);
    }
    printf("\n");
    return NULL;
}
int main(){
    pthread_t tid;
    printf("In main function\n");
    pthread_create(&tid,NULL,runthread,NULL);
    pthread_join(tid,NULL);
    printf("thread over\n");
    return 0;
}