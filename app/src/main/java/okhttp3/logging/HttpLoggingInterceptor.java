package okhttp3.logging;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p033io.CloseableKt;
import kotlin.text.StringsKt;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: HttpLoggingInterceptor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u001e\u001fB\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\r\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0002\b\u0012J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\n\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006 "}, m31884d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "headersToRedact", "", "", "<set-?>", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "getLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "bodyHasUnknownEncoding", "", "headers", "Lokhttp3/Headers;", "-deprecated_level", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "logHeader", "", "i", "", "redactHeader", "name", "setLevel", "Level", "Logger", "okhttp-logging-interceptor"}, m31885k = 1, m31886mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class HttpLoggingInterceptor implements Interceptor {
    private volatile Set<String> headersToRedact;

    @NotNull
    private volatile Level level;
    private final Logger logger;

    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m31884d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, m31885k = 1, m31886mv = {1, 1, 16})
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0007"}, m31884d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "Companion", "okhttp-logging-interceptor"}, m31885k = 1, m31886mv = {1, 1, 16})
    public interface Logger {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        @NotNull
        public static final Logger DEFAULT = new Logger() { // from class: okhttp3.logging.HttpLoggingInterceptor$Logger$Companion$DEFAULT$1
            @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
            public void log(@NotNull String message) {
                Intrinsics.m32180i(message, "message");
                Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
            }
        };

        /* compiled from: HttpLoggingInterceptor.kt */
        @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0005"}, m31884d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "()V", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "okhttp-logging-interceptor"}, m31885k = 1, m31886mv = {1, 1, 16})
        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = null;

            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        void log(@NotNull String message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull Logger logger) {
        Intrinsics.m32180i(logger, "logger");
        this.logger = logger;
        this.headersToRedact = EmptySet.f63146b;
        this.level = Level.NONE;
    }

    private final boolean bodyHasUnknownEncoding(Headers headers) {
        String str = headers.get("Content-Encoding");
        return (str == null || StringsKt.m33927y(str, "identity", true) || StringsKt.m33927y(str, "gzip", true)) ? false : true;
    }

    private final void logHeader(Headers headers, int i2) {
        String value = this.headersToRedact.contains(headers.name(i2)) ? "██" : headers.value(i2);
        this.logger.log(headers.name(i2) + ": " + value);
    }

    @Deprecated
    @JvmName
    @NotNull
    /* renamed from: -deprecated_level, reason: not valid java name and from getter */
    public final Level getLevel() {
        return this.level;
    }

    @NotNull
    public final Level getLevel() {
        return this.level;
    }

    @Override // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Interceptor.Chain chain) throws IOException {
        String str;
        String str2;
        String sb;
        Long l2;
        Charset UTF_8;
        Charset UTF_82;
        Intrinsics.m32180i(chain, "chain");
        Level level = this.level;
        Request request = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(request);
        }
        boolean z = level == Level.BODY;
        boolean z2 = z || level == Level.HEADERS;
        RequestBody body = request.body();
        Connection connection = chain.connection();
        StringBuilder m24u = C0000a.m24u("--> ");
        m24u.append(request.method());
        m24u.append(' ');
        m24u.append(request.url());
        if (connection != null) {
            StringBuilder m24u2 = C0000a.m24u(" ");
            m24u2.append(connection.protocol());
            str = m24u2.toString();
        } else {
            str = "";
        }
        m24u.append(str);
        String sb2 = m24u.toString();
        if (!z2 && body != null) {
            StringBuilder m27x = C0000a.m27x(sb2, " (");
            m27x.append(body.contentLength());
            m27x.append("-byte body)");
            sb2 = m27x.toString();
        }
        this.logger.log(sb2);
        if (z2) {
            Headers headers = request.headers();
            if (body != null) {
                MediaType contentType = body.getContentType();
                if (contentType != null && headers.get("Content-Type") == null) {
                    this.logger.log("Content-Type: " + contentType);
                }
                if (body.contentLength() != -1 && headers.get("Content-Length") == null) {
                    Logger logger = this.logger;
                    StringBuilder m24u3 = C0000a.m24u("Content-Length: ");
                    m24u3.append(body.contentLength());
                    logger.log(m24u3.toString());
                }
            }
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                logHeader(headers, i2);
            }
            if (!z || body == null) {
                Logger logger2 = this.logger;
                StringBuilder m24u4 = C0000a.m24u("--> END ");
                m24u4.append(request.method());
                logger2.log(m24u4.toString());
            } else if (bodyHasUnknownEncoding(request.headers())) {
                Logger logger3 = this.logger;
                StringBuilder m24u5 = C0000a.m24u("--> END ");
                m24u5.append(request.method());
                m24u5.append(" (encoded body omitted)");
                logger3.log(m24u5.toString());
            } else if (body.isDuplex()) {
                Logger logger4 = this.logger;
                StringBuilder m24u6 = C0000a.m24u("--> END ");
                m24u6.append(request.method());
                m24u6.append(" (duplex request body omitted)");
                logger4.log(m24u6.toString());
            } else if (body.isOneShot()) {
                Logger logger5 = this.logger;
                StringBuilder m24u7 = C0000a.m24u("--> END ");
                m24u7.append(request.method());
                m24u7.append(" (one-shot body omitted)");
                logger5.log(m24u7.toString());
            } else {
                Buffer buffer = new Buffer();
                body.writeTo(buffer);
                MediaType contentType2 = body.getContentType();
                if (contentType2 == null || (UTF_82 = contentType2.charset(StandardCharsets.UTF_8)) == null) {
                    UTF_82 = StandardCharsets.UTF_8;
                    Intrinsics.m32175d(UTF_82, "UTF_8");
                }
                this.logger.log("");
                if (Utf8Kt.isProbablyUtf8(buffer)) {
                    this.logger.log(buffer.mo34564t0(UTF_82));
                    Logger logger6 = this.logger;
                    StringBuilder m24u8 = C0000a.m24u("--> END ");
                    m24u8.append(request.method());
                    m24u8.append(" (");
                    m24u8.append(body.contentLength());
                    m24u8.append("-byte body)");
                    logger6.log(m24u8.toString());
                } else {
                    Logger logger7 = this.logger;
                    StringBuilder m24u9 = C0000a.m24u("--> END ");
                    m24u9.append(request.method());
                    m24u9.append(" (binary ");
                    m24u9.append(body.contentLength());
                    m24u9.append("-byte body omitted)");
                    logger7.log(m24u9.toString());
                }
            }
        }
        long nanoTime = System.nanoTime();
        try {
            Response proceed = chain.proceed(request);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ResponseBody body2 = proceed.body();
            if (body2 == null) {
                Intrinsics.m32188q();
                throw null;
            }
            long contentLength = body2.getContentLength();
            String str3 = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            Logger logger8 = this.logger;
            StringBuilder m24u10 = C0000a.m24u("<-- ");
            m24u10.append(proceed.code());
            if (proceed.message().length() == 0) {
                str2 = "-byte body omitted)";
                sb = "";
            } else {
                String message = proceed.message();
                StringBuilder sb3 = new StringBuilder();
                str2 = "-byte body omitted)";
                sb3.append(String.valueOf(' '));
                sb3.append(message);
                sb = sb3.toString();
            }
            m24u10.append(sb);
            m24u10.append(' ');
            m24u10.append(proceed.request().url());
            m24u10.append(" (");
            m24u10.append(millis);
            m24u10.append("ms");
            m24u10.append(!z2 ? C0000a.m16m(", ", str3, " body") : "");
            m24u10.append(')');
            logger8.log(m24u10.toString());
            if (z2) {
                Headers headers2 = proceed.headers();
                int size2 = headers2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    logHeader(headers2, i3);
                }
                if (!z || !HttpHeaders.promisesBody(proceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (bodyHasUnknownEncoding(proceed.headers())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource bodySource = body2.getBodySource();
                    bodySource.request(Long.MAX_VALUE);
                    Buffer f68789b = bodySource.getF68789b();
                    if (StringsKt.m33927y("gzip", headers2.get("Content-Encoding"), true)) {
                        l2 = Long.valueOf(f68789b.f68742c);
                        GzipSource gzipSource = new GzipSource(f68789b.clone());
                        try {
                            f68789b = new Buffer();
                            f68789b.mo34569z0(gzipSource);
                            CloseableKt.m32138a(gzipSource, null);
                        } finally {
                        }
                    } else {
                        l2 = null;
                    }
                    MediaType mediaType = body2.get$contentType();
                    if (mediaType == null || (UTF_8 = mediaType.charset(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        Intrinsics.m32175d(UTF_8, "UTF_8");
                    }
                    if (!Utf8Kt.isProbablyUtf8(f68789b)) {
                        this.logger.log("");
                        Logger logger9 = this.logger;
                        StringBuilder m24u11 = C0000a.m24u("<-- END HTTP (binary ");
                        m24u11.append(f68789b.f68742c);
                        m24u11.append(str2);
                        logger9.log(m24u11.toString());
                        return proceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(f68789b.clone().mo34564t0(UTF_8));
                    }
                    if (l2 != null) {
                        Logger logger10 = this.logger;
                        StringBuilder m24u12 = C0000a.m24u("<-- END HTTP (");
                        m24u12.append(f68789b.f68742c);
                        m24u12.append("-byte, ");
                        m24u12.append(l2);
                        m24u12.append("-gzipped-byte body)");
                        logger10.log(m24u12.toString());
                    } else {
                        Logger logger11 = this.logger;
                        StringBuilder m24u13 = C0000a.m24u("<-- END HTTP (");
                        m24u13.append(f68789b.f68742c);
                        m24u13.append("-byte body)");
                        logger11.log(m24u13.toString());
                    }
                }
            }
            return proceed;
        } catch (Exception e2) {
            this.logger.log("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    @JvmName
    public final void level(@NotNull Level level) {
        Intrinsics.m32180i(level, "<set-?>");
        this.level = level;
    }

    public final void redactHeader(@NotNull String name) {
        Intrinsics.m32180i(name, "name");
        StringsKt.m33875A(StringCompanionObject.f63355a);
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        CollectionsKt.m32020g(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level level) {
        Intrinsics.m32180i(level, "level");
        this.level = level;
        return this;
    }

    public /* synthetic */ HttpLoggingInterceptor(Logger logger, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Logger.DEFAULT : logger);
    }
}
