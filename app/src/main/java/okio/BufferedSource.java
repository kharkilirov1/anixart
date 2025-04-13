package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: BufferedSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public interface BufferedSource extends Source, ReadableByteChannel {
    @NotNull
    /* renamed from: B0 */
    ByteString mo34515B0() throws IOException;

    @NotNull
    /* renamed from: G */
    ByteString mo34518G(long j2) throws IOException;

    @NotNull
    /* renamed from: M0 */
    String mo34520M0() throws IOException;

    @NotNull
    /* renamed from: P0 */
    byte[] mo34523P0(long j2) throws IOException;

    @NotNull
    /* renamed from: T */
    byte[] mo34527T() throws IOException;

    /* renamed from: V */
    boolean mo34529V() throws IOException;

    /* renamed from: X0 */
    long mo34531X0(@NotNull Sink sink) throws IOException;

    /* renamed from: c0 */
    void mo34536c0(@NotNull Buffer buffer, long j2) throws IOException;

    /* renamed from: c1 */
    void mo34537c1(long j2) throws IOException;

    /* renamed from: e0 */
    long mo34540e0(@NotNull ByteString byteString) throws IOException;

    /* renamed from: g0 */
    long mo34543g0() throws IOException;

    @NotNull
    /* renamed from: h0 */
    String mo34546h0(long j2) throws IOException;

    /* renamed from: k1 */
    long mo34551k1() throws IOException;

    /* renamed from: m1 */
    int mo34554m1(@NotNull Options options) throws IOException;

    @NotNull
    BufferedSource peek();

    /* renamed from: r0 */
    boolean mo34561r0(long j2, @NotNull ByteString byteString) throws IOException;

    byte readByte() throws IOException;

    void readFully(@NotNull byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j2) throws IOException;

    @NotNull
    /* renamed from: s */
    Buffer mo34562s();

    void skip(long j2) throws IOException;

    @NotNull
    /* renamed from: t0 */
    String mo34564t0(@NotNull Charset charset) throws IOException;

    @NotNull
    /* renamed from: x */
    InputStream mo34568x();
}
