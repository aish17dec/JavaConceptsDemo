package MultithreadingConcepts;

public class SynchronizationDemo extends Thread{
    private int requiredSeats;
   static BookBusSeats bookBusSeats;

    public void run(){
        System.out.println("bb object "+bookBusSeats.toString());
        bookBusSeats.bookSeats(this.requiredSeats);
    }
    public static void main(String[] args) throws InterruptedException {
        bookBusSeats = new BookBusSeats();
        SynchronizationDemo t1 = new SynchronizationDemo();
        SynchronizationDemo t2 = new SynchronizationDemo();

        t1.requiredSeats = 9;
        t1.start();
        t2.requiredSeats = 8;
        t2.start();
    }
}

class BookBusSeats{
    int totalSeats = 10;

    public void bookSeats(int n){
        synchronized(this){
            if(totalSeats>=n){
                totalSeats = totalSeats-n;
                System.out.println("Seats booked! Seats booked: " + n);
            }else{
                System.out.println("Seats couldn't be booked.");
            }
        }
        System.out.println("Total Seats Left: "+totalSeats);
    }
}
