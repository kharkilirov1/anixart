package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.Uh */
/* loaded from: classes2.dex */
public class C3673Uh {

    /* renamed from: a */
    @NonNull
    private final Context f44178a;

    /* renamed from: b */
    @NonNull
    private final C3432L0 f44179b;

    /* renamed from: c */
    @NonNull
    private final InterfaceExecutorC4297sn f44180c;

    /* renamed from: d */
    @NonNull
    private final C3570Qd f44181d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3549Ph f44182e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3529Om f44183f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC3669Ud f44184g;

    /* renamed from: h */
    @NonNull
    private final C4377w f44185h;

    /* renamed from: i */
    private boolean f44186i;

    public C3673Uh(@NonNull Context context) {
        this(context, new C3432L0(), new C3570Qd(), new C3504Nm(), new C3594Rd(context), C3532P0.m18696i().m18716s().m21323h(), C3532P0.m18696i().m18718u(), C3532P0.m18696i().m18697a());
    }

    /* renamed from: c */
    public static void m19253c(C3673Uh c3673Uh) {
        synchronized (c3673Uh) {
            c3673Uh.f44186i = false;
        }
    }

    /* renamed from: a */
    public synchronized void m19254a(@NonNull C3575Qi c3575Qi, @NonNull C3928ei c3928ei) {
        C3275Ei m18832M = c3575Qi.m18832M();
        if (m18832M == null) {
            return;
        }
        File m18469a = this.f44179b.m18469a(this.f44178a, "certificate.p12");
        boolean z = m18469a != null && m18469a.exists();
        if (z) {
            c3928ei.m19822a(m18469a);
        }
        long mo18644b = this.f44183f.mo18644b();
        long mo18276a = this.f44182e.mo18276a();
        if ((!z || mo18644b >= mo18276a) && !this.f44186i) {
            String m18847e = c3575Qi.m18847e();
            if (!TextUtils.isEmpty(m18847e) && this.f44184g.mo18965a()) {
                this.f44186i = true;
                this.f44185h.m21069a(C4377w.f46831c, this.f44180c, new C3623Sh(this, m18847e, m18469a, c3928ei, m18832M));
            }
        }
    }

    @VisibleForTesting
    public C3673Uh(@NonNull Context context, @NonNull C3432L0 c3432l0, @NonNull C3570Qd c3570Qd, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull InterfaceC3669Ud interfaceC3669Ud, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3549Ph interfaceC3549Ph, @NonNull C4377w c4377w) {
        this.f44186i = false;
        this.f44178a = context;
        this.f44179b = c3432l0;
        this.f44181d = c3570Qd;
        this.f44183f = interfaceC3529Om;
        this.f44184g = interfaceC3669Ud;
        this.f44180c = interfaceExecutorC4297sn;
        this.f44182e = interfaceC3549Ph;
        this.f44185h = c4377w;
    }

    /* renamed from: a */
    public static void m19251a(C3673Uh c3673Uh, long j2) {
        c3673Uh.f44182e.mo18279a(c3673Uh.f44183f.mo18644b() + j2);
    }
}
