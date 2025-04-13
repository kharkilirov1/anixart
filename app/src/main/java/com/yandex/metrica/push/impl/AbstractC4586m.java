package com.yandex.metrica.push.impl;

import android.location.Location;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.yandex.metrica.push.common.utils.DoNotInline;

@RequiresApi
@DoNotInline
/* renamed from: com.yandex.metrica.push.impl.m */
/* loaded from: classes2.dex */
abstract class AbstractC4586m {
    /* renamed from: a */
    public static long m21555a(@NonNull Location location) {
        return SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos();
    }
}
