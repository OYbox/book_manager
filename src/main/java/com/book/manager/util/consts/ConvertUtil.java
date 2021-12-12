package com.book.manager.util.consts;

public class ConvertUtil {

    /**
     * 获取身份信息
     * @param type 身份类型
     * @return
     */
    public static String identStr(int type) {
        String result = null;
        if (type == Constants.STUDENT) {
            result = Constants.STU_STR;
        }else if (type == Constants.TEACHER) {
            result = Constants.TEA_STR;
        }else if (type ==  Constants.ADMIN) {
            result = Constants.ADMIN_STR;
        }else if (type == Constants.OTHER) {
            result = Constants.OTHER_STR;
        }

        return result;
    }
}
