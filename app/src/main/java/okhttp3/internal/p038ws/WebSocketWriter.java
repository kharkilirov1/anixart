package okhttp3.internal.p038ws;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketWriter.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!J\u0018\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020!H\u0002J\u0016\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020!J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!J\u000e\u0010)\u001a\u00020\u001c2\u0006\u0010$\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006*"}, m31884d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "isClient", "", "sink", "Lokio/BufferedSink;", "random", "Ljava/util/Random;", "perMessageDeflate", "noContextTakeover", "minimumDeflateSize", "", "(ZLokio/BufferedSink;Ljava/util/Random;ZZJ)V", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "messageBuffer", "Lokio/Buffer;", "messageDeflater", "Lokhttp3/internal/ws/MessageDeflater;", "getRandom", "()Ljava/util/Random;", "getSink", "()Lokio/BufferedSink;", "sinkBuffer", "writerClosed", "close", "", "writeClose", "code", "", "reason", "Lokio/ByteString;", "writeControlFrame", "opcode", "payload", "writeMessageFrame", "formatOpcode", "data", "writePing", "writePong", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class WebSocketWriter implements Closeable {
    private final boolean isClient;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageBuffer;
    private MessageDeflater messageDeflater;
    private final long minimumDeflateSize;
    private final boolean noContextTakeover;
    private final boolean perMessageDeflate;

    @NotNull
    private final Random random;

    @NotNull
    private final BufferedSink sink;
    private final Buffer sinkBuffer;
    private boolean writerClosed;

    public WebSocketWriter(boolean z, @NotNull BufferedSink sink, @NotNull Random random, boolean z2, boolean z3, long j2) {
        Intrinsics.m32179h(sink, "sink");
        Intrinsics.m32179h(random, "random");
        this.isClient = z;
        this.sink = sink;
        this.random = random;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.minimumDeflateSize = j2;
        this.messageBuffer = new Buffer();
        this.sinkBuffer = sink.getF68789b();
        this.maskKey = z ? new byte[4] : null;
        this.maskCursor = z ? new Buffer.UnsafeCursor() : null;
    }

    private final void writeControlFrame(int opcode, ByteString payload) throws IOException {
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        int mo34576d = payload.mo34576d();
        if (!(((long) mo34576d) <= 125)) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125".toString());
        }
        this.sinkBuffer.m34524Q(opcode | 128);
        if (this.isClient) {
            this.sinkBuffer.m34524Q(mo34576d | 128);
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.m32176e(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.m34567w(this.maskKey);
            if (mo34576d > 0) {
                Buffer buffer = this.sinkBuffer;
                long j2 = buffer.f68742c;
                buffer.m34566v(payload);
                Buffer buffer2 = this.sinkBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                Intrinsics.m32176e(unsafeCursor);
                buffer2.m34549j(unsafeCursor);
                this.maskCursor.m34571b(j2);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        } else {
            this.sinkBuffer.m34524Q(mo34576d);
            this.sinkBuffer.m34566v(payload);
        }
        this.sink.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        MessageDeflater messageDeflater = this.messageDeflater;
        if (messageDeflater != null) {
            messageDeflater.close();
        }
    }

    @NotNull
    public final Random getRandom() {
        return this.random;
    }

    @NotNull
    public final BufferedSink getSink() {
        return this.sink;
    }

    public final void writeClose(int code, @Nullable ByteString reason) throws IOException {
        ByteString byteString = ByteString.f68752e;
        if (code != 0 || reason != null) {
            if (code != 0) {
                WebSocketProtocol.INSTANCE.validateCloseCode(code);
            }
            Buffer buffer = new Buffer();
            buffer.m34556n0(code);
            if (reason != null) {
                buffer.m34566v(reason);
            }
            byteString = buffer.mo34515B0();
        }
        try {
            writeControlFrame(8, byteString);
        } finally {
            this.writerClosed = true;
        }
    }

    public final void writeMessageFrame(int formatOpcode, @NotNull ByteString data) throws IOException {
        Intrinsics.m32179h(data, "data");
        if (this.writerClosed) {
            throw new IOException("closed");
        }
        this.messageBuffer.m34566v(data);
        int i2 = formatOpcode | 128;
        if (this.perMessageDeflate && data.mo34576d() >= this.minimumDeflateSize) {
            MessageDeflater messageDeflater = this.messageDeflater;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.noContextTakeover);
                this.messageDeflater = messageDeflater;
            }
            messageDeflater.deflate(this.messageBuffer);
            i2 |= 64;
        }
        long j2 = this.messageBuffer.f68742c;
        this.sinkBuffer.m34524Q(i2);
        int i3 = this.isClient ? 128 : 0;
        if (j2 <= 125) {
            this.sinkBuffer.m34524Q(((int) j2) | i3);
        } else if (j2 <= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            this.sinkBuffer.m34524Q(i3 | 126);
            this.sinkBuffer.m34556n0((int) j2);
        } else {
            this.sinkBuffer.m34524Q(i3 | 127);
            this.sinkBuffer.m34538d0(j2);
        }
        if (this.isClient) {
            Random random = this.random;
            byte[] bArr = this.maskKey;
            Intrinsics.m32176e(bArr);
            random.nextBytes(bArr);
            this.sinkBuffer.m34567w(this.maskKey);
            if (j2 > 0) {
                Buffer buffer = this.messageBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                Intrinsics.m32176e(unsafeCursor);
                buffer.m34549j(unsafeCursor);
                this.maskCursor.m34571b(0L);
                WebSocketProtocol.INSTANCE.toggleMask(this.maskCursor, this.maskKey);
                this.maskCursor.close();
            }
        }
        this.sinkBuffer.write(this.messageBuffer, j2);
        this.sink.mo34519J();
    }

    public final void writePing(@NotNull ByteString payload) throws IOException {
        Intrinsics.m32179h(payload, "payload");
        writeControlFrame(9, payload);
    }

    public final void writePong(@NotNull ByteString payload) throws IOException {
        Intrinsics.m32179h(payload, "payload");
        writeControlFrame(10, payload);
    }
}
