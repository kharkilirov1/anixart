package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5621q6;
import com.yandex.mobile.ads.impl.aa1;
import com.yandex.mobile.ads.impl.cj0;
import com.yandex.mobile.ads.impl.cz0;
import com.yandex.mobile.ads.impl.xz0;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.nativeads.d0 */
/* loaded from: classes3.dex */
final class C6205d0 implements InterfaceC5621q6 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC6213h0 f57686a;

    /* renamed from: b */
    @NonNull
    private final cj0 f57687b;

    /* renamed from: c */
    @Nullable
    private final xz0 f57688c = xz0.m29823b();

    /* renamed from: d */
    @NonNull
    private final Context f57689d;

    public C6205d0(@NonNull Context context, @NonNull C6210g c6210g, @NonNull cj0 cj0Var) {
        this.f57686a = c6210g;
        this.f57687b = cj0Var;
        this.f57689d = context;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5621q6
    /* renamed from: a */
    public final boolean mo24283a() {
        Objects.requireNonNull(this.f57687b);
        cz0 m29824a = this.f57688c.m29824a(this.f57689d);
        return !(m29824a != null && m29824a.m23583V()) || ((C6211g0) this.f57686a.mo30548a(false)).m30556b() == aa1.EnumC4801a.f48453b;
    }
}
