package com.google.android.exoplayer2.ext.okhttp;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.BaseDataSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.HttpUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class OkHttpDataSource extends BaseDataSource implements HttpDataSource {

    /* renamed from: e */
    public final Call.Factory f10781e;

    /* renamed from: f */
    public final HttpDataSource.RequestProperties f10782f;

    /* renamed from: g */
    @Nullable
    public final String f10783g;

    /* renamed from: h */
    @Nullable
    public final CacheControl f10784h;

    /* renamed from: i */
    @Nullable
    public final HttpDataSource.RequestProperties f10785i;

    /* renamed from: j */
    @Nullable
    public Predicate<String> f10786j;

    /* renamed from: k */
    @Nullable
    public DataSpec f10787k;

    /* renamed from: l */
    @Nullable
    public Response f10788l;

    /* renamed from: m */
    @Nullable
    public InputStream f10789m;

    /* renamed from: n */
    public boolean f10790n;

    /* renamed from: o */
    public long f10791o;

    /* renamed from: p */
    public long f10792p;

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.okhttp");
    }

    public OkHttpDataSource(Call.Factory factory, @Nullable String str, @Nullable CacheControl cacheControl, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable Predicate<String> predicate) {
        super(true);
        Objects.requireNonNull(factory);
        this.f10781e = factory;
        this.f10783g = str;
        this.f10784h = cacheControl;
        this.f10785i = requestProperties;
        this.f10786j = predicate;
        this.f10782f = new HttpDataSource.RequestProperties();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        this.f10787k = dataSpec;
        long j2 = 0;
        this.f10792p = 0L;
        this.f10791o = 0L;
        m7429q(dataSpec);
        long j3 = dataSpec.f14367f;
        long j4 = dataSpec.f14368g;
        HttpUrl parse = HttpUrl.parse(dataSpec.f14362a.toString());
        if (parse == null) {
            throw new HttpDataSource.HttpDataSourceException("Malformed URL", dataSpec, 1004, 1);
        }
        Request.Builder url = new Request.Builder().url(parse);
        CacheControl cacheControl = this.f10784h;
        if (cacheControl != null) {
            url.cacheControl(cacheControl);
        }
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.f10785i;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.m7465a());
        }
        hashMap.putAll(this.f10782f.m7465a());
        hashMap.putAll(dataSpec.f14366e);
        for (Map.Entry entry : hashMap.entrySet()) {
            url.header((String) entry.getKey(), (String) entry.getValue());
        }
        String m7466a = HttpUtil.m7466a(j3, j4);
        if (m7466a != null) {
            url.addHeader("Range", m7466a);
        }
        String str = this.f10783g;
        if (str != null) {
            url.addHeader("User-Agent", str);
        }
        if (!dataSpec.m7435c(1)) {
            url.addHeader("Accept-Encoding", "identity");
        }
        byte[] bArr2 = dataSpec.f14365d;
        url.method(DataSpec.m7433b(dataSpec.f14364c), bArr2 != null ? RequestBody.create((MediaType) null, bArr2) : dataSpec.f14364c == 2 ? RequestBody.create((MediaType) null, Util.f14741f) : null);
        try {
            Response execute = this.f10781e.newCall(url.build()).execute();
            this.f10788l = execute;
            ResponseBody body = execute.body();
            Objects.requireNonNull(body);
            this.f10789m = body.byteStream();
            int code = execute.code();
            if (!execute.isSuccessful()) {
                if (code == 416) {
                    if (dataSpec.f14367f == HttpUtil.m7467b(execute.headers().get("Content-Range"))) {
                        this.f10790n = true;
                        m7430r(dataSpec);
                        long j5 = dataSpec.f14368g;
                        if (j5 != -1) {
                            return j5;
                        }
                        return 0L;
                    }
                }
                try {
                    InputStream inputStream = this.f10789m;
                    Objects.requireNonNull(inputStream);
                    bArr = Util.m7729a0(inputStream);
                } catch (IOException unused) {
                    bArr = Util.f14741f;
                }
                byte[] bArr3 = bArr;
                Map<String, List<String>> multimap = execute.headers().toMultimap();
                m6353s();
                throw new HttpDataSource.InvalidResponseCodeException(code, execute.message(), code == 416 ? new DataSourceException(2008) : null, multimap, dataSpec, bArr3);
            }
            MediaType mediaType = body.get$contentType();
            String mediaType2 = mediaType != null ? mediaType.getMediaType() : "";
            Predicate<String> predicate = this.f10786j;
            if (predicate != null && !predicate.apply(mediaType2)) {
                m6353s();
                throw new HttpDataSource.InvalidContentTypeException(mediaType2, dataSpec);
            }
            if (code == 200) {
                long j6 = dataSpec.f14367f;
                if (j6 != 0) {
                    j2 = j6;
                }
            }
            long j7 = dataSpec.f14368g;
            if (j7 != -1) {
                this.f10791o = j7;
            } else {
                long contentLength = body.getContentLength();
                this.f10791o = contentLength != -1 ? contentLength - j2 : -1L;
            }
            this.f10790n = true;
            m7430r(dataSpec);
            try {
                m6354t(j2, dataSpec);
                return this.f10791o;
            } catch (HttpDataSource.HttpDataSourceException e2) {
                m6353s();
                throw e2;
            }
        } catch (IOException e3) {
            throw HttpDataSource.HttpDataSourceException.m7464b(e3, dataSpec, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f10790n) {
            this.f10790n = false;
            m7428p();
            m6353s();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        Response response = this.f10788l;
        return response == null ? Collections.emptyMap() : response.headers().toMultimap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        Response response = this.f10788l;
        if (response == null) {
            return null;
        }
        return Uri.parse(response.request().url().getUrl());
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws HttpDataSource.HttpDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f10791o;
            if (j2 != -1) {
                long j3 = j2 - this.f10792p;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.f10789m;
            int i4 = Util.f14736a;
            int read = inputStream.read(bArr, i2, i3);
            if (read != -1) {
                this.f10792p += read;
                m7427o(read);
                return read;
            }
            return -1;
        } catch (IOException e2) {
            DataSpec dataSpec = this.f10787k;
            int i5 = Util.f14736a;
            throw HttpDataSource.HttpDataSourceException.m7464b(e2, dataSpec, 2);
        }
    }

    /* renamed from: s */
    public final void m6353s() {
        Response response = this.f10788l;
        if (response != null) {
            ResponseBody body = response.body();
            Objects.requireNonNull(body);
            body.close();
            this.f10788l = null;
        }
        this.f10789m = null;
    }

    /* renamed from: t */
    public final void m6354t(long j2, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j2 > 0) {
            try {
                int min = (int) Math.min(j2, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
                InputStream inputStream = this.f10789m;
                int i2 = Util.f14736a;
                int read = inputStream.read(bArr, 0, min);
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
                if (read == -1) {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
                }
                j2 -= read;
                m7427o(read);
            } catch (IOException e2) {
                if (!(e2 instanceof HttpDataSource.HttpDataSourceException)) {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2000, 1);
                }
                throw ((HttpDataSource.HttpDataSourceException) e2);
            }
        }
    }

    public static final class Factory implements HttpDataSource.Factory {

        /* renamed from: a */
        public final HttpDataSource.RequestProperties f10793a = new HttpDataSource.RequestProperties();

        /* renamed from: b */
        public final Call.Factory f10794b;

        public Factory(Call.Factory factory) {
            this.f10794b = factory;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public DataSource mo6355a() {
            return new OkHttpDataSource(this.f10794b, null, null, this.f10793a, null);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public HttpDataSource mo6355a() {
            return new OkHttpDataSource(this.f10794b, null, null, this.f10793a, null);
        }
    }
}
