package com.yandex.mobile.ads.impl;

import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class on0 {

    /* renamed from: a */
    private final int f53296a;

    /* renamed from: b */
    private final int f53297b;

    /* renamed from: c */
    @Nullable
    private final SSLSocketFactory f53298c;

    public on0(int i2, int i3, @Nullable SSLSocketFactory sSLSocketFactory) {
        this.f53296a = i2;
        this.f53297b = i3;
        this.f53298c = sSLSocketFactory;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof on0)) {
            return false;
        }
        on0 on0Var = (on0) obj;
        return this.f53296a == on0Var.f53296a && this.f53297b == on0Var.f53297b && Intrinsics.m32174c(this.f53298c, on0Var.f53298c);
    }

    public final int hashCode() {
        int i2 = (this.f53297b + (this.f53296a * 31)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f53298c;
        return i2 + (sSLSocketFactory == null ? 0 : sSLSocketFactory.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder m26356a = l60.m26356a("OkHttpConfiguration(connectionTimeoutMs=");
        m26356a.append(this.f53296a);
        m26356a.append(", readTimeoutMs=");
        m26356a.append(this.f53297b);
        m26356a.append(", sslSocketFactory=");
        m26356a.append(this.f53298c);
        m26356a.append(')');
        return m26356a.toString();
    }
}
