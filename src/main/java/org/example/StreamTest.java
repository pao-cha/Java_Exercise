package org.example;

/**
 * <p>Title: xCRMS </p>
 * Description: 通用可逆加解密工具 <br>
 * Copyright: CorpRights xQuant.com<br>
 * Company: xQuant.com<br>
 *
 * @author yujj
 * @version 1.1.1.RELEASE
 * @date 2019-04-12
 */
public final class Base64EncodeUtil {

    public static final String ENCRYPT_FACTOR = "xQuant_xCRMS";

    public static void main(String[] args) {


        final String text = "674643";

        System.out.println(String.format("Plain Text:%s，Cipher Text:%s", text, encode(text)));
    }

    /**
     * 加密（使用默认盐）
     *
     * @param text
     * @return
     */
    public static String encode(String text) {

        return encode(text, ENCRYPT_FACTOR);
    }

    /**
     * 加密（使用指定盐）
     *
     * @param text
     * @param key
     * @return
     */
    public static String encode(String text, String key) {

        byte[] bs = RC4.encodeRC4_byte(text, key);
        return Base64.encode(bs);
    }
}
