package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.impl.p023ob.AbstractC3694Vd;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.Ob */
/* loaded from: classes2.dex */
public final class C3518Ob {

    /* renamed from: a */
    private final C4344ui f43556a;

    public C3518Ob(@NotNull C4344ui c4344ui) {
        this.f43556a = c4344ui;
    }

    @Nullable
    /* renamed from: a */
    public final HttpsURLConnection m18667a() {
        HttpsURLConnection httpsURLConnection;
        String m20894c = this.f43556a.m20894c();
        try {
            C3532P0 m18696i = C3532P0.m18696i();
            Intrinsics.m32178g(m18696i, "GlobalServiceLocator.getInstance()");
            httpsURLConnection = m18696i.m18721x().m19508a(m20894c);
        } catch (Throwable unused) {
            httpsURLConnection = null;
        }
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setInstanceFollowRedirects(true);
        int i2 = AbstractC3694Vd.a.f44229a;
        httpsURLConnection.setConnectTimeout(i2);
        httpsURLConnection.setReadTimeout(i2);
        httpsURLConnection.setUseCaches(false);
        return httpsURLConnection;
    }
}
