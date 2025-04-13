package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {

    /* renamed from: e */
    public final boolean f14431e;

    /* renamed from: f */
    public final int f14432f;

    /* renamed from: g */
    public final int f14433g;

    /* renamed from: h */
    @Nullable
    public final String f14434h;

    /* renamed from: i */
    @Nullable
    public final HttpDataSource.RequestProperties f14435i;

    /* renamed from: j */
    public final HttpDataSource.RequestProperties f14436j;

    /* renamed from: k */
    public final boolean f14437k;

    /* renamed from: l */
    @Nullable
    public Predicate<String> f14438l;

    /* renamed from: m */
    @Nullable
    public DataSpec f14439m;

    /* renamed from: n */
    @Nullable
    public HttpURLConnection f14440n;

    /* renamed from: o */
    @Nullable
    public InputStream f14441o;

    /* renamed from: p */
    public boolean f14442p;

    /* renamed from: q */
    public int f14443q;

    /* renamed from: r */
    public long f14444r;

    /* renamed from: s */
    public long f14445s;

    public static final class Factory implements HttpDataSource.Factory {

        /* renamed from: b */
        @Nullable
        public String f14447b;

        /* renamed from: a */
        public final HttpDataSource.RequestProperties f14446a = new HttpDataSource.RequestProperties();

        /* renamed from: c */
        public int f14448c = 8000;

        /* renamed from: d */
        public int f14449d = 8000;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public DefaultHttpDataSource mo6355a() {
            return new DefaultHttpDataSource(this.f14447b, this.f14448c, this.f14449d, false, this.f14446a, null, false);
        }
    }

    public static class NullFilteringHeadersMap extends ForwardingMap<String, List<String>> {

        /* renamed from: b */
        public final Map<String, List<String>> f14450b;

        public NullFilteringHeadersMap(Map<String, List<String>> map) {
            this.f14450b = map;
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* renamed from: G */
        public Object mo7455G() {
            return this.f14450b;
        }

        @Override // com.google.common.collect.ForwardingMap
        /* renamed from: H */
        public Map<String, List<String>> mo11329H() {
            return this.f14450b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            return obj != null && mo11329H().containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return m11565I(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.m11886d(super.entrySet(), C1166c.f14543d);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(@Nullable Object obj) {
            return obj != null && Maps.m11788e(this, obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        @Nullable
        public Object get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return mo11329H().get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
            return Sets.m11887e(entrySet());
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<String> keySet() {
            return Sets.m11886d(super.keySet(), C1166c.f14542c);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }
    }

    @Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000, false, null, null, false);
    }

    /* renamed from: w */
    public static void m7448w(@Nullable HttpURLConnection httpURLConnection, long j2) {
        int i2;
        if (httpURLConnection == null || (i2 = Util.f14736a) < 19 || i2 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j2 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j2 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                Objects.requireNonNull(superclass);
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long mo6350a(com.google.android.exoplayer2.upstream.DataSpec r19) throws com.google.android.exoplayer2.upstream.HttpDataSource.HttpDataSourceException {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.mo6350a(com.google.android.exoplayer2.upstream.DataSpec):long");
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.f14441o;
            if (inputStream != null) {
                long j2 = this.f14444r;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = j2 - this.f14445s;
                }
                m7448w(this.f14440n, j3);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    DataSpec dataSpec = this.f14439m;
                    int i2 = Util.f14736a;
                    throw new HttpDataSource.HttpDataSourceException(e2, dataSpec, 2000, 3);
                }
            }
        } finally {
            this.f14441o = null;
            m7449s();
            if (this.f14442p) {
                this.f14442p = false;
                m7428p();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.BaseDataSource, com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        HttpURLConnection httpURLConnection = this.f14440n;
        return httpURLConnection == null ? ImmutableMap.m11650l() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        HttpURLConnection httpURLConnection = this.f14440n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws HttpDataSource.HttpDataSourceException {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f14444r;
            if (j2 != -1) {
                long j3 = j2 - this.f14445s;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.f14441o;
            int i4 = Util.f14736a;
            int read = inputStream.read(bArr, i2, i3);
            if (read != -1) {
                this.f14445s += read;
                m7427o(read);
                return read;
            }
            return -1;
        } catch (IOException e2) {
            DataSpec dataSpec = this.f14439m;
            int i5 = Util.f14736a;
            throw HttpDataSource.HttpDataSourceException.m7464b(e2, dataSpec, 2);
        }
    }

    /* renamed from: s */
    public final void m7449s() {
        HttpURLConnection httpURLConnection = this.f14440n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.m7585b("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f14440n = null;
        }
    }

    /* renamed from: t */
    public final URL m7450t(URL url, @Nullable String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String valueOf = String.valueOf(protocol);
                throw new HttpDataSource.HttpDataSourceException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "), dataSpec, 2001, 1);
            }
            if (this.f14431e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder m4122u = C0576a.m4122u(protocol.length() + C0576a.m4106e(protocol2, 41), "Disallowed cross-protocol redirect (", protocol2, " to ", protocol);
            m4122u.append(")");
            throw new HttpDataSource.HttpDataSourceException(m4122u.toString(), dataSpec, 2001, 1);
        } catch (MalformedURLException e2) {
            throw new HttpDataSource.HttpDataSourceException(e2, dataSpec, 2001, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ad, code lost:
    
        return r0;
     */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.net.HttpURLConnection m7451u(com.google.android.exoplayer2.upstream.DataSpec r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.DefaultHttpDataSource.m7451u(com.google.android.exoplayer2.upstream.DataSpec):java.net.HttpURLConnection");
    }

    /* renamed from: v */
    public final HttpURLConnection m7452v(URL url, int i2, @Nullable byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f14432f);
        httpURLConnection.setReadTimeout(this.f14433g);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.f14435i;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.m7465a());
        }
        hashMap.putAll(this.f14436j.m7465a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String m7466a = HttpUtil.m7466a(j2, j3);
        if (m7466a != null) {
            httpURLConnection.setRequestProperty("Range", m7466a);
        }
        String str = this.f14434h;
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.m7433b(i2));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: x */
    public final void m7453x(long j2, DataSpec dataSpec) throws IOException {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j2 > 0) {
            int min = (int) Math.min(j2, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            InputStream inputStream = this.f14441o;
            int i2 = Util.f14736a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
            if (read == -1) {
                throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
            }
            j2 -= read;
            m7427o(read);
        }
    }

    public DefaultHttpDataSource(@Nullable String str, int i2, int i3, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable Predicate<String> predicate, boolean z2) {
        super(true);
        this.f14434h = str;
        this.f14432f = i2;
        this.f14433g = i3;
        this.f14431e = z;
        this.f14435i = requestProperties;
        this.f14438l = predicate;
        this.f14436j = new HttpDataSource.RequestProperties();
        this.f14437k = z2;
    }
}
