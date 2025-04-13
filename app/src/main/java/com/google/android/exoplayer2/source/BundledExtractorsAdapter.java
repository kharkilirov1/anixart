package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    /* renamed from: a */
    public final ExtractorsFactory f12234a;

    /* renamed from: b */
    @Nullable
    public Extractor f12235b;

    /* renamed from: c */
    @Nullable
    public ExtractorInput f12236c;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.f12234a = extractorsFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r6.f10834d != r11) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005c, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0059, code lost:
    
        if (r6.f10834d != r11) goto L34;
     */
    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo6782a(com.google.android.exoplayer2.upstream.DataReader r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, com.google.android.exoplayer2.extractor.ExtractorOutput r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.exoplayer2.extractor.DefaultExtractorInput r6 = new com.google.android.exoplayer2.extractor.DefaultExtractorInput
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f12236c = r6
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.f12235b
            if (r8 == 0) goto L10
            return
        L10:
            com.google.android.exoplayer2.extractor.ExtractorsFactory r8 = r7.f12234a
            com.google.android.exoplayer2.extractor.Extractor[] r8 = r8.mo6098c(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L21
            r8 = r8[r13]
            r7.f12235b = r8
            goto Lb8
        L21:
            int r10 = r8.length
            r0 = 0
        L23:
            if (r0 >= r10) goto L67
            r1 = r8[r0]
            boolean r2 = r1.mo6403e(r6)     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            if (r2 == 0) goto L32
            r7.f12235b = r1     // Catch: java.lang.Throwable -> L3d java.io.EOFException -> L50
            r6.f10836f = r13
            goto L67
        L32:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.f12235b
            if (r1 != 0) goto L5e
            long r1 = r6.f10834d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L5c
            goto L5e
        L3d:
            r8 = move-exception
            com.google.android.exoplayer2.extractor.Extractor r9 = r7.f12235b
            if (r9 != 0) goto L4a
            long r9 = r6.f10834d
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L49
            goto L4a
        L49:
            r14 = 0
        L4a:
            com.google.android.exoplayer2.util.Assertions.m7516d(r14)
            r6.f10836f = r13
            throw r8
        L50:
            com.google.android.exoplayer2.extractor.Extractor r1 = r7.f12235b
            if (r1 != 0) goto L5e
            long r1 = r6.f10834d
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L5c
            goto L5e
        L5c:
            r1 = 0
            goto L5f
        L5e:
            r1 = 1
        L5f:
            com.google.android.exoplayer2.util.Assertions.m7516d(r1)
            r6.f10836f = r13
            int r0 = r0 + 1
            goto L23
        L67:
            com.google.android.exoplayer2.extractor.Extractor r10 = r7.f12235b
            if (r10 != 0) goto Lb8
            com.google.android.exoplayer2.source.UnrecognizedInputFormatException r10 = new com.google.android.exoplayer2.source.UnrecognizedInputFormatException
            int r11 = com.google.android.exoplayer2.util.Util.f14736a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
        L74:
            int r12 = r8.length
            if (r13 >= r12) goto L91
            r12 = r8[r13]
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            r11.append(r12)
            int r12 = r8.length
            int r12 = r12 + (-1)
            if (r13 >= r12) goto L8e
            java.lang.String r12 = ", "
            r11.append(r12)
        L8e:
            int r13 = r13 + 1
            goto L74
        L91:
            java.lang.String r8 = r11.toString()
            r11 = 58
            int r11 = androidx.room.util.C0576a.m4106e(r8, r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "None of the available extractors ("
            r12.append(r11)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.util.Objects.requireNonNull(r9)
            r10.<init>(r8, r9)
            throw r10
        Lb8:
            com.google.android.exoplayer2.extractor.Extractor r8 = r7.f12235b
            r8.mo6401b(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.BundledExtractorsAdapter.mo6782a(com.google.android.exoplayer2.upstream.DataReader, android.net.Uri, java.util.Map, long, long, com.google.android.exoplayer2.extractor.ExtractorOutput):void");
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: b */
    public int mo6783b(PositionHolder positionHolder) throws IOException {
        Extractor extractor = this.f12235b;
        Objects.requireNonNull(extractor);
        ExtractorInput extractorInput = this.f12236c;
        Objects.requireNonNull(extractorInput);
        return extractor.mo6404g(extractorInput, positionHolder);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: c */
    public void mo6784c(long j2, long j3) {
        Extractor extractor = this.f12235b;
        Objects.requireNonNull(extractor);
        extractor.mo6402c(j2, j3);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: d */
    public long mo6785d() {
        ExtractorInput extractorInput = this.f12236c;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /* renamed from: e */
    public void mo6786e() {
        Extractor extractor = this.f12235b;
        if (extractor instanceof Mp3Extractor) {
            ((Mp3Extractor) extractor).f11143r = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
        Extractor extractor = this.f12235b;
        if (extractor != null) {
            extractor.release();
            this.f12235b = null;
        }
        this.f12236c = null;
    }
}
