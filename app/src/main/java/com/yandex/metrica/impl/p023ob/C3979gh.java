package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.room.util.C0576a;
import com.yandex.metrica.impl.p023ob.C3901dh;
import java.util.List;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.gh */
/* loaded from: classes2.dex */
public class C3979gh extends C3901dh {

    /* renamed from: m */
    @NonNull
    private String f45219m;

    /* renamed from: n */
    @NonNull
    private String f45220n;

    /* renamed from: com.yandex.metrica.impl.ob.gh$a */
    public static abstract class a<T extends C3979gh, A extends C3901dh.a> extends C3901dh.b<T, A> {

        /* renamed from: c */
        private final C3729Wn f45221c;

        public a(@NonNull Context context, @NonNull String str) {
            this(context, str, new C3729Wn());
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.metrica.impl.ob.dh] */
        @NonNull
        /* renamed from: a */
        public T m19972a(@NonNull C3901dh.c<A> cVar) {
            ?? mo19389a = mo19389a();
            mo19389a.m19737a(C3858c0.m19667a());
            C4380w2 m21177a = C3532P0.m18696i().m18713p().m21177a();
            mo19389a.m19740a(m21177a);
            mo19389a.m19736a(cVar.f44968a);
            String str = cVar.f44969b.f44963a;
            if (str == null) {
                str = m21177a.m21075a() != null ? m21177a.m21075a().f42437b : null;
            }
            mo19389a.m19745c(str);
            String str2 = this.f44967b;
            String str3 = cVar.f44969b.f44964b;
            Context context = this.f44966a;
            if (TextUtils.isEmpty(str3)) {
                str3 = C3658U2.m19198a(context, str2);
            }
            mo19389a.m19743b(str3);
            String str4 = this.f44967b;
            String str5 = cVar.f44969b.f44965c;
            Context context2 = this.f44966a;
            if (TextUtils.isEmpty(str5)) {
                str5 = String.valueOf(C3658U2.m19216b(context2, str4));
            }
            mo19389a.m19741a(str5);
            mo19389a.m19749e(this.f44967b);
            mo19389a.m19738a(C3532P0.m18696i().m18717t().m19805a(this.f44966a));
            mo19389a.m19739a(C3532P0.m18696i().m18700b().m20055a());
            List<String> m20519a = C4197p1.m20517a(this.f44966a).m20519a();
            mo19389a.m19747d(m20519a.isEmpty() ? null : m20519a.get(0));
            T t = (T) mo19389a;
            String packageName = this.f44966a.getPackageName();
            ApplicationInfo m19371a = this.f45221c.m19371a(this.f44966a, this.f44967b, 0);
            if (m19371a != null) {
                t.m19970f((m19371a.flags & 2) != 0 ? "1" : "0");
                t.m19971g((m19371a.flags & 1) == 0 ? "0" : "1");
            } else if (TextUtils.equals(packageName, this.f44967b)) {
                t.m19970f((this.f44966a.getApplicationInfo().flags & 2) != 0 ? "1" : "0");
                t.m19971g((this.f44966a.getApplicationInfo().flags & 1) == 0 ? "0" : "1");
            } else {
                t.m19970f("0");
                t.m19971g("0");
            }
            return t;
        }

        public a(@NonNull Context context, @NonNull String str, @NonNull C3729Wn c3729Wn) {
            super(context, str);
            this.f45221c = c3729Wn;
        }
    }

    @NonNull
    /* renamed from: A */
    public String m19968A() {
        return this.f45219m;
    }

    /* renamed from: B */
    public String m19969B() {
        return this.f45220n;
    }

    /* renamed from: f */
    public void m19970f(@NonNull String str) {
        this.f45219m = str;
    }

    /* renamed from: g */
    public void m19971g(@NonNull String str) {
        this.f45220n = str;
    }

    public String toString() {
        StringBuilder m24u = C0000a.m24u("CoreRequestConfig{mAppDebuggable='");
        C0576a.m4100A(m24u, this.f45219m, '\'', ", mAppSystem='");
        C0576a.m4100A(m24u, this.f45220n, '\'', "} ");
        m24u.append(super.toString());
        return m24u.toString();
    }
}
