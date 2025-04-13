package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.sv0;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class lg0 {

    /* renamed from: a */
    @NotNull
    private final vv0 f52395a;

    /* renamed from: b */
    private boolean f52396b;

    /* renamed from: c */
    private boolean f52397c;

    /* renamed from: d */
    private boolean f52398d;

    public lg0(@NotNull Context context) {
        Intrinsics.m32179h(context, "context");
        this.f52395a = C5730s8.m28078a(context);
        this.f52396b = true;
        this.f52397c = true;
        this.f52398d = true;
    }

    /* renamed from: a */
    public final void m26449a() {
        if (this.f52398d) {
            this.f52395a.mo23876a(new sv0(sv0.EnumC5764b.f54826N, MapsKt.m32061f(new Pair("event_type", "first_auto_swipe"))));
            this.f52398d = false;
        }
    }

    /* renamed from: b */
    public final void m26450b() {
        if (this.f52396b) {
            this.f52395a.mo23876a(new sv0(sv0.EnumC5764b.f54826N, MapsKt.m32061f(new Pair("event_type", "first_click_on_controls"))));
            this.f52396b = false;
        }
    }

    /* renamed from: c */
    public final void m26451c() {
        if (this.f52397c) {
            this.f52395a.mo23876a(new sv0(sv0.EnumC5764b.f54826N, MapsKt.m32061f(new Pair("event_type", "first_user_swipe"))));
            this.f52397c = false;
        }
    }
}
