//package lesson9;
//
//public class Main {
//
////    public static void main(String[] args) {
//////        MyThread myThread = new MyThread("Full-thread-1", "Roman");
//////        myThread.start();
////
////        Runnable runnable = () -> {
////            for (int i = 0; i < 5; i++) {
////                System.out.println(Thread.currentThread().getName() + ":" + i);
////            }
////        };
////        Thread thread = new Thread(runnable, "My-Tread-1");
////        thread.start();
////        for (int i = 0; i < 5; i++) {
////            System.out.println(Thread.currentThread().getName() + ":" + i);
////        }
////
////    }
//
////            for (int i= 0; i<5; i++) {
////                System.out.println(Thread.currentThread().getName() + ":" + i);
////            }
////        }
////    }
//
////    Thread thread1 = new Thread() > {
////        for (int i=0; i<2000; i++) {
////            System.out.println("value" + i);
////        }
////        flag = false;
////        System.out.println("flag status changed to " + flag);
////    }
////    Thread thread2 = new Thread(new Runnable() {
////        int i=1;
////        @Override
////        public void run() {
////            while (flag) {
////                i++;
////            }
////            System.out.println("another flag");
////        }
////    })
//
//    BankAccount bankAccount = new BankAccount(50);
//    CreditCard creditCard = new CreditCard((bankAccount);
//    CardOwner husband = new CardOwner(creditCard1);
//    CardOwner wife = new CardOwner(creditCard2);
//
//    Thread husbandTread = new Thread(husband, "Husband")
//    )
//}
