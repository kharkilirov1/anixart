package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface HttpDataSource extends DataSource {

    public static abstract class BaseFactory implements Factory {

        /* renamed from: a */
        public final RequestProperties f14457a = new RequestProperties();

        /* renamed from: b */
        public abstract HttpDataSource mo6356b(RequestProperties requestProperties);

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        public final HttpDataSource mo6355a() {
            return mo6356b(this.f14457a);
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    public interface Factory extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        /* renamed from: a */
        HttpDataSource mo6355a();
    }

    public static class HttpDataSourceException extends DataSourceException {

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException(DataSpec dataSpec, int i2, int i3) {
            super(m7463a(i2, i3));
        }

        /* renamed from: a */
        public static int m7463a(int i2, int i3) {
            if (i2 == 2000 && i3 == 1) {
                return 2001;
            }
            return i2;
        }

        /* renamed from: b */
        public static HttpDataSourceException m7464b(IOException iOException, DataSpec dataSpec, int i2) {
            String message = iOException.getMessage();
            int i3 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !Ascii.m11123c(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i3 == 2007 ? new CleartextNotPermittedException(iOException, dataSpec) : new HttpDataSourceException(iOException, dataSpec, i3, i2);
        }

        public HttpDataSourceException(String str, DataSpec dataSpec, int i2, int i3) {
            super(str, m7463a(i2, i3));
        }

        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i2, int i3) {
            super(iOException, m7463a(i2, i3));
        }

        public HttpDataSourceException(String str, @Nullable IOException iOException, DataSpec dataSpec, int i2, int i3) {
            super(str, iOException, m7463a(i2, i3));
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InvalidContentTypeException(java.lang.String r3, com.google.android.exoplayer2.upstream.DataSpec r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "Invalid content type: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r0 = 2003(0x7d3, float:2.807E-42)
                r1 = 1
                r2.<init>(r3, r4, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.HttpDataSource.InvalidContentTypeException.<init>(java.lang.String, com.google.android.exoplayer2.upstream.DataSpec):void");
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* renamed from: d */
        public final int f14458d;

        /* renamed from: e */
        public final Map<String, List<String>> f14459e;

        public InvalidResponseCodeException(int i2, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super(C0576a.m4111j(26, "Response code: ", i2), iOException, dataSpec, 2004, 1);
            this.f14458d = i2;
            this.f14459e = map;
        }
    }

    public static final class RequestProperties {

        /* renamed from: a */
        public final Map<String, String> f14460a = new HashMap();

        /* renamed from: b */
        @Nullable
        public Map<String, String> f14461b;

        /* renamed from: a */
        public synchronized Map<String, String> m7465a() {
            if (this.f14461b == null) {
                this.f14461b = Collections.unmodifiableMap(new HashMap(this.f14460a));
            }
            return this.f14461b;
        }
    }
}
