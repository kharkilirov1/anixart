package com.google.android.exoplayer2.source.hls;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import java.io.IOException;

/* loaded from: classes.dex */
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(@Nullable String str) {
        super(C0576a.m4115n(C0576a.m4106e(str, 60), "Unable to bind a sample queue to TrackGroup with mime type ", str, "."));
    }
}
