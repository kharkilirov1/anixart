package com.yandex.mobile.ads.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.vh1;

/* loaded from: classes3.dex */
public final class lc1 {

    /* renamed from: b */
    @NonNull
    private static final Object f52358b = new Object();

    /* renamed from: c */
    private static volatile lc1 f52359c;

    /* renamed from: a */
    @NonNull
    private final kw0 f52360a;

    private lc1(@NonNull kw0 kw0Var) {
        this.f52360a = kw0Var;
    }

    /* renamed from: a */
    public final void m26430a(@NonNull Context context, @NonNull pb1 pb1Var, @NonNull fa1 fa1Var, @NonNull hj1 hj1Var) {
        this.f52360a.m26292a(new xa1(context, pb1Var.m27272k(), new vh1.C5921b(hj1Var), pb1Var, new pj1(fa1Var)));
    }

    @NonNull
    /* renamed from: a */
    public static lc1 m26427a(@NonNull Context context) {
        if (f52359c == null) {
            synchronized (f52358b) {
                if (f52359c == null) {
                    f52359c = new lc1(xj1.m29762a(context, 1));
                }
            }
        }
        return f52359c;
    }

    /* renamed from: a */
    public final void m26428a(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull lh1 lh1Var, @NonNull Object obj, @NonNull oh1 oh1Var) {
        this.f52360a.m26292a(new nh1().m26914a(context, c5101g2, lh1Var, obj, oh1Var));
    }

    /* renamed from: a */
    public final void m26429a(@NonNull Context context, @NonNull C5101g2 c5101g2, @NonNull pa1 pa1Var, @NonNull Object obj, @NonNull ia1 ia1Var) {
        this.f52360a.m26292a(new qa1().m27665a(context, c5101g2, pa1Var, obj, ia1Var));
    }
}
