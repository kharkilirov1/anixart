package com.yandex.metrica.impl.p023ob;

import android.util.Log;
import java.util.Locale;

/* renamed from: com.yandex.metrica.impl.ob.zo */
/* loaded from: classes2.dex */
public abstract class AbstractC4480zo {

    /* renamed from: a */
    private volatile boolean f47158a;

    public AbstractC4480zo(boolean z) {
        this.f47158a = false;
        this.f47158a = z;
    }

    /* renamed from: a */
    public abstract String mo17843a();

    /* renamed from: a */
    public void m21329a(String str) {
        m21328a(6, str);
    }

    /* renamed from: b */
    public abstract String mo18340b();

    /* renamed from: b */
    public void m21333b(String str) {
        m21328a(4, str);
    }

    /* renamed from: c */
    public boolean m21337c() {
        return this.f47158a;
    }

    /* renamed from: d */
    public void m21338d() {
        this.f47158a = false;
    }

    /* renamed from: e */
    public void m21339e() {
        this.f47158a = true;
    }

    /* renamed from: f */
    public boolean mo21164f() {
        return this.f47158a;
    }

    /* renamed from: d */
    private String m21327d(String str, Object[] objArr) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(mo17843a());
            if (str == null) {
                str = "";
            }
            sb.append(String.format(Locale.US, str, objArr));
            return sb.toString();
        } catch (Throwable unused) {
            return mo17843a();
        }
    }

    /* renamed from: a */
    public void m21332a(Throwable th, String str, Object... objArr) {
        Log.println(6, mo18340b(), m21327d(str, objArr) + "\n" + Log.getStackTraceString(th));
    }

    /* renamed from: b */
    public void m21334b(String str, Object... objArr) {
        Log.println(5, mo18340b(), m21327d(str, objArr));
    }

    /* renamed from: c */
    public void m21335c(String str) {
        m21328a(5, str);
    }

    /* renamed from: c */
    public void m21336c(String str, Object... objArr) {
        if (mo21164f()) {
            Log.println(5, mo18340b(), m21327d(str, objArr));
        }
    }

    /* renamed from: a */
    public void m21328a(int i2, String str) {
        if (mo21164f()) {
            String mo18340b = mo18340b();
            StringBuilder sb = new StringBuilder();
            sb.append(mo17843a());
            if (str == null) {
                str = "";
            }
            sb.append(str);
            Log.println(i2, mo18340b, sb.toString());
        }
    }

    /* renamed from: a */
    public void m21330a(String str, Object... objArr) {
        if (mo21164f()) {
            Log.println(4, mo18340b(), m21327d(str, objArr));
        }
    }

    /* renamed from: a */
    public void m21331a(Throwable th, String str) {
        if (this.f47158a) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo17843a());
            if (str == null) {
                str = "";
            }
            sb2.append(str);
            sb.append(sb2.toString());
            sb.append("\n");
            sb.append(Log.getStackTraceString(th));
            Log.println(6, "AppMetrica", sb.toString());
        }
    }
}
