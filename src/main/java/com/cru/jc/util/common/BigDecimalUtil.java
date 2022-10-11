package com.cru.jc.util.common;

import java.math.BigDecimal;

/**
 * @author tyj
 * @ClassName DateUtil
 * @Description 加减乘除工具类 精准计算
 * @date 2022/10/9 19:42
 */
public class BigDecimalUtil {
    /**
     *
     * 加法
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double add(Double num1, Double num2) {
        if (num1 == null) {
            num1 = 0d;
        }
        BigDecimal bignum1 = new BigDecimal(Double.toString(num1));
        if (num2 == null) {
            num2 = 0d;
        }
        BigDecimal bignum2 = new BigDecimal(Double.toString(num2));
        return bignum1.add(bignum2).doubleValue();
    }

    /**
     *
     * 减法
     *
     * @param num1
     * @param num2
     * @return
     */
    public static double subtract(Double num1, Double num2) {
        if (num1 == null) {
            num1 = 0d;
        }
        BigDecimal bignum1 = new BigDecimal(Double.toString(num1));
        if (num2 == null) {
            num2 = 0d;
        }
        BigDecimal bignum2 = new BigDecimal(Double.toString(num2));
        return bignum1.subtract(bignum2).doubleValue();
    }

    /**
     *
     * 乘法
     *
     * @param num1
     * @param num2
     * @return double
     **/
    public static double multiply(Double num1, Double num2) {
        if (num1 == null) {
            num1 = 0d;
        }
        BigDecimal bignum1 = new BigDecimal(Double.toString(num1));
        if (num2 == null) {
            num2 = 0d;
        }
        BigDecimal bignum2 = new BigDecimal(Double.toString(num2));
        return bignum1.multiply(bignum2).doubleValue();
    }

    /**
     *
     * 除法(double)
     *
     * @param num1
     * @param num2
     * @return double
     **/
    public static double divide(Double num1, Double num2) {
        if (num1 == null) {
            num1 = 0d;
        }
        BigDecimal bignum1 = new BigDecimal(Double.toString(num1));
        if (num2 == null || num2 == 0d) {
            num2 = 1d;
        }
        BigDecimal bignum2 = new BigDecimal(Double.toString(num2));
        return bignum1.divide(bignum2, 3, BigDecimal.ROUND_HALF_UP).doubleValue();// 四舍五入 保留3位小数
    }

    /**
     *
     * 除法(int,double)
     *
     * @param num1
     * @param num2
     * @return double
     **/
    public static double divide(Double num1, Integer num2) {
        if (num1 == null) {
            num1 = 0d;
        }
        BigDecimal bignum1 = new BigDecimal(Double.toString(num1));
        if (num2 == null || num2 == 0) {
            num2 = 1;
        }
        BigDecimal bignum2 = new BigDecimal(Integer.toString(num2));
        return bignum1.divide(bignum2, 3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     *
     * 除法(自定义)
     *
     * @param num1
     * @param num2
     * @param num3
     * @return double
     **/
    public static double divide(Integer num1, Integer num2, Integer num3) {
        if (num1 == null) {
            num1 = 0;
        }
        BigDecimal bignum1 = new BigDecimal(Double.toString(num1));
        if (num2 == null || num2 == 0) {
            num2 = 1;
        }
        BigDecimal bignum2 = new BigDecimal(Integer.toString(num2));
        // 四舍五入 保留3位小数
        return bignum1.divide(bignum2, num3, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static void main(String[] args) {

    }

}
