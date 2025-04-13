package com.squareup.okhttp.internal.framed;

import com.fasterxml.jackson.core.util.TextBuffer;
import com.squareup.okhttp.Protocol;
import com.squareup.okhttp.internal.NamedRunnable;
import com.squareup.okhttp.internal.Util;
import com.squareup.okhttp.internal.framed.FrameReader;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okio.ByteString;

/* loaded from: classes2.dex */
public final class FramedConnection implements Closeable {

    /* renamed from: t */
    public static final ExecutorService f24993t = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.m13942j("OkHttp FramedConnection", true));

    /* renamed from: b */
    public final Protocol f24994b;

    /* renamed from: c */
    public final boolean f24995c;

    /* renamed from: d */
    public final Listener f24996d;

    /* renamed from: e */
    public final Map<Integer, FramedStream> f24997e;

    /* renamed from: f */
    public final String f24998f;

    /* renamed from: g */
    public int f24999g;

    /* renamed from: h */
    public int f25000h;

    /* renamed from: i */
    public boolean f25001i;

    /* renamed from: j */
    public final ExecutorService f25002j;

    /* renamed from: k */
    public final PushObserver f25003k;

    /* renamed from: l */
    public long f25004l;

    /* renamed from: m */
    public long f25005m;

    /* renamed from: n */
    public Settings f25006n;

    /* renamed from: o */
    public final Settings f25007o;

    /* renamed from: p */
    public boolean f25008p;

    /* renamed from: q */
    public final Socket f25009q;

    /* renamed from: r */
    public final FrameWriter f25010r;

    /* renamed from: s */
    public final Set<Integer> f25011s;

    public static class Builder {
    }

    public static abstract class Listener {

        /* renamed from: a */
        public static final Listener f25038a = new Listener() { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Listener.1
            @Override // com.squareup.okhttp.internal.framed.FramedConnection.Listener
            /* renamed from: a */
            public void mo13958a(FramedStream framedStream) throws IOException {
                framedStream.m13969c(ErrorCode.REFUSED_STREAM);
            }
        };

        /* renamed from: a */
        public abstract void mo13958a(FramedStream framedStream) throws IOException;
    }

    public class Reader extends NamedRunnable implements FrameReader.Handler {

        /* renamed from: c */
        public final FrameReader f25039c;

        /* renamed from: d */
        public final /* synthetic */ FramedConnection f25040d;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.squareup.okhttp.internal.NamedRunnable
        /* renamed from: a */
        public void mo13883a() {
            ErrorCode errorCode;
            ErrorCode errorCode2;
            ErrorCode errorCode3 = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    try {
                        if (!this.f25040d.f24995c) {
                            this.f25039c.mo13944H0();
                        }
                        while (this.f25039c.mo13945m0(this)) {
                        }
                        ErrorCode errorCode4 = ErrorCode.NO_ERROR;
                        try {
                            errorCode3 = ErrorCode.CANCEL;
                            this.f25040d.m13950b(errorCode4, errorCode3);
                            errorCode2 = errorCode4;
                        } catch (IOException unused) {
                            errorCode3 = ErrorCode.PROTOCOL_ERROR;
                            FramedConnection framedConnection = this.f25040d;
                            ExecutorService executorService = FramedConnection.f24993t;
                            framedConnection.m13950b(errorCode3, errorCode3);
                            errorCode2 = framedConnection;
                            Util.m13935c(this.f25039c);
                        }
                    } catch (Throwable th) {
                        errorCode = errorCode2;
                        th = th;
                        try {
                            FramedConnection framedConnection2 = this.f25040d;
                            ExecutorService executorService2 = FramedConnection.f24993t;
                            framedConnection2.m13950b(errorCode, errorCode3);
                        } catch (IOException unused2) {
                        }
                        Util.m13935c(this.f25039c);
                        throw th;
                    }
                } catch (IOException unused3) {
                } catch (Throwable th2) {
                    th = th2;
                    errorCode = errorCode3;
                    FramedConnection framedConnection22 = this.f25040d;
                    ExecutorService executorService22 = FramedConnection.f24993t;
                    framedConnection22.m13950b(errorCode, errorCode3);
                    Util.m13935c(this.f25039c);
                    throw th;
                }
            } catch (IOException unused4) {
            }
            Util.m13935c(this.f25039c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e3, code lost:
        
            if (r18 == false) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00e5, code lost:
        
            r3.m13974h();
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00e8, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        
            return;
         */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m13959b(final boolean r18, final int r19, okio.BufferedSource r20, final int r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.Reader.m13959b(boolean, int, okio.BufferedSource, int):void");
        }

        /* renamed from: c */
        public void m13960c(int i2, ErrorCode errorCode, ByteString byteString) {
            FramedStream[] framedStreamArr;
            byteString.mo34576d();
            synchronized (this.f25040d) {
                framedStreamArr = (FramedStream[]) this.f25040d.f24997e.values().toArray(new FramedStream[this.f25040d.f24997e.size()]);
                this.f25040d.f25001i = true;
            }
            for (FramedStream framedStream : framedStreamArr) {
                if (framedStream.f25048c > i2 && framedStream.m13972f()) {
                    ErrorCode errorCode2 = ErrorCode.REFUSED_STREAM;
                    synchronized (framedStream) {
                        if (framedStream.f25056k == null) {
                            framedStream.f25056k = errorCode2;
                            framedStream.notifyAll();
                        }
                    }
                    this.f25040d.m13952e(framedStream.f25048c);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0054 A[Catch: all -> 0x0100, TryCatch #0 {, blocks: (B:9:0x003c, B:11:0x0042, B:13:0x0044, B:20:0x0054, B:21:0x005b, B:23:0x005d, B:25:0x0063, B:27:0x0065, B:29:0x006c, B:31:0x006e, B:32:0x00a3, B:35:0x00a5), top: B:8:0x003c }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x005d A[Catch: all -> 0x0100, TryCatch #0 {, blocks: (B:9:0x003c, B:11:0x0042, B:13:0x0044, B:20:0x0054, B:21:0x005b, B:23:0x005d, B:25:0x0063, B:27:0x0065, B:29:0x006c, B:31:0x006e, B:32:0x00a3, B:35:0x00a5), top: B:8:0x003c }] */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m13961d(boolean r14, final boolean r15, final int r16, int r17, final java.util.List<com.squareup.okhttp.internal.framed.Header> r18, com.squareup.okhttp.internal.framed.HeadersMode r19) {
            /*
                Method dump skipped, instructions count: 259
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.Reader.m13961d(boolean, boolean, int, int, java.util.List, com.squareup.okhttp.internal.framed.HeadersMode):void");
        }

        /* renamed from: e */
        public void m13962e(boolean z, final int i2, final int i3) {
            if (z) {
                FramedConnection framedConnection = this.f25040d;
                ExecutorService executorService = FramedConnection.f24993t;
                synchronized (framedConnection) {
                }
            } else {
                final FramedConnection framedConnection2 = this.f25040d;
                final boolean z2 = true;
                final Ping ping = null;
                ((ThreadPoolExecutor) FramedConnection.f24993t).execute(new NamedRunnable("OkHttp %s ping %08x%08x", new Object[]{framedConnection2.f24998f, Integer.valueOf(i2), Integer.valueOf(i3)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.3
                    @Override // com.squareup.okhttp.internal.NamedRunnable
                    /* renamed from: a */
                    public void mo13883a() {
                        try {
                            FramedConnection framedConnection3 = FramedConnection.this;
                            boolean z3 = z2;
                            int i4 = i2;
                            int i5 = i3;
                            Ping ping2 = ping;
                            synchronized (framedConnection3.f25010r) {
                                if (ping2 != null) {
                                    if (ping2.f25123b != -1) {
                                        throw new IllegalStateException();
                                    }
                                    ping2.f25123b = System.nanoTime();
                                }
                                framedConnection3.f25010r.ping(z3, i4, i5);
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
            }
        }

        /* renamed from: f */
        public void m13963f(int i2, final int i3, final List<Header> list) {
            final FramedConnection framedConnection = this.f25040d;
            ExecutorService executorService = FramedConnection.f24993t;
            synchronized (framedConnection) {
                if (framedConnection.f25011s.contains(Integer.valueOf(i3))) {
                    framedConnection.m13956j(i3, ErrorCode.PROTOCOL_ERROR);
                } else {
                    framedConnection.f25011s.add(Integer.valueOf(i3));
                    framedConnection.f25002j.execute(new NamedRunnable("OkHttp %s Push Request[%s]", new Object[]{framedConnection.f24998f, Integer.valueOf(i3)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.4
                        @Override // com.squareup.okhttp.internal.NamedRunnable
                        /* renamed from: a */
                        public void mo13883a() {
                            if (FramedConnection.this.f25003k.onRequest(i3, list)) {
                                try {
                                    FramedConnection.this.f25010r.mo13946G0(i3, ErrorCode.CANCEL);
                                    synchronized (FramedConnection.this) {
                                        FramedConnection.this.f25011s.remove(Integer.valueOf(i3));
                                    }
                                } catch (IOException unused) {
                                }
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: g */
        public void m13964g(final int i2, final ErrorCode errorCode) {
            if (FramedConnection.m13949a(this.f25040d, i2)) {
                final FramedConnection framedConnection = this.f25040d;
                framedConnection.f25002j.execute(new NamedRunnable("OkHttp %s Push Reset[%s]", new Object[]{framedConnection.f24998f, Integer.valueOf(i2)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.7
                    @Override // com.squareup.okhttp.internal.NamedRunnable
                    /* renamed from: a */
                    public void mo13883a() {
                        FramedConnection.this.f25003k.mo13995a(i2, errorCode);
                        synchronized (FramedConnection.this) {
                            FramedConnection.this.f25011s.remove(Integer.valueOf(i2));
                        }
                    }
                });
                return;
            }
            FramedStream m13952e = this.f25040d.m13952e(i2);
            if (m13952e != null) {
                synchronized (m13952e) {
                    if (m13952e.f25056k == null) {
                        m13952e.f25056k = errorCode;
                        m13952e.notifyAll();
                    }
                }
            }
        }

        /* renamed from: h */
        public void m13965h(boolean z, final Settings settings) {
            int i2;
            FramedStream[] framedStreamArr;
            long j2;
            synchronized (this.f25040d) {
                int m13997b = this.f25040d.f25007o.m13997b(TextBuffer.MAX_SEGMENT_LEN);
                if (z) {
                    Settings settings2 = this.f25040d.f25007o;
                    settings2.f25127c = 0;
                    settings2.f25126b = 0;
                    settings2.f25125a = 0;
                    Arrays.fill(settings2.f25128d, 0);
                }
                Settings settings3 = this.f25040d.f25007o;
                Objects.requireNonNull(settings3);
                for (int i3 = 0; i3 < 10; i3++) {
                    if (settings.m13998c(i3)) {
                        settings3.m13999d(i3, settings.m13996a(i3), settings.f25128d[i3]);
                    }
                }
                FramedConnection framedConnection = this.f25040d;
                if (framedConnection.f24994b == Protocol.HTTP_2) {
                    ((ThreadPoolExecutor) FramedConnection.f24993t).execute(new NamedRunnable("OkHttp %s ACK Settings", new Object[]{framedConnection.f24998f}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Reader.3
                        @Override // com.squareup.okhttp.internal.NamedRunnable
                        /* renamed from: a */
                        public void mo13883a() {
                            try {
                                Reader.this.f25040d.f25010r.mo13948y0(settings);
                            } catch (IOException unused) {
                            }
                        }
                    });
                }
                int m13997b2 = this.f25040d.f25007o.m13997b(TextBuffer.MAX_SEGMENT_LEN);
                framedStreamArr = null;
                if (m13997b2 == -1 || m13997b2 == m13997b) {
                    j2 = 0;
                } else {
                    j2 = m13997b2 - m13997b;
                    FramedConnection framedConnection2 = this.f25040d;
                    if (!framedConnection2.f25008p) {
                        framedConnection2.f25005m += j2;
                        if (j2 > 0) {
                            framedConnection2.notifyAll();
                        }
                        this.f25040d.f25008p = true;
                    }
                    if (!this.f25040d.f24997e.isEmpty()) {
                        framedStreamArr = (FramedStream[]) this.f25040d.f24997e.values().toArray(new FramedStream[this.f25040d.f24997e.size()]);
                    }
                }
                ((ThreadPoolExecutor) FramedConnection.f24993t).execute(new NamedRunnable("OkHttp %s settings", this.f25040d.f24998f) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.Reader.2
                    @Override // com.squareup.okhttp.internal.NamedRunnable
                    /* renamed from: a */
                    public void mo13883a() {
                        Objects.requireNonNull(Reader.this.f25040d.f24996d);
                    }
                });
            }
            if (framedStreamArr == null || j2 == 0) {
                return;
            }
            for (FramedStream framedStream : framedStreamArr) {
                synchronized (framedStream) {
                    framedStream.f25047b += j2;
                    if (j2 > 0) {
                        framedStream.notifyAll();
                    }
                }
            }
        }

        /* renamed from: i */
        public void m13966i(int i2, long j2) {
            if (i2 == 0) {
                synchronized (this.f25040d) {
                    FramedConnection framedConnection = this.f25040d;
                    framedConnection.f25005m += j2;
                    framedConnection.notifyAll();
                }
                return;
            }
            FramedStream m13951c = this.f25040d.m13951c(i2);
            if (m13951c != null) {
                synchronized (m13951c) {
                    m13951c.f25047b += j2;
                    if (j2 > 0) {
                        m13951c.notifyAll();
                    }
                }
            }
        }

        @Override // com.squareup.okhttp.internal.framed.FrameReader.Handler
        public void priority(int i2, int i3, int i4, boolean z) {
        }
    }

    /* renamed from: a */
    public static boolean m13949a(FramedConnection framedConnection, int i2) {
        return framedConnection.f24994b == Protocol.HTTP_2 && i2 != 0 && (i2 & 1) == 0;
    }

    /* renamed from: b */
    public final void m13950b(ErrorCode errorCode, ErrorCode errorCode2) throws IOException {
        int i2;
        FramedStream[] framedStreamArr = null;
        try {
            m13954h(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f24997e.isEmpty()) {
                framedStreamArr = (FramedStream[]) this.f24997e.values().toArray(new FramedStream[this.f24997e.size()]);
                this.f24997e.clear();
                m13953g(false);
            }
        }
        if (framedStreamArr != null) {
            for (FramedStream framedStream : framedStreamArr) {
                try {
                    framedStream.m13969c(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f25010r.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f25009q.close();
        } catch (IOException e5) {
            e = e5;
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: c */
    public synchronized FramedStream m13951c(int i2) {
        return this.f24997e.get(Integer.valueOf(i2));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m13950b(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* renamed from: e */
    public synchronized FramedStream m13952e(int i2) {
        FramedStream remove;
        remove = this.f24997e.remove(Integer.valueOf(i2));
        if (remove != null && this.f24997e.isEmpty()) {
            m13953g(true);
        }
        notifyAll();
        return remove;
    }

    /* renamed from: g */
    public final synchronized void m13953g(boolean z) {
        if (z) {
            System.nanoTime();
        }
    }

    /* renamed from: h */
    public void m13954h(ErrorCode errorCode) throws IOException {
        synchronized (this.f25010r) {
            synchronized (this) {
                if (this.f25001i) {
                    return;
                }
                this.f25001i = true;
                this.f25010r.mo13947M(this.f24999g, errorCode, Util.f24976a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f25010r.maxDataLength());
        r6 = r3;
        r8.f25005m -= r6;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13955i(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto Ld
            com.squareup.okhttp.internal.framed.FrameWriter r12 = r8.f25010r
            r12.data(r10, r9, r11, r0)
            return
        Ld:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L60
            monitor-enter(r8)
        L12:
            long r3 = r8.f25005m     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L30
            java.util.Map<java.lang.Integer, com.squareup.okhttp.internal.framed.FramedStream> r3 = r8.f24997e     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            boolean r3 = r3.containsKey(r4)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            if (r3 == 0) goto L28
            r8.wait()     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            goto L12
        L28:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
            throw r9     // Catch: java.lang.Throwable -> L56 java.lang.InterruptedException -> L58
        L30:
            long r3 = java.lang.Math.min(r12, r3)     // Catch: java.lang.Throwable -> L56
            int r4 = (int) r3     // Catch: java.lang.Throwable -> L56
            com.squareup.okhttp.internal.framed.FrameWriter r3 = r8.f25010r     // Catch: java.lang.Throwable -> L56
            int r3 = r3.maxDataLength()     // Catch: java.lang.Throwable -> L56
            int r3 = java.lang.Math.min(r4, r3)     // Catch: java.lang.Throwable -> L56
            long r4 = r8.f25005m     // Catch: java.lang.Throwable -> L56
            long r6 = (long) r3     // Catch: java.lang.Throwable -> L56
            long r4 = r4 - r6
            r8.f25005m = r4     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            long r12 = r12 - r6
            com.squareup.okhttp.internal.framed.FrameWriter r4 = r8.f25010r
            if (r10 == 0) goto L51
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            r4.data(r5, r9, r11, r3)
            goto Ld
        L56:
            r9 = move-exception
            goto L5e
        L58:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L56
            r9.<init>()     // Catch: java.lang.Throwable -> L56
            throw r9     // Catch: java.lang.Throwable -> L56
        L5e:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L56
            throw r9
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.framed.FramedConnection.m13955i(int, boolean, okio.Buffer, long):void");
    }

    /* renamed from: j */
    public void m13956j(final int i2, final ErrorCode errorCode) {
        f24993t.submit(new NamedRunnable("OkHttp %s stream %d", new Object[]{this.f24998f, Integer.valueOf(i2)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.1
            @Override // com.squareup.okhttp.internal.NamedRunnable
            /* renamed from: a */
            public void mo13883a() {
                try {
                    FramedConnection framedConnection = FramedConnection.this;
                    framedConnection.f25010r.mo13946G0(i2, errorCode);
                } catch (IOException unused) {
                }
            }
        });
    }

    /* renamed from: k */
    public void m13957k(final int i2, final long j2) {
        ((ThreadPoolExecutor) f24993t).execute(new NamedRunnable("OkHttp Window Update %s stream %d", new Object[]{this.f24998f, Integer.valueOf(i2)}) { // from class: com.squareup.okhttp.internal.framed.FramedConnection.2
            @Override // com.squareup.okhttp.internal.NamedRunnable
            /* renamed from: a */
            public void mo13883a() {
                try {
                    FramedConnection.this.f25010r.windowUpdate(i2, j2);
                } catch (IOException unused) {
                }
            }
        });
    }
}
