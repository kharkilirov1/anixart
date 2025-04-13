package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4700q;
import com.yandex.mobile.ads.embedded.guava.collect.C4693m0;
import com.yandex.mobile.ads.impl.InterfaceC4978dm;
import java.io.ByteArrayOutputStream;
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
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.mobile.ads.impl.sn */
/* loaded from: classes3.dex */
public class C5754sn extends AbstractC6022xd {

    /* renamed from: e */
    private final boolean f54765e;

    /* renamed from: f */
    private final int f54766f;

    /* renamed from: g */
    private final int f54767g;

    /* renamed from: h */
    @Nullable
    private final String f54768h;

    /* renamed from: i */
    @Nullable
    private final i00 f54769i;

    /* renamed from: j */
    private final i00 f54770j;

    /* renamed from: k */
    private final boolean f54771k;

    /* renamed from: l */
    @Nullable
    private ur0<String> f54772l;

    /* renamed from: m */
    @Nullable
    private HttpURLConnection f54773m;

    /* renamed from: n */
    @Nullable
    private InputStream f54774n;

    /* renamed from: o */
    private boolean f54775o;

    /* renamed from: p */
    private int f54776p;

    /* renamed from: q */
    private long f54777q;

    /* renamed from: r */
    private long f54778r;

    /* renamed from: com.yandex.mobile.ads.impl.sn$a */
    public static final class a implements InterfaceC4978dm.a {

        /* renamed from: b */
        @Nullable
        private String f54780b;

        /* renamed from: a */
        private final i00 f54779a = new i00();

        /* renamed from: c */
        private int f54781c = 8000;

        /* renamed from: d */
        private int f54782d = 8000;

        @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm.a
        /* renamed from: a */
        public final InterfaceC4978dm mo22497a() {
            return new C5754sn(this.f54780b, this.f54781c, this.f54782d, false, this.f54779a);
        }

