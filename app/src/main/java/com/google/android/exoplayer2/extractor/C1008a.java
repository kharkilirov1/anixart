package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* compiled from: TrackOutput.java */
/* renamed from: com.google.android.exoplayer2.extractor.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C1008a {
    /* renamed from: a */
    public static int m6434a(TrackOutput trackOutput, DataReader dataReader, int i2, boolean z) throws IOException {
        return trackOutput.mo6395a(dataReader, i2, z, 0);
    }

    /* renamed from: b */
    public static void m6435b(TrackOutput trackOutput, ParsableByteArray parsableByteArray, int i2) {
        trackOutput.mo6400f(parsableByteArray, i2, 0);
    }

    /* renamed from: c */
    public static ParserException m6436c(int i2, String str, int i3, Throwable th) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(i3);
        return ParserException.m5907a(sb.toString(), th);
    }

    /* renamed from: d */
    public static String m6437d(int i2, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }
}
