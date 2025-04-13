package com.google.android.exoplayer2;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class RendererConfiguration {

    /* renamed from: b */
    public static final RendererConfiguration f9984b = new RendererConfiguration(false);

    /* renamed from: a */
    public final boolean f9985a;

    public RendererConfiguration(boolean z) {
        this.f9985a = z;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && RendererConfiguration.class == obj.getClass() && this.f9985a == ((RendererConfiguration) obj).f9985a;
    }

    public int hashCode() {
        return !this.f9985a ? 1 : 0;
    }
}
