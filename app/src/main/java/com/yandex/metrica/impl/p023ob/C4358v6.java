package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import okhttp3.internal.connection.RealConnection;

/* renamed from: com.yandex.metrica.impl.ob.v6 */
/* loaded from: classes2.dex */
public class C4358v6 {

    /* renamed from: a */
    @NonNull
    private final C3940f4 f46671a;

    /* renamed from: b */
    @NonNull
    private final C4332u6 f46672b;

    /* renamed from: c */
    @NonNull
    private final a f46673c;

    /* renamed from: d */
    @NonNull
    private final C3407K0 f46674d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC4176o6<C4228q6> f46675e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC4176o6<C4228q6> f46676f;

    /* renamed from: g */
    @Nullable
    private C4202p6 f46677g;

    /* renamed from: h */
    @Nullable
    private b f46678h;

    /* renamed from: com.yandex.metrica.impl.ob.v6$a */
    public interface a {
        /* renamed from: a */
        void mo19894a(@NonNull C4066k0 c4066k0, @NonNull C4384w6 c4384w6);
    }

    /* renamed from: com.yandex.metrica.impl.ob.v6$b */
    public enum b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C4358v6(@NonNull C3940f4 c3940f4, @NonNull C4332u6 c4332u6, @NonNull a aVar) {
        this(c3940f4, c4332u6, aVar, new C4150n6(c3940f4, c4332u6), new C4124m6(c3940f4, c4332u6), new C3407K0(c3940f4.m19876g()));
    }

    /* renamed from: e */
    private void m20918e(@NonNull C4066k0 c4066k0) {
        if (this.f46678h == null) {
            C4202p6 m20348b = ((AbstractC4098l6) this.f46675e).m20348b();
            if (m20916a(m20348b, c4066k0)) {
                this.f46677g = m20348b;
                this.f46678h = b.FOREGROUND;
                return;
            }
            C4202p6 m20348b2 = ((AbstractC4098l6) this.f46676f).m20348b();
            if (m20916a(m20348b2, c4066k0)) {
                this.f46677g = m20348b2;
                this.f46678h = b.BACKGROUND;
            } else {
                this.f46677g = null;
                this.f46678h = b.EMPTY;
            }
        }
    }

    /* renamed from: a */
    public synchronized long m20919a() {
        C4202p6 c4202p6;
        c4202p6 = this.f46677g;
        return c4202p6 == null ? RealConnection.IDLE_CONNECTION_HEALTHY_NS : c4202p6.m20534c() - 1;
    }

    @NonNull
    /* renamed from: b */
    public C4384w6 m20920b(@NonNull C4066k0 c4066k0) {
        return m20915a(m20921c(c4066k0), c4066k0.m20203e());
    }

    @NonNull
    /* renamed from: c */
    public synchronized C4202p6 m20921c(@NonNull C4066k0 c4066k0) {
        m20918e(c4066k0);
        b bVar = this.f46678h;
        b bVar2 = b.EMPTY;
        if (bVar != bVar2 && !m20916a(this.f46677g, c4066k0)) {
            this.f46678h = bVar2;
            this.f46677g = null;
        }
        int ordinal = this.f46678h.ordinal();
        if (ordinal == 1) {
            this.f46677g.m20535c(c4066k0.m20203e());
            return this.f46677g;
        }
        if (ordinal == 2) {
            return this.f46677g;
        }
        this.f46678h = b.BACKGROUND;
        long m20203e = c4066k0.m20203e();
        C4202p6 m20346a = ((AbstractC4098l6) this.f46676f).m20346a(new C4228q6(m20203e, c4066k0.m20204f()));
        if (this.f46671a.m19891w().m18270m()) {
            this.f46673c.mo19894a(C4066k0.m20179a(c4066k0, this.f46674d), m20915a(m20346a, c4066k0.m20203e()));
        } else if (c4066k0.m20212n() == EnumC4067k1.EVENT_TYPE_FIRST_ACTIVATION.m20218b()) {
            this.f46673c.mo19894a(c4066k0, m20915a(m20346a, m20203e));
            this.f46673c.mo19894a(C4066k0.m20179a(c4066k0, this.f46674d), m20915a(m20346a, m20203e));
        }
        this.f46677g = m20346a;
        return m20346a;
    }

