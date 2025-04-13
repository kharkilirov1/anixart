package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* loaded from: classes.dex */
public final class DvbDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    public final DvbParser f13607o;

    public DvbDecoder(List<byte[]> list) {
        super("DvbDecoder");
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        this.f13607o = new DvbParser(parsableByteArray.m7662z(), parsableByteArray.m7662z());
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 com.google.android.exoplayer2.text.dvb.DvbSubtitle, still in use, count: 2, list:
          (r2v0 com.google.android.exoplayer2.text.dvb.DvbSubtitle) from 0x027e: PHI (r2v1 com.google.android.exoplayer2.text.dvb.DvbSubtitle) = (r2v0 com.google.android.exoplayer2.text.dvb.DvbSubtitle), (r2v4 com.google.android.exoplayer2.text.dvb.DvbSubtitle) binds: [B:90:0x0276, B:129:0x03b5] A[DONT_GENERATE, DONT_INLINE]
          (r2v0 com.google.android.exoplayer2.text.dvb.DvbSubtitle) from 0x0240: MOVE (r26v6 com.google.android.exoplayer2.text.dvb.DvbSubtitle) = (r2v0 com.google.android.exoplayer2.text.dvb.DvbSubtitle)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public com.google.android.exoplayer2.text.Subtitle mo7185l(byte[] r35, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.dvb.DvbDecoder.mo7185l(byte[], int, boolean):com.google.android.exoplayer2.text.Subtitle");
    }
}
