package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface DataSource extends DataReader {

    public interface Factory {
        /* renamed from: a */
        DataSource mo6355a();
    }

    /* renamed from: a */
    long mo6350a(DataSpec dataSpec) throws IOException;

    /* renamed from: c */
    void mo6818c(TransferListener transferListener);

    void close() throws IOException;

    /* renamed from: i */
    Map<String, List<String>> mo6351i();

    @Nullable
    /* renamed from: m */
    Uri mo6352m();
}
