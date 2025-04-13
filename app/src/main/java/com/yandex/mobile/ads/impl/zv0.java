package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;
import com.yandex.mobile.ads.impl.rh1;
import com.yandex.mobile.ads.impl.tw0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zv0<T> implements Comparable<zv0<T>> {

    /* renamed from: a */
    private final rh1.C5690a f57328a;

    /* renamed from: b */
    private final int f57329b;

    /* renamed from: c */
    private final String f57330c;

    /* renamed from: d */
    private final int f57331d;

    /* renamed from: e */
    private final Object f57332e;

    /* renamed from: f */
    @Nullable
    @GuardedBy
    private tw0.InterfaceC5821a f57333f;

    /* renamed from: g */
    private Integer f57334g;

    /* renamed from: h */
    private kw0 f57335h;

    /* renamed from: i */
    private boolean f57336i;

    /* renamed from: j */
    @GuardedBy
    private boolean f57337j;

    /* renamed from: k */
    @GuardedBy
    private boolean f57338k;

    /* renamed from: l */
    private C4982do f57339l;

    /* renamed from: m */
    @Nullable
    private InterfaceC6025xf.a f57340m;

    /* renamed from: n */
    private Object f57341n;

    /* renamed from: o */
    @GuardedBy
    private InterfaceC6144b f57342o;

    /* renamed from: com.yandex.mobile.ads.impl.zv0$a */
    public class RunnableC6143a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ String f57343b;

        /* renamed from: c */
        public final /* synthetic */ long f57344c;

        public RunnableC6143a(String str, long j2) {
            this.f57343b = str;
            this.f57344c = j2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zv0.this.f57328a.m27925a(this.f57343b, this.f57344c);
            zv0.this.f57328a.m27924a(zv0.this.toString());
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zv0$b */
    public interface InterfaceC6144b {
    }

    public zv0(int i2, String str, @Nullable tw0.InterfaceC5821a interfaceC5821a) {
        this.f57328a = rh1.C5690a.f54314c ? new rh1.C5690a() : null;
        this.f57332e = new Object();
        this.f57336i = true;
        this.f57337j = false;
        this.f57338k = false;
        this.f57340m = null;
        this.f57329b = i2;
        this.f57330c = str;
        this.f57333f = interfaceC5821a;
        m30310a(new C4982do());
        this.f57331d = m30307b(str);
    }

    /* renamed from: c */
    public static String m30308c() {
        return um1.m29049a("application/x-www-form-urlencoded; charset=", "UTF-8");
    }

    /* renamed from: a */
    public abstract tw0<T> mo22616a(km0 km0Var);

    /* renamed from: a */
    public abstract void mo23873a(T t);

    /* renamed from: b */
    public qh1 mo24816b(qh1 qh1Var) {
        return qh1Var;
    }

    /* renamed from: b */
    public final void m30318b(Object obj) {
        this.f57341n = obj;
    }

    /* renamed from: b */
    public byte[] mo27672b() throws C6069yb {
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zv0 zv0Var = (zv0) obj;
        int mo29626h = mo29626h();
        int mo29626h2 = zv0Var.mo29626h();
        return mo29626h == mo29626h2 ? this.f57334g.intValue() - zv0Var.f57334g.intValue() : C5782t5.m28463a(mo29626h2) - C5782t5.m28463a(mo29626h);
    }

    @Nullable
    /* renamed from: d */
    public final InterfaceC6025xf.a m30320d() {
        return this.f57340m;
    }

    /* renamed from: e */
    public final String m30321e() {
        String mo27673m = mo27673m();
        int i2 = this.f57329b;
        if (i2 == 0 || i2 == -1) {
            return mo27673m;
        }
        return Integer.toString(i2) + '-' + mo27673m;
    }

    /* renamed from: f */
    public Map<String, String> mo26305f() throws C6069yb {
        return Collections.emptyMap();
    }

    /* renamed from: g */
    public final int m30322g() {
        return this.f57329b;
    }

    /* renamed from: h */
    public int mo29626h() {
        return 2;
    }

    /* renamed from: i */
    public final C4982do m30323i() {
        return this.f57339l;
    }

    /* renamed from: j */
    public final Object m30324j() {
        return this.f57341n;
    }

    /* renamed from: k */
    public final int m30325k() {
        return this.f57339l.m23923b();
    }

    /* renamed from: l */
    public final int m30326l() {
        return this.f57331d;
    }

    /* renamed from: m */
    public String mo27673m() {
        return this.f57330c;
    }

    /* renamed from: n */
    public final boolean m30327n() {
        boolean z;
        synchronized (this.f57332e) {
            z = this.f57338k;
        }
        return z;
    }

    /* renamed from: o */
    public final boolean m30328o() {
        boolean z;
        synchronized (this.f57332e) {
            z = this.f57337j;
        }
        return z;
    }

    /* renamed from: p */
    public final void m30329p() {
        synchronized (this.f57332e) {
            this.f57338k = true;
        }
    }

    /* renamed from: q */
    public final void m30330q() {
        InterfaceC6144b interfaceC6144b;
        synchronized (this.f57332e) {
            interfaceC6144b = this.f57342o;
        }
        if (interfaceC6144b != null) {
            ((ci1) interfaceC6144b).m23289b(this);
        }
    }

    /* renamed from: r */
    public final void m30331r() {
        this.f57336i = false;
    }

    /* renamed from: s */
    public final boolean m30332s() {
        return this.f57336i;
    }

    public final String toString() {
        StringBuilder m26356a = l60.m26356a("0x");
        m26356a.append(Integer.toHexString(this.f57331d));
        String sb = m26356a.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m30328o() ? "[X] " : "[ ] ");
        sb2.append(mo27673m());
        sb2.append(" ");
        sb2.append(sb);
        sb2.append(" ");
        sb2.append(bw0.m22942a(mo29626h()));
        sb2.append(" ");
        sb2.append(this.f57334g);
        return sb2.toString();
    }

    /* renamed from: b */
    private static int m30307b(String str) {
        Uri parse;
        String host;
        if (TextUtils.isEmpty(str) || (parse = Uri.parse(str)) == null || (host = parse.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    /* renamed from: a */
    public final void m30310a(C4982do c4982do) {
        this.f57339l = c4982do;
    }

    /* renamed from: c */
    public final void m30319c(String str) {
        kw0 kw0Var = this.f57335h;
        if (kw0Var != null) {
            kw0Var.m26294b(this);
        }
        if (rh1.C5690a.f54314c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC6143a(str, id2));
            } else {
                this.f57328a.m27925a(str, id2);
                this.f57328a.m27924a(toString());
            }
        }
    }

    /* renamed from: a */
    public final void m30316a(String str) {
        if (rh1.C5690a.f54314c) {
            this.f57328a.m27925a(str, Thread.currentThread().getId());
        }
    }

    /* renamed from: a */
    public final void m30309a(int i2) {
        kw0 kw0Var = this.f57335h;
        if (kw0Var != null) {
            kw0Var.m26293a(this, i2);
        }
    }

    /* renamed from: b */
    public final void m30317b(int i2) {
        this.f57334g = Integer.valueOf(i2);
    }

    /* renamed from: a */
    public final void m30311a(kw0 kw0Var) {
        this.f57335h = kw0Var;
    }

    /* renamed from: a */
    public final void m30314a(InterfaceC6025xf.a aVar) {
        this.f57340m = aVar;
    }

    @CallSuper
    /* renamed from: a */
    public void mo26796a() {
        synchronized (this.f57332e) {
            this.f57337j = true;
            this.f57333f = null;
        }
    }

    /* renamed from: a */
    public final void m30312a(qh1 qh1Var) {
        tw0.InterfaceC5821a interfaceC5821a;
        synchronized (this.f57332e) {
            interfaceC5821a = this.f57333f;
        }
        if (interfaceC5821a != null) {
            interfaceC5821a.mo22923a(qh1Var);
        }
    }

    /* renamed from: a */
    public final void m30315a(InterfaceC6144b interfaceC6144b) {
        synchronized (this.f57332e) {
            this.f57342o = interfaceC6144b;
        }
    }

    /* renamed from: a */
    public final void m30313a(tw0<?> tw0Var) {
        InterfaceC6144b interfaceC6144b;
        synchronized (this.f57332e) {
            interfaceC6144b = this.f57342o;
        }
        if (interfaceC6144b != null) {
            ((ci1) interfaceC6144b).m23287a(this, tw0Var);
        }
    }
}
