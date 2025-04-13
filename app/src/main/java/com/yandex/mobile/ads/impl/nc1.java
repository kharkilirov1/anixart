package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.wz0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class nc1 implements wz0.InterfaceC5998a {

    /* renamed from: a */
    public final /* synthetic */ hw0 f52912a;

    /* renamed from: b */
    public final /* synthetic */ lh1 f52913b;

    /* renamed from: c */
    public final /* synthetic */ Object f52914c;

    /* renamed from: d */
    public final /* synthetic */ oc1 f52915d;

    public nc1(oc1 oc1Var, a40 a40Var, lh1 lh1Var, Object obj) {
        this.f52915d = oc1Var;
        this.f52912a = a40Var;
        this.f52913b = lh1Var;
        this.f52914c = obj;
    }

    @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
    /* renamed from: a */
    public final void mo26147a(@NonNull C5961w7 c5961w7, @NonNull C5507nr c5507nr) {
        C5724s3 c5724s3;
        C5724s3 c5724s32;
        lc1 lc1Var;
        Context context;
        C5101g2 c5101g2;
        c5724s3 = this.f52915d.f53250b;
        oh1 oh1Var = new oh1(c5724s3, this.f52912a);
        oc1.m27070a(this.f52915d, c5961w7, c5507nr);
        c5724s32 = this.f52915d.f53250b;
        c5724s32.m28055b(EnumC5668r3.f54181n);
        lc1Var = this.f52915d.f53252d;
        context = this.f52915d.f53249a;
        c5101g2 = this.f52915d.f53251c;
        lc1Var.m26428a(context, c5101g2, this.f52913b, this.f52914c, oh1Var);
    }

    @Override // com.yandex.mobile.ads.impl.wz0.InterfaceC5998a
    /* renamed from: a */
    public final void mo26146a(@NonNull C5563p2 c5563p2) {
        bc1 bc1Var;
        bc1Var = this.f52915d.f53255g;
        Objects.requireNonNull(bc1Var);
        this.f52912a.mo22373a(bc1.m22802a(c5563p2));
    }
}
