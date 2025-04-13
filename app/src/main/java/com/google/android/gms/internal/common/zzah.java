package com.google.android.gms.internal.common;

import androidx.room.util.C0576a;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public final class zzah {
    /* renamed from: a */
    public static Object[] m8557a(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(C0576a.m4111j(20, "at index ", i3));
            }
        }
        return objArr;
    }
}
