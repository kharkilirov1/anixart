package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.E9 */
/* loaded from: classes2.dex */
public class C3266E9 extends AbstractC3341H9 {

    /* renamed from: c */
    private final C4444ye f42774c;

    /* renamed from: d */
    private final C4444ye f42775d;

    public C3266E9(InterfaceC4464z8 interfaceC4464z8) {
        super(interfaceC4464z8);
        this.f42774c = new C4444ye("init_event_pref_key");
        this.f42775d = new C4444ye("first_event_pref_key");
    }

    @Deprecated
    /* renamed from: e */
    public boolean m18006e() {
        return m18217a(this.f42775d.m21201a(), (String) null) != null;
    }

    @Deprecated
    /* renamed from: f */
    public String m18007f(String str) {
        return m18217a(this.f42774c.m21201a(), (String) null);
    }

    @NonNull
    @Deprecated
    /* renamed from: g */
    public C3266E9 m18009g() {
        return (C3266E9) m18230e(this.f42775d.m21201a());
    }

    @NonNull
    @Deprecated
    /* renamed from: h */
    public C3266E9 m18010h() {
        return (C3266E9) m18230e(this.f42774c.m21201a());
    }

    @Deprecated
    /* renamed from: i */
    public void m18011i() {
        m18222b(this.f42775d.m21201a(), "DONE").m18227c();
    }

    @Deprecated
    /* renamed from: j */
    public void m18012j() {
        m18222b(this.f42774c.m21201a(), "DONE").m18227c();
    }

    @Deprecated
    /* renamed from: f */
    public boolean m18008f() {
        return m18217a(this.f42774c.m21201a(), (String) null) != null;
    }
}
