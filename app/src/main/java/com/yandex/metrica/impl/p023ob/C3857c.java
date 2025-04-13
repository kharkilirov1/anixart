package com.yandex.metrica.impl.p023ob;

import java.io.UnsupportedEncodingException;

/* renamed from: com.yandex.metrica.impl.ob.c */
/* loaded from: classes2.dex */
public final class C3857c {

    /* renamed from: a */
    public static final Object f44857a = new Object();

    /* renamed from: a */
    public static byte[] m19666a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new IllegalStateException("Java VM does not support a standard character set.", e2);
        }
    }
}
