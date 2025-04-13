package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.td */
/* loaded from: classes2.dex */
public class C4313td {

    /* renamed from: a */
    @NonNull
    public final C4079kd f46512a;

    /* renamed from: b */
    @NonNull
    private final C3808a2 f46513b;

    /* renamed from: c */
    @NonNull
    private final C4235qd f46514c;

    public C4313td(@NonNull C4079kd c4079kd) {
        this(c4079kd, new C3808a2());
    }

    @NonNull
    /* renamed from: a */
    private C4235qd m20812a() {
        return new C4235qd();
    }

    @VisibleForTesting
    public C4313td(@NonNull C4079kd c4079kd, @NonNull C3808a2 c3808a2) {
        this.f46512a = c4079kd;
        this.f46513b = c3808a2;
        this.f46514c = m20812a();
    }

    @NonNull
    /* renamed from: a */
    public C4131md<C3269Ec> m20813a(@NonNull C4417xd c4417xd, @Nullable C3269Ec c3269Ec) {
        C4468zc c4468zc = this.f46512a.f45611a;
        Context context = c4468zc.f47108a;
        Looper m20675b = c4468zc.f47109b.m20675b();
        C4079kd c4079kd = this.f46512a;
        return new C4131md<>(new C3195Bd(context, m20675b, c4079kd.f45612b, this.f46513b.m19565c(c4079kd.f45611a.f47110c), "passive", new C4001hd(c4417xd)), this.f46514c, new C4287sd(), new C4261rd(), c3269Ec);
    }
}
