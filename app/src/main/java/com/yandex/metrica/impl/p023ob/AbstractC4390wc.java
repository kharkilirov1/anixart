package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.wc */
/* loaded from: classes2.dex */
public abstract class AbstractC4390wc {

    /* renamed from: a */
    @NonNull
    public final C3366I9 f46863a;

    /* renamed from: b */
    @NonNull
    public final C4079kd f46864b;

    /* renamed from: c */
    @NonNull
    public final C3808a2 f46865c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3519Oc f46866d;

    /* renamed from: e */
    @NonNull
    private final C4312tc f46867e;

    /* renamed from: f */
    @NonNull
    private final C4338uc f46868f;

    public AbstractC4390wc(@NonNull C4079kd c4079kd, @NonNull C3366I9 c3366i9, @NonNull C3808a2 c3808a2) {
        this.f46864b = c4079kd;
        this.f46863a = c3366i9;
        this.f46865c = c3808a2;
        InterfaceC3519Oc mo18588a = mo18588a();
        this.f46866d = mo18588a;
        this.f46867e = new C4312tc(mo18588a, mo18591c());
        this.f46868f = new C4338uc(c4079kd.f45611a.f47109b);
    }

    @NonNull
    /* renamed from: a */
    public abstract InterfaceC3519Oc mo18588a();

    @NonNull
    /* renamed from: a */
    public abstract InterfaceC3976ge mo18589a(@NonNull C3950fe c3950fe);

    @NonNull
    /* renamed from: a */
    public C4131md<C3269Ec> m21094a(@NonNull C4417xd c4417xd, @Nullable C3269Ec c3269Ec) {
        C4468zc c4468zc = this.f46864b.f45611a;
        Context context = c4468zc.f47108a;
        Looper m20675b = c4468zc.f47109b.m20675b();
        C4079kd c4079kd = this.f46864b;
        return new C4131md<>(new C3195Bd(context, m20675b, c4079kd.f45612b, mo18589a(c4079kd.f45611a.f47110c), mo18590b(), new C4001hd(c4417xd)), this.f46867e, new C4364vc(this.f46866d, new C3504Nm()), this.f46868f, c3269Ec);
    }

    @NonNull
    /* renamed from: b */
    public abstract String mo18590b();

    @NonNull
    /* renamed from: c */
    public abstract String mo18591c();
}
