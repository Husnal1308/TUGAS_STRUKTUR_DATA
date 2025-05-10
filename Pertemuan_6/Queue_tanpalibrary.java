package Pertemuan_6;
        
public class Queue_tanpalibrary {
    int queue[] = new int[3];
    
    public void push(int value){
        if (queue[0]==0){
            queue[0]=value;
            System.out.println("PUSH" + queue[0]);
        }else if (queue[1]==0){
            queue[1]=value;
            System.out.println("PUSH" + queue[1]);
        }else if (queue[2]==0){
            queue[2]=value;
            System.out.println("PUSH" + queue[2]);
        }else{
            isFull();
        }
    }
    public void isFull(){
        System.out.println("QUEUE IS FULL");
    }
    public void pop(){
        System.out.println("-------POP-------");
        if (queue[0]!=0){
            System.out.println("\t" + queue[0]);
            queue[0]=0;
        }else if (queue[1]!=0){
            System.out.println("\t" + queue[1]);
            queue[1]=0;
        }else if (queue[2]==0){
            System.out.println("\t" + queue[2]);
            queue[2]=0;
        }else{
            isEmpty();
        }
        System.out.println("-----------------");
    }
    public void isEmpty(){
        System.out.println("QUEUE EMPTY");
    }
    public void clear(){
        queue[0]=0;
        queue[1]=0;
        queue[2]=0;
        System.out.println("QUEUE IS CLEAR");
    }
    public void cetak(){
        System.out.println("------PRINT------");
        for(int i = 0; i < queue.length; i++){
            if (queue[i]!=0){
                System.out.println("\t" + queue[i]);
            }
        }
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        
        Queue_tanpalibrary s = new Queue_tanpalibrary();
        s.push(5);
        s.push(7);
        s.push(4);
        s.push(9);
        s.cetak();
        s.pop();
        s.cetak();
        s.clear();
        
    }
}