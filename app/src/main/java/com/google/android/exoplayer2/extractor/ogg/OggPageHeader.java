package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class OggPageHeader {

    /* renamed from: a */
    public int f11352a;

    /* renamed from: b */
    public long f11353b;

    /* renamed from: c */
    public int f11354c;

    /* renamed from: d */
    public int f11355d;

    /* renamed from: e */
    public int f11356e;

    /* renamed from: f */
    public final int[] f11357f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g */
    public final ParsableByteArray f11358g = new ParsableByteArray(KotlinVersion.MAX_COMPONENT_VALUE);

    /* renamed from: a */
    public boolean m6543a(ExtractorInput extractorInput, boolean z) throws IOException {
        m6544b();
        this.f11358g.m7631B(27);
        if (!ExtractorUtil.m6406b(extractorInput, this.f11358g.f14698a, 0, 27, z) || this.f11358g.m7658v() != 1332176723) {
            return false;
        }
        if (this.f11358g.m7657u() != 0) {
            if (z) {
                return false;
            }
            throw ParserException.m5909c("unsupported bit stream revision");
        }
        this.f11352a = this.f11358g.m7657u();
        this.f11353b = this.f11358g.m7645i();
        this.f11358g.m7647k();
        this.f11358g.m7647k();
        this.f11358g.m7647k();
        int m7657u = this.f11358g.m7657u();
        this.f11354c = m7657u;
        this.f11355d = m7657u + 27;
        this.f11358g.m7631B(m7657u);
        if (!ExtractorUtil.m6406b(extractorInput, this.f11358g.f14698a, 0, this.f11354c, z)) {
            return false;
        }
        for (int i2 = 0; i2 < this.f11354c; i2++) {
            this.f11357f[i2] = this.f11358g.m7657u();
            this.f11356e += this.f11357f[i2];
        }
        return true;
    }

    /* renamed from: b */
    public void m6544b() {
        this.f11352a = 0;
        this.f11353b = 0L;
        this.f11354c = 0;
        this.f11355d = 0;
        this.f11356e = 0;
    }

    /* renamed from: c */
    public boolean m6545c(ExtractorInput extractorInput, long j2) throws IOException {
        Assertions.m7513a(extractorInput.getPosition() == extractorInput.mo6379e());
        this.f11358g.m7631B(4);
        while (true) {
            if ((j2 == -1 || extractorInput.getPosition() + 4 < j2) && ExtractorUtil.m6406b(extractorInput, this.f11358g.f14698a, 0, 4, true)) {
                this.f11358g.m7635F(0);
                if (this.f11358g.m7658v() == 1332176723) {
                    extractorInput.mo6383j();
                    return true;
                }
                extractorInput.mo6384k(1);
            }
        }
        do {
            if (j2 != -1 && extractorInput.getPosition() >= j2) {
                break;
            }
        } while (extractorInput.mo6381g(1) != -1);
        return false;
    }
}
