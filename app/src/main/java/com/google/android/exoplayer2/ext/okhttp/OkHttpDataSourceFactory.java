package com.google.android.exoplayer2.ext.okhttp;

import com.google.android.exoplayer2.upstream.HttpDataSource;

@Deprecated
/* loaded from: classes.dex */
public final class OkHttpDataSourceFactory extends HttpDataSource.BaseFactory {
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.BaseFactory
    /* renamed from: b */
    public HttpDataSource mo6356b(HttpDataSource.RequestProperties requestProperties) {
        return new OkHttpDataSource(null, null, null, requestProperties, null);
    }
}
