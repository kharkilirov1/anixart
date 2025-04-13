package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.z4 */
/* loaded from: classes2.dex */
public class C4460z4 {

    /* renamed from: a */
    @NonNull
    private final C3316G9 f47089a;

    /* renamed from: b */
    @NonNull
    private final InterfaceC3529Om f47090b;

    /* renamed from: c */
    @NonNull
    private final C3583R2 f47091c;

    /* renamed from: d */
    @Nullable
    private C3674Ui f47092d;

    /* renamed from: e */
    private long f47093e;

    public C4460z4(@NonNull Context context, @NonNull C3862c4 c3862c4) {
        this(new C3316G9(C3567Qa.m18783a(context).m18793b(c3862c4)), new C3504Nm(), new C3583R2());
    }

    /* renamed from: a */
    public boolean m21290a(@Nullable Boolean bool) {
        C3674Ui c3674Ui;
        return Boolean.FALSE.equals(bool) && (c3674Ui = this.f47092d) != null && this.f47091c.m18937a(this.f47093e, c3674Ui.f44187a, "should report diagnostic");
    }

    /* renamed from: a */
    public void m21288a() {
        long mo18643a = this.f47090b.mo18643a();
        this.f47093e = mo18643a;
        this.f47089a.m18138d(mo18643a).m18227c();
    }

    public C4460z4(@NonNull C3316G9 c3316g9, @NonNull InterfaceC3529Om interfaceC3529Om, @NonNull C3583R2 c3583r2) {
        this.f47089a = c3316g9;
        this.f47090b = interfaceC3529Om;
        this.f47091c = c3583r2;
        this.f47093e = c3316g9.m18149j();
    }

    /* renamed from: a */
    public void m21289a(@Nullable C3674Ui c3674Ui) {
        this.f47092d = c3674Ui;
    }
}
