#include<stdio.h>
#include<pthread.h>

void *runningThread1(void *arg){
    int i;
   // printf("Thread 1 is running...\n");
    for( i=0;i<5;i++){
        printf("thread 1 --%d\n",i);

    }
    return NULL;
}
void *runningThread2(void *arg){
    //printf("thread 2 is runnning.....\n");
    for(int i=0;i<5;i++){
        printf("thread 2 --%d\n",i);
    }
    return NULL;
}

int main(){
 pthread_t tid1,tid2;
 pthread_create(&tid1,NULL,runningThread1,NULL);
 pthread_create(&tid2,NULL,runningThread2,NULL);
 pthread_join(tid1,NULL);
 pthread_join(tid2,NULL);
 return 0;
}