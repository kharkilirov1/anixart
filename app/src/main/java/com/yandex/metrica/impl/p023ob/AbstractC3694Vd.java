package com.yandex.metrica.impl.p023ob;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: com.yandex.metrica.impl.ob.Vd */
/* loaded from: classes2.dex */
public abstract class AbstractC3694Vd {

    /* renamed from: a */
    private final String f44228a;

    /* renamed from: com.yandex.metrica.impl.ob.Vd$a */
    public static final class a {

        /* renamed from: a */
        public static final int f44229a = (int) TimeUnit.SECONDS.toMillis(30);
    }

    public AbstractC3694Vd(String str) {
        this.f44228a = str;
    }

    /* renamed from: a */
    public HttpsURLConnection m19275a() throws IOException {
        HttpsURLConnection m19508a = C3532P0.m18696i().m18721x().m19508a(this.f44228a);
        int i2 = a.f44229a;
        m19508a.setConnectTimeout(i2);
        m19508a.setReadTimeout(i2);
        m19508a.setDoInput(true);
        m19508a.setRequestProperty("Accept", "application/json");
        m19508a.setRequestProperty("User-Agent", C3184B2.m17885c("com.yandex.mobile.metrica.sdk"));
        return m19508a;
    }
}
