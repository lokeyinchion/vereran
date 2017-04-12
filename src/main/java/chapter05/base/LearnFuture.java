/*
 * Project: VetarianPlay
 * 
 * File Created at 2016��9��29��
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */
package chapter05.base;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @Type LearnFuture.java
 * @Desc 
 * @author 15392
 * @date 2016��9��29�� ����2:59:38
 * @version 
 */
class Task implements Callable<Integer> { //Task��������1��100���
    public Integer call() throws Exception {
        System.out.println("���߳��ڽ��м���");
        Thread.sleep(3000);
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}

public class LearnFuture {
    public static void main(String[] args) {
        //        //����һ:ExecutorService���Future����ʵ��
        //        ExecutorService executor = Executors.newCachedThreadPool();
        //        Task task = new Task();
        //        Future<Integer> result = executor.submit(task); //Futue��Ҫ���ExecutorService���е�submit����ʹ��
        //        executor.shutdown();

        //��������ExecutorService�����FutureTask����ʵ��
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();

        //��������Thread�����FutureTask����ʵ��
        //        Task task = new Task();
        //        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        //        Thread thread = new Thread(futureTask); //Thread����������ֱ�ӽ���һ��
        //        thread.start();

        // ��һ�δ���ģ�����߳�ִ��һЩ���񣬲���Ҳ�ǿ��Ե�
        try {
            Thread.sleep(1000);

        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("���߳���ִ������");

        try {
            //����������Ҫ��ȡ֮ǰ���߳��첽ִ�еĽ��
            //            System.out.println("task���н��"+result.get()); //����һ
            System.out.println("task���н��" + futureTask.get());//���������߷�����
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("��������ִ�����");

    }
}
