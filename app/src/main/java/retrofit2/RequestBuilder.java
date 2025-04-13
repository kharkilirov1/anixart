package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okio.BufferedSink;
import p000a.C0000a;

/* loaded from: classes3.dex */
final class RequestBuilder {

    /* renamed from: l */
    public static final char[] f69511l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    public static final Pattern f69512m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    public final String f69513a;

    /* renamed from: b */
    public final HttpUrl f69514b;

    /* renamed from: c */
    @Nullable
    public String f69515c;

    /* renamed from: d */
    @Nullable
    public HttpUrl.Builder f69516d;

    /* renamed from: e */
    public final Request.Builder f69517e = new Request.Builder();

    /* renamed from: f */
    public final Headers.Builder f69518f;

    /* renamed from: g */
    @Nullable
    public MediaType f69519g;

    /* renamed from: h */
    public final boolean f69520h;

    /* renamed from: i */
    @Nullable
    public MultipartBody.Builder f69521i;

    /* renamed from: j */
    @Nullable
    public FormBody.Builder f69522j;

    /* renamed from: k */
    @Nullable
    public RequestBody f69523k;

    public static class ContentTypeOverridingRequestBody extends RequestBody {

        /* renamed from: a */
        public final RequestBody f69524a;

        /* renamed from: b */
        public final MediaType f69525b;

        public ContentTypeOverridingRequestBody(RequestBody requestBody, MediaType mediaType) {
            this.f69524a = requestBody;
            this.f69525b = mediaType;
        }

        @Override // okhttp3.RequestBody
        public long contentLength() throws IOException {
            return this.f69524a.contentLength();
        }

        @Override // okhttp3.RequestBody
        /* renamed from: contentType */
        public MediaType getContentType() {
            return this.f69525b;
        }

        @Override // okhttp3.RequestBody
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f69524a.writeTo(bufferedSink);
        }
    }

    public RequestBuilder(String str, HttpUrl httpUrl, @Nullable String str2, @Nullable Headers headers, @Nullable MediaType mediaType, boolean z, boolean z2, boolean z3) {
        this.f69513a = str;
        this.f69514b = httpUrl;
        this.f69515c = str2;
        this.f69519g = mediaType;
        this.f69520h = z;
        if (headers != null) {
            this.f69518f = headers.newBuilder();
        } else {
            this.f69518f = new Headers.Builder();
        }
        if (z2) {
            this.f69522j = new FormBody.Builder();
        } else if (z3) {
            MultipartBody.Builder builder = new MultipartBody.Builder();
            this.f69521i = builder;
            builder.setType(MultipartBody.FORM);
        }
    }

    /* renamed from: a */
    public void m35027a(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f69518f.add(str, str2);
            return;
        }
        try {
            this.f69519g = MediaType.get(str2);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException(C0000a.m14k("Malformed content type: ", str2), e2);
        }
    }

    /* renamed from: b */
    public void m35028b(String str, @Nullable String str2, boolean z) {
        String str3 = this.f69515c;
        if (str3 != null) {
            HttpUrl.Builder newBuilder = this.f69514b.newBuilder(str3);
            this.f69516d = newBuilder;
            if (newBuilder == null) {
                StringBuilder m24u = C0000a.m24u("Malformed URL. Base: ");
                m24u.append(this.f69514b);
                m24u.append(", Relative: ");
                m24u.append(this.f69515c);
                throw new IllegalArgumentException(m24u.toString());
            }
            this.f69515c = null;
        }
        if (z) {
            this.f69516d.addEncodedQueryParameter(str, str2);
        } else {
            this.f69516d.addQueryParameter(str, str2);
        }
    }
}
