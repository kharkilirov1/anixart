package com.google.android.exoplayer2.source.dash;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.chunk.ChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import java.util.List;

/* loaded from: classes.dex */
public interface DashChunkSource extends ChunkSource {

    public interface Factory {
        /* renamed from: a */
        DashChunkSource mo6994a(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i2, int[] iArr, ExoTrackSelection exoTrackSelection, int i3, long j2, boolean z, List<Format> list, @Nullable PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, @Nullable TransferListener transferListener);
    }

    /* renamed from: d */
    void mo6992d(DashManifest dashManifest, int i2);

    /* renamed from: f */
    void mo6993f(ExoTrackSelection exoTrackSelection);
}
