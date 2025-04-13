package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.text.cea.Cea608Decoder;
import com.google.android.exoplayer2.text.cea.Cea708Decoder;
import com.google.android.exoplayer2.text.dvb.DvbDecoder;
import com.google.android.exoplayer2.text.pgs.PgsDecoder;
import com.google.android.exoplayer2.text.ssa.SsaDecoder;
import com.google.android.exoplayer2.text.subrip.SubripDecoder;
import com.google.android.exoplayer2.text.ttml.TtmlDecoder;
import com.google.android.exoplayer2.text.tx3g.Tx3gDecoder;
import com.google.android.exoplayer2.text.webvtt.Mp4WebvttDecoder;
import com.google.android.exoplayer2.text.webvtt.WebvttDecoder;

/* loaded from: classes.dex */
public interface SubtitleDecoderFactory {

    /* renamed from: a */
    public static final SubtitleDecoderFactory f13481a = new SubtitleDecoderFactory() { // from class: com.google.android.exoplayer2.text.SubtitleDecoderFactory.1
        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        /* renamed from: a */
        public boolean mo7186a(Format format) {
            String str = format.f9659m;
            return "text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str);
        }

        @Override // com.google.android.exoplayer2.text.SubtitleDecoderFactory
        /* renamed from: b */
        public SubtitleDecoder mo7187b(Format format) {
            String str = format.f9659m;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new DvbDecoder(format.f9661o);
                    case "application/pgs":
                        return new PgsDecoder();
                    case "application/x-mp4-vtt":
                        return new Mp4WebvttDecoder();
                    case "text/vtt":
                        return new WebvttDecoder();
                    case "application/x-quicktime-tx3g":
                        return new Tx3gDecoder(format.f9661o);
                    case "text/x-ssa":
                        return new SsaDecoder(format.f9661o);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new Cea608Decoder(str, format.f9645E, 16000L);
                    case "text/x-exoplayer-cues":
                        return new ExoplayerCuesDecoder();
                    case "application/cea-708":
                        return new Cea708Decoder(format.f9645E, format.f9661o);
                    case "application/x-subrip":
                        return new SubripDecoder();
                    case "application/ttml+xml":
                        return new TtmlDecoder();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    };

    /* renamed from: a */
    boolean mo7186a(Format format);

    /* renamed from: b */
    SubtitleDecoder mo7187b(Format format);
}
