package com.google.android.exoplayer2.extractor.p008ts;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import java.io.IOException;

/* loaded from: classes.dex */
public final class PsExtractor implements Extractor {

    /* renamed from: e */
    public boolean f11674e;

    /* renamed from: f */
    public boolean f11675f;

    /* renamed from: g */
    public boolean f11676g;

    /* renamed from: h */
    public long f11677h;

    /* renamed from: i */
    @Nullable
    public PsBinarySearchSeeker f11678i;

    /* renamed from: j */
    public ExtractorOutput f11679j;

    /* renamed from: k */
    public boolean f11680k;

    /* renamed from: a */
    public final TimestampAdjuster f11670a = new TimestampAdjuster(0);

    /* renamed from: c */
    public final ParsableByteArray f11672c = new ParsableByteArray(RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT);

    /* renamed from: b */
    public final SparseArray<PesReader> f11671b = new SparseArray<>();

    /* renamed from: d */
    public final PsDurationReader f11673d = new PsDurationReader();

    public static final class PesReader {

        /* renamed from: a */
        public final ElementaryStreamReader f11681a;

        /* renamed from: b */
        public final TimestampAdjuster f11682b;

        /* renamed from: c */
        public final ParsableBitArray f11683c = new ParsableBitArray(new byte[64]);

        /* renamed from: d */
        public boolean f11684d;

        /* renamed from: e */
        public boolean f11685e;

        /* renamed from: f */
        public boolean f11686f;

        /* renamed from: g */
        public long f11687g;

        public PesReader(ElementaryStreamReader elementaryStreamReader, TimestampAdjuster timestampAdjuster) {
            this.f11681a = elementaryStreamReader;
            this.f11682b = timestampAdjuster;
        }
    }

    static {
        C0954j c0954j = C0954j.f10222o;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11679j = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        boolean z = this.f11670a.m7694d() == -9223372036854775807L;
        if (!z) {
            long m7693c = this.f11670a.m7693c();
            z = (m7693c == -9223372036854775807L || m7693c == 0 || m7693c == j3) ? false : true;
        }
        if (z) {
            this.f11670a.m7695e(j3);
        }
        PsBinarySearchSeeker psBinarySearchSeeker = this.f11678i;
        if (psBinarySearchSeeker != null) {
            psBinarySearchSeeker.m6361e(j3);
        }
        for (int i2 = 0; i2 < this.f11671b.size(); i2++) {
            PesReader valueAt = this.f11671b.valueAt(i2);
            valueAt.f11686f = false;
            valueAt.f11681a.mo6549c();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        byte[] bArr = new byte[14];
        extractorInput.mo6386n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        extractorInput.mo6380f(bArr[13] & 7);
        extractorInput.mo6386n(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0187  */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r14, com.google.android.exoplayer2.extractor.PositionHolder r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 853
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.p008ts.PsExtractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
