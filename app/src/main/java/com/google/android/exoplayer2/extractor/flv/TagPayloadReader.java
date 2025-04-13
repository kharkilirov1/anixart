package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes.dex */
abstract class TagPayloadReader {

    /* renamed from: a */
    public final TrackOutput f10963a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(TrackOutput trackOutput) {
        this.f10963a = trackOutput;
    }

    /* renamed from: a */
    public final boolean m6449a(ParsableByteArray parsableByteArray, long j2) throws ParserException {
        return mo6442b(parsableByteArray) && mo6443c(parsableByteArray, j2);
    }

    /* renamed from: b */
    public abstract boolean mo6442b(ParsableByteArray parsableByteArray) throws ParserException;

    /* renamed from: c */
    public abstract boolean mo6443c(ParsableByteArray parsableByteArray, long j2) throws ParserException;
}
