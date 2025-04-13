package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashSet;

/* renamed from: com.yandex.metrica.impl.ob.M2 */
/* loaded from: classes2.dex */
public class C3459M2 {

    /* renamed from: a */
    private final a f43393a;

    /* renamed from: b */
    @Nullable
    private Boolean f43394b;

    /* renamed from: c */
    private final HashSet<String> f43395c = new HashSet<>();

    /* renamed from: d */
    private final HashSet<String> f43396d = new HashSet<>();

    /* renamed from: com.yandex.metrica.impl.ob.M2$a */
    public interface a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.M2$b */
    public static class b implements a {

        /* renamed from: a */
        private final C3366I9 f43397a;

        public b(@NonNull C3366I9 c3366i9) {
            this.f43397a = c3366i9;
        }

        /* renamed from: a */
        public void m18569a(boolean z) {
            this.f43397a.m18286b(z).m18227c();
        }

        @Nullable
        /* renamed from: a */
        public Boolean m18568a() {
            return this.f43397a.m18293e();
        }
    }

    public C3459M2(@NonNull a aVar) {
        this.f43393a = aVar;
        this.f43394b = ((b) aVar).m18568a();
    }

    /* renamed from: b */
    private boolean m18561b() {
        Boolean bool = this.f43394b;
        return bool == null ? !this.f43395c.isEmpty() || this.f43396d.isEmpty() : bool.booleanValue();
    }

    /* renamed from: a */
    public synchronized void m18562a(@Nullable Boolean bool) {
        if (C3658U2.m19212a(bool) || this.f43394b == null) {
            Boolean valueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f43394b = valueOf;
            ((b) this.f43393a).m18569a(valueOf.booleanValue());
        }
    }

    /* renamed from: c */
    public synchronized boolean m18565c() {
        Boolean bool;
        bool = this.f43394b;
        return bool == null ? this.f43396d.isEmpty() && this.f43395c.isEmpty() : bool.booleanValue();
    }

    /* renamed from: d */
    public synchronized boolean m18566d() {
        return m18561b();
    }

    /* renamed from: e */
    public synchronized boolean m18567e() {
        return m18561b();
    }

    /* renamed from: a */
    public synchronized void m18563a(@NonNull String str, @Nullable Boolean bool) {
        if (C3658U2.m19212a(bool) || (!this.f43396d.contains(str) && !this.f43395c.contains(str))) {
            Boolean bool2 = Boolean.TRUE;
            if (bool == null) {
                bool = bool2;
            }
            if (bool.booleanValue()) {
                this.f43396d.add(str);
                this.f43395c.remove(str);
            } else {
                this.f43395c.add(str);
                this.f43396d.remove(str);
            }
        }
    }

    /* renamed from: a */
    public synchronized boolean m18564a() {
        Boolean bool;
        bool = this.f43394b;
        return bool == null ? this.f43396d.isEmpty() : bool.booleanValue();
    }
}
