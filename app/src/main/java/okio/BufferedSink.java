package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferedSink.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface BufferedSink extends Sink, WritableByteChannel {
    @NotNull
    /* renamed from: A0 */
    BufferedSink mo34514A0(long j2) throws IOException;

    @Deprecated
    @NotNull
    /* renamed from: F */
    Buffer mo34517F();

    @NotNull
    /* renamed from: J */
    BufferedSink mo34519J() throws IOException;

    @NotNull
    /* renamed from: T0 */
    BufferedSink mo34528T0(@NotNull ByteString byteString) throws IOException;

    @NotNull
    /* renamed from: f0 */
    BufferedSink mo34541f0() throws IOException;

    @Override // okio.Sink, java.io.Flushable
    void flush() throws IOException;

    @NotNull
    /* renamed from: g1 */
    BufferedSink mo34544g1(long j2) throws IOException;

    @NotNull
    /* renamed from: i1 */
    OutputStream mo34548i1();

    @NotNull
    /* renamed from: p0 */
    BufferedSink mo34559p0(@NotNull String str) throws IOException;

    @NotNull
    /* renamed from: s */
    Buffer mo34562s();

    @NotNull
    BufferedSink write(@NotNull byte[] bArr) throws IOException;

    @NotNull
    BufferedSink write(@NotNull byte[] bArr, int i2, int i3) throws IOException;

    @NotNull
    BufferedSink writeByte(int i2) throws IOException;

    @NotNull
    BufferedSink writeInt(int i2) throws IOException;

    @NotNull
    BufferedSink writeShort(int i2) throws IOException;

    /* renamed from: z0 */
    long mo34569z0(@NotNull Source source) throws IOException;
}
