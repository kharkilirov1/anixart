package okio;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Source.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/Source;", "Ljava/io/Closeable;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface Source extends Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    long read(@NotNull Buffer buffer, long j2) throws IOException;

    @NotNull
    Timeout timeout();
}
