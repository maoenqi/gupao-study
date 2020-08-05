package com.gupao.pattern.proxy.dbroute.db;

/**
 * Created by Tom on 2019/3/10.
 */
public class DynamicDataSourceEntity {

    public final static String DEFAULE_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntity(){}


    public static String get(){return  local.get();}

    /**
     * 还原当前切面的数据源
     */
    public static void restore(){
         local.set(DEFAULE_SOURCE);
    }

    //DB_2018
    //DB_2019
    public static void set(String source){local.set(source);}

    public static void set(int year){local.set("DB_" + year);}

}
