public class PriorityQueue {

    CircularQueue<Integer> veryHigh = new CircularQueue<>(6);
    CircularQueue<Integer> high= new CircularQueue<>(6);
    CircularQueue<Integer> medium = new CircularQueue<>(6);
    CircularQueue<Integer> low = new CircularQueue<>(6);
    public void enqueue(int priority, int data){
       

        if(priority == 0 && !veryHigh.isFull()){
            veryHigh.enqueue(data);
        }
        else if(priority == 1 && !high.isFull()){
            high.enqueue(data);
        }
        else if(priority == 2  && !medium.isFull()){
            medium.enqueue(data);
        }
        else if(priority == 3 && !low.isFull()){
            low.enqueue(data);
        }
        else{
            low.enqueue(data);
        }
      
    }
    public Integer dequeue()
    {
        if(!veryHigh.isEmpty()){
            return veryHigh.dequeue();
        }
        else if(!high.isEmpty()){
            return high.dequeue();
        }
        else if(!medium.isEmpty()){
            return medium.dequeue();
        }
        else if(!low.isEmpty()){
            return low.dequeue();
        }
        else{
           return low.dequeue();
        }
    }
}