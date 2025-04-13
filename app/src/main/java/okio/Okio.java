package okio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"okio/Okio__JvmOkioKt", "okio/Okio__OkioKt"}, m31885k = 4, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class Okio {
    @NotNull
    /* renamed from: a */
    public static final Sink m34599a(@NotNull File appendingSink) throws FileNotFoundException {
        Logger logger = Okio__JvmOkioKt.f68773a;
        Intrinsics.m32179h(appendingSink, "$this$appendingSink");
        return new OutputStreamSink(new FileOutputStream(appendingSink, true), new Timeout());
    }

    @JvmName
    @NotNull
    /* renamed from: b */
    public static final Sink m34600b() {
        return new BlackholeSink();
    }

    @NotNull
    /* renamed from: c */
    public static final BufferedSink m34601c(@NotNull Sink buffer) {
        Intrinsics.m32179h(buffer, "$this$buffer");
        return new RealBufferedSink(buffer);
    }

    @NotNull
    /* renamed from: d */
    public static final BufferedSource m34602d(@NotNull Source buffer) {
        Intrinsics.m32179h(buffer, "$this$buffer");
        return new RealBufferedSource(buffer);
    }

    /* renamed from: e */
    public static final boolean m34603e(@NotNull AssertionError assertionError) {
        Logger logger = Okio__JvmOkioKt.f68773a;
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? StringsKt.m33922t(message, "getsockname failed", false, 2, null) : false;
    }

    @NotNull
    /* renamed from: f */
    public static final Sink m34604f(@NotNull Socket sink) throws IOException {
        Logger logger = Okio__JvmOkioKt.f68773a;
        Intrinsics.m32179h(sink, "$this$sink");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(sink);
        OutputStream outputStream = sink.getOutputStream();
        Intrinsics.m32178g(outputStream, "getOutputStream()");
        return socketAsyncTimeout.sink(new OutputStreamSink(outputStream, socketAsyncTimeout));
    }

    /* renamed from: g */
    public static Sink m34605g(File sink, boolean z, int i2, Object obj) throws FileNotFoundException {
        Logger logger = Okio__JvmOkioKt.f68773a;
        if ((i2 & 1) != 0) {
            z = false;
        }
        Intrinsics.m32179h(sink, "$this$sink");
        return new OutputStreamSink(new FileOutputStream(sink, z), new Timeout());
    }

    @NotNull
    /* renamed from: h */
    public static final Source m34606h(@NotNull File source) throws FileNotFoundException {
        Logger logger = Okio__JvmOkioKt.f68773a;
        Intrinsics.m32179h(source, "$this$source");
        return m34607i(new FileInputStream(source));
    }

    @NotNull
    /* renamed from: i */
    public static final Source m34607i(@NotNull InputStream source) {
        Logger logger = Okio__JvmOkioKt.f68773a;
        Intrinsics.m32179h(source, "$this$source");
        return new InputStreamSource(source, new Timeout());
    }

    @NotNull
    /* renamed from: j */
    public static final Source m34608j(@NotNull Socket source) throws IOException {
        Logger logger = Okio__JvmOkioKt.f68773a;
        Intrinsics.m32179h(source, "$this$source");
        SocketAsyncTimeout socketAsyncTimeout = new SocketAsyncTimeout(source);
        InputStream inputStream = source.getInputStream();
        Intrinsics.m32178g(inputStream, "getInputStream()");
        return socketAsyncTimeout.source(new InputStreamSource(inputStream, socketAsyncTimeout));
    }
}