        /* renamed from: b */
        public final a m28337b() {
            this.f54780b = null;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sn$b */
    public static class b extends AbstractC4688k<String, List<String>> {

        /* renamed from: a */
        private final Map<String, List<String>> f54783a;

        public b(Map<String, List<String>> map) {
            this.f54783a = map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ boolean m28338a(String str) {
            return str != null;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4690l
        /* renamed from: a */
        public final Map mo22037a() {
            return this.f54783a;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k
        /* renamed from: b */
        public final Map<String, List<String>> mo22034b() {
            return this.f54783a;
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k, java.util.Map
        public final boolean containsKey(@Nullable Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // java.util.Map
        public final boolean containsValue(@Nullable Object obj) {
            return m22033a(obj);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return C4693m0.m22042a(super.entrySet(), (ur0) xp1.f56519c);
        }

        @Override // java.util.Map
        public final boolean equals(@Nullable Object obj) {
            return obj != null && m22035b(obj);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k, java.util.Map
        @Nullable
        public final Object get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return m22036c();
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            return super.size() == 1 && super.containsKey(null);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k, java.util.Map
        public final Set<String> keySet() {
            return C4693m0.m22042a(super.keySet(), (ur0) xp1.f56520d);
        }

        @Override // com.yandex.mobile.ads.embedded.guava.collect.AbstractC4688k, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static /* synthetic */ boolean m28339a(Map.Entry entry) {
            return entry.getKey() != null;
        }
    }

    public C5754sn(@Nullable String str, int i2, int i3, boolean z, @Nullable i00 i00Var) {
        super(true);
        this.f54768h = str;
        this.f54766f = i2;
        this.f54767g = i3;
        this.f54765e = z;
        this.f54769i = i00Var;
        this.f54772l = null;
        this.f54770j = new i00();
        this.f54771k = false;
    }

    /* renamed from: g */
    private void m28336g() {
        HttpURLConnection httpURLConnection = this.f54773m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                d90.m23838a("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f54773m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: a */
    public final long mo22487a(C5192hm c5192hm) throws f00 {
        long j2 = 0;
        this.f54778r = 0L;
        this.f54777q = 0L;
        m29738b(c5192hm);
        try {
            HttpURLConnection m28335d = m28335d(c5192hm);
            this.f54773m = m28335d;
            this.f54776p = m28335d.getResponseCode();
            m28335d.getResponseMessage();
            int i2 = this.f54776p;
            if (i2 < 200 || i2 > 299) {
                Map<String, List<String>> headerFields = m28335d.getHeaderFields();
                if (this.f54776p == 416) {
                    if (c5192hm.f50972f == u00.m28812a(m28335d.getHeaderField("Content-Range"))) {
                        this.f54775o = true;
                        m29740c(c5192hm);
                        long j3 = c5192hm.f50973g;
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = m28335d.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i3 = s91.f54530a;
                        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int read = errorStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, read);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i4 = s91.f54530a;
                    }
                } catch (IOException unused) {
                    int i5 = s91.f54530a;
                }
                m28336g();
                throw new h00(this.f54776p, this.f54776p == 416 ? new C5035em(2008) : null, headerFields);
            }
            String contentType = m28335d.getContentType();
            ur0<String> ur0Var = this.f54772l;
            if (ur0Var != null && !ur0Var.apply(contentType)) {
                m28336g();
                throw new g00(contentType);
            }
            if (this.f54776p == 200) {
                long j4 = c5192hm.f50972f;
                if (j4 != 0) {
                    j2 = j4;
                }
            }
            boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(m28335d.getHeaderField("Content-Encoding"));
            if (equalsIgnoreCase) {
                this.f54777q = c5192hm.f50973g;
            } else {
                long j5 = c5192hm.f50973g;
                if (j5 != -1) {
                    this.f54777q = j5;
                } else {
                    long m28813a = u00.m28813a(m28335d.getHeaderField("Content-Length"), m28335d.getHeaderField("Content-Range"));
                    this.f54777q = m28813a != -1 ? m28813a - j2 : -1L;
                }
            }
            try {
                this.f54774n = m28335d.getInputStream();
                if (equalsIgnoreCase) {
                    this.f54774n = new GZIPInputStream(this.f54774n);
                }
                this.f54775o = true;
                m29740c(c5192hm);
                try {
                    m28333a(j2);
                    return this.f54777q;
                } catch (IOException e2) {
                    m28336g();
                    if (e2 instanceof f00) {
                        throw ((f00) e2);
                    }
                    throw new f00(e2, 2000, 1);
                }
            } catch (IOException e3) {
                m28336g();
                throw new f00(e3, 2000, 1);
            }
        } catch (IOException e4) {
            m28336g();
            throw f00.m24288a(e4, 1);
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC6022xd, com.yandex.mobile.ads.impl.InterfaceC4978dm
    /* renamed from: b */
    public final Map<String, List<String>> mo22489b() {
        HttpURLConnection httpURLConnection = this.f54773m;
        return httpURLConnection == null ? AbstractC4700q.m22063h() : new b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    public final void close() throws f00 {
        try {
            InputStream inputStream = this.f54774n;
            if (inputStream != null) {
                long j2 = this.f54777q;
                long j3 = -1;
                if (j2 != -1) {
                    j3 = j2 - this.f54778r;
                }
                m28334a(this.f54773m, j3);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    int i2 = s91.f54530a;
                    throw new f00(e2, 2000, 3);
                }
            }
        } finally {
            this.f54774n = null;
            m28336g();
            if (this.f54775o) {
                this.f54775o = false;
                m29741f();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4978dm
    @Nullable
    /* renamed from: d */
    public final Uri mo22490d() {
        HttpURLConnection httpURLConnection = this.f54773m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4815am
    public final int read(byte[] bArr, int i2, int i3) throws f00 {
        if (i3 == 0) {
            return 0;
        }
        try {
            long j2 = this.f54777q;
            if (j2 != -1) {
                long j3 = j2 - this.f54778r;
                if (j3 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j3);
            }
            InputStream inputStream = this.f54774n;
            int i4 = s91.f54530a;
            int read = inputStream.read(bArr, i2, i3);
            if (read == -1) {
                return -1;
            }
            this.f54778r += read;
            m29739c(read);
            return read;
        } catch (IOException e2) {
            int i5 = s91.f54530a;
            throw f00.m24288a(e2, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
    
        return r0;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection m28335d(com.yandex.mobile.ads.impl.C5192hm r26) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5754sn.m28335d(com.yandex.mobile.ads.impl.hm):java.net.HttpURLConnection");
    }

    /* renamed from: a */
    private HttpURLConnection m28331a(URL url, int i2, @Nullable byte[] bArr, long j2, long j3, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String sb;
        String str;
        HttpURLConnection mo26922a = mo26922a(url);
        mo26922a.setConnectTimeout(this.f54766f);
        mo26922a.setReadTimeout(this.f54767g);
        HashMap hashMap = new HashMap();
        i00 i00Var = this.f54769i;
        if (i00Var != null) {
            hashMap.putAll(i00Var.m25421a());
        }
        hashMap.putAll(this.f54770j.m25421a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            mo26922a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i3 = u00.f55316c;
        if (j2 == 0 && j3 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("bytes=");
            sb2.append(j2);
            sb2.append("-");
            if (j3 != -1) {
                sb2.append((j2 + j3) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            mo26922a.setRequestProperty("Range", sb);
        }
        String str2 = this.f54768h;
        if (str2 != null) {
            mo26922a.setRequestProperty("User-Agent", str2);
        }
        mo26922a.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        mo26922a.setInstanceFollowRedirects(z2);
        mo26922a.setDoOutput(bArr != null);
        int i4 = C5192hm.f50966k;
        if (i2 == 1) {
            str = "GET";
        } else if (i2 == 2) {
            str = "POST";
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        mo26922a.setRequestMethod(str);
        if (bArr != null) {
            mo26922a.setFixedLengthStreamingMode(bArr.length);
            mo26922a.connect();
            OutputStream outputStream = mo26922a.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            mo26922a.connect();
        }
        return mo26922a;
    }

    @VisibleForTesting
    /* renamed from: a */
    public HttpURLConnection mo26922a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    private URL m28332a(URL url, @Nullable String str) throws f00 {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new f00(um1.m29049a("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (this.f54765e || protocol.equals(url.getProtocol())) {
                    return url2;
                }
                StringBuilder m26356a = l60.m26356a("Disallowed cross-protocol redirect (");
                m26356a.append(url.getProtocol());
                m26356a.append(" to ");
                m26356a.append(protocol);
                m26356a.append(")");
                throw new f00(m26356a.toString(), 2001);
            } catch (MalformedURLException e2) {
                throw new f00(e2, 2001, 1);
            }
        }
        throw new f00("Null location redirect", 2001);
    }

    /* renamed from: a */
    private void m28333a(long j2) throws IOException {
        if (j2 == 0) {
            return;
        }
        byte[] bArr = new byte[RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT];
        while (j2 > 0) {
            int min = (int) Math.min(j2, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);
            InputStream inputStream = this.f54774n;
            int i2 = s91.f54530a;
            int read = inputStream.read(bArr, 0, min);
            if (Thread.currentThread().isInterrupted()) {
                throw new f00(new InterruptedIOException(), 2000, 1);
            }
            if (read != -1) {
                j2 -= read;
                m29739c(read);
            } else {
                throw new f00(2008);
            }
        }
    }

    /* renamed from: a */
    private static void m28334a(@Nullable HttpURLConnection httpURLConnection, long j2) {
        int i2;
        if (httpURLConnection == null || (i2 = s91.f54530a) < 19 || i2 > 20) {
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
}
