package play.test;
/*
 * Project: VetarianPlay
 * 
 * File Created at 2016��10��8��
 * 
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */

/**
 * @Type Test.java
 * @Desc 
 * @author 15392
 * @date 2016��10��8�� ����4:12:29
 * @version 
 */
public class Test {
    public static void main(String[] args) {
        increse(10, 1000000);
    }

    private static int newCapacity; // ������  
    private static int count; // ���ݴ���  
    private static int temp;

    /** 
     * �������ݴ��� 
     * @param init ���ϳ�ʼ����С 
     * @param elementDataSize Ԫ�ظ��� 
     */
    public static void increse(int init, int elementDataSize) {
        temp = init;
        while (true) {
            if (newCapacity >= elementDataSize) {
                break;
            }
            increse(temp);
        }
    }

    private static void increse(int init) {
        newCapacity = (int) (init * 1.5 + 1); // ����������  
        System.out.println("���ݵ� [" + ++count + "] ��" + "\t" + "������=" + newCapacity);
        temp = newCapacity;
    }
}
