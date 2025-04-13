package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class oc1 {

    /* renamed from: a */
    @NonNull
    private final Context f53249a;

    /* renamed from: b */
    @NonNull
    private final C5724s3 f53250b;

    /* renamed from: d */
    @NonNull
    private final lc1 f53252d;

    /* renamed from: e */
    @NonNull
    private final ja1 f53253e;

    /* renamed from: f */
    @NonNull
    private final wz0 f53254f;

    /* renamed from: c */
    @NonNull
    private final C5101g2 f53251c = new C5101g2(EnumC5007e6.f49820f);

    /* renamed from: g */
    @NonNull
    private final bc1 f53255g = new bc1();

    public oc1(@NonNull Context context, @NonNull C5724s3 c5724s3) {
        this.f53249a = context.getApplicationContext();
        this.f53250b = c5724s3;
        this.f53252d = lc1.m26427a(context);
        this.f53253e = new ja1(c5724s3);
        this.f53254f = new wz0(context, o80.m27018a().m27019b(), c5724s3);
    }

    /* renamed from: a */
    public final void m27075a(@NonNull lh1 lh1Var, @NonNull Object obj, @NonNull a40 a40Var) {
        this.f53254f.m29611a(new nc1(this, a40Var, lh1Var, obj));
    }

    /* renamed from: a */
    public final void m27076a(@NonNull pa1 pa1Var, @NonNull Object obj, @NonNull sa1 sa1Var) {
        ia1 m25829a = this.f53253e.m25829a(this.f53249a, pa1Var, sa1Var);
        this.f53250b.m28052a(EnumC5668r3.f54178k, pa1Var);
        this.f53252d.m26429a(this.f53249a, this.f53251c, pa1Var, obj, m25829a);
    }

    /* renamed from: a */
    public static void m27070a(oc1 oc1Var, C5961w7 c5961w7, C5507nr c5507nr) {
        oc1Var.f53251c.m24772a(c5961w7);
        oc1Var.f53251c.m24771a(c5507nr);
    }
}
