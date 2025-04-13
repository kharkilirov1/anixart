package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class CacheDataSource implements DataSource {

    /* renamed from: a */
    public final Cache f14555a;

    /* renamed from: b */
    public final DataSource f14556b;

    /* renamed from: c */
    @Nullable
    public final DataSource f14557c;

    /* renamed from: d */
    public final DataSource f14558d;

    /* renamed from: e */
    public final CacheKeyFactory f14559e;

    /* renamed from: f */
    @Nullable
    public final EventListener f14560f;

    /* renamed from: g */
    public final boolean f14561g;

    /* renamed from: h */
    public final boolean f14562h;

    /* renamed from: i */
    public final boolean f14563i;

    /* renamed from: j */
    @Nullable
    public Uri f14564j;

    /* renamed from: k */
    @Nullable
    public DataSpec f14565k;

    /* renamed from: l */
    @Nullable
    public DataSpec f14566l;

    /* renamed from: m */
    @Nullable
    public DataSource f14567m;

    /* renamed from: n */
    public long f14568n;

    /* renamed from: o */
    public long f14569o;

    /* renamed from: p */
    public long f14570p;

    /* renamed from: q */
    @Nullable
    public CacheSpan f14571q;

    /* renamed from: r */
    public boolean f14572r;

    /* renamed from: s */
    public boolean f14573s;

    /* renamed from: t */
    public long f14574t;

    /* renamed from: u */
    public long f14575u;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CacheIgnoredReason {
    }

    public interface EventListener {
        /* renamed from: a */
        void m7501a(int i2);

        /* renamed from: b */
        void m7502b(long j2, long j3);
    }

    public static final class Factory implements DataSource.Factory {

        /* renamed from: a */
        public DataSource.Factory f14576a = new FileDataSource.Factory();

        /* renamed from: b */
        public CacheKeyFactory f14577b = CacheKeyFactory.f14578y1;

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DataSource mo6355a() {
            Objects.requireNonNull(null);
            throw null;
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws IOException {
        EventListener eventListener;
        try {
            String mo7342g = this.f14559e.mo7342g(dataSpec);
            DataSpec.Builder m7434a = dataSpec.m7434a();
            m7434a.f14379h = mo7342g;
            DataSpec m7438a = m7434a.m7438a();
            this.f14565k = m7438a;
            Cache cache = this.f14555a;
            Uri uri = m7438a.f14362a;
            Uri uri2 = null;
            String mo7507a = cache.mo7485b(mo7342g).mo7507a("exo_redir", null);
            if (mo7507a != null) {
                uri2 = Uri.parse(mo7507a);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.f14564j = uri;
            this.f14569o = dataSpec.f14367f;
            boolean z = true;
            int i2 = (this.f14562h && this.f14572r) ? 0 : (this.f14563i && dataSpec.f14368g == -1) ? 1 : -1;
            if (i2 == -1) {
                z = false;
            }
            this.f14573s = z;
            if (z && (eventListener = this.f14560f) != null) {
                eventListener.m7501a(i2);
            }
            if (this.f14573s) {
                this.f14570p = -1L;
            } else {
                long m4104c = C0576a.m4104c(this.f14555a.mo7485b(mo7342g));
                this.f14570p = m4104c;
                if (m4104c != -1) {
                    long j2 = m4104c - dataSpec.f14367f;
                    this.f14570p = j2;
                    if (j2 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long j3 = dataSpec.f14368g;
            if (j3 != -1) {
                long j4 = this.f14570p;
                if (j4 != -1) {
                    j3 = Math.min(j4, j3);
                }
                this.f14570p = j3;
            }
            long j5 = this.f14570p;
            if (j5 > 0 || j5 == -1) {
                m7500s(m7438a, false);
            }
            long j6 = dataSpec.f14368g;
            return j6 != -1 ? j6 : this.f14570p;
        } catch (Throwable th) {
            m7497p(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f14556b.mo6818c(transferListener);
        this.f14558d.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f14565k = null;
        this.f14564j = null;
        this.f14569o = 0L;
        EventListener eventListener = this.f14560f;
        if (eventListener != null && this.f14574t > 0) {
            eventListener.m7502b(this.f14555a.mo7492i(), this.f14574t);
            this.f14574t = 0L;
        }
        try {
            m7496o();
        } catch (Throwable th) {
            m7497p(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        return m7499r() ? this.f14558d.mo6351i() : Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f14564j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o */
    public final void m7496o() throws IOException {
        DataSource dataSource = this.f14567m;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.f14566l = null;
            this.f14567m = null;
            CacheSpan cacheSpan = this.f14571q;
            if (cacheSpan != null) {
                this.f14555a.mo7493j(cacheSpan);
                this.f14571q = null;
            }
        }
    }

    /* renamed from: p */
    public final void m7497p(Throwable th) {
        if (m7498q() || (th instanceof Cache.CacheException)) {
            this.f14572r = true;
        }
    }

    /* renamed from: q */
    public final boolean m7498q() {
        return this.f14567m == this.f14556b;
    }

    /* renamed from: r */
    public final boolean m7499r() {
        return !m7498q();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        if (this.f14570p == 0) {
            return -1;
        }
        DataSpec dataSpec = this.f14565k;
        Objects.requireNonNull(dataSpec);
        DataSpec dataSpec2 = this.f14566l;
        Objects.requireNonNull(dataSpec2);
        try {
            if (this.f14569o >= this.f14575u) {
                m7500s(dataSpec, true);
            }
            DataSource dataSource = this.f14567m;
            Objects.requireNonNull(dataSource);
            int read = dataSource.read(bArr, i2, i3);
            if (read == -1) {
                if (m7499r()) {
                    long j2 = dataSpec2.f14368g;
                    if (j2 == -1 || this.f14568n < j2) {
                        String str = dataSpec.f14369h;
                        int i4 = Util.f14736a;
                        this.f14570p = 0L;
                        if (this.f14567m == this.f14557c) {
                            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
                            ContentMetadataMutations.m7509a(contentMetadataMutations, this.f14569o);
                            this.f14555a.mo7486c(str, contentMetadataMutations);
                        }
                    }
                }
                long j3 = this.f14570p;
                if (j3 <= 0) {
                    if (j3 == -1) {
                    }
                }
                m7496o();
                m7500s(dataSpec, false);
                return read(bArr, i2, i3);
            }
            if (m7498q()) {
                this.f14574t += read;
            }
            long j4 = read;
            this.f14569o += j4;
            this.f14568n += j4;
            long j5 = this.f14570p;
            if (j5 != -1) {
                this.f14570p = j5 - j4;
            }
            return read;
        } catch (Throwable th) {
            m7497p(th);
            throw th;
        }
    }

    /* renamed from: s */
    public final void m7500s(DataSpec dataSpec, boolean z) throws IOException {
        CacheSpan mo7490g;
        DataSpec m7438a;
        DataSource dataSource;
        String str = dataSpec.f14369h;
        int i2 = Util.f14736a;
        if (this.f14573s) {
            mo7490g = null;
        } else if (this.f14561g) {
            try {
                mo7490g = this.f14555a.mo7490g(str, this.f14569o, this.f14570p);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            mo7490g = this.f14555a.mo7488e(str, this.f14569o, this.f14570p);
        }
        if (mo7490g == null) {
            dataSource = this.f14558d;
            DataSpec.Builder m7434a = dataSpec.m7434a();
            m7434a.f14377f = this.f14569o;
            m7434a.f14378g = this.f14570p;
            m7438a = m7434a.m7438a();
        } else if (mo7490g.f14582e) {
            Uri fromFile = Uri.fromFile(mo7490g.f14583f);
            long j2 = mo7490g.f14580c;
            long j3 = this.f14569o - j2;
            long j4 = mo7490g.f14581d - j3;
            long j5 = this.f14570p;
            if (j5 != -1) {
                j4 = Math.min(j4, j5);
            }
            DataSpec.Builder m7434a2 = dataSpec.m7434a();
            m7434a2.f14372a = fromFile;
            m7434a2.f14373b = j2;
            m7434a2.f14377f = j3;
            m7434a2.f14378g = j4;
            m7438a = m7434a2.m7438a();
            dataSource = this.f14556b;
        } else {
            long j6 = mo7490g.f14581d;
            if (j6 == -1) {
                j6 = this.f14570p;
            } else {
                long j7 = this.f14570p;
                if (j7 != -1) {
                    j6 = Math.min(j6, j7);
                }
            }
            DataSpec.Builder m7434a3 = dataSpec.m7434a();
            m7434a3.f14377f = this.f14569o;
            m7434a3.f14378g = j6;
            m7438a = m7434a3.m7438a();
            dataSource = this.f14557c;
            if (dataSource == null) {
                dataSource = this.f14558d;
                this.f14555a.mo7493j(mo7490g);
                mo7490g = null;
            }
        }
        this.f14575u = (this.f14573s || dataSource != this.f14558d) ? Long.MAX_VALUE : this.f14569o + 102400;
        if (z) {
            Assertions.m7516d(this.f14567m == this.f14558d);
            if (dataSource == this.f14558d) {
                return;
            }
            try {
                m7496o();
            } finally {
            }
        }
        if (mo7490g != null && (!mo7490g.f14582e)) {
            this.f14571q = mo7490g;
        }
        this.f14567m = dataSource;
        this.f14566l = m7438a;
        this.f14568n = 0L;
        long mo6350a = dataSource.mo6350a(m7438a);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (m7438a.f14368g == -1 && mo6350a != -1) {
            this.f14570p = mo6350a;
            ContentMetadataMutations.m7509a(contentMetadataMutations, this.f14569o + mo6350a);
        }
        if (m7499r()) {
            Uri mo6352m = dataSource.mo6352m();
            this.f14564j = mo6352m;
            Uri uri = dataSpec.f14362a.equals(mo6352m) ^ true ? this.f14564j : null;
            if (uri == null) {
                contentMetadataMutations.f14599b.add("exo_redir");
                contentMetadataMutations.f14598a.remove("exo_redir");
            } else {
                String uri2 = uri.toString();
                Map<String, Object> map = contentMetadataMutations.f14598a;
                Objects.requireNonNull(uri2);
                map.put("exo_redir", uri2);
                contentMetadataMutations.f14599b.remove("exo_redir");
            }
        }
        if (this.f14567m == this.f14557c) {
            this.f14555a.mo7486c(str, contentMetadataMutations);
        }
    }
}
