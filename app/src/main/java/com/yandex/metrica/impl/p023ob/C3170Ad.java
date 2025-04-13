package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4377w;

/* renamed from: com.yandex.metrica.impl.ob.Ad */
/* loaded from: classes2.dex */
class C3170Ad implements InterfaceC4157nd {

    /* renamed from: a */
    @NonNull
    private final Context f42538a;

    /* renamed from: b */
    @NonNull
    private C3575Qi f42539b;

    /* renamed from: c */
    @Nullable
    private volatile C3668Uc f42540c;

    /* renamed from: d */
    @NonNull
    private final C3190B8 f42541d;

    /* renamed from: e */
    @NonNull
    private final C3165A8 f42542e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3529Om f42543f;

    /* renamed from: g */
    @NonNull
    private final C3520Od f42544g;

    /* renamed from: h */
    @NonNull
    private final C4377w f42545h;

    /* renamed from: i */
    @NonNull
    private final C4377w.c f42546i;

    /* renamed from: j */
    @NonNull
    private final InterfaceExecutorC4297sn f42547j;

    /* renamed from: k */
    private boolean f42548k;

    /* renamed from: com.yandex.metrica.impl.ob.Ad$a */
    public class a implements C4377w.c {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C4377w.c
        @AnyThread
        /* renamed from: a */
        public void mo17830a() {
            C3170Ad.this.f42548k = true;
            C3170Ad.this.m17826b();
        }
    }

    public C3170Ad(@NonNull Context context, @NonNull C3575Qi c3575Qi, @Nullable C3668Uc c3668Uc, @NonNull C3190B8 c3190b8, @NonNull C3165A8 c3165a8, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, c3575Qi, c3668Uc, c3190b8, c3165a8, interfaceExecutorC4297sn, new C3504Nm(), new C3520Od(), C3532P0.m18696i().m18697a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @AnyThread
    /* renamed from: b */
    public void m17826b() {
        C3582R1 m18709l = C3532P0.m18696i().m18709l();
        C3668Uc c3668Uc = this.f42540c;
        if (c3668Uc == null || m18709l == null) {
            return;
        }
        m18709l.m18935b(this.f42544g.m18668a(this.f42538a, this.f42539b, c3668Uc, this));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4157nd
    @AnyThread
    /* renamed from: a */
    public void mo17827a() {
        if (m17825a(this.f42541d) || m17825a(this.f42542e)) {
            if (!this.f42548k) {
                this.f42545h.m21069a(C4377w.f46831c, this.f42547j, this.f42546i);
            } else {
                m17826b();
            }
        }
    }

    @VisibleForTesting
    public C3170Ad(@NonNull Context context, @NonNull C3575Qi c3575Qi, @Nullable C3668Uc c3668Uc, @NonNull C3190B8 c3190b8, @NonNull C3165A8 c3165a8, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3520Od c3520Od, @NonNull C4377w c4377w) {
        this.f42548k = false;
        this.f42538a = context;
        this.f42540c = c3668Uc;
        this.f42539b = c3575Qi;
        this.f42541d = c3190b8;
        this.f42542e = c3165a8;
        this.f42547j = interfaceExecutorC4297sn;
        this.f42543f = interfaceC3529Om;
        this.f42544g = c3520Od;
        this.f42545h = c4377w;
        this.f42546i = new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.AnyThread
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m17825a(com.yandex.metrica.impl.p023ob.AbstractC4256r8 r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.Uc r0 = r9.f42540c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L3f
            com.yandex.metrica.impl.ob.Uc r0 = r9.f42540c
            if (r0 == 0) goto L1c
            int r0 = r0.f44134c
            long r3 = (long) r0
            long r5 = r10.m20650c()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L17
            r0 = 1
            goto L18
        L17:
            r0 = 0
        L18:
            if (r0 == 0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L40
            com.yandex.metrica.impl.ob.Uc r0 = r9.f42540c
            if (r0 == 0) goto L3b
            long r3 = r0.f44136e
            com.yandex.metrica.impl.ob.Om r0 = r9.f42543f
            long r5 = r0.mo18643a()
            long r7 = r10.m20648b()
            long r5 = r5 - r7
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 <= 0) goto L36
            r10 = 1
            goto L37
        L36:
            r10 = 0
        L37:
            if (r10 == 0) goto L3b
            r10 = 1
            goto L3c
        L3b:
            r10 = 0
        L3c:
            if (r10 == 0) goto L3f
            goto L40
        L3f:
            r1 = 0
        L40:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3170Ad.m17825a(com.yandex.metrica.impl.ob.r8):boolean");
    }

    /* renamed from: a */
    public void m17828a(@NonNull C3575Qi c3575Qi) {
        this.f42539b = c3575Qi;
    }

    /* renamed from: a */
    public void m17829a(@Nullable C3668Uc c3668Uc) {
        this.f42540c = c3668Uc;
    }
}
