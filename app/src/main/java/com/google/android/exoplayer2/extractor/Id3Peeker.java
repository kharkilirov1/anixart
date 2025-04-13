package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class Id3Peeker {

    /* renamed from: a */
    public final ParsableByteArray f10866a = new ParsableByteArray(10);

    @Nullable
    /* renamed from: a */
    public Metadata m6424a(ExtractorInput extractorInput, @Nullable Id3Decoder.FramePredicate framePredicate) throws IOException {
        Metadata metadata = null;
        int i2 = 0;
        while (true) {
            try {
                extractorInput.mo6386n(this.f10866a.f14698a, 0, 10);
                this.f10866a.m7635F(0);
                if (this.f10866a.m7659w() != 4801587) {
                    break;
                }
                this.f10866a.m7636G(3);
                int m7656t = this.f10866a.m7656t();
                int i3 = m7656t + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.f10866a.f14698a, 0, bArr, 0, 10);
                    extractorInput.mo6386n(bArr, 10, m7656t);
                    metadata = new Id3Decoder(framePredicate).m6731d(bArr, i3);
                } else {
                    extractorInput.mo6380f(m7656t);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        extractorInput.mo6383j();
        extractorInput.mo6380f(i2);
        return metadata;
    }
}
