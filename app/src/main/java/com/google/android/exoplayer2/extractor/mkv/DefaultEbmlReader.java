package com.google.android.exoplayer2.extractor.mkv;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.C1008a;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class DefaultEbmlReader implements EbmlReader {

    /* renamed from: a */
    public final byte[] f10993a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque<MasterElement> f10994b = new ArrayDeque<>();

    /* renamed from: c */
    public final VarintReader f10995c = new VarintReader();

    /* renamed from: d */
    public EbmlProcessor f10996d;

    /* renamed from: e */
    public int f10997e;

    /* renamed from: f */
    public int f10998f;

    /* renamed from: g */
    public long f10999g;

    public static final class MasterElement {

        /* renamed from: a */
        public final int f11000a;

        /* renamed from: b */
        public final long f11001b;

        public MasterElement(int i2, long j2, C10111 c10111) {
            this.f11000a = i2;
            this.f11001b = j2;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    /* renamed from: a */
    public boolean mo6455a(ExtractorInput extractorInput) throws IOException {
        String str;
        int m6480b;
        int m6479a;
        Assertions.m7518f(this.f10996d);
        while (true) {
            MasterElement peek = this.f10994b.peek();
            if (peek != null && extractorInput.getPosition() >= peek.f11001b) {
                this.f10996d.mo6458a(this.f10994b.pop().f11000a);
                return true;
            }
            if (this.f10997e == 0) {
                long m6481c = this.f10995c.m6481c(extractorInput, true, false, 4);
                if (m6481c == -2) {
                    extractorInput.mo6383j();
                    while (true) {
                        extractorInput.mo6386n(this.f10993a, 0, 4);
                        m6480b = VarintReader.m6480b(this.f10993a[0]);
                        if (m6480b != -1 && m6480b <= 4) {
                            m6479a = (int) VarintReader.m6479a(this.f10993a, m6480b, false);
                            if (this.f10996d.mo6460c(m6479a)) {
                                break;
                            }
                        }
                        extractorInput.mo6384k(1);
                    }
                    extractorInput.mo6384k(m6480b);
                    m6481c = m6479a;
                }
                if (m6481c == -1) {
                    return false;
                }
                this.f10998f = (int) m6481c;
                this.f10997e = 1;
            }
            if (this.f10997e == 1) {
                this.f10999g = this.f10995c.m6481c(extractorInput, false, true, 8);
                this.f10997e = 2;
            }
            int mo6459b = this.f10996d.mo6459b(this.f10998f);
            if (mo6459b != 0) {
                if (mo6459b == 1) {
                    long position = extractorInput.getPosition();
                    this.f10994b.push(new MasterElement(this.f10998f, this.f10999g + position, null));
                    this.f10996d.mo6464g(this.f10998f, position, this.f10999g);
                    this.f10997e = 0;
                    return true;
                }
                if (mo6459b == 2) {
                    long j2 = this.f10999g;
                    if (j2 <= 8) {
                        this.f10996d.mo6465h(this.f10998f, m6457c(extractorInput, (int) j2));
                        this.f10997e = 0;
                        return true;
                    }
                    StringBuilder sb = new StringBuilder(42);
                    sb.append("Invalid integer size: ");
                    sb.append(j2);
                    throw ParserException.m5907a(sb.toString(), null);
                }
                if (mo6459b != 3) {
                    if (mo6459b == 4) {
                        this.f10996d.mo6461d(this.f10998f, (int) this.f10999g, extractorInput);
                        this.f10997e = 0;
                        return true;
                    }
                    if (mo6459b != 5) {
                        throw C1008a.m6436c(32, "Invalid element type ", mo6459b, null);
                    }
                    long j3 = this.f10999g;
                    if (j3 != 4 && j3 != 8) {
                        StringBuilder sb2 = new StringBuilder(40);
                        sb2.append("Invalid float size: ");
                        sb2.append(j3);
                        throw ParserException.m5907a(sb2.toString(), null);
                    }
                    int i2 = (int) j3;
                    this.f10996d.mo6463f(this.f10998f, i2 == 4 ? Float.intBitsToFloat((int) r6) : Double.longBitsToDouble(m6457c(extractorInput, i2)));
                    this.f10997e = 0;
                    return true;
                }
                long j4 = this.f10999g;
                if (j4 > ParserMinimalBase.MAX_INT_L) {
                    StringBuilder sb3 = new StringBuilder(41);
                    sb3.append("String element size: ");
                    sb3.append(j4);
                    throw ParserException.m5907a(sb3.toString(), null);
                }
                EbmlProcessor ebmlProcessor = this.f10996d;
                int i3 = this.f10998f;
                int i4 = (int) j4;
                if (i4 == 0) {
                    str = "";
                } else {
                    byte[] bArr = new byte[i4];
                    extractorInput.readFully(bArr, 0, i4);
                    while (i4 > 0) {
                        int i5 = i4 - 1;
                        if (bArr[i5] != 0) {
                            break;
                        }
                        i4 = i5;
                    }
                    str = new String(bArr, 0, i4);
                }
                ebmlProcessor.mo6462e(i3, str);
                this.f10997e = 0;
                return true;
            }
            extractorInput.mo6384k((int) this.f10999g);
            this.f10997e = 0;
        }
    }

    /* renamed from: b */
    public void m6456b(EbmlProcessor ebmlProcessor) {
        this.f10996d = ebmlProcessor;
    }

    /* renamed from: c */
    public final long m6457c(ExtractorInput extractorInput, int i2) throws IOException {
        extractorInput.readFully(this.f10993a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.f10993a[i3] & 255);
        }
        return j2;
    }

    @Override // com.google.android.exoplayer2.extractor.mkv.EbmlReader
    public void reset() {
        this.f10997e = 0;
        this.f10994b.clear();
        VarintReader varintReader = this.f10995c;
        varintReader.f11116b = 0;
        varintReader.f11117c = 0;
    }
}
