package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class FlvExtractor implements Extractor {

    /* renamed from: f */
    public ExtractorOutput f10949f;

    /* renamed from: h */
    public boolean f10951h;

    /* renamed from: i */
    public long f10952i;

    /* renamed from: j */
    public int f10953j;

    /* renamed from: k */
    public int f10954k;

    /* renamed from: l */
    public int f10955l;

    /* renamed from: m */
    public long f10956m;

    /* renamed from: n */
    public boolean f10957n;

    /* renamed from: o */
    public AudioTagPayloadReader f10958o;

    /* renamed from: p */
    public VideoTagPayloadReader f10959p;

    /* renamed from: a */
    public final ParsableByteArray f10944a = new ParsableByteArray(4);

    /* renamed from: b */
    public final ParsableByteArray f10945b = new ParsableByteArray(9);

    /* renamed from: c */
    public final ParsableByteArray f10946c = new ParsableByteArray(11);

    /* renamed from: d */
    public final ParsableByteArray f10947d = new ParsableByteArray();

    /* renamed from: e */
    public final ScriptTagPayloadReader f10948e = new ScriptTagPayloadReader();

    /* renamed from: g */
    public int f10950g = 1;

    static {
        C0954j c0954j = C0954j.f10214g;
    }

    @RequiresNonNull({"extractorOutput"})
    /* renamed from: a */
    public final void m6444a() {
        if (this.f10957n) {
            return;
        }
        this.f10949f.mo6393d(new SeekMap.Unseekable(-9223372036854775807L, 0L));
        this.f10957n = true;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f10949f = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        if (j2 == 0) {
            this.f10950g = 1;
            this.f10951h = false;
        } else {
            this.f10950g = 3;
        }
        this.f10953j = 0;
    }

    /* renamed from: d */
    public final ParsableByteArray m6445d(ExtractorInput extractorInput) throws IOException {
        int i2 = this.f10955l;
        ParsableByteArray parsableByteArray = this.f10947d;
        byte[] bArr = parsableByteArray.f14698a;
        if (i2 > bArr.length) {
            parsableByteArray.f14698a = new byte[Math.max(bArr.length * 2, i2)];
            parsableByteArray.f14700c = 0;
            parsableByteArray.f14699b = 0;
        } else {
            parsableByteArray.m7635F(0);
        }
        this.f10947d.m7634E(this.f10955l);
        extractorInput.readFully(this.f10947d.f14698a, 0, this.f10955l);
        return this.f10947d;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        extractorInput.mo6386n(this.f10944a.f14698a, 0, 3);
        this.f10944a.m7635F(0);
        if (this.f10944a.m7659w() != 4607062) {
            return false;
        }
        extractorInput.mo6386n(this.f10944a.f14698a, 0, 2);
        this.f10944a.m7635F(0);
        if ((this.f10944a.m7662z() & 250) != 0) {
            return false;
        }
        extractorInput.mo6386n(this.f10944a.f14698a, 0, 4);
        this.f10944a.m7635F(0);
        int m7642f = this.f10944a.m7642f();
        extractorInput.mo6383j();
        extractorInput.mo6380f(m7642f);
        extractorInput.mo6386n(this.f10944a.f14698a, 0, 4);
        this.f10944a.m7635F(0);
        return this.f10944a.m7642f() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r17, com.google.android.exoplayer2.extractor.PositionHolder r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.FlvExtractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
