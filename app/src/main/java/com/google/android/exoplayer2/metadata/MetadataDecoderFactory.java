package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTableDecoder;
import com.google.android.exoplayer2.metadata.emsg.EventMessageDecoder;
import com.google.android.exoplayer2.metadata.icy.IcyDecoder;
import com.google.android.exoplayer2.metadata.id3.Id3Decoder;
import com.google.android.exoplayer2.metadata.scte35.SpliceInfoDecoder;

/* loaded from: classes.dex */
public interface MetadataDecoderFactory {

    /* renamed from: a */
    public static final MetadataDecoderFactory f11987a = new MetadataDecoderFactory() { // from class: com.google.android.exoplayer2.metadata.MetadataDecoderFactory.1
        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        /* renamed from: a */
        public boolean mo6702a(Format format) {
            String str = format.f9659m;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataDecoderFactory
        /* renamed from: b */
        public MetadataDecoder mo6703b(Format format) {
            String str = format.f9659m;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new AppInfoTableDecoder();
                    case "application/x-icy":
                        return new IcyDecoder();
                    case "application/id3":
                        return new Id3Decoder();
                    case "application/x-emsg":
                        return new EventMessageDecoder();
                    case "application/x-scte35":
                        return new SpliceInfoDecoder();
                }
            }
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Attempted to create decoder for unsupported MIME type: ".concat(valueOf) : new String("Attempted to create decoder for unsupported MIME type: "));
        }
    };

    /* renamed from: a */
    boolean mo6702a(Format format);

    /* renamed from: b */
    MetadataDecoder mo6703b(Format format);
}
