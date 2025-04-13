package com.bumptech.glide.util;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class Preconditions {
    /* renamed from: a */
    public static void m5343a(boolean z, @NonNull String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }
}
