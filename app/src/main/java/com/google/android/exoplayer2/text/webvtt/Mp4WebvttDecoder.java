package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.SimpleSubtitleDecoder;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.webvtt.WebvttCueParser;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class Mp4WebvttDecoder extends SimpleSubtitleDecoder {

    /* renamed from: o */
    public final ParsableByteArray f13798o;

    public Mp4WebvttDecoder() {
        super("Mp4WebvttDecoder");
        this.f13798o = new ParsableByteArray();
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    /* renamed from: l */
    public Subtitle mo7185l(byte[] bArr, int i2, boolean z) throws SubtitleDecoderException {
        Cue m7178a;
        ParsableByteArray parsableByteArray = this.f13798o;
        parsableByteArray.f14698a = bArr;
        parsableByteArray.f14700c = i2;
        parsableByteArray.f14699b = 0;
        ArrayList arrayList = new ArrayList();
        while (this.f13798o.m7637a() > 0) {
            if (this.f13798o.m7637a() < 8) {
                throw new SubtitleDecoderException("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int m7642f = this.f13798o.m7642f();
            if (this.f13798o.m7642f() == 1987343459) {
                ParsableByteArray parsableByteArray2 = this.f13798o;
                int i3 = m7642f - 8;
                CharSequence charSequence = null;
                Cue.Builder builder = null;
                while (i3 > 0) {
                    if (i3 < 8) {
                        throw new SubtitleDecoderException("Incomplete vtt cue box header found.");
                    }
                    int m7642f2 = parsableByteArray2.m7642f();
                    int m7642f3 = parsableByteArray2.m7642f();
                    int i4 = m7642f2 - 8;
                    String m7749r = Util.m7749r(parsableByteArray2.f14698a, parsableByteArray2.f14699b, i4);
                    parsableByteArray2.m7636G(i4);
                    i3 = (i3 - 8) - i4;
                    if (m7642f3 == 1937011815) {
                        Pattern pattern = WebvttCueParser.f13824a;
                        WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder = new WebvttCueParser.WebvttCueInfoBuilder();
                        WebvttCueParser.m7278e(m7749r, webvttCueInfoBuilder);
                        builder = webvttCueInfoBuilder.m7282a();
                    } else if (m7642f3 == 1885436268) {
                        charSequence = WebvttCueParser.m7279f(null, m7749r.trim(), Collections.emptyList());
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (builder != null) {
                    builder.f13454a = charSequence;
                    m7178a = builder.m7178a();
                } else {
                    Pattern pattern2 = WebvttCueParser.f13824a;
                    WebvttCueParser.WebvttCueInfoBuilder webvttCueInfoBuilder2 = new WebvttCueParser.WebvttCueInfoBuilder();
                    webvttCueInfoBuilder2.f13838c = charSequence;
                    m7178a = webvttCueInfoBuilder2.m7282a().m7178a();
                }
                arrayList.add(m7178a);
            } else {
                this.f13798o.m7636G(m7642f - 8);
            }
        }
        return new Mp4WebvttSubtitle(arrayList);
    }
}
