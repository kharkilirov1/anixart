package com.yandex.mobile.ads.instream;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5318k5;
import com.yandex.mobile.ads.impl.C5377l5;
import com.yandex.mobile.ads.impl.C6029xj;
import com.yandex.mobile.ads.impl.InterfaceC5473n5;
import com.yandex.mobile.ads.impl.d50;
import com.yandex.mobile.ads.impl.i40;
import com.yandex.mobile.ads.impl.l50;
import com.yandex.mobile.ads.impl.t30;
import com.yandex.mobile.ads.impl.tb1;
import com.yandex.mobile.ads.impl.w50;

/* renamed from: com.yandex.mobile.ads.instream.b */
/* loaded from: classes3.dex */
public final class C6150b {

    /* renamed from: a */
    @NonNull
    private final t30 f57427a;

    /* renamed from: b */
    @NonNull
    private final C6153e f57428b;

    /* renamed from: c */
    @NonNull
    private final C6152d f57429c;

    /* renamed from: d */
    @NonNull
    private final C5377l5 f57430d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC5473n5 f57431e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC5473n5 f57432f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC5473n5 f57433g;

    /* renamed from: h */
    @NonNull
    private final tb1 f57434h;

    /* renamed from: i */
    @Nullable
    private C5318k5 f57435i;

    /* renamed from: j */
    @Nullable
    private w50 f57436j;

    /* renamed from: k */
    private boolean f57437k;

