package com.squareup.okhttp;

import java.io.UnsupportedEncodingException;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class Credentials {
    /* renamed from: a */
    public static String m13889a(String str, String str2) {
        try {
            return "Basic " + ByteString.m34573i((str + ":" + str2).getBytes("ISO-8859-1")).mo34574a();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
