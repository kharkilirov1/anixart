package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.A4 */
/* loaded from: classes2.dex */
public abstract class AbstractC3161A4 implements InterfaceC3261E4 {

    /* renamed from: a */
    @NonNull
    private final C4252r4 f42526a;

    /* renamed from: b */
    @NonNull
    private final C3245Dd f42527b;

    public AbstractC3161A4(@NonNull Context context, @NonNull C4252r4 c4252r4) {
        this(context, c4252r4, new C3245Dd(C3897dd.m19718a(context), C3835b3.m19636a(context), C3532P0.m18696i().m18718u()));
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3261E4
    /* renamed from: a */
    public void mo17811a(@NonNull C4066k0 c4066k0, @NonNull C3734X3 c3734x3) {
        mo17813b(c4066k0, c3734x3);
    }

    @NonNull
    /* renamed from: b */
    public C4252r4 m17812b() {
        return this.f42526a;
    }

    /* renamed from: b */
    public abstract void mo17813b(@NonNull C4066k0 c4066k0, @NonNull C3734X3 c3734x3);

    @NonNull
    /* renamed from: c */
    public C3245Dd m17814c() {
        return this.f42527b;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3261E4
    /* renamed from: a */
    public void mo17810a() {
        this.f42526a.m20620b(this);
        this.f42527b.m17966b(this);
    }

    @VisibleForTesting
    public AbstractC3161A4(@NonNull Context context, @NonNull C4252r4 c4252r4, @NonNull C3245Dd c3245Dd) {
        context.getApplicationContext();
        this.f42526a = c4252r4;
        this.f42527b = c3245Dd;
        c4252r4.m20618a(this);
        c3245Dd.m17964a(this);
    }
}
