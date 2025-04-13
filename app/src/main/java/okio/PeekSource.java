package okio;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PeekSource.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lokio/PeekSource;", "Lokio/Source;", "okio"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class PeekSource implements Source {

    /* renamed from: b */
    public final Buffer f68779b;

    /* renamed from: c */
    public Segment f68780c;

    /* renamed from: d */
    public int f68781d;

    /* renamed from: e */
    public boolean f68782e;

    /* renamed from: f */
    public long f68783f;

    /* renamed from: g */
    public final BufferedSource f68784g;

    public PeekSource(@NotNull BufferedSource bufferedSource) {
        this.f68784g = bufferedSource;
        Buffer f68789b = bufferedSource.getF68789b();
        this.f68779b = f68789b;
        Segment segment = f68789b.f68741b;
        this.f68780c = segment;
        this.f68781d = segment != null ? segment.f68794b : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f68782e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0028, code lost:
    
        if (r4 == r5.f68794b) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.m32179h(r9, r0)
            r0 = 0
            r1 = 0
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 < 0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r4 == 0) goto L85
            boolean r4 = r8.f68782e
            r4 = r4 ^ 1
            if (r4 == 0) goto L79
            okio.Segment r4 = r8.f68780c
            if (r4 == 0) goto L2a
            okio.Buffer r5 = r8.f68779b
            okio.Segment r5 = r5.f68741b
            if (r4 != r5) goto L2b
            int r4 = r8.f68781d
            kotlin.jvm.internal.Intrinsics.m32176e(r5)
            int r5 = r5.f68794b
            if (r4 != r5) goto L2b
        L2a:
            r0 = 1
        L2b:
            if (r0 == 0) goto L6d
            if (r3 != 0) goto L30
            return r1
        L30:
            okio.BufferedSource r0 = r8.f68784g
            long r1 = r8.f68783f
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            okio.Segment r0 = r8.f68780c
            if (r0 != 0) goto L53
            okio.Buffer r0 = r8.f68779b
            okio.Segment r0 = r0.f68741b
            if (r0 == 0) goto L53
            r8.f68780c = r0
            kotlin.jvm.internal.Intrinsics.m32176e(r0)
            int r0 = r0.f68794b
            r8.f68781d = r0
        L53:
            okio.Buffer r0 = r8.f68779b
            long r0 = r0.f68742c
            long r2 = r8.f68783f
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f68779b
            long r4 = r8.f68783f
            r3 = r9
            r6 = r10
            r2.m34535c(r3, r4, r6)
            long r0 = r8.f68783f
            long r0 = r0 + r10
            r8.f68783f = r0
            return r10
        L6d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L79:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L85:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p000a.C0000a.m11h(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getF68772c() {
        return this.f68784g.getF68772c();
    }
}
