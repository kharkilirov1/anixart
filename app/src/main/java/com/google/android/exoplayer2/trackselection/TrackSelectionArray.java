package com.google.android.exoplayer2.trackselection;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class TrackSelectionArray {

    /* renamed from: a */
    public final TrackSelection[] f13971a;

    /* renamed from: b */
    public int f13972b;

    public TrackSelectionArray(TrackSelection... trackSelectionArr) {
        this.f13971a = trackSelectionArr;
        int length = trackSelectionArr.length;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackSelectionArray.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13971a, ((TrackSelectionArray) obj).f13971a);
    }

    public int hashCode() {
        if (this.f13972b == 0) {
            this.f13972b = 527 + Arrays.hashCode(this.f13971a);
        }
        return this.f13972b;
    }
}
