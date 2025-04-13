package com.google.android.gms.appset;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
public class AppSetIdInfo {

    /* renamed from: a */
    @NonNull
    public final String f15010a;

    /* renamed from: b */
    public final int f15011b;

    /* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Scope {
    }

    public AppSetIdInfo(@NonNull String str, int i2) {
        this.f15010a = str;
        this.f15011b = i2;
    }
}
