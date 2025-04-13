package com.squareup.okhttp.internal;

import com.squareup.okhttp.ConnectionPool;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.internal.p013io.RealConnection;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public abstract class Internal {

    /* renamed from: a */
    public static final Logger f24954a = Logger.getLogger(OkHttpClient.class.getName());

    /* renamed from: b */
    public static Internal f24955b;

    /* renamed from: a */
    public abstract void mo13922a(Headers.Builder builder, String str);

    /* renamed from: b */
    public abstract boolean mo13923b(ConnectionPool connectionPool, RealConnection realConnection);
}
