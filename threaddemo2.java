public class threaddemo2 implements Runnable {
    String name;
    threaddemo2(String nam){
        name=nam;
    }
    public threaddemo2() {
        //TODO Auto-generated constructor stub
    }
    public void run(){System.out.println("thread run method started by "+name);}
    public void start(){
        System.out.println("thread execution started");
    }
    
    //public void notify(){}
    public static void main(String args[]){
        threaddemo2 obj=new threaddemo2("gayi");
        Thread t1=new Thread(obj);
        //Thread t2=new Thread("yamu");
        t1.run();
        
        //t2.run();
        t1.start();
        
        //t2.start();
    }
        
    }
    

    


	
