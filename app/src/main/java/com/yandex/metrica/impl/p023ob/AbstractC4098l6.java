package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4254r6;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.l6 */
/* loaded from: classes2.dex */
public abstract class AbstractC4098l6 implements InterfaceC4176o6<C4228q6> {

    /* renamed from: a */
    private final C3940f4 f45865a;

    /* renamed from: b */
    @NonNull
    private final C4332u6 f45866b;

    /* renamed from: c */
    private final C4436y6 f45867c;

    /* renamed from: d */
    private final C4306t6 f45868d;

    /* renamed from: e */
    @NonNull
    private final InterfaceC3706W0 f45869e;

    /* renamed from: f */
    @NonNull
    private final C3504Nm f45870f;

    public AbstractC4098l6(@NonNull C3940f4 c3940f4, @NonNull C4332u6 c4332u6, @NonNull C4436y6 c4436y6, @NonNull C4306t6 c4306t6, @NonNull InterfaceC3706W0 interfaceC3706W0, @NonNull C3504Nm c3504Nm) {
        this.f45865a = c3940f4;
        this.f45866b = c4332u6;
        this.f45867c = c4436y6;
        this.f45868d = c4306t6;
        this.f45869e = interfaceC3706W0;
        this.f45870f = c3504Nm;
    }

    @NonNull
    /* renamed from: a */
    public C4202p6 m20346a(@NonNull Object obj) {
        C4228q6 c4228q6 = (C4228q6) obj;
        if (this.f45867c.m21196h()) {
            this.f45869e.reportEvent("create session with non-empty storage");
        }
        C3940f4 c3940f4 = this.f45865a;
        C4436y6 c4436y6 = this.f45867c;
        long m20868a = this.f45866b.m20868a();
        C4436y6 m21190d = this.f45867c.m21190d(m20868a);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m21190d.m21192e(timeUnit.toSeconds(c4228q6.f46228a)).m21183a(c4228q6.f46228a).m21188c(0L).m21184a(true).m21187b();
        this.f45865a.m19878i().m20801a(m20868a, this.f45868d.m20777b(), timeUnit.toSeconds(c4228q6.f46229b));
        return new C4202p6(c3940f4, c4436y6, m20347a(), new C3504Nm());
    }

    @Nullable
    /* renamed from: b */
    public final C4202p6 m20348b() {
        if (this.f45867c.m21196h()) {
            return new C4202p6(this.f45865a, this.f45867c, m20347a(), this.f45870f);
        }
        return null;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: a */
    public C4254r6 m20347a() {
        C4254r6.b m20641d = new C4254r6.b(this.f45868d).m20637a(this.f45867c.m21197i()).m20639b(this.f45867c.m21193e()).m20638a(this.f45867c.m21189c()).m20640c(this.f45867c.m21194f()).m20641d(this.f45867c.m21195g());
        m20641d.f46286a = this.f45867c.m21191d();
        return new C4254r6(m20641d);
    }
}
