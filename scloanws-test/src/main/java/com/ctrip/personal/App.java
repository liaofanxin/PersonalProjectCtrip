package com.ctrip.personal;

import com.ctrip.personal.core.EnumHelper;
import com.ctrip.personal.entity.enums.EmpTestEnum;
import com.ctrip.personal.entity.enums.EmpTypeEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        try {
//            EnumHelper enumEnumHelper=new EnumHelper();
//            Boolean hasEnum=enumEnumHelper.isContains(EmpTestEnum.class,100,"getCode");
//            System.out.println(Enum.valueOf(EmpTypeEnum.class,"1"));
//            //System.out.println(new Date().getTime());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public static boolean isMobile(String str) {
        Pattern p = null;
        Matcher m = null;
        boolean b = false;
        p = Pattern.compile("^[1][3-8][0-9]{9}$"); // 验证手机号
        m = p.matcher(str);
        b = m.matches();
        return b;
    }



}
