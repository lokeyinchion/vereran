package play.test;
/*
 * Project: VetarianPlay
 * 
 * File Created at 2016年5月9日
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
 * @date 2016年5月9日 下午3:35:23
 * @version 
 */
public class Main {
    public enum Test {
        ONE,
        TWO,
        THREE;
    }

    public static void main(String args[]) {
        CHANGE ob = new CHANGE();
        for (int i = 0; i < 100; i++) {
            ob.change();
        }

    }

    public static class CHANGE {
        Test ts = Test.ONE;

        public void change() {

            switch (ts) {
                case ONE:
                    ts = Test.TWO;
                    System.out.println("this is test one");
                    break;
                case TWO:
                    ts = Test.THREE;
                    System.out.println("this is test two");
                    break;
                case THREE:
                    ts = Test.ONE;
                    System.out.println("this is test three");
                    break;
            }
        }
    }
}

/**
 * Revision history
 * -------------------------------------------------------------------------
 * 
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2016年5月9日 15392 creat
 */
