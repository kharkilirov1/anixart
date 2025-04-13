package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: classes.dex */
public class ForwardingExtractorInput implements ExtractorInput {

    /* renamed from: a */
    public final ExtractorInput f10862a;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.f10862a = extractorInput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: b */
    public boolean mo6377b(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.f10862a.mo6377b(bArr, i2, i3, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: d */
    public boolean mo6378d(byte[] bArr, int i2, int i3, boolean z) throws IOException {
        return this.f10862a.mo6378d(bArr, i2, i3, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: e */
    public long mo6379e() {
        return this.f10862a.mo6379e();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: f */
    public void mo6380f(int i2) throws IOException {
        this.f10862a.mo6380f(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: g */
    public int mo6381g(int i2) throws IOException {
        return this.f10862a.mo6381g(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.f10862a.getLength();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.f10862a.getPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: h */
    public int mo6382h(byte[] bArr, int i2, int i3) throws IOException {
        return this.f10862a.mo6382h(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: j */
    public void mo6383j() {
        this.f10862a.mo6383j();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: k */
    public void mo6384k(int i2) throws IOException {
        this.f10862a.mo6384k(i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: l */
    public boolean mo6385l(int i2, boolean z) throws IOException {
        return this.f10862a.mo6385l(i2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    /* renamed from: n */
    public void mo6386n(byte[] bArr, int i2, int i3) throws IOException {
        this.f10862a.mo6386n(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        return this.f10862a.read(bArr, i2, i3);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i2, int i3) throws IOException {
        this.f10862a.readFully(bArr, i2, i3);
    }
}
