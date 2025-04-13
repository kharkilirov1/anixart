package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.dh */
/* loaded from: classes2.dex */
public class C3901dh {

    /* renamed from: a */
    private String f44951a;

    /* renamed from: b */
    private C3858c0 f44952b;

    /* renamed from: c */
    private C4380w2 f44953c;

    /* renamed from: d */
    @NonNull
    private final String f44954d = m19734z();

    /* renamed from: e */
    @NonNull
    private String f44955e = C3184B2.m17876a();

    /* renamed from: f */
    private String f44956f;

    /* renamed from: g */
    private String f44957g;

    /* renamed from: h */
    private C4000hc f44958h;

    /* renamed from: i */
    @NonNull
    private C3974gc f44959i;

    /* renamed from: j */
    @Nullable
    private String f44960j;

    /* renamed from: k */
    private String f44961k;

    /* renamed from: l */
    private C3575Qi f44962l;

    /* renamed from: com.yandex.metrica.impl.ob.dh$a */
    public static abstract class a<I, O> implements InterfaceC3875ch<I, O> {

        /* renamed from: a */
        @Nullable
        public final String f44963a;

        /* renamed from: b */
        @Nullable
        public final String f44964b;

        /* renamed from: c */
        @Nullable
        public final String f44965c;

        public a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f44963a = str;
            this.f44964b = str2;
            this.f44965c = str3;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$b */
    public static abstract class b<T extends C3901dh, A extends a> implements d<T, c<A>> {

        /* renamed from: a */
        @NonNull
        public final Context f44966a;

        /* renamed from: b */
        @NonNull
        public final String f44967b;

        public b(@NonNull Context context, @NonNull String str) {
            this.f44966a = context;
            this.f44967b = str;
        }

        @NonNull
        /* renamed from: a */
        public abstract T mo19389a();
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$c */
    public static class c<A> {

        /* renamed from: a */
        @NonNull
        public final C3575Qi f44968a;

        /* renamed from: b */
        @NonNull
        public final A f44969b;

        public c(@NonNull C3575Qi c3575Qi, A a2) {
            this.f44968a = c3575Qi;
            this.f44969b = a2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.dh$d */
    public interface d<T extends C3901dh, D> {
        @NonNull
        /* renamed from: a */
        T mo18753a(D d);
    }

    @NonNull
    /* renamed from: z */
    private static String m19734z() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb.append("public");
        }
        if (!TextUtils.isEmpty("binary")) {
            sb.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb.append("_");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m19737a(C3858c0 c3858c0) {
        this.f44952b = c3858c0;
    }

    /* renamed from: b */
    public String m19742b() {
        String str = this.f44957g;
        return str == null ? "" : str;
    }

    @NonNull
    /* renamed from: c */
    public String m19744c() {
        return this.f44955e;
    }

    @NonNull
    /* renamed from: d */
    public synchronized String m19746d() {
        String m20010a;
        C4000hc c4000hc = this.f44958h;
        m20010a = c4000hc == null ? null : c4000hc.m20010a();
        if (m20010a == null) {
            m20010a = "";
        }
        return m20010a;
    }

    /* renamed from: e */
    public void m19749e(String str) {
        this.f44951a = str;
    }

    /* renamed from: f */
    public String m19750f() {
        String str = this.f44956f;
        return str == null ? "" : str;
    }

    @NonNull
    /* renamed from: g */
    public synchronized String m19751g() {
        String m18851i;
        m18851i = this.f44962l.m18851i();
        if (m18851i == null) {
            m18851i = "";
        }
        return m18851i;
    }

    @NonNull
    /* renamed from: h */
    public synchronized String m19752h() {
        String m18852j;
        m18852j = this.f44962l.m18852j();
        if (m18852j == null) {
            m18852j = "";
        }
        return m18852j;
    }

    @NonNull
    /* renamed from: i */
    public String m19753i() {
        return this.f44952b.f44864e;
    }

    @NonNull
    /* renamed from: j */
    public String m19754j() {
        String str = this.f44960j;
        return str == null ? "phone" : str;
    }

    @NonNull
    /* renamed from: k */
    public String m19755k() {
        return this.f44954d;
    }

    @NonNull
    /* renamed from: l */
    public String m19756l() {
        String str = this.f44961k;
        return str == null ? "" : str;
    }

    @NonNull
    /* renamed from: m */
    public String m19757m() {
        String str = this.f44952b.f44860a;
        return str == null ? "" : str;
    }

    @NonNull
    /* renamed from: n */
    public String m19758n() {
        return this.f44952b.f44861b;
    }

    /* renamed from: o */
    public int m19759o() {
        return this.f44952b.f44863d;
    }

    @NonNull
    /* renamed from: p */
    public String m19760p() {
        return this.f44952b.f44862c;
    }

    /* renamed from: q */
    public String m19761q() {
        return this.f44951a;
    }

    @NonNull
    /* renamed from: r */
    public C3225Ci m19762r() {
        return this.f44962l.m18829J();
    }

    /* renamed from: s */
    public float m19763s() {
        return this.f44953c.m21078d();
    }

    /* renamed from: t */
    public int m19764t() {
        return this.f44953c.m21076b();
    }

    /* renamed from: u */
    public int m19765u() {
        return this.f44953c.m21077c();
    }

    /* renamed from: v */
    public int m19766v() {
        return this.f44953c.m21079e();
    }

    /* renamed from: w */
    public C3575Qi m19767w() {
        return this.f44962l;
    }

    @NonNull
    /* renamed from: x */
    public synchronized String m19768x() {
        String m18841V;
        m18841V = this.f44962l.m18841V();
        if (m18841V == null) {
            m18841V = "";
        }
        return m18841V;
    }

    /* renamed from: y */
    public synchronized boolean m19769y() {
        return C3525Oi.m18683a(this.f44962l);
    }

    /* renamed from: a */
    public void m19740a(@NonNull C4380w2 c4380w2) {
        this.f44953c = c4380w2;
    }

    /* renamed from: b */
    public void m19743b(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f44956f = str;
    }

    /* renamed from: c */
    public void m19745c(@Nullable String str) {
        this.f44960j = str;
    }

    /* renamed from: d */
    public final void m19747d(String str) {
        this.f44961k = str;
    }

    @NonNull
    /* renamed from: e */
    public synchronized String m19748e() {
        String str;
        C4000hc c4000hc = this.f44958h;
        str = c4000hc == null ? null : c4000hc.m20011b().f42307b;
        if (str == null) {
            str = "";
        }
        return str;
    }

    /* renamed from: a */
    public void m19736a(C3575Qi c3575Qi) {
        this.f44962l = c3575Qi;
    }

    /* renamed from: a */
    public void m19741a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f44957g = str;
    }

    /* renamed from: a */
    public synchronized void m19739a(@NonNull C4000hc c4000hc) {
        this.f44958h = c4000hc;
    }

    @NonNull
    /* renamed from: a */
    public C3974gc m19735a() {
        return this.f44959i;
    }

    /* renamed from: a */
    public void m19738a(@NonNull C3974gc c3974gc) {
        this.f44959i = c3974gc;
    }
}
