package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
final class IcyDataSource implements DataSource {

    /* renamed from: a */
    public final DataSource f12311a;

    /* renamed from: b */
    public final int f12312b;

    /* renamed from: c */
    public final Listener f12313c;

    /* renamed from: d */
    public final byte[] f12314d;

    /* renamed from: e */
    public int f12315e;

    public interface Listener {
        /* renamed from: b */
        void mo6819b(ParsableByteArray parsableByteArray);
    }

    public IcyDataSource(DataSource dataSource, int i2, Listener listener) {
        Assertions.m7513a(i2 > 0);
        this.f12311a = dataSource;
        this.f12312b = i2;
        this.f12313c = listener;
        this.f12314d = new byte[1];
        this.f12315e = i2;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: a */
    public long mo6350a(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: c */
    public void mo6818c(TransferListener transferListener) {
        Objects.requireNonNull(transferListener);
        this.f12311a.mo6818c(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    /* renamed from: i */
    public Map<String, List<String>> mo6351i() {
        return this.f12311a.mo6351i();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    /* renamed from: m */
    public Uri mo6352m() {
        return this.f12311a.mo6352m();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d A[RETURN] */
    @Override // com.google.android.exoplayer2.upstream.DataReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r9, int r10, int r11) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.f12315e
            r1 = -1
            if (r0 != 0) goto L4e
            com.google.android.exoplayer2.upstream.DataSource r0 = r8.f12311a
            byte[] r2 = r8.f12314d
            r3 = 1
            r4 = 0
            int r0 = r0.read(r2, r4, r3)
            if (r0 != r1) goto L13
        L11:
            r3 = 0
            goto L46
        L13:
            byte[] r0 = r8.f12314d
            r0 = r0[r4]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 4
            if (r0 != 0) goto L1e
            goto L46
        L1e:
            byte[] r2 = new byte[r0]
            r5 = r0
            r6 = 0
        L22:
            if (r5 <= 0) goto L30
            com.google.android.exoplayer2.upstream.DataSource r7 = r8.f12311a
            int r7 = r7.read(r2, r6, r5)
            if (r7 != r1) goto L2d
            goto L11
        L2d:
            int r6 = r6 + r7
            int r5 = r5 - r7
            goto L22
        L30:
            if (r0 <= 0) goto L3a
            int r4 = r0 + (-1)
            r5 = r2[r4]
            if (r5 != 0) goto L3a
            r0 = r4
            goto L30
        L3a:
            if (r0 <= 0) goto L46
            com.google.android.exoplayer2.source.IcyDataSource$Listener r4 = r8.f12313c
            com.google.android.exoplayer2.util.ParsableByteArray r5 = new com.google.android.exoplayer2.util.ParsableByteArray
            r5.<init>(r2, r0)
            r4.mo6819b(r5)
        L46:
            if (r3 == 0) goto L4d
            int r0 = r8.f12312b
            r8.f12315e = r0
            goto L4e
        L4d:
            return r1
        L4e:
            com.google.android.exoplayer2.upstream.DataSource r0 = r8.f12311a
            int r2 = r8.f12315e
            int r11 = java.lang.Math.min(r2, r11)
            int r9 = r0.read(r9, r10, r11)
            if (r9 == r1) goto L61
            int r10 = r8.f12315e
            int r10 = r10 - r9
            r8.f12315e = r10
        L61:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.IcyDataSource.read(byte[], int, int):int");
    }
}
