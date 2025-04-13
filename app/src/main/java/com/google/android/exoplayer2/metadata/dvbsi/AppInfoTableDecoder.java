package com.google.android.exoplayer2.metadata.dvbsi;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataInputBuffer;
import com.google.android.exoplayer2.metadata.SimpleMetadataDecoder;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.common.base.Charsets;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class AppInfoTableDecoder extends SimpleMetadataDecoder {
    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    @Nullable
    /* renamed from: b */
    public Metadata mo6705b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            ParsableBitArray parsableBitArray = new ParsableBitArray(byteBuffer.array(), byteBuffer.limit());
            parsableBitArray.m7628m(12);
            int m7619d = (parsableBitArray.m7619d() + parsableBitArray.m7622g(12)) - 4;
            parsableBitArray.m7628m(44);
            parsableBitArray.m7629n(parsableBitArray.m7622g(12));
            parsableBitArray.m7628m(16);
            ArrayList arrayList = new ArrayList();
            while (parsableBitArray.m7619d() < m7619d) {
                parsableBitArray.m7628m(48);
                int m7622g = parsableBitArray.m7622g(8);
                parsableBitArray.m7628m(4);
                int m7619d2 = parsableBitArray.m7619d() + parsableBitArray.m7622g(12);
                String str = null;
                String str2 = null;
                while (parsableBitArray.m7619d() < m7619d2) {
                    int m7622g2 = parsableBitArray.m7622g(8);
                    int m7622g3 = parsableBitArray.m7622g(8);
                    int m7619d3 = parsableBitArray.m7619d() + m7622g3;
                    if (m7622g2 == 2) {
                        int m7622g4 = parsableBitArray.m7622g(16);
                        parsableBitArray.m7628m(8);
                        if (m7622g4 == 3) {
                            while (parsableBitArray.m7619d() < m7619d3) {
                                int m7622g5 = parsableBitArray.m7622g(8);
                                Charset charset = Charsets.f20502a;
                                byte[] bArr = new byte[m7622g5];
                                parsableBitArray.m7624i(bArr, 0, m7622g5);
                                str = new String(bArr, charset);
                                int m7622g6 = parsableBitArray.m7622g(8);
                                for (int i2 = 0; i2 < m7622g6; i2++) {
                                    parsableBitArray.m7629n(parsableBitArray.m7622g(8));
                                }
                            }
                        }
                    } else if (m7622g2 == 21) {
                        Charset charset2 = Charsets.f20502a;
                        byte[] bArr2 = new byte[m7622g3];
                        parsableBitArray.m7624i(bArr2, 0, m7622g3);
                        str2 = new String(bArr2, charset2);
                    }
                    parsableBitArray.m7626k(m7619d3 * 8);
                }
                parsableBitArray.m7626k(m7619d2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new AppInfoTable(m7622g, str2.length() != 0 ? str.concat(str2) : new String(str)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new Metadata(arrayList);
            }
        }
        return null;
    }
}
