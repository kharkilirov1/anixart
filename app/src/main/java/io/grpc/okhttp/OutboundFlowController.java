package io.grpc.okhttp;

import com.google.common.base.Preconditions;
import io.grpc.okhttp.OkHttpClientStream;
import io.grpc.okhttp.internal.framed.FrameWriter;
import java.io.IOException;
import javax.annotation.Nullable;
import okhttp3.internal.http2.Settings;
import okio.Buffer;
import p000a.C0000a;

/* loaded from: classes3.dex */
class OutboundFlowController {

    /* renamed from: a */
    public final OkHttpClientTransport f59319a;

    /* renamed from: b */
    public final FrameWriter f59320b;

    /* renamed from: c */
    public int f59321c = Settings.DEFAULT_INITIAL_WINDOW_SIZE;

    /* renamed from: d */
    public final OutboundFlowState f59322d = new OutboundFlowState(0, Settings.DEFAULT_INITIAL_WINDOW_SIZE);

    public static final class WriteStatus {

        /* renamed from: a */
        public int f59330a;

        public WriteStatus() {
        }

        public WriteStatus(C64821 c64821) {
        }
    }

    public OutboundFlowController(OkHttpClientTransport okHttpClientTransport, FrameWriter frameWriter) {
        this.f59319a = okHttpClientTransport;
        this.f59320b = frameWriter;
    }

    /* renamed from: a */
    public void m31263a(boolean z, int i2, Buffer buffer, boolean z2) {
        Preconditions.m11187k(buffer, "source");
        OkHttpClientStream m31237o = this.f59319a.m31237o(i2);
        if (m31237o == null) {
            return;
        }
        OutboundFlowState m31266d = m31266d(m31237o);
        int m31271c = m31266d.m31271c();
        boolean z3 = m31266d.f59323a.f68742c > 0;
        int i3 = (int) buffer.f68742c;
        if (z3 || m31271c < i3) {
            if (!z3 && m31271c > 0) {
                m31266d.m31272d(buffer, m31271c, false);
            }
            m31266d.f59323a.write(buffer, (int) buffer.f68742c);
            m31266d.f59328f = z | m31266d.f59328f;
        } else {
            m31266d.m31272d(buffer, i3, z);
        }
        if (z2) {
            m31264b();
        }
    }

    /* renamed from: b */
    public void m31264b() {
        try {
            this.f59320b.flush();
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: c */
    public boolean m31265c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException(C0000a.m7d("Invalid initial window size: ", i2));
        }
        int i3 = i2 - this.f59321c;
        this.f59321c = i2;
        for (OkHttpClientStream okHttpClientStream : this.f59319a.m31233k()) {
            OutboundFlowState outboundFlowState = (OutboundFlowState) okHttpClientStream.f59214l;
            if (outboundFlowState == null) {
                okHttpClientStream.f59214l = new OutboundFlowState(this, okHttpClientStream, this.f59321c);
            } else {
                outboundFlowState.m31269a(i3);
            }
        }
        return i3 > 0;
    }

    /* renamed from: d */
    public final OutboundFlowState m31266d(OkHttpClientStream okHttpClientStream) {
        OutboundFlowState outboundFlowState = (OutboundFlowState) okHttpClientStream.f59214l;
        if (outboundFlowState != null) {
            return outboundFlowState;
        }
        OutboundFlowState outboundFlowState2 = new OutboundFlowState(this, okHttpClientStream, this.f59321c);
        okHttpClientStream.f59214l = outboundFlowState2;
        return outboundFlowState2;
    }

    /* renamed from: e */
    public int m31267e(@Nullable OkHttpClientStream okHttpClientStream, int i2) {
        if (okHttpClientStream == null) {
            int m31269a = this.f59322d.m31269a(i2);
            m31268f();
            return m31269a;
        }
        OutboundFlowState m31266d = m31266d(okHttpClientStream);
        int m31269a2 = m31266d.m31269a(i2);
        WriteStatus writeStatus = new WriteStatus(null);
        m31266d.m31273e(m31266d.m31271c(), writeStatus);
        if (writeStatus.f59330a > 0) {
            m31264b();
        }
        return m31269a2;
    }

