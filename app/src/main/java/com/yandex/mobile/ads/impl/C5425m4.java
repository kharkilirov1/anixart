package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.m4 */
/* loaded from: classes3.dex */
public final class C5425m4 {

    /* renamed from: a */
    @NonNull
    private final Context f52572a;

    /* renamed from: b */
    @NonNull
    private final xz0 f52573b = xz0.m29823b();

    /* renamed from: c */
    @NonNull
    private final InterfaceC5674r6 f52574c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC5621q6 f52575d;

    public C5425m4(@NonNull Context context, @NonNull InterfaceC5674r6 interfaceC5674r6, @NonNull InterfaceC5621q6 interfaceC5621q6) {
        this.f52572a = context;
        this.f52574c = interfaceC5674r6;
        this.f52575d = interfaceC5621q6;
    }

    /* renamed from: a */
    public final boolean m26566a() {
        cz0 m29824a = this.f52573b.m29824a(this.f52572a);
        return (m29824a != null && !m29824a.m23570I() ? this.f52574c.mo21749a() : this.f52574c.mo21750b()) && this.f52575d.mo24283a();
    }
}