    /* renamed from: com.yandex.mobile.ads.instream.b$a */
    public class a implements InterfaceC5473n5 {
        private a() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: a */
        public final void mo26024a() {
            C6150b.this.m30372e();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: b */
        public final void mo26027b() {
            C6150b.m30361c(C6150b.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: c */
        public final void mo26028c() {
            C6150b.m30364f(C6150b.this);
        }

        public /* synthetic */ a(C6150b c6150b, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.instream.b$b */
    public class b implements InterfaceC5473n5 {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: a */
        public final void mo26024a() {
            C6150b.m30365g(C6150b.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: b */
        public final void mo26027b() {
            C6150b.m30361c(C6150b.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: c */
        public final void mo26028c() {
            C6150b.m30365g(C6150b.this);
        }

        public /* synthetic */ b(C6150b c6150b, int i2) {
            this();
        }
    }

    /* renamed from: com.yandex.mobile.ads.instream.b$c */
    public class c implements InterfaceC5473n5 {
        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: a */
        public final void mo26024a() {
            C6150b.this.f57437k = false;
            C6150b.m30363e(C6150b.this);
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: b */
        public final void mo26027b() {
            boolean z = C6150b.this.f57437k;
            C6150b.this.f57437k = false;
            if (z) {
                C6150b.m30361c(C6150b.this);
            } else if (C6150b.this.f57436j != null) {
                ((d50) C6150b.this.f57436j).m23810c();
            }
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC5473n5
        /* renamed from: c */
        public final void mo26028c() {
            C6150b.m30363e(C6150b.this);
        }

        public /* synthetic */ c(C6150b c6150b, int i2) {
            this();
        }
    }

    public C6150b(@NonNull Context context, @NonNull l50 l50Var, @NonNull t30 t30Var, @NonNull i40 i40Var, @NonNull C6153e c6153e) {
        this.f57427a = t30Var;
        this.f57428b = c6153e;
        tb1 tb1Var = new tb1();
        this.f57434h = tb1Var;
        C6152d c6152d = new C6152d(c6153e, this);
        this.f57429c = c6152d;
        this.f57430d = new C5377l5(context, l50Var, t30Var, i40Var, c6153e, c6152d, tb1Var);
        int i2 = 0;
        this.f57431e = new c(this, i2);
        this.f57432f = new a(this, i2);
        this.f57433g = new b(this, i2);
    }

    /* renamed from: c */
    public final void m30370c() {
        C5318k5 c5318k5 = this.f57435i;
        if (c5318k5 != null) {
            c5318k5.m26029d();
        }
        this.f57427a.m28446b();
    }

    /* renamed from: e */
    public final void m30372e() {
        w50 w50Var = this.f57436j;
        if (w50Var != null) {
            ((d50) w50Var).m23812e();
        }
        this.f57428b.m30400h();
        this.f57427a.m28446b();
    }

    /* renamed from: f */
    public final void m30373f() {
        if (this.f57435i != null) {
            this.f57429c.m30388c();
            C5318k5 c5318k5 = this.f57435i;
            if (c5318k5 != null) {
                c5318k5.m26033h();
                return;
            }
            return;
        }
        C5318k5 m26354c = this.f57430d.m26354c();
        this.f57435i = m26354c;
        if (m26354c != null) {
            m26354c.m26025a(this.f57431e);
            this.f57429c.m30388c();
            this.f57437k = true;
            this.f57435i.m26031f();
            return;
        }
        C5318k5 m26352a = this.f57430d.m26352a();
        this.f57435i = m26352a;
        m26352a.m26025a(this.f57432f);
        this.f57435i.m26031f();
    }

    /* renamed from: g */
    public final void m30374g() {
        this.f57428b.m30393a(this.f57429c);
        this.f57429c.m30389d();
    }

    /* renamed from: h */
    public final void m30375h() {
        if (this.f57435i != null) {
            w50 w50Var = this.f57436j;
            if (w50Var != null) {
                ((d50) w50Var).m23810c();
                return;
            }
            return;
        }
        C5318k5 m26354c = this.f57430d.m26354c();
        this.f57435i = m26354c;
        if (m26354c != null) {
            m26354c.m26025a(this.f57431e);
            this.f57437k = false;
            this.f57435i.m26031f();
        } else {
            w50 w50Var2 = this.f57436j;
            if (w50Var2 != null) {
                ((d50) w50Var2).m23810c();
            }
        }
    }

    /* renamed from: i */
    public final void m30376i() {
        C5318k5 c5318k5 = this.f57435i;
        if (c5318k5 != null) {
            c5318k5.m26032g();
        }
    }

    /* renamed from: j */
    public final void m30377j() {
        this.f57429c.m30391f();
        C5318k5 c5318k5 = this.f57435i;
        if (c5318k5 != null) {
            c5318k5.m26030e();
        }
    }

    /* renamed from: a */
    public final void m30367a(@Nullable d50 d50Var) {
        this.f57436j = d50Var;
    }

    /* renamed from: b */
    public final void m30369b() {
        C5318k5 c5318k5 = this.f57435i;
        if (c5318k5 != null) {
            c5318k5.m26032g();
            return;
        }
        w50 w50Var = this.f57436j;
        if (w50Var != null) {
            ((d50) w50Var).m23811d();
        }
        this.f57428b.m30400h();
        this.f57427a.m28446b();
    }

    /* renamed from: d */
    public final void m30371d() {
        m30370c();
        this.f57428b.m30400h();
        this.f57429c.m30387b();
    }

    /* renamed from: g */
    public static void m30365g(C6150b c6150b) {
        w50 w50Var = c6150b.f57436j;
        if (w50Var != null) {
            ((d50) w50Var).m23811d();
        }
        c6150b.f57428b.m30400h();
        c6150b.f57427a.m28446b();
    }

    /* renamed from: a */
    public final void m30368a(@Nullable C6029xj c6029xj) {
        this.f57434h.m28583a(c6029xj);
    }

    /* renamed from: c */
    public static void m30361c(C6150b c6150b) {
        C5318k5 c5318k5 = c6150b.f57435i;
        if (c5318k5 != null) {
            c5318k5.m26033h();
        }
    }

    /* renamed from: a */
    public final void m30366a() {
        this.f57429c.m30385a();
    }

    /* renamed from: e */
    public static void m30363e(C6150b c6150b) {
        C5318k5 m26352a = c6150b.f57430d.m26352a();
        c6150b.f57435i = m26352a;
        m26352a.m26025a(c6150b.f57432f);
        c6150b.f57435i.m26031f();
    }

    /* renamed from: f */
    public static void m30364f(C6150b c6150b) {
        C5318k5 m26353b = c6150b.f57430d.m26353b();
        c6150b.f57435i = m26353b;
        if (m26353b != null) {
            m26353b.m26025a(c6150b.f57433g);
            c6150b.f57435i.m26031f();
            return;
        }
        w50 w50Var = c6150b.f57436j;
        if (w50Var != null) {
            ((d50) w50Var).m23811d();
        }
        c6150b.f57428b.m30400h();
        c6150b.f57427a.m28446b();
    }
}
