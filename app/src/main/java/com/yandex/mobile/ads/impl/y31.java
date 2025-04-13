package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.eq0;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class y31 extends C4847b9 {

    /* renamed from: h */
    public static final /* synthetic */ int f56664h = 0;

    /* renamed from: com.yandex.mobile.ads.impl.y31$a */
    public static final class C6055a {
        private C6055a() {
        }

        public /* synthetic */ C6055a(int i2) {
            this();
        }

        /* renamed from: a */
        public static y31 m29860a() {
            int i2 = y31.f56664h;
            try {
                return new y31(Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl"), Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl"), Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            } catch (Exception e2) {
                int i3 = eq0.f50037c;
                Objects.requireNonNull(eq0.C5041a.m24241b());
                eq0.m24229a(5, "unable to load android socket classes", e2);
                return null;
            }
        }
    }

    static {
        new C6055a(0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y31(@NotNull Class<? super SSLSocket> sslSocketClass, @NotNull Class<? super SSLSocketFactory> sslSocketFactoryClass, @NotNull Class<?> paramClass) {
        super(sslSocketClass);
        Intrinsics.m32179h(sslSocketClass, "sslSocketClass");
        Intrinsics.m32179h(sslSocketFactoryClass, "sslSocketFactoryClass");
        Intrinsics.m32179h(paramClass, "paramClass");
    }
}
