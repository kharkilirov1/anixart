package com.google.android.exoplayer2.decoder;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes.dex */
public class DecoderInputBuffer extends Buffer {

    /* renamed from: d */
    @Nullable
    public ByteBuffer f10605d;

    /* renamed from: e */
    public boolean f10606e;

    /* renamed from: f */
    public long f10607f;

    /* renamed from: g */
    @Nullable
    public ByteBuffer f10608g;

    /* renamed from: h */
    public final int f10609h;

    /* renamed from: c */
    public final CryptoInfo f10604c = new CryptoInfo();

    /* renamed from: i */
    public final int f10610i = 0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface BufferReplacementMode {
    }

    public static final class InsufficientCapacityException extends IllegalStateException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public InsufficientCapacityException(int r4, int r5) {
            /*
                r3 = this;
                r0 = 44
                java.lang.String r1 = "Buffer too small ("
                java.lang.String r2 = " < "
                java.lang.StringBuilder r4 = androidx.room.util.C0576a.m4120s(r0, r1, r4, r2, r5)
                java.lang.String r5 = ")"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.decoder.DecoderInputBuffer.InsufficientCapacityException.<init>(int, int):void");
        }
    }

    static {
        ExoPlayerLibraryInfo.m5824a("goog.exo.decoder");
    }

    public DecoderInputBuffer(int i2) {
        this.f10609h = i2;
    }

    /* renamed from: l */
    public void mo6248l() {
        this.f10580b = 0;
        ByteBuffer byteBuffer = this.f10605d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f10608g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f10606e = false;
    }

    /* renamed from: m */
    public final ByteBuffer m6249m(int i2) {
        int i3 = this.f10609h;
        if (i3 == 1) {
            return ByteBuffer.allocate(i2);
        }
        if (i3 == 2) {
            return ByteBuffer.allocateDirect(i2);
        }
        ByteBuffer byteBuffer = this.f10605d;
        throw new InsufficientCapacityException(byteBuffer == null ? 0 : byteBuffer.capacity(), i2);
    }

    @EnsuresNonNull({"data"})
    /* renamed from: n */
    public void m6250n(int i2) {
        int i3 = i2 + this.f10610i;
        ByteBuffer byteBuffer = this.f10605d;
        if (byteBuffer == null) {
            this.f10605d = m6249m(i3);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i4 = i3 + position;
        if (capacity >= i4) {
            this.f10605d = byteBuffer;
            return;
        }
        ByteBuffer m6249m = m6249m(i4);
        m6249m.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            m6249m.put(byteBuffer);
        }
        this.f10605d = m6249m;
    }

    /* renamed from: o */
    public final void m6251o() {
        ByteBuffer byteBuffer = this.f10605d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f10608g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: p */
    public final boolean m6252p() {
        return m6239f(1073741824);
    }
}
