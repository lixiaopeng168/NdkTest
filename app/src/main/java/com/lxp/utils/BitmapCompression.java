package com.lxp.utils;

import android.graphics.Bitmap;


/**
 * 作者：lixiaopeng on 2017/8/28 0028.
 * 邮箱：lixiaopeng186@163.com
 * 描述：
 */

public class BitmapCompression {

    //    public static native void saveBitmap(Bitmap bitmap,String path);
    static {
        System.loadLibrary("BMCopress");
    }

    public static native String saveBitmap(String oldPath, String newPath);

}
