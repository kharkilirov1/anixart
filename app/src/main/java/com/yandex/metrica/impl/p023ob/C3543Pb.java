package com.yandex.metrica.impl.p023ob;

import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3256E;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.Pb */
/* loaded from: classes2.dex */
public final class C3543Pb {

    /* renamed from: a */
    private C4344ui f43624a;

    /* renamed from: b */
    private C3468Mb f43625b;

    /* renamed from: c */
    private final C3256E f43626c;

    /* renamed from: d */
    private final C3493Nb f43627d;

    /* renamed from: com.yandex.metrica.impl.ob.Pb$a */
    public static final class a implements C3256E.b {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p023ob.C3256E.b
        /* renamed from: a */
        public final void mo17994a(@NotNull C3256E.a aVar) {
            C3543Pb.this.m18733b();
        }
    }

    @VisibleForTesting
    public C3543Pb(@NotNull C3256E c3256e, @NotNull C3493Nb c3493Nb) {
        this.f43626c = c3256e;
        this.f43627d = c3493Nb;
    }

    /* renamed from: b */
    public synchronized void m18735b(@NotNull C3575Qi c3575Qi) {
        C4344ui c4344ui;
        if (!Intrinsics.m32174c(c3575Qi.m18856n(), this.f43624a)) {
            this.f43624a = c3575Qi.m18856n();
            C3468Mb c3468Mb = this.f43625b;
            if (c3468Mb != null) {
                c3468Mb.m18585a();
            }
            this.f43625b = null;
            if (m18732a() && this.f43625b == null && (c4344ui = this.f43624a) != null) {
                this.f43625b = this.f43627d.m18612a(c4344ui);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m18734a(@NotNull C3575Qi c3575Qi) {
        this.f43624a = c3575Qi.m18856n();
        this.f43626c.m17987a(new a());
        m18733b();
    }

    /* renamed from: a */
    private final boolean m18732a() {
        boolean m20895d;
        C4344ui c4344ui = this.f43624a;
        if (c4344ui == null) {
            return false;
        }
        C3256E.a m17992c = this.f43626c.m17992c();
        Intrinsics.m32178g(m17992c, "applicationStateProvider.currentState");
        if (!(c4344ui.m20894c().length() > 0)) {
            return false;
        }
        int ordinal = m17992c.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            m20895d = c4344ui.m20895d();
        } else {
            if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            m20895d = true;
        }
        return m20895d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void m18733b() {
        C4344ui c4344ui;
        boolean z = this.f43625b != null;
        if (m18732a() == z) {
            return;
        }
        if (z) {
            C3468Mb c3468Mb = this.f43625b;
            if (c3468Mb != null) {
                c3468Mb.m18585a();
            }
            this.f43625b = null;
            return;
        }
        if (this.f43625b == null && (c4344ui = this.f43624a) != null) {
            this.f43625b = this.f43627d.m18612a(c4344ui);
        }
    }
}
