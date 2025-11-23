#include<stdio.h>
#include<pthread.h>
int counter=0;
pthread_mutex_t lock;
void *increment_counter(void *arg){
    for(int i=0;i<5;i++){
        pthread_mutex_lock(&lock);
        counter++;
        printf("thread %d increment counter to %d\n",*(int *)arg,counter);
        pthread_mutex_unlock(&lock);
    }
    return NULL;
}
int main(){
    pthread_t thread1,thread2;
    int thread_id1=1,thread_id2=2;
    pthread_mutex_init(&lock,NULL);
    pthread_create(&thread1,NULL,increment_counter,&thread_id1);
    pthread_create(&thread2,NULL,increment_counter,&thread_id2);
    pthread_join(thread1,NULL);
    pthread_join(thread2,NULL);
    pthread_mutex_destroy(&lock);
    printf("Final counter value:%d\n",counter);
    return 0;
}