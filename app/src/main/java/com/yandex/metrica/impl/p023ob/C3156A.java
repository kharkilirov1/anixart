package com.yandex.metrica.impl.p023ob;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.A */
/* loaded from: classes2.dex */
public class C3156A {

    /* renamed from: a */
    private C3329Gm f42514a;

    /* renamed from: b */
    private long f42515b;

    /* renamed from: c */
    private boolean f42516c;

    /* renamed from: d */
    @NonNull
    private final C3455Ln f42517d;

    /* renamed from: com.yandex.metrica.impl.ob.A$a */
    public static final class a {

        /* renamed from: a */
        public final String f42518a;

        /* renamed from: b */
        public final long f42519b;

        public a(String str, long j2) {
            this.f42518a = str;
            this.f42519b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f42519b != aVar.f42519b) {
                return false;
            }
            String str = this.f42518a;
            String str2 = aVar.f42518a;
            if (str != null) {
                if (str.equals(str2)) {
                    return true;
                }
            } else if (str2 == null) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f42518a;
            int hashCode = str != null ? str.hashCode() : 0;
            long j2 = this.f42519b;
            return (hashCode * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }
    }

    public C3156A(String str, long j2, @NonNull C3379Im c3379Im) {
        this(str, j2, new C3455Ln(c3379Im, "[App Environment]"));
    }

    /* renamed from: a */
    public synchronized void m17807a(@NonNull Pair<String, String> pair) {
        if (this.f42517d.m18526b(this.f42514a, (String) pair.first, (String) pair.second)) {
            this.f42516c = true;
        }
    }

    /* renamed from: b */
    public synchronized void m17808b() {
        this.f42514a = new C3329Gm();
    }

    public synchronized String toString() {
        return "Map size " + this.f42514a.size() + ". Is changed " + this.f42516c + ". Current revision " + this.f42515b;
    }

    @VisibleForTesting
    public C3156A(String str, long j2, @NonNull C3455Ln c3455Ln) {
        this.f42515b = j2;
        try {
            this.f42514a = new C3329Gm(str);
        } catch (Throwable unused) {
            this.f42514a = new C3329Gm();
        }
        this.f42517d = c3455Ln;
    }

    /* renamed from: a */
    public synchronized a m17806a() {
        if (this.f42516c) {
            this.f42515b++;
            this.f42516c = false;
        }
        return new a(C4452ym.m21272g(this.f42514a), this.f42515b);
    }
}
