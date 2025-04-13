package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.C0932C;
import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class HttpMediaDrmCallback implements MediaDrmCallback {

    /* renamed from: a */
    public final HttpDataSource.Factory f10738a;

    /* renamed from: b */
    @Nullable
    public final String f10739b;

    /* renamed from: c */
    public final boolean f10740c;

    /* renamed from: d */
    public final Map<String, String> f10741d;

    public HttpMediaDrmCallback(@Nullable String str, boolean z, HttpDataSource.Factory factory) {
        Assertions.m7513a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f10738a = factory;
        this.f10739b = str;
        this.f10740c = z;
        this.f10741d = new HashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:15|16|17|(1:45)(1:21)|22|(1:42)|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        r4 = r3.f14458d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        if (r4 == 307) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if (r4 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        r11 = r11 + 1;
        r10 = r10.m7434a();
        r10.f14372a = android.net.Uri.parse(r5);
        r10 = r10.m7438a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005f, code lost:
    
        r5 = r4.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0044, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0034, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007f, code lost:
    
        r9 = com.google.android.exoplayer2.util.Util.f14736a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0081, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0084, code lost:
    
        throw r8;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m6328c(com.google.android.exoplayer2.upstream.HttpDataSource.Factory r8, java.lang.String r9, @androidx.annotation.Nullable byte[] r10, java.util.Map<java.lang.String, java.lang.String> r11) throws com.google.android.exoplayer2.drm.MediaDrmCallbackException {
        /*
            com.google.android.exoplayer2.upstream.StatsDataSource r0 = new com.google.android.exoplayer2.upstream.StatsDataSource
            com.google.android.exoplayer2.upstream.HttpDataSource r8 = r8.mo6355a()
            r0.<init>(r8)
            com.google.android.exoplayer2.upstream.DataSpec$Builder r8 = new com.google.android.exoplayer2.upstream.DataSpec$Builder
            r8.<init>()
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r8.f14372a = r9
            r8.f14376e = r11
            r9 = 2
            r8.f14374c = r9
            r8.f14375d = r10
            r9 = 1
            r8.f14380i = r9
            com.google.android.exoplayer2.upstream.DataSpec r2 = r8.m7438a()
            r8 = 0
            r10 = r2
            r11 = 0
        L25:
            com.google.android.exoplayer2.upstream.DataSourceInputStream r1 = new com.google.android.exoplayer2.upstream.DataSourceInputStream     // Catch: java.lang.Exception -> L85
            r1.<init>(r0, r10)     // Catch: java.lang.Exception -> L85
            byte[] r8 = com.google.android.exoplayer2.util.Util.m7729a0(r1)     // Catch: java.lang.Throwable -> L34 com.google.android.exoplayer2.upstream.HttpDataSource.InvalidResponseCodeException -> L36
            int r9 = com.google.android.exoplayer2.util.Util.f14736a     // Catch: java.lang.Exception -> L85
            r1.close()     // Catch: java.io.IOException -> L33 java.lang.Exception -> L85
        L33:
            return r8
        L34:
            r8 = move-exception
            goto L7f
        L36:
            r3 = move-exception
            int r4 = r3.f14458d     // Catch: java.lang.Throwable -> L34
            r5 = 307(0x133, float:4.3E-43)
            if (r4 == r5) goto L41
            r5 = 308(0x134, float:4.32E-43)
            if (r4 != r5) goto L46
        L41:
            r4 = 5
            if (r11 >= r4) goto L46
            r4 = 1
            goto L47
        L46:
            r4 = 0
        L47:
            r5 = 0
            if (r4 != 0) goto L4b
            goto L66
        L4b:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r4 = r3.f14459e     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L66
            java.lang.String r6 = "Location"
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L34
            java.util.List r4 = (java.util.List) r4     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L66
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r6 != 0) goto L66
            java.lang.Object r4 = r4.get(r8)     // Catch: java.lang.Throwable -> L34
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L34
        L66:
            if (r5 == 0) goto L7e
            int r11 = r11 + 1
            com.google.android.exoplayer2.upstream.DataSpec$Builder r10 = r10.m7434a()     // Catch: java.lang.Throwable -> L34
            android.net.Uri r3 = android.net.Uri.parse(r5)     // Catch: java.lang.Throwable -> L34
            r10.f14372a = r3     // Catch: java.lang.Throwable -> L34
            com.google.android.exoplayer2.upstream.DataSpec r10 = r10.m7438a()     // Catch: java.lang.Throwable -> L34
            int r3 = com.google.android.exoplayer2.util.Util.f14736a     // Catch: java.lang.Exception -> L85
            r1.close()     // Catch: java.io.IOException -> L25 java.lang.Exception -> L85
            goto L25
        L7e:
            throw r3     // Catch: java.lang.Throwable -> L34
        L7f:
            int r9 = com.google.android.exoplayer2.util.Util.f14736a     // Catch: java.lang.Exception -> L85
            r1.close()     // Catch: java.io.IOException -> L84 java.lang.Exception -> L85
        L84:
            throw r8     // Catch: java.lang.Exception -> L85
        L85:
            r8 = move-exception
            r7 = r8
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r8 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r3 = r0.f14522c
            java.util.Objects.requireNonNull(r3)
            java.util.Map r4 = r0.mo6351i()
            long r5 = r0.f14521b
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.HttpMediaDrmCallback.m6328c(com.google.android.exoplayer2.upstream.HttpDataSource$Factory, java.lang.String, byte[], java.util.Map):byte[]");
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    /* renamed from: a */
    public byte[] mo6329a(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) throws MediaDrmCallbackException {
        String str = keyRequest.f10727b;
        if (this.f10740c || TextUtils.isEmpty(str)) {
            str = this.f10739b;
        }
        if (TextUtils.isEmpty(str)) {
            DataSpec.Builder builder = new DataSpec.Builder();
            builder.f14372a = Uri.EMPTY;
            throw new MediaDrmCallbackException(builder.m7438a(), Uri.EMPTY, ImmutableMap.m11650l(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap hashMap = new HashMap();
        UUID uuid2 = C0932C.f9460e;
        hashMap.put("Content-Type", uuid2.equals(uuid) ? "text/xml" : C0932C.f9458c.equals(uuid) ? "application/json" : "application/octet-stream");
        if (uuid2.equals(uuid)) {
            hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f10741d) {
            hashMap.putAll(this.f10741d);
        }
        return m6328c(this.f10738a, str, keyRequest.f10726a, hashMap);
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    /* renamed from: b */
    public byte[] mo6330b(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) throws MediaDrmCallbackException {
        String str = provisionRequest.f10729b;
        String m7748q = Util.m7748q(provisionRequest.f10728a);
        return m6328c(this.f10738a, C0576a.m4115n(m7748q.length() + C0576a.m4106e(str, 15), str, "&signedRequest=", m7748q), null, Collections.emptyMap());
    }
}
