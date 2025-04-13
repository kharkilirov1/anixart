package retrofit2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import p000a.C0000a;
import retrofit2.RequestBuilder;

/* loaded from: classes3.dex */
final class OkHttpCall<T> implements Call<T> {

    /* renamed from: b */
    public final RequestFactory f69444b;

    /* renamed from: c */
    public final Object[] f69445c;

    /* renamed from: d */
    public final Call.Factory f69446d;

    /* renamed from: e */
    public final Converter<ResponseBody, T> f69447e;

    /* renamed from: f */
    public volatile boolean f69448f;

    /* renamed from: g */
    @GuardedBy
    @Nullable
    public okhttp3.Call f69449g;

    /* renamed from: h */
    @GuardedBy
    @Nullable
    public Throwable f69450h;

    /* renamed from: i */
    @GuardedBy
    public boolean f69451i;

    public static final class ExceptionCatchingResponseBody extends ResponseBody {

        /* renamed from: b */
        public final ResponseBody f69454b;

        /* renamed from: c */
        public final BufferedSource f69455c;

        /* renamed from: d */
        @Nullable
        public IOException f69456d;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.f69454b = responseBody;
            this.f69455c = Okio.m34602d(new ForwardingSource(responseBody.getSource()) { // from class: retrofit2.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // okio.ForwardingSource, okio.Source
                public long read(Buffer buffer, long j2) throws IOException {
                    try {
                        return super.read(buffer, j2);
                    } catch (IOException e2) {
                        ExceptionCatchingResponseBody.this.f69456d = e2;
                        throw e2;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f69454b.close();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.f69454b.getContentLength();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.f69454b.get$contentType();
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public BufferedSource getSource() {
            return this.f69455c;
        }
    }

    public static final class NoContentResponseBody extends ResponseBody {

        /* renamed from: b */
        @Nullable
        public final MediaType f69458b;

        /* renamed from: c */
        public final long f69459c;

        public NoContentResponseBody(@Nullable MediaType mediaType, long j2) {
            this.f69458b = mediaType;
            this.f69459c = j2;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentLength */
        public long getContentLength() {
            return this.f69459c;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: contentType */
        public MediaType get$contentType() {
            return this.f69458b;
        }

        @Override // okhttp3.ResponseBody
        /* renamed from: source */
        public BufferedSource getSource() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(RequestFactory requestFactory, Object[] objArr, Call.Factory factory, Converter<ResponseBody, T> converter) {
        this.f69444b = requestFactory;
        this.f69445c = objArr;
        this.f69446d = factory;
        this.f69447e = converter;
    }

    /* renamed from: a */
    public final okhttp3.Call m35021a() throws IOException {
        HttpUrl resolve;
        Call.Factory factory = this.f69446d;
        RequestFactory requestFactory = this.f69444b;
        Object[] objArr = this.f69445c;
        ParameterHandler<?>[] parameterHandlerArr = requestFactory.f69535j;
        int length = objArr.length;
        if (length != parameterHandlerArr.length) {
            throw new IllegalArgumentException(C0000a.m18o(C0000a.m25v("Argument count (", length, ") doesn't match expected count ("), parameterHandlerArr.length, ")"));
        }
        RequestBuilder requestBuilder = new RequestBuilder(requestFactory.f69528c, requestFactory.f69527b, requestFactory.f69529d, requestFactory.f69530e, requestFactory.f69531f, requestFactory.f69532g, requestFactory.f69533h, requestFactory.f69534i);
        if (requestFactory.f69536k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(objArr[i2]);
            parameterHandlerArr[i2].mo35024a(requestBuilder, objArr[i2]);
        }
        HttpUrl.Builder builder = requestBuilder.f69516d;
        if (builder != null) {
            resolve = builder.build();
        } else {
            resolve = requestBuilder.f69514b.resolve(requestBuilder.f69515c);
            if (resolve == null) {
                StringBuilder m24u = C0000a.m24u("Malformed URL. Base: ");
                m24u.append(requestBuilder.f69514b);
                m24u.append(", Relative: ");
                m24u.append(requestBuilder.f69515c);
                throw new IllegalArgumentException(m24u.toString());
            }
        }
        RequestBody requestBody = requestBuilder.f69523k;
        if (requestBody == null) {
            FormBody.Builder builder2 = requestBuilder.f69522j;
            if (builder2 != null) {
                requestBody = builder2.build();
            } else {
                MultipartBody.Builder builder3 = requestBuilder.f69521i;
                if (builder3 != null) {
                    requestBody = builder3.build();
                } else if (requestBuilder.f69520h) {
                    requestBody = RequestBody.create((MediaType) null, new byte[0]);
                }
            }
        }
        MediaType mediaType = requestBuilder.f69519g;
        if (mediaType != null) {
            if (requestBody != null) {
                requestBody = new RequestBuilder.ContentTypeOverridingRequestBody(requestBody, mediaType);
            } else {
                requestBuilder.f69518f.add("Content-Type", mediaType.getMediaType());
            }
        }
        okhttp3.Call newCall = factory.newCall(requestBuilder.f69517e.url(resolve).headers(requestBuilder.f69518f.build()).method(requestBuilder.f69513a, requestBody).tag(Invocation.class, new Invocation(requestFactory.f69526a, arrayList)).build());
        Objects.requireNonNull(newCall, "Call.Factory returned null.");
        return newCall;
    }

    @GuardedBy
    /* renamed from: b */
    public final okhttp3.Call m35022b() throws IOException {
        okhttp3.Call call = this.f69449g;
        if (call != null) {
            return call;
        }
        Throwable th = this.f69450h;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            okhttp3.Call m35021a = m35021a();
            this.f69449g = m35021a;
            return m35021a;
        } catch (IOException | Error | RuntimeException e2) {
            Utils.m35056o(e2);
            this.f69450h = e2;
            throw e2;
        }
    }

    /* renamed from: c */
    public Response<T> m35023c(okhttp3.Response response) throws IOException {
        ResponseBody body = response.body();
        okhttp3.Response build = response.newBuilder().body(new NoContentResponseBody(body.get$contentType(), body.getContentLength())).build();
        int code = build.code();
        if (code < 200 || code >= 300) {
            try {
                ResponseBody m35042a = Utils.m35042a(body);
                Objects.requireNonNull(m35042a, "body == null");
                if (build.isSuccessful()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new Response<>(build, null, m35042a);
            } finally {
                body.close();
            }
        }
        if (code == 204 || code == 205) {
            body.close();
            return Response.m35032b(null, build);
        }
        ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
        try {
            return Response.m35032b(this.f69447e.convert(exceptionCatchingResponseBody), build);
        } catch (RuntimeException e2) {
            IOException iOException = exceptionCatchingResponseBody.f69456d;
            if (iOException == null) {
                throw e2;
            }
            throw iOException;
        }
    }

    @Override // retrofit2.Call
    public void cancel() {
        okhttp3.Call call;
        this.f69448f = true;
        synchronized (this) {
            call = this.f69449g;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new OkHttpCall(this.f69444b, this.f69445c, this.f69446d, this.f69447e);
    }

    @Override // retrofit2.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call m35022b;
        synchronized (this) {
            if (this.f69451i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f69451i = true;
            m35022b = m35022b();
        }
        if (this.f69448f) {
            m35022b.cancel();
        }
        return m35023c(m35022b.execute());
    }

    @Override // retrofit2.Call
    public boolean isCanceled() {
        boolean z = true;
        if (this.f69448f) {
            return true;
        }
        synchronized (this) {
            okhttp3.Call call = this.f69449g;
            if (call == null || !call.getCanceled()) {
                z = false;
            }
        }
        return z;
    }

    @Override // retrofit2.Call
    /* renamed from: o0 */
    public void mo35010o0(final Callback<T> callback) {
        okhttp3.Call call;
        Throwable th;
        synchronized (this) {
            if (this.f69451i) {
                throw new IllegalStateException("Already executed.");
            }
            this.f69451i = true;
            call = this.f69449g;
            th = this.f69450h;
            if (call == null && th == null) {
                try {
                    okhttp3.Call m35021a = m35021a();
                    this.f69449g = m35021a;
                    call = m35021a;
                } catch (Throwable th2) {
                    th = th2;
                    Utils.m35056o(th);
                    this.f69450h = th;
                }
            }
        }
        if (th != null) {
            callback.mo35016a(this, th);
            return;
        }
        if (this.f69448f) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback() { // from class: retrofit2.OkHttpCall.1
            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                try {
                    callback.mo35016a(OkHttpCall.this, iOException);
                } catch (Throwable th3) {
                    Utils.m35056o(th3);
                    th3.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.mo35017b(OkHttpCall.this, OkHttpCall.this.m35023c(response));
                    } catch (Throwable th3) {
                        Utils.m35056o(th3);
                        th3.printStackTrace();
                    }
                } catch (Throwable th4) {
                    Utils.m35056o(th4);
                    try {
                        callback.mo35016a(OkHttpCall.this, th4);
                    } catch (Throwable th5) {
                        Utils.m35056o(th5);
                        th5.printStackTrace();
                    }
                }
            }
        });
    }

    @Override // retrofit2.Call
    public synchronized Request request() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return m35022b().request();
    }

    @Override // retrofit2.Call
    public Call clone() {
        return new OkHttpCall(this.f69444b, this.f69445c, this.f69446d, this.f69447e);
    }
}
