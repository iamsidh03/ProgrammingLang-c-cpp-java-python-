#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>
#include<unistd.h>
pthread_mutex_t lock;
pthread_t tid1,tid2;
void *runThread(void *arg){
    pthread_mutex_lock(&lock);
    pthread_t id =pthread_self();
    if(pthread_equal(id,tid1)){
        printf("Thread %d is running\n",id);
       } else{
            printf("Thread %d is running\n",id);
        }
        sleep(1);
        if(pthread_equal(id,tid1)){
            printf("Thread %d is running\n",id);
        }
        else{
            printf("Thread %d is running\n",id);
        }
        pthread_mutex_unlock(&lock);
        return NULL;
    }
    int main(void)
 {
    if (pthread_mutex_init(&lock, NULL) != 0)
        printf("\n mutex init has failed\n");
    pthread_create(&tid1, NULL, &runThread, NULL);
    pthread_create(&tid2, NULL, &runThread, NULL);
    pthread_join(tid1, NULL);
    pthread_join(tid2, NULL);
    pthread_mutex_destroy(&lock);
    return 0;
 }
