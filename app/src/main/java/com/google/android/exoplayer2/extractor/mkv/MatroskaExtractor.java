package com.google.android.exoplayer2.extractor.mkv;

import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.apphosting.datastore.testing.DatastoreTestTrace;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;
import okhttp3.internal.p038ws.RealWebSocket;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public class MatroskaExtractor implements Extractor {

    /* renamed from: b0 */
    public static final byte[] f11002b0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* renamed from: c0 */
    public static final byte[] f11003c0 = Util.m7708G("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d0 */
    public static final byte[] f11004d0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* renamed from: e0 */
    public static final UUID f11005e0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* renamed from: f0 */
    public static final Map<String, Integer> f11006f0;

    /* renamed from: A */
    public long f11007A;

    /* renamed from: B */
    public long f11008B;

    /* renamed from: C */
    @Nullable
    public LongArray f11009C;

    /* renamed from: D */
    @Nullable
    public LongArray f11010D;

    /* renamed from: E */
    public boolean f11011E;

    /* renamed from: F */
    public boolean f11012F;

    /* renamed from: G */
    public int f11013G;

    /* renamed from: H */
    public long f11014H;

    /* renamed from: I */
    public long f11015I;

    /* renamed from: J */
    public int f11016J;

    /* renamed from: K */
    public int f11017K;

    /* renamed from: L */
    public int[] f11018L;

    /* renamed from: M */
    public int f11019M;

    /* renamed from: N */
    public int f11020N;

    /* renamed from: O */
    public int f11021O;

    /* renamed from: P */
    public int f11022P;

    /* renamed from: Q */
    public boolean f11023Q;

    /* renamed from: R */
    public int f11024R;

    /* renamed from: S */
    public int f11025S;

    /* renamed from: T */
    public int f11026T;

    /* renamed from: U */
    public boolean f11027U;

    /* renamed from: V */
    public boolean f11028V;

    /* renamed from: W */
    public boolean f11029W;

    /* renamed from: X */
    public int f11030X;

    /* renamed from: Y */
    public byte f11031Y;

    /* renamed from: Z */
    public boolean f11032Z;

    /* renamed from: a */
    public final EbmlReader f11033a;

    /* renamed from: a0 */
    public ExtractorOutput f11034a0;

    /* renamed from: b */
    public final VarintReader f11035b;

    /* renamed from: c */
    public final SparseArray<Track> f11036c;

    /* renamed from: d */
    public final boolean f11037d;

    /* renamed from: e */
    public final ParsableByteArray f11038e;

    /* renamed from: f */
    public final ParsableByteArray f11039f;

    /* renamed from: g */
    public final ParsableByteArray f11040g;

    /* renamed from: h */
    public final ParsableByteArray f11041h;

    /* renamed from: i */
    public final ParsableByteArray f11042i;

    /* renamed from: j */
    public final ParsableByteArray f11043j;

    /* renamed from: k */
    public final ParsableByteArray f11044k;

    /* renamed from: l */
    public final ParsableByteArray f11045l;

    /* renamed from: m */
    public final ParsableByteArray f11046m;

    /* renamed from: n */
    public final ParsableByteArray f11047n;

    /* renamed from: o */
    public ByteBuffer f11048o;

    /* renamed from: p */
    public long f11049p;

    /* renamed from: q */
    public long f11050q;

    /* renamed from: r */
    public long f11051r;

    /* renamed from: s */
    public long f11052s;

    /* renamed from: t */
    public long f11053t;

    /* renamed from: u */
    @Nullable
    public Track f11054u;

    /* renamed from: v */
    public boolean f11055v;

    /* renamed from: w */
    public int f11056w;

    /* renamed from: x */
    public long f11057x;

    /* renamed from: y */
    public boolean f11058y;

    /* renamed from: z */
    public long f11059z;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class InnerEbmlProcessor implements EbmlProcessor {
        public InnerEbmlProcessor(C10121 c10121) {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:356:0x0806, code lost:
        
            if (r0.m7650n() == r7.getLeastSignificantBits()) goto L474;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x086d  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0884  */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0893  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x0a60  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x08a0  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0886  */
        /* JADX WARN: Removed duplicated region for block: B:346:0x080d  */
        /* JADX WARN: Removed duplicated region for block: B:349:0x083b  */
        /* JADX WARN: Type inference failed for: r0v79 */
        /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.Throwable] */
        /* JADX WARN: Type inference failed for: r4v19 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v7 */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo6458a(int r25) throws com.google.android.exoplayer2.ParserException {
            /*
                Method dump skipped, instructions count: 3208
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.InnerEbmlProcessor.mo6458a(int):void");
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: b */
        public int mo6459b(int i2) {
            Objects.requireNonNull(MatroskaExtractor.this);
            switch (i2) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case 231:
                case 238:
                case 241:
                case 251:
                case 16871:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 21998:
                case 22186:
                case 22203:
                case 25188:
                case 30321:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 21358:
                case 2274716:
                    return 3;
                case 160:
                case 166:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 16868:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30113:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 165:
                case 16877:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                case 30323:
                case 30324:
                case 30325:
                    return 5;
                default:
                    return 0;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: c */
        public boolean mo6460c(int i2) {
            Objects.requireNonNull(MatroskaExtractor.this);
            return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
        }

        /* JADX WARN: Code restructure failed: missing block: B:122:0x024f, code lost:
        
            throw com.google.android.exoplayer2.ParserException.m5907a("EBML lacing sample size out of range.", null);
         */
        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo6461d(int r21, int r22, com.google.android.exoplayer2.extractor.ExtractorInput r23) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 752
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.InnerEbmlProcessor.mo6461d(int, int, com.google.android.exoplayer2.extractor.ExtractorInput):void");
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: e */
        public void mo6462e(int i2, String str) throws ParserException {
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            Objects.requireNonNull(matroskaExtractor);
            if (i2 == 134) {
                matroskaExtractor.m6469d(i2);
                matroskaExtractor.f11054u.f11087b = str;
                return;
            }
            if (i2 == 17026) {
                if ("webm".equals(str) || "matroska".equals(str)) {
                    return;
                }
                StringBuilder sb = new StringBuilder(str.length() + 22);
                sb.append("DocType ");
                sb.append(str);
                sb.append(" not supported");
                throw ParserException.m5907a(sb.toString(), null);
            }
            if (i2 == 21358) {
                matroskaExtractor.m6469d(i2);
                matroskaExtractor.f11054u.f11086a = str;
            } else {
                if (i2 != 2274716) {
                    return;
                }
                matroskaExtractor.m6469d(i2);
                matroskaExtractor.f11054u.f11083W = str;
            }
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: f */
        public void mo6463f(int i2, double d) throws ParserException {
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            Objects.requireNonNull(matroskaExtractor);
            if (i2 == 181) {
                matroskaExtractor.m6469d(i2);
                matroskaExtractor.f11054u.f11077Q = (int) d;
            }
            if (i2 == 17545) {
                matroskaExtractor.f11052s = (long) d;
                return;
            }
            switch (i2) {
                case 21969:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11064D = (float) d;
                    break;
                case 21970:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11065E = (float) d;
                    break;
                case 21971:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11066F = (float) d;
                    break;
                case 21972:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11067G = (float) d;
                    break;
                case 21973:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11068H = (float) d;
                    break;
                case 21974:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11069I = (float) d;
                    break;
                case 21975:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11070J = (float) d;
                    break;
                case 21976:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11071K = (float) d;
                    break;
                case 21977:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11072L = (float) d;
                    break;
                case 21978:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11073M = (float) d;
                    break;
                default:
                    switch (i2) {
                        case 30323:
                            matroskaExtractor.m6469d(i2);
                            matroskaExtractor.f11054u.f11104s = (float) d;
                            break;
                        case 30324:
                            matroskaExtractor.m6469d(i2);
                            matroskaExtractor.f11054u.f11105t = (float) d;
                            break;
                        case 30325:
                            matroskaExtractor.m6469d(i2);
                            matroskaExtractor.f11054u.f11106u = (float) d;
                            break;
                    }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: g */
        public void mo6464g(int i2, long j2, long j3) throws ParserException {
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            Assertions.m7518f(matroskaExtractor.f11034a0);
            if (i2 == 160) {
                matroskaExtractor.f11023Q = false;
                return;
            }
            if (i2 == 174) {
                matroskaExtractor.f11054u = new Track(null);
                return;
            }
            if (i2 == 187) {
                matroskaExtractor.f11011E = false;
                return;
            }
            if (i2 == 19899) {
                matroskaExtractor.f11056w = -1;
                matroskaExtractor.f11057x = -1L;
                return;
            }
            if (i2 == 20533) {
                matroskaExtractor.m6469d(i2);
                matroskaExtractor.f11054u.f11093h = true;
                return;
            }
            if (i2 == 21968) {
                matroskaExtractor.m6469d(i2);
                matroskaExtractor.f11054u.f11109x = true;
                return;
            }
            if (i2 == 408125543) {
                long j4 = matroskaExtractor.f11050q;
                if (j4 != -1 && j4 != j2) {
                    throw ParserException.m5907a("Multiple Segment elements not supported", null);
                }
                matroskaExtractor.f11050q = j2;
                matroskaExtractor.f11049p = j3;
                return;
            }
            if (i2 == 475249515) {
                matroskaExtractor.f11009C = new LongArray();
                matroskaExtractor.f11010D = new LongArray();
            } else if (i2 == 524531317 && !matroskaExtractor.f11055v) {
                if (matroskaExtractor.f11037d && matroskaExtractor.f11059z != -1) {
                    matroskaExtractor.f11058y = true;
                } else {
                    matroskaExtractor.f11034a0.mo6393d(new SeekMap.Unseekable(matroskaExtractor.f11053t, 0L));
                    matroskaExtractor.f11055v = true;
                }
            }
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        /* renamed from: h */
        public void mo6465h(int i2, long j2) throws ParserException {
            MatroskaExtractor matroskaExtractor = MatroskaExtractor.this;
            Objects.requireNonNull(matroskaExtractor);
            if (i2 == 20529) {
                if (j2 != 0) {
                    throw ParserException.m5907a(C0576a.m4113l(55, "ContentEncodingOrder ", j2, " not supported"), null);
                }
                return;
            }
            if (i2 == 20530) {
                if (j2 != 1) {
                    throw ParserException.m5907a(C0576a.m4113l(55, "ContentEncodingScope ", j2, " not supported"), null);
                }
                return;
            }
            switch (i2) {
                case 131:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11089d = (int) j2;
                    return;
                case 136:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11082V = j2 == 1;
                    return;
                case 155:
                    matroskaExtractor.f11015I = matroskaExtractor.m6473l(j2);
                    return;
                case 159:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11075O = (int) j2;
                    return;
                case 176:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11098m = (int) j2;
                    return;
                case 179:
                    matroskaExtractor.m6468a(i2);
                    matroskaExtractor.f11009C.m7589a(matroskaExtractor.m6473l(j2));
                    return;
                case 186:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11099n = (int) j2;
                    return;
                case 215:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11088c = (int) j2;
                    return;
                case 231:
                    matroskaExtractor.f11008B = matroskaExtractor.m6473l(j2);
                    return;
                case 238:
                    matroskaExtractor.f11022P = (int) j2;
                    return;
                case 241:
                    if (matroskaExtractor.f11011E) {
                        return;
                    }
                    matroskaExtractor.m6468a(i2);
                    matroskaExtractor.f11010D.m7589a(j2);
                    matroskaExtractor.f11011E = true;
                    return;
                case 251:
                    matroskaExtractor.f11023Q = true;
                    return;
                case 16871:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11092g = (int) j2;
                    return;
                case 16980:
                    if (j2 != 3) {
                        throw ParserException.m5907a(C0576a.m4113l(50, "ContentCompAlgo ", j2, " not supported"), null);
                    }
                    return;
                case 17029:
                    if (j2 < 1 || j2 > 2) {
                        throw ParserException.m5907a(C0576a.m4113l(53, "DocTypeReadVersion ", j2, " not supported"), null);
                    }
                    return;
                case 17143:
                    if (j2 != 1) {
                        throw ParserException.m5907a(C0576a.m4113l(50, "EBMLReadVersion ", j2, " not supported"), null);
                    }
                    return;
                case 18401:
                    if (j2 != 5) {
                        throw ParserException.m5907a(C0576a.m4113l(49, "ContentEncAlgo ", j2, " not supported"), null);
                    }
                    return;
                case 18408:
                    if (j2 != 1) {
                        throw ParserException.m5907a(C0576a.m4113l(56, "AESSettingsCipherMode ", j2, " not supported"), null);
                    }
                    return;
                case 21420:
                    matroskaExtractor.f11057x = j2 + matroskaExtractor.f11050q;
                    return;
                case 21432:
                    int i3 = (int) j2;
                    matroskaExtractor.m6469d(i2);
                    if (i3 == 0) {
                        matroskaExtractor.f11054u.f11108w = 0;
                        return;
                    }
                    if (i3 == 1) {
                        matroskaExtractor.f11054u.f11108w = 2;
                        return;
                    } else if (i3 == 3) {
                        matroskaExtractor.f11054u.f11108w = 1;
                        return;
                    } else {
                        if (i3 != 15) {
                            return;
                        }
                        matroskaExtractor.f11054u.f11108w = 3;
                        return;
                    }
                case 21680:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11100o = (int) j2;
                    return;
                case 21682:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11102q = (int) j2;
                    return;
                case 21690:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11101p = (int) j2;
                    return;
                case 21930:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11081U = j2 == 1;
                    return;
                case 21998:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11091f = (int) j2;
                    return;
                case 22186:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11078R = j2;
                    return;
                case 22203:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11079S = j2;
                    return;
                case 25188:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11076P = (int) j2;
                    return;
                case 30321:
                    matroskaExtractor.m6469d(i2);
                    int i4 = (int) j2;
                    if (i4 == 0) {
                        matroskaExtractor.f11054u.f11103r = 0;
                        return;
                    }
                    if (i4 == 1) {
                        matroskaExtractor.f11054u.f11103r = 1;
                        return;
                    } else if (i4 == 2) {
                        matroskaExtractor.f11054u.f11103r = 2;
                        return;
                    } else {
                        if (i4 != 3) {
                            return;
                        }
                        matroskaExtractor.f11054u.f11103r = 3;
                        return;
                    }
                case 2352003:
                    matroskaExtractor.m6469d(i2);
                    matroskaExtractor.f11054u.f11090e = (int) j2;
                    return;
                case 2807729:
                    matroskaExtractor.f11051r = j2;
                    return;
                default:
                    switch (i2) {
                        case 21945:
                            matroskaExtractor.m6469d(i2);
                            int i5 = (int) j2;
                            if (i5 == 1) {
                                matroskaExtractor.f11054u.f11061A = 2;
                                return;
                            } else {
                                if (i5 != 2) {
                                    return;
                                }
                                matroskaExtractor.f11054u.f11061A = 1;
                                return;
                            }
                        case 21946:
                            matroskaExtractor.m6469d(i2);
                            int m7765c = ColorInfo.m7765c((int) j2);
                            if (m7765c != -1) {
                                matroskaExtractor.f11054u.f11111z = m7765c;
                                return;
                            }
                            return;
                        case 21947:
                            matroskaExtractor.m6469d(i2);
                            matroskaExtractor.f11054u.f11109x = true;
                            int m7764b = ColorInfo.m7764b((int) j2);
                            if (m7764b != -1) {
                                matroskaExtractor.f11054u.f11110y = m7764b;
                                return;
                            }
                            return;
                        case 21948:
                            matroskaExtractor.m6469d(i2);
                            matroskaExtractor.f11054u.f11062B = (int) j2;
                            return;
                        case 21949:
                            matroskaExtractor.m6469d(i2);
                            matroskaExtractor.f11054u.f11063C = (int) j2;
                            return;
                        default:
                            return;
                    }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        C0576a.m4124w(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f11006f0 = Collections.unmodifiableMap(hashMap);
    }

    public MatroskaExtractor() {
        this(0);
    }

    /* renamed from: h */
    public static int[] m6466h(@Nullable int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    /* renamed from: i */
    public static byte[] m6467i(long j2, String str, long j3) {
        Assertions.m7513a(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - ((i2 * 3600) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - ((i3 * 60) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return Util.m7708G(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (i4 * 1000000)) / j3))));
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    /* renamed from: a */
    public final void m6468a(int i2) throws ParserException {
        if (this.f11009C == null || this.f11010D == null) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Element ");
            sb.append(i2);
            sb.append(" must be in a Cues");
            throw ParserException.m5907a(sb.toString(), null);
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: b */
    public final void mo6401b(ExtractorOutput extractorOutput) {
        this.f11034a0 = extractorOutput;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    /* renamed from: c */
    public void mo6402c(long j2, long j3) {
        this.f11008B = -9223372036854775807L;
        this.f11013G = 0;
        this.f11033a.reset();
        VarintReader varintReader = this.f11035b;
        varintReader.f11116b = 0;
        varintReader.f11117c = 0;
        m6472k();
        for (int i2 = 0; i2 < this.f11036c.size(); i2++) {
            TrueHdSampleRechunker trueHdSampleRechunker = this.f11036c.valueAt(i2).f11080T;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.f10884b = false;
                trueHdSampleRechunker.f10885c = 0;
            }
        }
    }

    @EnsuresNonNull({"currentTrack"})
    /* renamed from: d */
    public final void m6469d(int i2) throws ParserException {
        if (this.f11054u != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Element ");
        sb.append(i2);
        sb.append(" must be in a TrackEntry");
        throw ParserException.m5907a(sb.toString(), null);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: e */
    public final boolean mo6403e(ExtractorInput extractorInput) throws IOException {
        Sniffer sniffer = new Sniffer();
        long length = extractorInput.getLength();
        long j2 = RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
        if (length != -1 && length <= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            j2 = length;
        }
        int i2 = (int) j2;
        extractorInput.mo6386n(sniffer.f11112a.f14698a, 0, 4);
        sniffer.f11113b = 4;
        for (long m7658v = sniffer.f11112a.m7658v(); m7658v != 440786851; m7658v = ((m7658v << 8) & (-256)) | (sniffer.f11112a.f14698a[0] & 255)) {
            int i3 = sniffer.f11113b + 1;
            sniffer.f11113b = i3;
            if (i3 == i2) {
                return false;
            }
            extractorInput.mo6386n(sniffer.f11112a.f14698a, 0, 1);
        }
        long m6478a = sniffer.m6478a(extractorInput);
        long j3 = sniffer.f11113b;
        if (m6478a == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j3 + m6478a >= length) {
            return false;
        }
        while (true) {
            long j4 = sniffer.f11113b;
            long j5 = j3 + m6478a;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (sniffer.m6478a(extractorInput) == Long.MIN_VALUE) {
                return false;
            }
            long m6478a2 = sniffer.m6478a(extractorInput);
            if (m6478a2 < 0 || m6478a2 > ParserMinimalBase.MAX_INT_L) {
                return false;
            }
            if (m6478a2 != 0) {
                int i4 = (int) m6478a2;
                extractorInput.mo6380f(i4);
                sniffer.f11113b += i4;
            }
        }
    }

    @RequiresNonNull({"#1.output"})
    /* renamed from: f */
    public final void m6470f(Track track, long j2, int i2, int i3, int i4) {
        byte[] m6467i;
        int i5;
        TrueHdSampleRechunker trueHdSampleRechunker = track.f11080T;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.m6426b(track.f11084X, j2, i2, i3, i4, track.f11095j);
        } else {
            if ("S_TEXT/UTF8".equals(track.f11087b) || "S_TEXT/ASS".equals(track.f11087b)) {
                if (this.f11017K > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j3 = this.f11015I;
                    if (j3 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = track.f11087b;
                        byte[] bArr = this.f11044k.f14698a;
                        Objects.requireNonNull(str);
                        if (str.equals("S_TEXT/ASS")) {
                            m6467i = m6467i(j3, "%01d:%02d:%02d:%02d", 10000L);
                            i5 = 21;
                        } else {
                            if (!str.equals("S_TEXT/UTF8")) {
                                throw new IllegalArgumentException();
                            }
                            m6467i = m6467i(j3, "%02d:%02d:%02d,%03d", 1000L);
                            i5 = 19;
                        }
                        System.arraycopy(m6467i, 0, bArr, i5, m6467i.length);
                        int i6 = this.f11044k.f14699b;
                        while (true) {
                            ParsableByteArray parsableByteArray = this.f11044k;
                            if (i6 >= parsableByteArray.f14700c) {
                                break;
                            }
                            if (parsableByteArray.f14698a[i6] == 0) {
                                parsableByteArray.m7634E(i6);
                                break;
                            }
                            i6++;
                        }
                        TrackOutput trackOutput = track.f11084X;
                        ParsableByteArray parsableByteArray2 = this.f11044k;
                        trackOutput.mo6397c(parsableByteArray2, parsableByteArray2.f14700c);
                        i3 += this.f11044k.f14700c;
                    }
                }
            }
            if ((268435456 & i2) != 0) {
                if (this.f11017K > 1) {
                    i2 &= -268435457;
                } else {
                    ParsableByteArray parsableByteArray3 = this.f11047n;
                    int i7 = parsableByteArray3.f14700c;
                    track.f11084X.mo6400f(parsableByteArray3, i7, 2);
                    i3 += i7;
                }
            }
            track.f11084X.mo6398d(j2, i2, i3, i4, track.f11095j);
        }
        this.f11012F = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0005 A[SYNTHETIC] */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput r9, com.google.android.exoplayer2.extractor.PositionHolder r10) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r8.f11012F = r0
            r1 = 1
            r2 = 1
        L5:
            if (r2 == 0) goto L3a
            boolean r3 = r8.f11012F
            if (r3 != 0) goto L3a
            com.google.android.exoplayer2.extractor.mkv.EbmlReader r2 = r8.f11033a
            boolean r2 = r2.mo6455a(r9)
            if (r2 == 0) goto L5
            long r3 = r9.getPosition()
            boolean r5 = r8.f11058y
            if (r5 == 0) goto L25
            r8.f11007A = r3
            long r3 = r8.f11059z
            r10.f10871a = r3
            r8.f11058y = r0
        L23:
            r3 = 1
            goto L37
        L25:
            boolean r3 = r8.f11055v
            if (r3 == 0) goto L36
            long r3 = r8.f11007A
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L36
            r10.f10871a = r3
            r8.f11007A = r5
            goto L23
        L36:
            r3 = 0
        L37:
            if (r3 == 0) goto L5
            return r1
        L3a:
            if (r2 != 0) goto L61
        L3c:
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r9 = r8.f11036c
            int r9 = r9.size()
            if (r0 >= r9) goto L5f
            android.util.SparseArray<com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track> r9 = r8.f11036c
            java.lang.Object r9 = r9.valueAt(r0)
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor$Track r9 = (com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.Track) r9
            com.google.android.exoplayer2.extractor.TrackOutput r10 = r9.f11084X
            java.util.Objects.requireNonNull(r10)
            com.google.android.exoplayer2.extractor.TrueHdSampleRechunker r10 = r9.f11080T
            if (r10 == 0) goto L5c
            com.google.android.exoplayer2.extractor.TrackOutput r1 = r9.f11084X
            com.google.android.exoplayer2.extractor.TrackOutput$CryptoData r9 = r9.f11095j
            r10.m6425a(r1, r9)
        L5c:
            int r0 = r0 + 1
            goto L3c
        L5f:
            r9 = -1
            return r9
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.mo6404g(com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.extractor.PositionHolder):int");
    }

    /* renamed from: j */
    public final void m6471j(ExtractorInput extractorInput, int i2) throws IOException {
        ParsableByteArray parsableByteArray = this.f11040g;
        if (parsableByteArray.f14700c >= i2) {
            return;
        }
        byte[] bArr = parsableByteArray.f14698a;
        if (bArr.length < i2) {
            parsableByteArray.m7638b(Math.max(bArr.length * 2, i2));
        }
        ParsableByteArray parsableByteArray2 = this.f11040g;
        byte[] bArr2 = parsableByteArray2.f14698a;
        int i3 = parsableByteArray2.f14700c;
        extractorInput.readFully(bArr2, i3, i2 - i3);
        this.f11040g.m7634E(i2);
    }

    /* renamed from: k */
    public final void m6472k() {
        this.f11024R = 0;
        this.f11025S = 0;
        this.f11026T = 0;
        this.f11027U = false;
        this.f11028V = false;
        this.f11029W = false;
        this.f11030X = 0;
        this.f11031Y = (byte) 0;
        this.f11032Z = false;
        this.f11043j.m7631B(0);
    }

    /* renamed from: l */
    public final long m6473l(long j2) throws ParserException {
        long j3 = this.f11051r;
        if (j3 != -9223372036854775807L) {
            return Util.m7723V(j2, j3, 1000L);
        }
        throw ParserException.m5907a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @RequiresNonNull({"#2.output"})
    /* renamed from: m */
    public final int m6474m(ExtractorInput extractorInput, Track track, int i2) throws IOException {
        int i3;
        if ("S_TEXT/UTF8".equals(track.f11087b)) {
            m6475n(extractorInput, f11002b0, i2);
            int i4 = this.f11025S;
            m6472k();
            return i4;
        }
        if ("S_TEXT/ASS".equals(track.f11087b)) {
            m6475n(extractorInput, f11004d0, i2);
            int i5 = this.f11025S;
            m6472k();
            return i5;
        }
        TrackOutput trackOutput = track.f11084X;
        if (!this.f11027U) {
            if (track.f11093h) {
                this.f11021O &= -1073741825;
                if (!this.f11028V) {
                    extractorInput.readFully(this.f11040g.f14698a, 0, 1);
                    this.f11024R++;
                    byte[] bArr = this.f11040g.f14698a;
                    if ((bArr[0] & 128) == 128) {
                        throw ParserException.m5907a("Extension bit is set in signal byte", null);
                    }
                    this.f11031Y = bArr[0];
                    this.f11028V = true;
                }
                byte b = this.f11031Y;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.f11021O |= 1073741824;
                    if (!this.f11032Z) {
                        extractorInput.readFully(this.f11045l.f14698a, 0, 8);
                        this.f11024R += 8;
                        this.f11032Z = true;
                        ParsableByteArray parsableByteArray = this.f11040g;
                        parsableByteArray.f14698a[0] = (byte) ((z ? 128 : 0) | 8);
                        parsableByteArray.m7635F(0);
                        trackOutput.mo6400f(this.f11040g, 1, 1);
                        this.f11025S++;
                        this.f11045l.m7635F(0);
                        trackOutput.mo6400f(this.f11045l, 8, 1);
                        this.f11025S += 8;
                    }
                    if (z) {
                        if (!this.f11029W) {
                            extractorInput.readFully(this.f11040g.f14698a, 0, 1);
                            this.f11024R++;
                            this.f11040g.m7635F(0);
                            this.f11030X = this.f11040g.m7657u();
                            this.f11029W = true;
                        }
                        int i6 = this.f11030X * 4;
                        this.f11040g.m7631B(i6);
                        extractorInput.readFully(this.f11040g.f14698a, 0, i6);
                        this.f11024R += i6;
                        short s = (short) ((this.f11030X / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f11048o;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f11048o = ByteBuffer.allocate(i7);
                        }
                        this.f11048o.position(0);
                        this.f11048o.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i3 = this.f11030X;
                            if (i8 >= i3) {
                                break;
                            }
                            int m7660x = this.f11040g.m7660x();
                            if (i8 % 2 == 0) {
                                this.f11048o.putShort((short) (m7660x - i9));
                            } else {
                                this.f11048o.putInt(m7660x - i9);
                            }
                            i8++;
                            i9 = m7660x;
                        }
                        int i10 = (i2 - this.f11024R) - i9;
                        if (i3 % 2 == 1) {
                            this.f11048o.putInt(i10);
                        } else {
                            this.f11048o.putShort((short) i10);
                            this.f11048o.putInt(0);
                        }
                        this.f11046m.m7633D(this.f11048o.array(), i7);
                        trackOutput.mo6400f(this.f11046m, i7, 1);
                        this.f11025S += i7;
                    }
                }
            } else {
                byte[] bArr2 = track.f11094i;
                if (bArr2 != null) {
                    ParsableByteArray parsableByteArray2 = this.f11043j;
                    int length = bArr2.length;
                    parsableByteArray2.f14698a = bArr2;
                    parsableByteArray2.f14700c = length;
                    parsableByteArray2.f14699b = 0;
                }
            }
            if (track.f11091f > 0) {
                this.f11021O |= 268435456;
                this.f11047n.m7631B(0);
                this.f11040g.m7631B(4);
                ParsableByteArray parsableByteArray3 = this.f11040g;
                byte[] bArr3 = parsableByteArray3.f14698a;
                bArr3[0] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[1] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[2] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                trackOutput.mo6400f(parsableByteArray3, 4, 2);
                this.f11025S += 4;
            }
            this.f11027U = true;
        }
        int i11 = i2 + this.f11043j.f14700c;
        if (!"V_MPEG4/ISO/AVC".equals(track.f11087b) && !"V_MPEGH/ISO/HEVC".equals(track.f11087b)) {
            if (track.f11080T != null) {
                Assertions.m7516d(this.f11043j.f14700c == 0);
                track.f11080T.m6427c(extractorInput);
            }
            while (true) {
                int i12 = this.f11024R;
                if (i12 >= i11) {
                    break;
                }
                int m6476o = m6476o(extractorInput, trackOutput, i11 - i12);
                this.f11024R += m6476o;
                this.f11025S += m6476o;
            }
        } else {
            byte[] bArr4 = this.f11039f.f14698a;
            bArr4[0] = 0;
            bArr4[1] = 0;
            bArr4[2] = 0;
            int i13 = track.f11085Y;
            int i14 = 4 - i13;
            while (this.f11024R < i11) {
                int i15 = this.f11026T;
                if (i15 == 0) {
                    int min = Math.min(i13, this.f11043j.m7637a());
                    extractorInput.readFully(bArr4, i14 + min, i13 - min);
                    if (min > 0) {
                        ParsableByteArray parsableByteArray4 = this.f11043j;
                        System.arraycopy(parsableByteArray4.f14698a, parsableByteArray4.f14699b, bArr4, i14, min);
                        parsableByteArray4.f14699b += min;
                    }
                    this.f11024R += i13;
                    this.f11039f.m7635F(0);
                    this.f11026T = this.f11039f.m7660x();
                    this.f11038e.m7635F(0);
                    trackOutput.mo6397c(this.f11038e, 4);
                    this.f11025S += 4;
                } else {
                    int m6476o2 = m6476o(extractorInput, trackOutput, i15);
                    this.f11024R += m6476o2;
                    this.f11025S += m6476o2;
                    this.f11026T -= m6476o2;
                }
            }
        }
        if ("A_VORBIS".equals(track.f11087b)) {
            this.f11041h.m7635F(0);
            trackOutput.mo6397c(this.f11041h, 4);
            this.f11025S += 4;
        }
        int i16 = this.f11025S;
        m6472k();
        return i16;
    }

    /* renamed from: n */
    public final void m6475n(ExtractorInput extractorInput, byte[] bArr, int i2) throws IOException {
        int length = bArr.length + i2;
        ParsableByteArray parsableByteArray = this.f11044k;
        byte[] bArr2 = parsableByteArray.f14698a;
        if (bArr2.length < length) {
            parsableByteArray.m7632C(Arrays.copyOf(bArr, length + i2));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        extractorInput.readFully(this.f11044k.f14698a, bArr.length, i2);
        this.f11044k.m7635F(0);
        this.f11044k.m7634E(length);
    }

    /* renamed from: o */
    public final int m6476o(ExtractorInput extractorInput, TrackOutput trackOutput, int i2) throws IOException {
        int m7637a = this.f11043j.m7637a();
        if (m7637a <= 0) {
            return trackOutput.mo6396b(extractorInput, i2, false);
        }
        int min = Math.min(i2, m7637a);
        trackOutput.mo6397c(this.f11043j, min);
        return min;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    public MatroskaExtractor(int i2) {
        DefaultEbmlReader defaultEbmlReader = new DefaultEbmlReader();
        this.f11050q = -1L;
        this.f11051r = -9223372036854775807L;
        this.f11052s = -9223372036854775807L;
        this.f11053t = -9223372036854775807L;
        this.f11059z = -1L;
        this.f11007A = -1L;
        this.f11008B = -9223372036854775807L;
        this.f11033a = defaultEbmlReader;
        defaultEbmlReader.m6456b(new InnerEbmlProcessor(null));
        this.f11037d = (i2 & 1) == 0;
        this.f11035b = new VarintReader();
        this.f11036c = new SparseArray<>();
        this.f11040g = new ParsableByteArray(4);
        this.f11041h = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.f11042i = new ParsableByteArray(4);
        this.f11038e = new ParsableByteArray(NalUnitUtil.f14658a);
        this.f11039f = new ParsableByteArray(4);
        this.f11043j = new ParsableByteArray();
        this.f11044k = new ParsableByteArray();
        this.f11045l = new ParsableByteArray(8);
        this.f11046m = new ParsableByteArray();
        this.f11047n = new ParsableByteArray();
        this.f11018L = new int[1];
    }

    public static final class Track {

        /* renamed from: N */
        public byte[] f11074N;

        /* renamed from: T */
        public TrueHdSampleRechunker f11080T;

        /* renamed from: U */
        public boolean f11081U;

        /* renamed from: X */
        public TrackOutput f11084X;

        /* renamed from: Y */
        public int f11085Y;

        /* renamed from: a */
        public String f11086a;

        /* renamed from: b */
        public String f11087b;

        /* renamed from: c */
        public int f11088c;

        /* renamed from: d */
        public int f11089d;

        /* renamed from: e */
        public int f11090e;

        /* renamed from: f */
        public int f11091f;

        /* renamed from: g */
        public int f11092g;

        /* renamed from: h */
        public boolean f11093h;

        /* renamed from: i */
        public byte[] f11094i;

        /* renamed from: j */
        public TrackOutput.CryptoData f11095j;

        /* renamed from: k */
        public byte[] f11096k;

        /* renamed from: l */
        public DrmInitData f11097l;

        /* renamed from: m */
        public int f11098m = -1;

        /* renamed from: n */
        public int f11099n = -1;

        /* renamed from: o */
        public int f11100o = -1;

        /* renamed from: p */
        public int f11101p = -1;

        /* renamed from: q */
        public int f11102q = 0;

        /* renamed from: r */
        public int f11103r = -1;

        /* renamed from: s */
        public float f11104s = 0.0f;

        /* renamed from: t */
        public float f11105t = 0.0f;

        /* renamed from: u */
        public float f11106u = 0.0f;

        /* renamed from: v */
        public byte[] f11107v = null;

        /* renamed from: w */
        public int f11108w = -1;

        /* renamed from: x */
        public boolean f11109x = false;

        /* renamed from: y */
        public int f11110y = -1;

        /* renamed from: z */
        public int f11111z = -1;

        /* renamed from: A */
        public int f11061A = -1;

        /* renamed from: B */
        public int f11062B = 1000;

        /* renamed from: C */
        public int f11063C = DatastoreTestTrace.DatastoreAction.ACTION_ID_FIELD_NUMBER;

        /* renamed from: D */
        public float f11064D = -1.0f;

        /* renamed from: E */
        public float f11065E = -1.0f;

        /* renamed from: F */
        public float f11066F = -1.0f;

        /* renamed from: G */
        public float f11067G = -1.0f;

        /* renamed from: H */
        public float f11068H = -1.0f;

        /* renamed from: I */
        public float f11069I = -1.0f;

        /* renamed from: J */
        public float f11070J = -1.0f;

        /* renamed from: K */
        public float f11071K = -1.0f;

        /* renamed from: L */
        public float f11072L = -1.0f;

        /* renamed from: M */
        public float f11073M = -1.0f;

        /* renamed from: O */
        public int f11075O = 1;

        /* renamed from: P */
        public int f11076P = -1;

        /* renamed from: Q */
        public int f11077Q = 8000;

        /* renamed from: R */
        public long f11078R = 0;

        /* renamed from: S */
        public long f11079S = 0;

        /* renamed from: V */
        public boolean f11082V = true;

        /* renamed from: W */
        public String f11083W = "eng";

        public Track() {
        }

        @EnsuresNonNull({"codecPrivate"})
        /* renamed from: a */
        public final byte[] m6477a(String str) throws ParserException {
            byte[] bArr = this.f11096k;
            if (bArr != null) {
                return bArr;
            }
            String valueOf = String.valueOf(str);
            throw ParserException.m5907a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        public Track(C10121 c10121) {
        }
    }
}
