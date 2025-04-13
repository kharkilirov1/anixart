package com.google.android.exoplayer2.trackselection;

import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;

/* loaded from: classes.dex */
public final class TrackSelectionUtil {

    public interface AdaptiveTrackSelectionFactory {
    }

    /* renamed from: a */
    public static LoadErrorHandlingPolicy.FallbackOptions m7334a(ExoTrackSelection exoTrackSelection) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (exoTrackSelection.mo7296d(i3, elapsedRealtime)) {
                i2++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i2);
    }
}
