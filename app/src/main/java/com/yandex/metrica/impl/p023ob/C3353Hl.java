package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3906dm;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Hl */
/* loaded from: classes2.dex */
class C3353Hl {

    /* renamed from: a */
    @NonNull
    private final C3752Xl f43071a;

    /* renamed from: b */
    @NonNull
    private final C3906dm.a f43072b;

    /* renamed from: c */
    @NonNull
    private final C3777Yl f43073c;

    public C3353Hl() {
        this(new C3752Xl(), new C3906dm.a(), new C3777Yl());
    }

    @NonNull
    /* renamed from: a */
    public C3328Gl m18240a(@NonNull Activity activity, @NonNull C3854bm c3854bm, @NonNull C3853bl c3853bl, @NonNull InterfaceC4035il interfaceC4035il, boolean z) throws Throwable {
        if (z) {
            return new C3328Gl();
        }
        C3777Yl c3777Yl = this.f43073c;
        Objects.requireNonNull(this.f43072b);
        return c3777Yl.m19486a(activity, interfaceC4035il, c3854bm, c3853bl, new C3906dm(c3854bm, C3524Oh.m18679a()), this.f43071a);
    }

    @VisibleForTesting
    public C3353Hl(@NonNull C3752Xl c3752Xl, @NonNull C3906dm.a aVar, @NonNull C3777Yl c3777Yl) {
        this.f43071a = c3752Xl;
        this.f43072b = aVar;
        this.f43073c = c3777Yl;
    }
}
