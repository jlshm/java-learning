package base.thread;

public class ThreadTest {
    public static void main(String[] args){
        //继承Thread类，覆盖run方法
        Thread thread = new Thread(){
            @Override
            public void run(){
                System.out.println("running thread");
            }
        };

        thread.start();
        //实现Runnable接口
        //Runnable不是线程，是线程要运行的代码的宿主。
        class run implements Runnable{
            @Override
            public void run(){
                System.out.println("running runnable");
            }
        }
        run r = new run();
        Thread t = new Thread(r);
        t.start();


    }
}
