package com.google.android.exoplayer2.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.Util;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
final class DvbParser {

    /* renamed from: h */
    public static final byte[] f13608h = {0, 7, 8, 15};

    /* renamed from: i */
    public static final byte[] f13609i = {0, 119, -120, -1};

    /* renamed from: j */
    public static final byte[] f13610j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};

    /* renamed from: a */
    public final Paint f13611a;

    /* renamed from: b */
    public final Paint f13612b;

    /* renamed from: c */
    public final Canvas f13613c;

    /* renamed from: d */
    public final DisplayDefinition f13614d;

    /* renamed from: e */
    public final ClutDefinition f13615e;

    /* renamed from: f */
    public final SubtitleService f13616f;

    /* renamed from: g */
    public Bitmap f13617g;

    public static final class ClutDefinition {

        /* renamed from: a */
        public final int f13618a;

        /* renamed from: b */
        public final int[] f13619b;

        /* renamed from: c */
        public final int[] f13620c;

        /* renamed from: d */
        public final int[] f13621d;

        public ClutDefinition(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f13618a = i2;
            this.f13619b = iArr;
            this.f13620c = iArr2;
            this.f13621d = iArr3;
        }
    }

    public static final class DisplayDefinition {

        /* renamed from: a */
        public final int f13622a;

        /* renamed from: b */
        public final int f13623b;

        /* renamed from: c */
        public final int f13624c;

        /* renamed from: d */
        public final int f13625d;

        /* renamed from: e */
        public final int f13626e;

        /* renamed from: f */
        public final int f13627f;

        public DisplayDefinition(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f13622a = i2;
            this.f13623b = i3;
            this.f13624c = i4;
            this.f13625d = i5;
            this.f13626e = i6;
            this.f13627f = i7;
        }
    }

    public static final class ObjectData {

        /* renamed from: a */
        public final int f13628a;

        /* renamed from: b */
        public final boolean f13629b;

        /* renamed from: c */
        public final byte[] f13630c;

        /* renamed from: d */
        public final byte[] f13631d;

        public ObjectData(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.f13628a = i2;
            this.f13629b = z;
            this.f13630c = bArr;
            this.f13631d = bArr2;
        }
    }

    public static final class PageComposition {

        /* renamed from: a */
        public final int f13632a;

        /* renamed from: b */
        public final int f13633b;

        /* renamed from: c */
        public final SparseArray<PageRegion> f13634c;

        public PageComposition(int i2, int i3, int i4, SparseArray<PageRegion> sparseArray) {
            this.f13632a = i3;
            this.f13633b = i4;
            this.f13634c = sparseArray;
        }
    }

    public static final class PageRegion {

        /* renamed from: a */
        public final int f13635a;

        /* renamed from: b */
        public final int f13636b;

        public PageRegion(int i2, int i3) {
            this.f13635a = i2;
            this.f13636b = i3;
        }
    }

    public static final class RegionComposition {

        /* renamed from: a */
        public final int f13637a;

        /* renamed from: b */
        public final boolean f13638b;

        /* renamed from: c */
        public final int f13639c;

        /* renamed from: d */
        public final int f13640d;

        /* renamed from: e */
        public final int f13641e;

        /* renamed from: f */
        public final int f13642f;

        /* renamed from: g */
        public final int f13643g;

        /* renamed from: h */
        public final int f13644h;

        /* renamed from: i */
        public final int f13645i;

        /* renamed from: j */
        public final SparseArray<RegionObject> f13646j;

        public RegionComposition(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, SparseArray<RegionObject> sparseArray) {
            this.f13637a = i2;
            this.f13638b = z;
            this.f13639c = i3;
            this.f13640d = i4;
            this.f13641e = i6;
            this.f13642f = i7;
            this.f13643g = i8;
            this.f13644h = i9;
            this.f13645i = i10;
            this.f13646j = sparseArray;
        }
    }

    public static final class RegionObject {

        /* renamed from: a */
        public final int f13647a;

        /* renamed from: b */
        public final int f13648b;

        public RegionObject(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f13647a = i4;
            this.f13648b = i5;
        }
    }

    public static final class SubtitleService {

        /* renamed from: a */
        public final int f13649a;

        /* renamed from: b */
        public final int f13650b;

        /* renamed from: c */
        public final SparseArray<RegionComposition> f13651c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<ClutDefinition> f13652d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<ObjectData> f13653e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<ClutDefinition> f13654f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<ObjectData> f13655g = new SparseArray<>();

        /* renamed from: h */
        @Nullable
        public DisplayDefinition f13656h;

        /* renamed from: i */
        @Nullable
        public PageComposition f13657i;

        public SubtitleService(int i2, int i3) {
            this.f13649a = i2;
            this.f13650b = i3;
        }
    }

    public DvbParser(int i2, int i3) {
        Paint paint = new Paint();
        this.f13611a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f13612b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f13613c = new Canvas();
        this.f13614d = new DisplayDefinition(719, 575, 0, 719, 0, 575);
        this.f13615e = new ClutDefinition(0, new int[]{0, -1, -16777216, -8421505}, m7223b(), m7224c());
        this.f13616f = new SubtitleService(i2, i3);
    }

    /* renamed from: a */
    public static byte[] m7222a(int i2, int i3, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) parsableBitArray.m7622g(i3);
        }
        return bArr;
    }

    /* renamed from: b */
    public static int[] m7223b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = m7225d(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i2 & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i2 & 4) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            } else {
                iArr[i2] = m7225d(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public static int[] m7224c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            int i3 = KotlinVersion.MAX_COMPONENT_VALUE;
            if (i2 < 8) {
                int i4 = (i2 & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
                int i5 = (i2 & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0;
                if ((i2 & 4) == 0) {
                    i3 = 0;
                }
                iArr[i2] = m7225d(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                if (i6 == 0) {
                    iArr[i2] = m7225d(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i2] = m7225d(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i2] = m7225d(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = m7225d(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: d */
    public static int m7225d(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0205 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141 A[LOOP:2: B:42:0x00ab->B:56:0x0141, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x020b A[LOOP:3: B:86:0x0163->B:99:0x020b, LOOP_END] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7226e(byte[] r23, int[] r24, int r25, int r26, int r27, @androidx.annotation.Nullable android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.dvb.DvbParser.m7226e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    /* renamed from: f */
    public static ClutDefinition m7227f(ParsableBitArray parsableBitArray, int i2) {
        int i3;
        int m7622g;
        int i4;
        int i5;
        int i6 = 8;
        int m7622g2 = parsableBitArray.m7622g(8);
        parsableBitArray.m7628m(8);
        int i7 = i2 - 2;
        int i8 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] m7223b = m7223b();
        int[] m7224c = m7224c();
        while (i7 > 0) {
            int m7622g3 = parsableBitArray.m7622g(i6);
            int m7622g4 = parsableBitArray.m7622g(i6);
            int i9 = i7 - 2;
            int[] iArr2 = (m7622g4 & 128) != 0 ? iArr : (m7622g4 & 64) != 0 ? m7223b : m7224c;
            if ((m7622g4 & 1) != 0) {
                i4 = parsableBitArray.m7622g(i6);
                i3 = parsableBitArray.m7622g(i6);
                i5 = parsableBitArray.m7622g(i6);
                m7622g = parsableBitArray.m7622g(i6);
                i7 = i9 - 4;
            } else {
                int m7622g5 = parsableBitArray.m7622g(6) << 2;
                int m7622g6 = parsableBitArray.m7622g(i8) << i8;
                int m7622g7 = parsableBitArray.m7622g(i8) << i8;
                i7 = i9 - 2;
                i3 = m7622g6;
                m7622g = parsableBitArray.m7622g(2) << 6;
                i4 = m7622g5;
                i5 = m7622g7;
            }
            if (i4 == 0) {
                i3 = 0;
                i5 = 0;
                m7622g = KotlinVersion.MAX_COMPONENT_VALUE;
            }
            double d = i4;
            double d2 = i3 - 128;
            double d3 = i5 - 128;
            iArr2[m7622g3] = m7225d((byte) (255 - (m7622g & KotlinVersion.MAX_COMPONENT_VALUE)), Util.m7741j((int) ((1.402d * d2) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE), Util.m7741j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, KotlinVersion.MAX_COMPONENT_VALUE), Util.m7741j((int) ((d3 * 1.772d) + d), 0, KotlinVersion.MAX_COMPONENT_VALUE));
            iArr = iArr;
            m7622g2 = m7622g2;
            i6 = 8;
            i8 = 4;
        }
        return new ClutDefinition(m7622g2, iArr, m7223b, m7224c);
    }

    /* renamed from: g */
    public static ObjectData m7228g(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int m7622g = parsableBitArray.m7622g(16);
        parsableBitArray.m7628m(4);
        int m7622g2 = parsableBitArray.m7622g(2);
        boolean m7621f = parsableBitArray.m7621f();
        parsableBitArray.m7628m(1);
        byte[] bArr2 = Util.f14741f;
        if (m7622g2 == 1) {
            parsableBitArray.m7628m(parsableBitArray.m7622g(8) * 16);
        } else if (m7622g2 == 0) {
            int m7622g3 = parsableBitArray.m7622g(16);
            int m7622g4 = parsableBitArray.m7622g(16);
            if (m7622g3 > 0) {
                bArr2 = new byte[m7622g3];
                parsableBitArray.m7624i(bArr2, 0, m7622g3);
            }
            if (m7622g4 > 0) {
                bArr = new byte[m7622g4];
                parsableBitArray.m7624i(bArr, 0, m7622g4);
                return new ObjectData(m7622g, m7621f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(m7622g, m7621f, bArr2, bArr);
    }
}
