package com.yandex.metrica.impl.p023ob;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.impl.ob.e3 */
/* loaded from: classes2.dex */
public final class C3913e3 extends Location {

    /* renamed from: a */
    @Nullable
    private final String f44985a;

    private C3913e3(@NonNull Location location, @Nullable String str) {
        super(location);
        this.f44985a = str;
    }

    /* renamed from: b */
    public static C3913e3 m19783b(@NonNull Location location) {
        return new C3913e3(new Location(location), "");
    }

    @Nullable
    /* renamed from: a */
    public String m19784a() {
        return this.f44985a;
    }

    /* renamed from: a */
    public static C3913e3 m19782a(@NonNull Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new C3913e3(location2, provider);
    }
}
