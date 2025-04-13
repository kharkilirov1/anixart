package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.analytics.C0954j;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.SeekPoint;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.mp4.Atom;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class Mp4Extractor implements Extractor, SeekMap {

    /* renamed from: y */
    public static final /* synthetic */ int f11241y = 0;

    /* renamed from: a */
    public final int f11242a;

    /* renamed from: b */
    public final ParsableByteArray f11243b;

    /* renamed from: c */
    public final ParsableByteArray f11244c;

    /* renamed from: d */
    public final ParsableByteArray f11245d;

    /* renamed from: e */
    public final ParsableByteArray f11246e;

    /* renamed from: f */
    public final ArrayDeque<Atom.ContainerAtom> f11247f;

    /* renamed from: g */
    public final SefReader f11248g;

    /* renamed from: h */
    public final List<Metadata.Entry> f11249h;

    /* renamed from: i */
    public int f11250i;

    /* renamed from: j */
    public int f11251j;

    /* renamed from: k */
    public long f11252k;

    /* renamed from: l */
    public int f11253l;

    /* renamed from: m */
    @Nullable
    public ParsableByteArray f11254m;

    /* renamed from: n */
    public int f11255n;

    /* renamed from: o */
    public int f11256o;

    /* renamed from: p */
    public int f11257p;

    /* renamed from: q */
    public int f11258q;

    /* renamed from: r */
    public ExtractorOutput f11259r;

    /* renamed from: s */
    public Mp4Track[] f11260s;

    /* renamed from: t */
    public long[][] f11261t;

    /* renamed from: u */
    public int f11262u;

    /* renamed from: v */
    public long f11263v;

    /* renamed from: w */
    public int f11264w;

    /* renamed from: x */
    @Nullable
    public MotionPhotoMetadata f11265x;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static final class Mp4Track {

        /* renamed from: a */
        public final Track f11266a;

        /* renamed from: b */
        public final TrackSampleTable f11267b;

        /* renamed from: c */
        public final TrackOutput f11268c;

        /* renamed from: d */
        @Nullable
        public final TrueHdSampleRechunker f11269d;

        /* renamed from: e */
        public int f11270e;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.f11266a = track;
            this.f11267b = trackSampleTable;
            this.f11268c = trackOutput;
            this.f11269d = "audio/true-hd".equals(track.f11287f.f9659m) ? new TrueHdSampleRechunker() : null;
        }
    }

    static {
        C0954j c0954j = C0954j.f10217j;
    }

    public Mp4Extractor() {
        this(0);
    }

    /* renamed from: k */
    public static long m6521k(TrackSampleTable trackSampleTable, long j2, long j3) {
        int m6532a = trackSampleTable.m6532a(j2);
        if (m6532a == -1) {
            m6532a = trackSampleTable.m6533b(j2);
        }
        return m6532a == -1 ? j3 : Math.min(trackSampleTable.f11317c[m6532a], j3);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public void mo6401b(ExtractorOutput extractorOutput) {
        this.f11259r = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11247f.clear();
        this.f11253l = 0;
        this.f11255n = -1;
        this.f11256o = 0;
        this.f11257p = 0;
        this.f11258q = 0;
        if (j2 == 0) {
            if (this.f11250i != 3) {
                m6522j();
                return;
            }
            SefReader sefReader = this.f11248g;
            sefReader.f11276a.clear();
            sefReader.f11277b = 0;
            this.f11249h.clear();
            return;
        }
        Mp4Track[] mp4TrackArr = this.f11260s;
        if (mp4TrackArr != null) {
            for (Mp4Track mp4Track : mp4TrackArr) {
                TrackSampleTable trackSampleTable = mp4Track.f11267b;
                int m6532a = trackSampleTable.m6532a(j3);
                if (m6532a == -1) {
                    m6532a = trackSampleTable.m6533b(j3);
                }
                mp4Track.f11270e = m6532a;
                TrueHdSampleRechunker trueHdSampleRechunker = mp4Track.f11269d;
                if (trueHdSampleRechunker != null) {
                    trueHdSampleRechunker.f10884b = false;
                    trueHdSampleRechunker.f10885c = 0;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        return Sniffer.m6530a(extractorInput, false, (this.f11242a & 2) != 0);
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: f */
    public boolean mo6363f() {
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:162:0x047c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0690 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0006 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r35, com.google.android.exoplayer2.extractor.PositionHolder r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: h */
    public SeekMap.SeekPoints mo6364h(long j2) {
        long j3;
        long j4;
        long j5;
        long j6;
        int m6533b;
        long j7 = j2;
        Mp4Track[] mp4TrackArr = this.f11260s;
        Objects.requireNonNull(mp4TrackArr);
        if (mp4TrackArr.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.f10876c);
        }
        long j8 = -1;
        int i2 = this.f11262u;
        if (i2 != -1) {
            TrackSampleTable trackSampleTable = this.f11260s[i2].f11267b;
            int m6532a = trackSampleTable.m6532a(j7);
            if (m6532a == -1) {
                m6532a = trackSampleTable.m6533b(j7);
            }
            if (m6532a == -1) {
                return new SeekMap.SeekPoints(SeekPoint.f10876c);
            }
            long j9 = trackSampleTable.f11320f[m6532a];
            j3 = trackSampleTable.f11317c[m6532a];
            if (j9 >= j7 || m6532a >= trackSampleTable.f11316b - 1 || (m6533b = trackSampleTable.m6533b(j7)) == -1 || m6533b == m6532a) {
                j6 = -9223372036854775807L;
            } else {
                long j10 = trackSampleTable.f11320f[m6533b];
                long j11 = trackSampleTable.f11317c[m6533b];
                j6 = j10;
                j8 = j11;
            }
            j4 = j8;
            j5 = j6;
            j7 = j9;
        } else {
            j3 = Long.MAX_VALUE;
            j4 = -1;
            j5 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            Mp4Track[] mp4TrackArr2 = this.f11260s;
            if (i3 >= mp4TrackArr2.length) {
                break;
            }
            if (i3 != this.f11262u) {
                TrackSampleTable trackSampleTable2 = mp4TrackArr2[i3].f11267b;
                long m6521k = m6521k(trackSampleTable2, j7, j3);
                if (j5 != -9223372036854775807L) {
                    j4 = m6521k(trackSampleTable2, j5, j4);
                }
                j3 = m6521k;
            }
            i3++;
        }
        SeekPoint seekPoint = new SeekPoint(j7, j3);
        return j5 == -9223372036854775807L ? new SeekMap.SeekPoints(seekPoint) : new SeekMap.SeekPoints(seekPoint, new SeekPoint(j5, j4));
    }

    @Override // com.google.android.exoplayer2.extractor.SeekMap
    /* renamed from: i */
    public long mo6365i() {
        return this.f11263v;
    }

    /* renamed from: j */
    public final void m6522j() {
        this.f11250i = 0;
        this.f11253l = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b4, code lost:
    
        r0 = -1;
        r5 = -1;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01b7, code lost:
    
        r9 = r3.f14699b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b9, code lost:
    
        if (r9 >= r7) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01bb, code lost:
    
        r11 = r3.m7642f();
        r9 = r3.m7642f();
        r19 = r8;
        r3.m7636G(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ce, code lost:
    
        if (r9 != 1835360622) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01d0, code lost:
    
        r13 = r3.m7652p(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f1, code lost:
    
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01db, code lost:
    
        if (r9 != 1851878757) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01dd, code lost:
    
        r6 = r3.m7652p(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01e7, code lost:
    
        if (r9 != 1684108385) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01e9, code lost:
    
        r5 = r11;
        r0 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01ec, code lost:
    
        r3.m7636G(r11 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01f4, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01f6, code lost:
    
        if (r13 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01f8, code lost:
    
        if (r6 == null) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01fb, code lost:
    
        if (r0 != (-1)) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ff, code lost:
    
        r3.m7635F(r0);
        r3.m7636G(16);
        r0 = new com.google.android.exoplayer2.metadata.id3.InternalFrame(r13, r6, r3.m7652p(r5 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02b5, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0215, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0298, code lost:
    
        r5 = java.lang.String.valueOf(com.google.android.exoplayer2.extractor.mp4.Atom.m6492a(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a6, code lost:
    
        if (r5.length() == 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02a8, code lost:
    
        r5 = "Skipped unknown metadata entry: ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02b2, code lost:
    
        android.util.Log.d("MetadataUtil", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02ad, code lost:
    
        r5 = new java.lang.String("Skipped unknown metadata entry: ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00cb, code lost:
    
        r5 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6520f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00cf, code lost:
    
        if (r5 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00d1, code lost:
    
        r9 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.f11240a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00d4, code lost:
    
        if (r5 > r9.length) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x00d6, code lost:
    
        r5 = r9[r5 - 1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x00dc, code lost:
    
        if (r5 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x00de, code lost:
    
        r0 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame("TCON", r13, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x00e5, code lost:
    
        android.util.Log.w("MetadataUtil", "Failed to parse standard genre code");
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00db, code lost:
    
        r5 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x022a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02d5, code lost:
    
        r3.m7635F(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d8, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0219, code lost:
    
        r19 = r8;
        r8 = 16777215 & r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0222, code lost:
    
        if (r8 != 6516084) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0224, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6515a(r5, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0230, code lost:
    
        if (r8 == 7233901) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0235, code lost:
    
        if (r8 != 7631467) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x023c, code lost:
    
        if (r8 == 6516589) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0241, code lost:
    
        if (r8 != 7828084) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0248, code lost:
    
        if (r8 != 6578553) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x024a, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TDRC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0255, code lost:
    
        if (r8 != 4280916) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0257, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TPE1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0261, code lost:
    
        if (r8 != 7630703) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0263, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TSSE", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x026d, code lost:
    
        if (r8 != 6384738) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x026f, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TALB", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0279, code lost:
    
        if (r8 != 7108978) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x027b, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "USLT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0285, code lost:
    
        if (r8 != 6776174) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0287, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TCON", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x028f, code lost:
    
        if (r8 != 6779504) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0291, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TIT1", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x02b7, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TCOM", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02be, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TIT2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x02d9, code lost:
    
        r17 = r0;
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x02e1, code lost:
    
        if (r4.isEmpty() == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x02e4, code lost:
    
        r0 = new com.google.android.exoplayer2.metadata.Metadata(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r3.m7635F(r6);
        r6 = r6 + r7;
        r3.m7636G(r9);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        r5 = r3.f14699b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r5 >= r6) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a7, code lost:
    
        r7 = r3.m7642f() + r5;
        r5 = r3.m7642f();
        r9 = (r5 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE;
        r16 = r6;
        r17 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00be, code lost:
    
        if (r9 == 169) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c2, code lost:
    
        if (r9 != 253) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
    
        if (r5 != 1735291493) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f1, code lost:
    
        if (r5 != 1684632427) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6517c(r5, "TPOS", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ab, code lost:
    
        r19 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x02c7, code lost:
    
        if (r0 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x02c9, code lost:
    
        r4.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x02cc, code lost:
    
        r13 = null;
        r6 = r16;
        r0 = r17;
        r8 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fe, code lost:
    
        if (r5 != 1953655662) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0100, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6517c(r5, "TRCK", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010b, code lost:
    
        if (r5 != 1953329263) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010d, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6519e(r5, "TBPM", r3, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
    
        if (r5 != 1668311404) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6519e(r5, "TCMP", r3, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0128, code lost:
    
        if (r5 != 1668249202) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6516b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0133, code lost:
    
        if (r5 != 1631670868) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TPE2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0140, code lost:
    
        if (r5 != 1936682605) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0142, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TSOT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        if (r5 != 1936679276) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014e, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TSO2", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0158, code lost:
    
        if (r5 != 1936679282) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015a, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TSOA", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
    
        if (r5 != 1936679265) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0166, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TSOP", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0170, code lost:
    
        if (r5 != 1936679791) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0172, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TSOC", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017c, code lost:
    
        if (r5 != 1920233063) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x017e, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6519e(r5, "ITUNESADVISORY", r3, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0189, code lost:
    
        if (r5 != 1885823344) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x018b, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6519e(r5, "ITUNESGAPLESS", r3, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0197, code lost:
    
        if (r5 != 1936683886) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0199, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TVSHOWSORT", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01a3, code lost:
    
        if (r5 != 1953919848) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a5, code lost:
    
        r0 = com.google.android.exoplayer2.extractor.mp4.MetadataUtil.m6518d(r5, "TVSHOW", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b2, code lost:
    
        if (r5 != 757935405) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:264:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b3 A[LOOP:10: B:303:0x05b0->B:305:0x05b3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0618 A[LOOP:12: B:342:0x0615->B:344:0x0618, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0634  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04a1  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m6523l(long r24) throws com.google.android.exoplayer2.ParserException {
        /*
            Method dump skipped, instructions count: 1705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.Mp4Extractor.m6523l(long):void");
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }

    public Mp4Extractor(int i2) {
        this.f11242a = i2;
        this.f11250i = (i2 & 4) != 0 ? 3 : 0;
        this.f11248g = new SefReader();
        this.f11249h = new ArrayList();
        this.f11246e = new ParsableByteArray(16);
        this.f11247f = new ArrayDeque<>();
        this.f11243b = new ParsableByteArray(NalUnitUtil.f14658a);
        this.f11244c = new ParsableByteArray(4);
        this.f11245d = new ParsableByteArray();
        this.f11255n = -1;
    }
}
