package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
public final class WebvttDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    public final ParsableByteArray f13847o;

    /* renamed from: p */
    public final WebvttCssParser f13848p;

    public WebvttDecoder() {
        super("WebvttDecoder");
        this.f13847o = new ParsableByteArray();
        this.f13848p = new WebvttCssParser();
    }

    /* JADX WARN: Code restructure failed: missing block: B:206:0x03a6, code lost:
    
        r0.addAll(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x010f, code lost:
    
        if (")".equals(com.google.android.exoplayer2.text.webvtt.WebvttCssParser.m7270b(r11, r12)) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0375  */
    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.text.Subtitle mo7185l(byte[] r21, int r22, boolean r23) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.webvtt.WebvttDecoder.mo7185l(byte[], int, boolean):com.google.android.exoplayer2.text.Subtitle");
    }
}
