package org.example;

/**
 * <p>Title: xCRMS </p>
 * Description: <br>
 * Copyright: CorpRights xQuant.com<br>
 * Company: xQuant.com<br>
 *
 * @author yujj
 * @version 1.1.1.RELEASE
 * @date 2019-04-12
 */
public class Base64 {

    public static String encode(byte[] bs) {

        if (bs == null) {
            return null;
        }
        byte[] b = java.util.Base64.getEncoder().encode(bs);
        try {
            return new String(b);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 将 BASE64 编码的字符串 s 进行解码
    public static byte[] decodeReturnByte(String s) {

        if (s == null) {
            return null;
        }
        return java.util.Base64.getDecoder().decode(s);
    }

    // 将 BASE64 编码的字符串 s 进行解码
    public static String decode(String s) {

        if (s == null) {
            return null;
        }
        byte[] b = java.util.Base64.getDecoder().decode(s);
        try {
            return new String(b);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 将 BASE64 编码的字符串 s 进行解码
    public static String encode(String s) {

        if (s == null) {
            return null;
        }
        byte[] b = java.util.Base64.getEncoder().encode(s.getBytes());
        try {
            return new String(b);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
