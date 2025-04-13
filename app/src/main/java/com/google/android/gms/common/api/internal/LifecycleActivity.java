package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class LifecycleActivity {

    /* renamed from: a */
    public final Object f15429a;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.m8132g(activity, "Activity must not be null");
        this.f15429a = activity;
    }
}
