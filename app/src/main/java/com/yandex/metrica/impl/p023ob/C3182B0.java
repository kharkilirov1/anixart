package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import com.yandex.metrica.impl.p023ob.InterfaceC3207C0;
import com.yandex.metrica.impl.p023ob.InterfaceC3282F0;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.metrica.impl.ob.B0 */
/* loaded from: classes2.dex */
public class C3182B0<CANDIDATE, CHOSEN extends InterfaceC3282F0, STORAGE extends InterfaceC3207C0<CANDIDATE, CHOSEN>> {

    /* renamed from: a */
    private final Context f42571a;

    /* renamed from: b */
    private final C3566Q9 f42572b;

    /* renamed from: c */
    private final AbstractC3232D0<CHOSEN> f42573c;

    /* renamed from: d */
    private final InterfaceC3633T2<CANDIDATE, CHOSEN> f42574d;

    /* renamed from: e */
    private final InterfaceC3434L2<CANDIDATE, CHOSEN, STORAGE> f42575e;

    /* renamed from: f */
    private final InterfaceC4354v2<CHOSEN> f42576f;

    /* renamed from: g */
    private final InterfaceC4276s2 f42577g;

    /* renamed from: h */
    private final InterfaceC4118m0 f42578h;

    /* renamed from: i */
    private STORAGE f42579i;

    /* JADX WARN: Multi-variable type inference failed */
    public C3182B0(@NotNull Context context, @NotNull C3566Q9 c3566q9, @NotNull AbstractC3232D0 abstractC3232D0, @NotNull InterfaceC3633T2 interfaceC3633T2, @NotNull InterfaceC3434L2 interfaceC3434L2, @NotNull InterfaceC4354v2 interfaceC4354v2, @NotNull InterfaceC4276s2 interfaceC4276s2, @NotNull InterfaceC4118m0 interfaceC4118m0, @NotNull InterfaceC3207C0 interfaceC3207C0, @NotNull String str) {
        this.f42571a = context;
        this.f42572b = c3566q9;
        this.f42573c = abstractC3232D0;
        this.f42574d = interfaceC3633T2;
        this.f42575e = interfaceC3434L2;
        this.f42576f = interfaceC4354v2;
        this.f42577g = interfaceC4276s2;
        this.f42578h = interfaceC4118m0;
        this.f42579i = interfaceC3207C0;
    }

    @NotNull
    /* renamed from: a */
    public final CHOSEN m17845a() {
        this.f42578h.mo17937a(this.f42571a);
        return m17844b();
    }

    /* renamed from: b */
    public final synchronized boolean m17847b(@NotNull CHOSEN chosen) {
        boolean z = false;
        if (chosen.mo18022a() == EnumC3257E0.UNDEFINED) {
            return false;
        }
        List<? extends CANDIDATE> invoke = this.f42574d.invoke(this.f42579i.mo17902a(), chosen);
        boolean z2 = invoke != null;
        if (invoke == null) {
            invoke = this.f42579i.mo17902a();
        }
        if (this.f42573c.mo17945a(chosen, this.f42579i.mo17903b())) {
            z = true;
        } else {
            chosen = (CHOSEN) this.f42579i.mo17903b();
        }
        if (z || z2) {
            STORAGE invoke2 = this.f42575e.invoke(chosen, invoke);
            this.f42579i = invoke2;
            this.f42572b.m18781a(invoke2);
        }
        return z;
    }

    @NotNull
    /* renamed from: a */
    public final CHOSEN m17846a(@NotNull CHOSEN chosen) {
        CHOSEN m17844b;
        this.f42578h.mo17937a(this.f42571a);
        synchronized (this) {
            m17847b(chosen);
            m17844b = m17844b();
        }
        return m17844b;
    }

    /* renamed from: b */
    private final synchronized CHOSEN m17844b() {
        if (!this.f42577g.mo18409a()) {
            CHOSEN invoke = this.f42576f.invoke();
            this.f42577g.mo18410b();
            if (invoke != null) {
                m17847b(invoke);
            }
        }
        C3184B2.m17877a("Choosing distribution data: %s", this.f42579i);
        return (CHOSEN) this.f42579i.mo17903b();
    }
}