    /* renamed from: f */
    public void m31268f() {
        OkHttpClientStream[] m31233k = this.f59319a.m31233k();
        int i2 = this.f59322d.f59325c;
        int length = m31233k.length;
        while (true) {
            if (length <= 0 || i2 <= 0) {
                break;
            }
            int ceil = (int) Math.ceil(i2 / length);
            for (int i3 = 0; i3 < length && i2 > 0; i3++) {
                OkHttpClientStream okHttpClientStream = m31233k[i3];
                OutboundFlowState m31266d = m31266d(okHttpClientStream);
                int min = Math.min(i2, Math.min(m31266d.m31270b(), ceil));
                if (min > 0) {
                    m31266d.f59326d += min;
                    i2 -= min;
                }
                if (m31266d.m31270b() > 0) {
                    m31233k[r3] = okHttpClientStream;
                    r3++;
                }
            }
            length = r3;
        }
        WriteStatus writeStatus = new WriteStatus(null);
        for (OkHttpClientStream okHttpClientStream2 : this.f59319a.m31233k()) {
            OutboundFlowState m31266d2 = m31266d(okHttpClientStream2);
            m31266d2.m31273e(m31266d2.f59326d, writeStatus);
            m31266d2.f59326d = 0;
        }
        if ((writeStatus.f59330a > 0 ? 1 : 0) != 0) {
            m31264b();
        }
    }

    public final class OutboundFlowState {

        /* renamed from: a */
        public final Buffer f59323a;

        /* renamed from: b */
        public final int f59324b;

        /* renamed from: c */
        public int f59325c;

        /* renamed from: d */
        public int f59326d;

        /* renamed from: e */
        public OkHttpClientStream f59327e;

        /* renamed from: f */
        public boolean f59328f;

        public OutboundFlowState(OutboundFlowController outboundFlowController, OkHttpClientStream okHttpClientStream, int i2) {
            int i3 = okHttpClientStream.f59215m;
            OutboundFlowController.this = outboundFlowController;
            this.f59328f = false;
            this.f59324b = i3;
            this.f59325c = i2;
            this.f59323a = new Buffer();
            this.f59327e = okHttpClientStream;
        }

        /* renamed from: a */
        public int m31269a(int i2) {
            if (i2 <= 0 || Integer.MAX_VALUE - i2 >= this.f59325c) {
                int i3 = this.f59325c + i2;
                this.f59325c = i3;
                return i3;
            }
            StringBuilder m24u = C0000a.m24u("Window size overflow for stream: ");
            m24u.append(this.f59324b);
            throw new IllegalArgumentException(m24u.toString());
        }

        /* renamed from: b */
        public int m31270b() {
            return Math.max(0, Math.min(this.f59325c, (int) this.f59323a.f68742c)) - this.f59326d;
        }

        /* renamed from: c */
        public int m31271c() {
            return Math.min(this.f59325c, OutboundFlowController.this.f59322d.f59325c);
        }

        /* renamed from: d */
        public void m31272d(Buffer buffer, int i2, boolean z) {
            do {
                int min = Math.min(i2, OutboundFlowController.this.f59320b.maxDataLength());
                int i3 = -min;
                OutboundFlowController.this.f59322d.m31269a(i3);
                m31269a(i3);
                try {
                    boolean z2 = false;
                    OutboundFlowController.this.f59320b.data(buffer.f68742c == ((long) min) && z, this.f59324b, buffer, min);
                    OkHttpClientStream.TransportState transportState = this.f59327e.f59216n;
                    synchronized (transportState.f58418b) {
                        Preconditions.m11192p(transportState.f58422f, "onStreamAllocated was not called, but it seems the stream is active");
                        int i4 = transportState.f58421e;
                        boolean z3 = i4 < 32768;
                        int i5 = i4 - min;
                        transportState.f58421e = i5;
                        boolean z4 = i5 < 32768;
                        if (!z3 && z4) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        transportState.m31028h();
                    }
                    i2 -= min;
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            } while (i2 > 0);
        }

        /* renamed from: e */
        public int m31273e(int i2, WriteStatus writeStatus) {
            int min = Math.min(i2, m31271c());
            int i3 = 0;
            while (true) {
                Buffer buffer = this.f59323a;
                long j2 = buffer.f68742c;
                if (!(j2 > 0) || min <= 0) {
                    break;
                }
                if (min >= j2) {
                    int i4 = (int) j2;
                    i3 += i4;
                    m31272d(buffer, i4, this.f59328f);
                } else {
                    i3 += min;
                    m31272d(buffer, min, false);
                }
                writeStatus.f59330a++;
                min = Math.min(i2 - i3, m31271c());
            }
            return i3;
        }

        public OutboundFlowState(int i2, int i3) {
            this.f59328f = false;
            this.f59324b = i2;
            this.f59325c = i3;
            this.f59323a = new Buffer();
        }
    }
}
