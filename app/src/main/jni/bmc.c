#include <jni.h>


JNIEXPORT jstring JNICALL Java_com_lxp_utils_BitmapCompression_saveBitmap
        (JNIEnv *env, jclass cla, jstring str01, jstring str02)
{
    return (*env)->NewStringUTF(env,"这是返回的c数据");
}