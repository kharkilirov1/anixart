package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class DefaultDataSource implements DataSource {

    /* renamed from: a */
    public final Context f14415a;

    /* renamed from: b */
    public final List<TransferListener> f14416b;

    /* renamed from: c */
    public final DataSource f14417c;

    /* renamed from: d */
    @Nullable
    public DataSource f14418d;

    /* renamed from: e */
    @Nullable
    public DataSource f14419e;

    /* renamed from: f */
    @Nullable
    public DataSource f14420f;

    /* renamed from: g */
    @Nullable
    public DataSource f14421g;

    /* renamed from: h */
    @Nullable
    public DataSource f14422h;

    /* renamed from: i */
    @Nullable
    public DataSource f14423i;

    /* renamed from: j */
    @Nullable
    public DataSource f14424j;

    /* renamed from: k */
    @Nullable
    public DataSource f14425k;

    public static final class Factory implements DataSource.Factory {

        /* renamed from: a */
        public final Context f14426a;

        /* renamed from: b */
        public final DataSource.Factory f14427b;

        public Factory(Context context) {
            DefaultHttpDataSource.Factory factory = new DefaultHttpDataSource.Factory();
            this.f14426a = context.getApplicationContext();
            this.f14427b = factory;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DataSource mo6355a() {
            return new DefaultDataSource(this.f14426a, this.f14427b.mo6355a());
        }
    }

    public DefaultDataSource(Context context, DataSource dataSource) {
        this.f14415a = context.getApplicationContext();
        Objects.requireNonNull(dataSource);
        this.f14417c = dataSource;
        this.f14416b = new ArrayList();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        boolean z = true;
        Assertions.m7516d(this.f14425k == null);
        String scheme = dataSpec.f14362a.getScheme();
        Uri uri = dataSpec.f14362a;
        int i2 = Util.f14736a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = dataSpec.f14362a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f14418d == null) {
                    FileDataSource fileDataSource = new FileDataSource();
                    this.f14418d = fileDataSource;
                    m7447o(fileDataSource);
                }
                this.f14425k = this.f14418d;
            } else {
                if (this.f14419e == null) {
                    AssetDataSource assetDataSource = new AssetDataSource(this.f14415a);
                    this.f14419e = assetDataSource;
                    m7447o(assetDataSource);
                }
                this.f14425k = this.f14419e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f14419e == null) {
                AssetDataSource assetDataSource2 = new AssetDataSource(this.f14415a);
                this.f14419e = assetDataSource2;
                m7447o(assetDataSource2);
            }
            this.f14425k = this.f14419e;
        } else if ("content".equals(scheme)) {
            if (this.f14420f == null) {
                ContentDataSource contentDataSource = new ContentDataSource(this.f14415a);
                this.f14420f = contentDataSource;
                m7447o(contentDataSource);
            }
            this.f14425k = this.f14420f;
        } else if ("rtmp".equals(scheme)) {
            if (this.f14421g == null) {
                try {
                    DataSource dataSource = (DataSource) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.f14421g = dataSource;
                    m7447o(dataSource);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.f14421g == null) {
                    this.f14421g = this.f14417c;
                }
            }
            this.f14425k = this.f14421g;
        } else if ("udp".equals(scheme)) {
            if (this.f14422h == null) {
                UdpDataSource udpDataSource = new UdpDataSource();
                this.f14422h = udpDataSource;
                m7447o(udpDataSource);
            }
            this.f14425k = this.f14422h;
        } else if ("data".equals(scheme)) {
            if (this.f14423i == null) {
                DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
                this.f14423i = dataSchemeDataSource;
                m7447o(dataSchemeDataSource);
            }
            this.f14425k = this.f14423i;
        } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
            if (this.f14424j == null) {
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.f14415a);
                this.f14424j = rawResourceDataSource;
                m7447o(rawResourceDataSource);
            }
            this.f14425k = this.f14424j;
        } else {
            this.f14425k = this.f14417c;
        }
        return this.f14425k.mo6350a(dataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f14417c.mo6818c(transferListener);
        this.f14416b.add(transferListener);
        DataSource dataSource = this.f14418d;
        if (dataSource != null) {
            dataSource.mo6818c(transferListener);
        }
        DataSource dataSource2 = this.f14419e;
        if (dataSource2 != null) {
            dataSource2.mo6818c(transferListener);
        }
        DataSource dataSource3 = this.f14420f;
        if (dataSource3 != null) {
            dataSource3.mo6818c(transferListener);
        }
        DataSource dataSource4 = this.f14421g;
        if (dataSource4 != null) {
            dataSource4.mo6818c(transferListener);
        }
        DataSource dataSource5 = this.f14422h;
        if (dataSource5 != null) {
            dataSource5.mo6818c(transferListener);
        }
        DataSource dataSource6 = this.f14423i;
        if (dataSource6 != null) {
            dataSource6.mo6818c(transferListener);
        }
        DataSource dataSource7 = this.f14424j;
        if (dataSource7 != null) {
            dataSource7.mo6818c(transferListener);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        DataSource dataSource = this.f14425k;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.f14425k = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        DataSource dataSource = this.f14425k;
        return dataSource == null ? Collections.emptyMap() : dataSource.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        DataSource dataSource = this.f14425k;
        if (dataSource == null) {
            return null;
        }
        return dataSource.mo6352m();
    }

    /* renamed from: o */
    public final void m7447o(DataSource dataSource) {
        for (int i2 = 0; i2 < this.f14416b.size(); i2++) {
            dataSource.mo6818c(this.f14416b.get(i2));
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        DataSource dataSource = this.f14425k;
        Objects.requireNonNull(dataSource);
        return dataSource.read(bArr, i2, i3);
    }
}
