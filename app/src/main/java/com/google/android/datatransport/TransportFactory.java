package com.google.android.datatransport;

/* loaded from: classes.dex */
public interface TransportFactory {
    /* renamed from: a */
    <T> Transport<T> mo5401a(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer);
}
