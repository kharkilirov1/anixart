package okhttp3.internal.cache2;

import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileOperator.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m31884d2 = {"Lokhttp3/internal/cache2/FileOperator;", "", "fileChannel", "Ljava/nio/channels/FileChannel;", "(Ljava/nio/channels/FileChannel;)V", "read", "", "pos", "", "sink", "Lokio/Buffer;", "byteCount", "write", "source", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(@NotNull FileChannel fileChannel) {
        Intrinsics.m32179h(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long pos, @NotNull Buffer sink, long byteCount) {
        Intrinsics.m32179h(sink, "sink");
        if (byteCount < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (byteCount > 0) {
            long transferTo = this.fileChannel.transferTo(pos, byteCount, sink);
            pos += transferTo;
            byteCount -= transferTo;
        }
    }

    public final void write(long pos, @NotNull Buffer source, long byteCount) throws IOException {
        Intrinsics.m32179h(source, "source");
        if (byteCount < 0 || byteCount > source.f68742c) {
            throw new IndexOutOfBoundsException();
        }
        long j2 = pos;
        long j3 = byteCount;
        while (j3 > 0) {
            long transferFrom = this.fileChannel.transferFrom(source, j2, j3);
            j2 += transferFrom;
            j3 -= transferFrom;
        }
    }
}
