package play.test;
/*
 * Project: VetarianPlay
 * 
 * File Created at 2016年10月8日
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
 * @date 2016年10月8日 下午4:12:29
 * @version 
 */
public class Test {
    public static void main(String[] args) {
        increse(10, 1000000);
    }

    private static int newCapacity; // 新容量  
    private static int count; // 扩容次数  
    private static int temp;

    /** 
     * 计算扩容次数 
     * @param init 集合初始化大小 
     * @param elementDataSize 元素个数 
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
        newCapacity = (int) (init * 1.5 + 1); // 计算新容量  
        System.out.println("扩容第 [" + ++count + "] 次" + "\t" + "新容量=" + newCapacity);
        temp = newCapacity;
    }
}
