package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import com.yandex.mobile.ads.impl.sm0;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.mobile.ads.impl.je */
/* loaded from: classes3.dex */
public final class C5281je implements fm0 {

    /* renamed from: a */
    private final AbstractC4861be f51583a;

    /* renamed from: b */
    public final C5799tf f51584b;

    public C5281je(s00 s00Var) {
        this(s00Var, new C5799tf());
    }

    /* renamed from: a */
    public final km0 m25875a(zv0<?> zv0Var) throws qh1 {
        byte[] bArr;
        sm0.C5753a c5753a;
        int m30325k;
        String str;
        qh1 qh1Var;
        String str2;
        p00 mo22665a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        while (true) {
            Collections.emptyList();
            p00 p00Var = null;
            int i2 = 0;
            try {
                mo22665a = this.f51583a.mo22665a(zv0Var, k00.m26004a(zv0Var.m30320d()));
            } catch (IOException e2) {
                e = e2;
                bArr = null;
            }
            try {
                int m27138d = mo22665a.m27138d();
                List<C5049ey> m27137c = mo22665a.m27137c();
                if (m27138d == 304) {
                    return sm0.m28326a(zv0Var, SystemClock.elapsedRealtime() - elapsedRealtime, m27137c);
                }
                InputStream m27135a = mo22665a.m27135a();
                byte[] m28328a = m27135a != null ? sm0.m28328a(m27135a, mo22665a.m27136b(), this.f51584b) : new byte[0];
                sm0.m28327a(SystemClock.elapsedRealtime() - elapsedRealtime, zv0Var, m28328a, m27138d);
                if (m27138d < 200 || m27138d > 299) {
                    throw new IOException();
                }
                return new km0(m27138d, m28328a, false, SystemClock.elapsedRealtime() - elapsedRealtime, m27137c);
            } catch (IOException e3) {
                e = e3;
                bArr = null;
                p00Var = mo22665a;
                if (e instanceof SocketTimeoutException) {
                    c5753a = new sm0.C5753a("socket", new m61(), i2);
                } else {
                    if (e instanceof MalformedURLException) {
                        StringBuilder m26356a = l60.m26356a("Bad URL ");
                        m26356a.append(zv0Var.mo27673m());
                        throw new RuntimeException(m26356a.toString(), e);
                    }
                    if (p00Var == null) {
                        throw new ym0(e);
                    }
                    int m27138d2 = p00Var.m27138d();
                    Object[] objArr = {Integer.valueOf(m27138d2), zv0Var.mo27673m()};
                    boolean z = rh1.f54313a;
                    n60.m26810c("Unexpected response code %d for %s", objArr);
                    if (bArr != null) {
                        km0 km0Var = new km0(m27138d2, bArr, false, SystemClock.elapsedRealtime() - elapsedRealtime, p00Var.m27137c());
                        if (m27138d2 != 401 && m27138d2 != 403) {
                            if (m27138d2 < 400 || m27138d2 > 499) {
                                throw new o01(km0Var);
                            }
                            throw new C4811ai(km0Var);
                        }
                        c5753a = new sm0.C5753a("auth", new C6069yb(km0Var), i2);
                    } else {
                        c5753a = new sm0.C5753a("network", new hm0(), i2);
                    }
                }
                C4982do m30323i = zv0Var.m30323i();
                m30325k = zv0Var.m30325k();
                try {
                    qh1Var = c5753a.f54764b;
                    m30323i.m23922a(qh1Var);
                    str2 = c5753a.f54763a;
                    zv0Var.m30316a(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(m30325k)));
                } catch (qh1 e4) {
                    str = c5753a.f54763a;
                    zv0Var.m30316a(String.format("%s-timeout-giveup [timeout=%s]", str, Integer.valueOf(m30325k)));
                    throw e4;
                }
            }
            str2 = c5753a.f54763a;
            zv0Var.m30316a(String.format("%s-retry [timeout=%s]", str2, Integer.valueOf(m30325k)));
        }
    }

    public C5281je(s00 s00Var, C5799tf c5799tf) {
        this.f51583a = s00Var;
        this.f51584b = c5799tf;
    }
}