    /* renamed from: d */
    public synchronized void m20922d(@NonNull C4066k0 c4066k0) {
        m20918e(c4066k0);
        int ordinal = this.f46678h.ordinal();
        if (ordinal == 0) {
            this.f46677g = m20914a(c4066k0);
        } else if (ordinal == 1) {
            m20917b(this.f46677g, c4066k0);
            this.f46677g = m20914a(c4066k0);
        } else if (ordinal == 2) {
            if (m20916a(this.f46677g, c4066k0)) {
                this.f46677g.m20535c(c4066k0.m20203e());
            } else {
                this.f46677g = m20914a(c4066k0);
            }
        }
    }

    @NonNull
    /* renamed from: f */
    public C4384w6 m20923f(@NonNull C4066k0 c4066k0) {
        C4202p6 c4202p6;
        if (this.f46678h == null) {
            c4202p6 = ((AbstractC4098l6) this.f46675e).m20348b();
            if (c4202p6 == null ? false : c4202p6.m20533b(c4066k0.m20203e())) {
                c4202p6 = ((AbstractC4098l6) this.f46676f).m20348b();
                if (c4202p6 != null ? c4202p6.m20533b(c4066k0.m20203e()) : false) {
                    c4202p6 = null;
                }
            }
        } else {
            c4202p6 = this.f46677g;
        }
        if (c4202p6 != null) {
            return new C4384w6().m21091c(c4202p6.m20534c()).m21086a(c4202p6.m20537e()).m21089b(c4202p6.m20536d()).m21087a(c4202p6.m20538f());
        }
        long m20204f = c4066k0.m20204f();
        long m20868a = this.f46672b.m20868a();
        C4308t8 m19878i = this.f46671a.m19878i();
        EnumC4462z6 enumC4462z6 = EnumC4462z6.BACKGROUND;
        m19878i.m20801a(m20868a, enumC4462z6, m20204f);
        return new C4384w6().m21091c(m20868a).m21087a(enumC4462z6).m21086a(0L).m21089b(0L);
    }

    /* renamed from: g */
    public synchronized void m20924g(@NonNull C4066k0 c4066k0) {
        m20921c(c4066k0).m20531a(false);
        b bVar = this.f46678h;
        b bVar2 = b.EMPTY;
        if (bVar != bVar2) {
            m20917b(this.f46677g, c4066k0);
        }
        this.f46678h = bVar2;
    }

    @NonNull
    /* renamed from: a */
    private C4202p6 m20914a(@NonNull C4066k0 c4066k0) {
        long m20203e = c4066k0.m20203e();
        C4202p6 m20346a = ((AbstractC4098l6) this.f46675e).m20346a(new C4228q6(m20203e, c4066k0.m20204f()));
        this.f46678h = b.FOREGROUND;
        this.f46671a.m19881l().m19273c();
        this.f46673c.mo19894a(C4066k0.m20179a(c4066k0, this.f46674d), m20915a(m20346a, m20203e));
        return m20346a;
    }

    /* renamed from: b */
    private void m20917b(@NonNull C4202p6 c4202p6, @Nullable C4066k0 c4066k0) {
        if (c4202p6.m20539h()) {
            this.f46673c.mo19894a(C4066k0.m20177a(c4066k0), new C4384w6().m21091c(c4202p6.m20534c()).m21087a(c4202p6.m20538f()).m21086a(c4202p6.m20537e()).m21089b(c4202p6.m20532b()));
            c4202p6.m20531a(false);
        }
        c4202p6.m20540i();
    }

    @VisibleForTesting
    public C4358v6(@NonNull C3940f4 c3940f4, @NonNull C4332u6 c4332u6, @NonNull a aVar, @NonNull InterfaceC4176o6<C4228q6> interfaceC4176o6, @NonNull InterfaceC4176o6<C4228q6> interfaceC4176o62, @NonNull C3407K0 c3407k0) {
        this.f46678h = null;
        this.f46671a = c3940f4;
        this.f46673c = aVar;
        this.f46675e = interfaceC4176o6;
        this.f46676f = interfaceC4176o62;
        this.f46672b = c4332u6;
        this.f46674d = c3407k0;
    }

    /* renamed from: a */
    private boolean m20916a(@Nullable C4202p6 c4202p6, @NonNull C4066k0 c4066k0) {
        if (c4202p6 == null) {
            return false;
        }
        if (c4202p6.m20533b(c4066k0.m20203e())) {
            return true;
        }
        m20917b(c4202p6, c4066k0);
        return false;
    }

    @NonNull
    /* renamed from: a */
    private C4384w6 m20915a(@NonNull C4202p6 c4202p6, long j2) {
        return new C4384w6().m21091c(c4202p6.m20534c()).m21086a(c4202p6.m20537e()).m21089b(c4202p6.m20530a(j2)).m21087a(c4202p6.m20538f());
    }
}
