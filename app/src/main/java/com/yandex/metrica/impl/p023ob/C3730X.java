package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.AbstractC3558Q1;
import com.yandex.mobile.ads.C4632R;

/* renamed from: com.yandex.metrica.impl.ob.X */
/* loaded from: classes2.dex */
public class C3730X extends AbstractC3558Q1 {

    /* renamed from: a */
    private final C3291F9 f44430a;

    /* renamed from: com.yandex.metrica.impl.ob.X$a */
    public class a extends SparseArray<AbstractC3558Q1.a> {
        public a() {
            put(47, new c(C3730X.this.f44430a));
            put(66, new d(C3730X.this, C3730X.this.f44430a));
            put(89, new b(C3730X.this.f44430a));
            put(99, new e(C3730X.this.f44430a));
            put(C4632R.styleable.AppCompatTheme_textAppearanceListItemSmall, new f(C3730X.this.f44430a));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$d */
    public class d implements AbstractC3558Q1.a {

        /* renamed from: a */
        private final C3291F9 f44434a;

        public d(C3730X c3730x, C3291F9 c3291f9) {
            this.f44434a = c3291f9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f44434a.m18230e(new C4444ye("COOKIE_BROWSERS", null).m21201a());
            this.f44434a.m18230e(new C4444ye("BIND_ID_URL", null).m21201a());
            C3681V0.m19262a(context, "b_meta.dat");
            C3681V0.m19262a(context, "browsers.dat");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$e */
    public static class e implements AbstractC3558Q1.a {

        /* renamed from: a */
        private final C3291F9 f44435a;

        public e(@NonNull C3291F9 c3291f9) {
            this.f44435a = c3291f9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f44435a.m18230e(new C4444ye("DEVICE_ID_POSSIBLE", null).m21201a()).m18227c();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$f */
    public static class f implements AbstractC3558Q1.a {

        /* renamed from: a */
        private final C3291F9 f44436a;

        public f(@NonNull C3291F9 c3291f9) {
            this.f44436a = c3291f9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            this.f44436a.m18230e(new C4444ye("STARTUP_REQUEST_TIME", null).m21201a()).m18227c();
        }
    }

    public C3730X(@NonNull Context context) {
        this(new C3291F9(C3567Qa.m18783a(context).m18796d()));
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1
    /* renamed from: a */
    public SparseArray<AbstractC3558Q1.a> mo18122a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1
    /* renamed from: a */
    public int mo18121a(C4340ue c4340ue) {
        return (int) this.f44430a.m18045b(-1L);
    }

    @VisibleForTesting
    public C3730X(C3291F9 c3291f9) {
        this.f44430a = c3291f9;
    }

    @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1
    /* renamed from: a */
    public void mo18123a(C4340ue c4340ue, int i2) {
        this.f44430a.m18055e(i2);
        c4340ue.m20886g().m20659b();
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$b */
    public static class b implements AbstractC3558Q1.a {

        /* renamed from: a */
        private final C3291F9 f44432a;

        public b(C3291F9 c3291f9) {
            this.f44432a = c3291f9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            String m18076k = this.f44432a.m18076k(null);
            String m18080m = this.f44432a.m18080m(null);
            String m18078l = this.f44432a.m18078l(null);
            String m18061f = this.f44432a.m18061f((String) null);
            String m18064g = this.f44432a.m18064g((String) null);
            String m18071i = this.f44432a.m18071i((String) null);
            this.f44432a.m18056e(m19375a(m18076k));
            this.f44432a.m18069i(m19375a(m18080m));
            this.f44432a.m18053d(m19375a(m18078l));
            this.f44432a.m18040a(m19375a(m18061f));
            this.f44432a.m18046b(m19375a(m18064g));
            this.f44432a.m18067h(m19375a(m18071i));
        }

        @NonNull
        /* renamed from: a */
        private C3963g1 m19375a(@Nullable String str) {
            boolean isEmpty = TextUtils.isEmpty(str);
            return new C3963g1(str, isEmpty ? EnumC3911e1.UNKNOWN : EnumC3911e1.OK, isEmpty ? "no identifier saved in previous version" : null);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.X$c */
    public static class c implements AbstractC3558Q1.a {

        /* renamed from: a */
        private C3291F9 f44433a;

        public c(C3291F9 c3291f9) {
            this.f44433a = c3291f9;
        }

        @Override // com.yandex.metrica.impl.p023ob.AbstractC3558Q1.a
        /* renamed from: a */
        public void mo18124a(Context context) {
            C4288se c4288se = new C4288se(context);
            if (C3658U2.m19218b(c4288se.m20699g())) {
                return;
            }
            if (this.f44433a.m18080m(null) == null || this.f44433a.m18076k(null) == null) {
                String m20696e = c4288se.m20696e(null);
                if (m19376a(m20696e, this.f44433a.m18076k(null))) {
                    this.f44433a.m18089r(m20696e);
                }
                String m20698f = c4288se.m20698f(null);
                if (m19376a(m20698f, this.f44433a.m18080m(null))) {
                    this.f44433a.m18091s(m20698f);
                }
                String m20693b = c4288se.m20693b(null);
                if (m19376a(m20693b, this.f44433a.m18061f((String) null))) {
                    this.f44433a.m18081n(m20693b);
                }
                String m20694c = c4288se.m20694c(null);
                if (m19376a(m20694c, this.f44433a.m18064g((String) null))) {
                    this.f44433a.m18083o(m20694c);
                }
                String m20695d = c4288se.m20695d(null);
                if (m19376a(m20695d, this.f44433a.m18071i((String) null))) {
                    this.f44433a.m18086p(m20695d);
                }
                long m20692a = c4288se.m20692a(-1L);
                if (m20692a != -1 && this.f44433a.m18052d(-1L) == -1) {
                    this.f44433a.m18066h(m20692a);
                }
                this.f44433a.m18227c();
                c4288se.m20697f().m20659b();
            }
        }

        /* renamed from: a */
        private boolean m19376a(String str, String str2) {
            return !TextUtils.isEmpty(str) && TextUtils.isEmpty(str2);
        }
    }
}
