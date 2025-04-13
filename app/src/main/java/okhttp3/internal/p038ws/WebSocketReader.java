package okhttp3.internal.p038ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Settings;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: WebSocketReader.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u001fH\u0002J\b\u0010\"\u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001fH\u0002J\b\u0010$\u001a\u00020\u001fH\u0002J\b\u0010%\u001a\u00020\u001fH\u0002R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006'"}, m31884d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "isClient", "", "source", "Lokio/BufferedSource;", "frameCallback", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "perMessageDeflate", "noContextTakeover", "(ZLokio/BufferedSource;Lokhttp3/internal/ws/WebSocketReader$FrameCallback;ZZ)V", "closed", "controlFrameBuffer", "Lokio/Buffer;", "frameLength", "", "isControlFrame", "isFinalFrame", "maskCursor", "Lokio/Buffer$UnsafeCursor;", "maskKey", "", "messageFrameBuffer", "messageInflater", "Lokhttp3/internal/ws/MessageInflater;", "opcode", "", "readingCompressedMessage", "getSource", "()Lokio/BufferedSource;", "close", "", "processNextFrame", "readControlFrame", "readHeader", "readMessage", "readMessageFrame", "readUntilNonControlFrame", "FrameCallback", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class WebSocketReader implements Closeable {
    private boolean closed;
    private final Buffer controlFrameBuffer;
    private final FrameCallback frameCallback;
    private long frameLength;
    private final boolean isClient;
    private boolean isControlFrame;
    private boolean isFinalFrame;
    private final Buffer.UnsafeCursor maskCursor;
    private final byte[] maskKey;
    private final Buffer messageFrameBuffer;
    private MessageInflater messageInflater;
    private final boolean noContextTakeover;
    private int opcode;
    private final boolean perMessageDeflate;
    private boolean readingCompressedMessage;

    @NotNull
    private final BufferedSource source;

    /* compiled from: WebSocketReader.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000bH&¨\u0006\u000f"}, m31884d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "onReadClose", "", "code", "", "reason", "", "onReadMessage", "text", "bytes", "Lokio/ByteString;", "onReadPing", "payload", "onReadPong", "okhttp"}, m31885k = 1, m31886mv = {1, 4, 0})
    public interface FrameCallback {
        void onReadClose(int code, @NotNull String reason);

        void onReadMessage(@NotNull String text) throws IOException;

        void onReadMessage(@NotNull ByteString bytes) throws IOException;

        void onReadPing(@NotNull ByteString payload);

        void onReadPong(@NotNull ByteString payload);
    }

    public WebSocketReader(boolean z, @NotNull BufferedSource source, @NotNull FrameCallback frameCallback, boolean z2, boolean z3) {
        Intrinsics.m32179h(source, "source");
        Intrinsics.m32179h(frameCallback, "frameCallback");
        this.isClient = z;
        this.source = source;
        this.frameCallback = frameCallback;
        this.perMessageDeflate = z2;
        this.noContextTakeover = z3;
        this.controlFrameBuffer = new Buffer();
        this.messageFrameBuffer = new Buffer();
        this.maskKey = z ? null : new byte[4];
        this.maskCursor = z ? null : new Buffer.UnsafeCursor();
    }

    private final void readControlFrame() throws IOException {
        String str;
        long j2 = this.frameLength;
        if (j2 > 0) {
            this.source.mo34536c0(this.controlFrameBuffer, j2);
            if (!this.isClient) {
                Buffer buffer = this.controlFrameBuffer;
                Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                Intrinsics.m32176e(unsafeCursor);
                buffer.m34549j(unsafeCursor);
                this.maskCursor.m34571b(0L);
                WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                byte[] bArr = this.maskKey;
                Intrinsics.m32176e(bArr);
                webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                this.maskCursor.close();
            }
        }
        switch (this.opcode) {
            case 8:
                short s = 1005;
                Buffer buffer2 = this.controlFrameBuffer;
                long j3 = buffer2.f68742c;
                if (j3 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j3 != 0) {
                    s = buffer2.readShort();
                    str = this.controlFrameBuffer.m34553m();
                    String closeCodeExceptionMessage = WebSocketProtocol.INSTANCE.closeCodeExceptionMessage(s);
                    if (closeCodeExceptionMessage != null) {
                        throw new ProtocolException(closeCodeExceptionMessage);
                    }
                } else {
                    str = "";
                }
                this.frameCallback.onReadClose(s, str);
                this.closed = true;
                return;
            case 9:
                this.frameCallback.onReadPing(this.controlFrameBuffer.mo34515B0());
                return;
            case 10:
                this.frameCallback.onReadPong(this.controlFrameBuffer.mo34515B0());
                return;
            default:
                StringBuilder m24u = C0000a.m24u("Unknown control opcode: ");
                m24u.append(Util.toHexString(this.opcode));
                throw new ProtocolException(m24u.toString());
        }
    }

    private final void readHeader() throws IOException, ProtocolException {
        boolean z;
        if (this.closed) {
            throw new IOException("closed");
        }
        long timeoutNanos = this.source.getTimeout().getTimeoutNanos();
        this.source.getTimeout().clearTimeout();
        try {
            int and = Util.and(this.source.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            this.source.getTimeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            int i2 = and & 15;
            this.opcode = i2;
            boolean z2 = (and & 128) != 0;
            this.isFinalFrame = z2;
            boolean z3 = (and & 8) != 0;
            this.isControlFrame = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (and & 64) != 0;
            if (i2 == 1 || i2 == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.perMessageDeflate) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.readingCompressedMessage = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((and & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((and & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            int and2 = Util.and(this.source.readByte(), KotlinVersion.MAX_COMPONENT_VALUE);
            boolean z5 = (and2 & 128) != 0;
            if (z5 == this.isClient) {
                throw new ProtocolException(this.isClient ? "Server-sent frames must not be masked." : "Client-sent frames must be masked.");
            }
            long j2 = and2 & 127;
            this.frameLength = j2;
            if (j2 == 126) {
                this.frameLength = Util.and(this.source.readShort(), Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            } else if (j2 == 127) {
                long readLong = this.source.readLong();
                this.frameLength = readLong;
                if (readLong < 0) {
                    StringBuilder m24u = C0000a.m24u("Frame length 0x");
                    m24u.append(Util.toHexString(this.frameLength));
                    m24u.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(m24u.toString());
                }
            }
            if (this.isControlFrame && this.frameLength > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                BufferedSource bufferedSource = this.source;
                byte[] bArr = this.maskKey;
                Intrinsics.m32176e(bArr);
                bufferedSource.readFully(bArr);
            }
        } catch (Throwable th) {
            this.source.getTimeout().timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            throw th;
        }
    }

    private final void readMessage() throws IOException {
        while (!this.closed) {
            long j2 = this.frameLength;
            if (j2 > 0) {
                this.source.mo34536c0(this.messageFrameBuffer, j2);
                if (!this.isClient) {
                    Buffer buffer = this.messageFrameBuffer;
                    Buffer.UnsafeCursor unsafeCursor = this.maskCursor;
                    Intrinsics.m32176e(unsafeCursor);
                    buffer.m34549j(unsafeCursor);
                    this.maskCursor.m34571b(this.messageFrameBuffer.f68742c - this.frameLength);
                    WebSocketProtocol webSocketProtocol = WebSocketProtocol.INSTANCE;
                    Buffer.UnsafeCursor unsafeCursor2 = this.maskCursor;
                    byte[] bArr = this.maskKey;
                    Intrinsics.m32176e(bArr);
                    webSocketProtocol.toggleMask(unsafeCursor2, bArr);
                    this.maskCursor.close();
                }
            }
            if (this.isFinalFrame) {
                return;
            }
            readUntilNonControlFrame();
            if (this.opcode != 0) {
                StringBuilder m24u = C0000a.m24u("Expected continuation opcode. Got: ");
                m24u.append(Util.toHexString(this.opcode));
                throw new ProtocolException(m24u.toString());
            }
        }
        throw new IOException("closed");
    }

    private final void readMessageFrame() throws IOException {
        int i2 = this.opcode;
        if (i2 != 1 && i2 != 2) {
            StringBuilder m24u = C0000a.m24u("Unknown opcode: ");
            m24u.append(Util.toHexString(i2));
            throw new ProtocolException(m24u.toString());
        }
        readMessage();
        if (this.readingCompressedMessage) {
            MessageInflater messageInflater = this.messageInflater;
            if (messageInflater == null) {
                messageInflater = new MessageInflater(this.noContextTakeover);
                this.messageInflater = messageInflater;
            }
            messageInflater.inflate(this.messageFrameBuffer);
        }
        if (i2 == 1) {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.m34553m());
        } else {
            this.frameCallback.onReadMessage(this.messageFrameBuffer.mo34515B0());
        }
    }

    private final void readUntilNonControlFrame() throws IOException {
        while (!this.closed) {
            readHeader();
            if (!this.isControlFrame) {
                return;
            } else {
                readControlFrame();
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        MessageInflater messageInflater = this.messageInflater;
        if (messageInflater != null) {
            messageInflater.close();
        }
    }

    @NotNull
    public final BufferedSource getSource() {
        return this.source;
    }

    public final void processNextFrame() throws IOException {
        readHeader();
        if (this.isControlFrame) {
            readControlFrame();
        } else {
            readMessageFrame();
        }
    }
}
