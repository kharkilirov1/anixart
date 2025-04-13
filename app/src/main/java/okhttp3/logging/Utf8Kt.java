package okhttp3.logging;

import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* compiled from: utf8.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m31884d2 = {"isProbablyUtf8", "", "Lokio/Buffer;", "okhttp-logging-interceptor"}, m31885k = 2, m31886mv = {1, 1, 16})
/* loaded from: classes3.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(@NotNull Buffer isProbablyUtf8) {
        Intrinsics.m32180i(isProbablyUtf8, "$this$isProbablyUtf8");
        try {
            Buffer buffer = new Buffer();
            isProbablyUtf8.m34535c(buffer, 0L, RangesKt.m32237d(isProbablyUtf8.f68742c, 64L));
            for (int i2 = 0; i2 < 16; i2++) {
                if (buffer.mo34529V()) {
                    return true;
                }
                int m34557o = buffer.m34557o();
                if (Character.isISOControl(m34557o) && !Character.isWhitespace(m34557o)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
