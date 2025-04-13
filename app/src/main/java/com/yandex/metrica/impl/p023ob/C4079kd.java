package com.yandex.metrica.impl.p023ob;

import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* renamed from: com.yandex.metrica.impl.ob.kd */
/* loaded from: classes2.dex */
public class C4079kd {

    /* renamed from: a */
    @NonNull
    public final C4468zc f45611a;

    /* renamed from: b */
    @Nullable
    public final LocationManager f45612b;

    /* renamed from: c */
    @Nullable
    public final C3668Uc f45613c;

    @VisibleForTesting
    public C4079kd(@NonNull C4468zc c4468zc, @NonNull C3575Qi c3575Qi, @Nullable C3668Uc c3668Uc, @Nullable LocationManager locationManager, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc) {
        this.f45611a = c4468zc;
        this.f45613c = c3668Uc;
        this.f45612b = locationManager;
    }

    /* renamed from: a */
    public static C4079kd m20235a(@NonNull C4365vd c4365vd, @NonNull C3170Ad c3170Ad, @NonNull C4442yc c4442yc, @Nullable LocationManager locationManager) {
        return new C4079kd(c4365vd.f46700a, c4365vd.f46701b, c4365vd.f46702c, locationManager, c3170Ad, c4442yc);
    }
}
