package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4377w;
import com.yandex.metrica.impl.p023ob.InterfaceC3467Ma;

/* renamed from: com.yandex.metrica.impl.ob.Dh */
/* loaded from: classes2.dex */
public class C3249Dh {

    /* renamed from: a */
    @NonNull
    private final C4473zh f42725a;

    /* renamed from: b */
    @NonNull
    private final C3566Q9 f42726b;

    /* renamed from: c */
    @NonNull
    private final C3583R2 f42727c;

    /* renamed from: d */
    @NonNull
    private final InterfaceExecutorC4297sn f42728d;

    /* renamed from: e */
    @NonNull
    private final C4377w.c f42729e;

    /* renamed from: f */
    @NonNull
    private final C4377w f42730f;

    /* renamed from: g */
    @NonNull
    private final C4447yh f42731g;

    /* renamed from: h */
    private boolean f42732h;

    /* renamed from: i */
    @Nullable
    private C3250Di f42733i;

    /* renamed from: j */
    private boolean f42734j;

    /* renamed from: k */
    private long f42735k;

    /* renamed from: l */
    private long f42736l;

    /* renamed from: m */
    private long f42737m;

    /* renamed from: n */
    private boolean f42738n;

    /* renamed from: o */
    private boolean f42739o;

    /* renamed from: p */
    private boolean f42740p;

    /* renamed from: q */
    private final Object f42741q;

    public C3249Dh(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(new C4473zh(context, null, interfaceExecutorC4297sn), InterfaceC3467Ma.b.m18577a(C3274Eh.class).mo18575a(context), new C3583R2(), interfaceExecutorC4297sn, C3532P0.m18696i().m18697a());
    }

    /* renamed from: a */
    public void m17976a() {
        if (this.f42732h) {
            return;
        }
        this.f42732h = true;
        if (!this.f42740p) {
            this.f42730f.m21069a(this.f42733i.f42744c, this.f42728d, this.f42729e);
        } else {
            this.f42725a.m21303a(this.f42731g);
        }
    }

    /* renamed from: b */
    public void m17978b() {
        C3274Eh c3274Eh = (C3274Eh) this.f42726b.m18782b();
        this.f42737m = c3274Eh.f42812c;
        this.f42738n = c3274Eh.f42813d;
        this.f42739o = c3274Eh.f42814e;
    }

    @VisibleForTesting
    public C3249Dh(@NonNull C4473zh c4473zh, @NonNull C3566Q9 c3566q9, @NonNull C3583R2 c3583r2, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C4377w c4377w) {
        this.f42740p = false;
        this.f42741q = new Object();
        this.f42725a = c4473zh;
        this.f42726b = c3566q9;
        this.f42731g = new C4447yh(c3566q9, new C3199Bh(this));
        this.f42727c = c3583r2;
        this.f42728d = interfaceExecutorC4297sn;
        this.f42729e = new C3224Ch(this);
        this.f42730f = c4377w;
    }

    /* renamed from: b */
    public void m17979b(@Nullable C3575Qi c3575Qi) {
        C3250Di c3250Di;
        C3250Di c3250Di2;
        boolean z = true;
        if (c3575Qi == null || ((this.f42734j || !c3575Qi.m18848f().f46405e) && (c3250Di2 = this.f42733i) != null && c3250Di2.equals(c3575Qi.m18830K()) && this.f42735k == c3575Qi.m18821B() && this.f42736l == c3575Qi.m18858p() && !this.f42725a.m21304b(c3575Qi))) {
            z = false;
        }
        synchronized (this.f42741q) {
            if (c3575Qi != null) {
                this.f42734j = c3575Qi.m18848f().f46405e;
                this.f42733i = c3575Qi.m18830K();
                this.f42735k = c3575Qi.m18821B();
                this.f42736l = c3575Qi.m18858p();
            }
            this.f42725a.m21302a(c3575Qi);
        }
        if (z) {
            synchronized (this.f42741q) {
                if (this.f42734j && (c3250Di = this.f42733i) != null) {
                    if (this.f42738n) {
                        if (this.f42739o) {
                            if (this.f42727c.m18937a(this.f42737m, c3250Di.f42745d, "should retry sdk collecting")) {
                                m17976a();
                            }
                        } else if (this.f42727c.m18937a(this.f42737m, c3250Di.f42742a, "should collect sdk as usual")) {
                            m17976a();
                        }
                    } else if (this.f42735k - this.f42736l >= c3250Di.f42743b) {
                        m17976a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m17977a(@Nullable C3575Qi c3575Qi) {
        C3274Eh c3274Eh = (C3274Eh) this.f42726b.m18782b();
        this.f42737m = c3274Eh.f42812c;
        this.f42738n = c3274Eh.f42813d;
        this.f42739o = c3274Eh.f42814e;
        m17979b(c3575Qi);
    }
}
