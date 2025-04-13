package com.google.android.exoplayer2.source.hls;

import com.google.android.exoplayer2.upstream.DataSource;

/* loaded from: classes.dex */
public final class DefaultHlsDataSourceFactory implements HlsDataSourceFactory {

    /* renamed from: a */
    public final DataSource.Factory f13041a;

    public DefaultHlsDataSourceFactory(DataSource.Factory factory) {
        this.f13041a = factory;
    }

    @Override // com.google.android.exoplayer2.source.hls.HlsDataSourceFactory
    /* renamed from: a */
    public DataSource mo7088a(int i2) {
        return this.f13041a.mo6355a();
    }
}
