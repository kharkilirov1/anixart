package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class DefaultClock implements Clock {

    /* renamed from: a */
    public static final DefaultClock f15894a = new DefaultClock();

    @Override // com.google.android.gms.common.util.Clock
    /* renamed from: a */
    public final long mo8238a() {
        return SystemClock.elapsedRealtime();
    }
}
