package lesson9;

public class Main {

    private static boolean flag = true;

//    public static void main(String[] args) {
//        MyThread myThread = new MyThread("Full-Thread-1", "Roman");
//        myThread start();
//
//        Runnable runnable = () => {
//            for (int i= 0; i<5; i++) {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//            for (int i= 0; i<5; i++) {
//                System.out.println(Thread.currentThread().getName() + ":" + i);
//            }
//        }
//    }

    Thread thread1 = new Thread() -> {
        for (int i=0; i<2000; i++) {
            System.out.println("value" + i);
        }
        flag = false;
        System.out.println("flag status changed to " + flag);
    }
    Thread thread2 = new Thread(new Runnable() {
        int i=1;
        @Override
        public void run() {
            while (flag) {
                i++;
            }
            System.out.println("another flag");
        }
    })
}
