package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;
import java.io.IOException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes.dex */
public final class ExtractorUtil {
    @Pure
    /* renamed from: a */
    public static void m6405a(boolean z, @Nullable String str) throws ParserException {
        if (!z) {
            throw ParserException.m5907a(str, null);
        }
    }

    /* renamed from: b */
    public static boolean m6406b(ExtractorInput extractorInput, byte[] bArr, int i2, int i3, boolean z) throws IOException {
        try {
            return extractorInput.mo6378d(bArr, i2, i3, z);
        } catch (EOFException e2) {
            if (z) {
                return false;
            }
            throw e2;
        }
    }

    /* renamed from: c */
    public static int m6407c(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i3) {
            int mo6382h = extractorInput.mo6382h(bArr, i2 + i4, i3 - i4);
            if (mo6382h == -1) {
                break;
            }
            i4 += mo6382h;
        }
        return i4;
    }
}
