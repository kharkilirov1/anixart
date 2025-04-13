package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class AuxEffectInfo {

    /* renamed from: a */
    public final int f10355a;

    /* renamed from: b */
    public final float f10356b;

    public AuxEffectInfo(int i2, float f2) {
        this.f10355a = i2;
        this.f10356b = f2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuxEffectInfo.class != obj.getClass()) {
            return false;
        }
        AuxEffectInfo auxEffectInfo = (AuxEffectInfo) obj;
        return this.f10355a == auxEffectInfo.f10355a && Float.compare(auxEffectInfo.f10356b, this.f10356b) == 0;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f10356b) + ((527 + this.f10355a) * 31);
    }
}
