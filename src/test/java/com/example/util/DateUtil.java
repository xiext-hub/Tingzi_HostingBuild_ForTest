package com.example.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author : Xiexiaoting
 * @Version : V 1.0
 * @Description :
 * @Modified by :
 * @Date : Created in 2022/6/22 下午4:35
 */


public class DateUtil {


    /**
     * @Author : Xiexiaoting
     * @Description : 时间转换成时间戳,参数和返回值都是字符串
     * @params :
     * @Date : Created in 2022/6/22 下午4:37
     */
    public static String dateToStamp(String s) throws ParseException {
        String res;
        //设置时间模版
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }


    /**
     * @Author : Xiexiaoting
     * @Description : 将时间戳转换为时间,参数和返回值都是字符串
     * @params :
     * @Date : Created in 2022/6/22 下午4:38
     */
    public static String stampToDate(String s) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }


    public static void main(String[] args) throws ParseException {

        //调用时间转换为时间戳的方法
        String date = dateToStamp("2022-09-07 00:00:00");
        System.out.println(date);

        // 调用 时间戳转换为时间的方法
        String dates = stampToDate("1662480000000");
        System.out.println(dates);

    }

}
