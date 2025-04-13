package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
public class AnimatorDurationScaleProvider {
    /* renamed from: a */
    public float m10206a(@NonNull ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
