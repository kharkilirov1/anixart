package com.yandex.mobile.ads.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class z80 {

    /* renamed from: a */
    @NonNull
    private final v80 f57084a = new v80();

    @Nullable
    /* renamed from: a */
    public final Location m30074a(@NonNull ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            Objects.requireNonNull(this.f57084a);
            if (v80.m29194b(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
