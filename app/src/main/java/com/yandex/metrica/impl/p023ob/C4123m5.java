package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.m5 */
/* loaded from: classes2.dex */
public class C4123m5 extends AbstractC4279s5 {

    /* renamed from: b */
    @NonNull
    private final C3365I8 f45936b;

    /* renamed from: c */
    @NonNull
    private final C3454Lm f45937c;

    public C4123m5(@NonNull C3940f4 c3940f4) {
        this(c3940f4, c3940f4.m19891w(), C3454Lm.m18520c());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC4149n5
    /* renamed from: a */
    public boolean mo17815a(@NonNull C4066k0 c4066k0) {
        C3940f4 m20685a = m20685a();
        if (this.f45936b.m18270m() || this.f45936b.m18271n()) {
            return false;
        }
        if (m20685a.m19882m().m20111Q()) {
            this.f45937c.m18522b();
        }
        m20685a().m19879j().m19949a();
        return false;
    }

    @VisibleForTesting
    public C4123m5(@NonNull C3940f4 c3940f4, @NonNull C3365I8 c3365i8, @NonNull C3454Lm c3454Lm) {
        super(c3940f4);
        this.f45936b = c3365i8;
        this.f45937c = c3454Lm;
    }
}
