package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {

    /* renamed from: a */
    public final long f14491a;

    /* renamed from: b */
    public final DataSpec f14492b;

    /* renamed from: c */
    public final int f14493c;

    /* renamed from: d */
    public final StatsDataSource f14494d;

    /* renamed from: e */
    public final Parser<? extends T> f14495e;

    /* renamed from: f */
    @Nullable
    public volatile T f14496f;

    public interface Parser<T> {
        /* renamed from: a */
        T mo6752a(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int i2, Parser<? extends T> parser) {
        DataSpec.Builder builder = new DataSpec.Builder();
        builder.f14372a = uri;
        builder.f14380i = 1;
        DataSpec m7438a = builder.m7438a();
        this.f14494d = new StatsDataSource(dataSource);
        this.f14492b = m7438a;
        this.f14493c = i2;
        this.f14495e = parser;
        this.f14491a = LoadEventInfo.m6820a();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: a */
    public final void mo6865a() throws IOException {
        this.f14494d.f14521b = 0L;
        DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.f14494d, this.f14492b);
        try {
            if (!dataSourceInputStream.f14359e) {
                dataSourceInputStream.f14356b.mo6350a(dataSourceInputStream.f14357c);
                dataSourceInputStream.f14359e = true;
            }
            Uri mo6352m = this.f14494d.mo6352m();
            Objects.requireNonNull(mo6352m);
            this.f14496f = this.f14495e.mo6752a(mo6352m, dataSourceInputStream);
            try {
                dataSourceInputStream.close();
            } catch (IOException unused) {
            }
        } finally {
            int i2 = Util.f14736a;
            try {
                dataSourceInputStream.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    /* renamed from: c */
    public final void mo6866c() {
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i2, Parser<? extends T> parser) {
        this.f14494d = new StatsDataSource(dataSource);
        this.f14492b = dataSpec;
        this.f14493c = i2;
        this.f14495e = parser;
        this.f14491a = LoadEventInfo.m6820a();
    }
}
