package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.yandex.mobile.ads.impl.C5751sl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.wq */
/* loaded from: classes3.dex */
final class C5984wq {

    /* renamed from: h */
    private static final byte[] f56179h = {0, 7, 8, 15};

    /* renamed from: i */
    private static final byte[] f56180i = {0, 119, -120, -1};

    /* renamed from: j */
    private static final byte[] f56181j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, ByteSourceJsonBootstrapper.UTF8_BOM_2, -52, -35, -18, -1};

    /* renamed from: a */
    private final Paint f56182a;

    /* renamed from: b */
    private final Paint f56183b;

    /* renamed from: c */
    private final Canvas f56184c;

    /* renamed from: d */
    private final b f56185d;

    /* renamed from: e */
    private final a f56186e;

    /* renamed from: f */
    private final h f56187f;

    /* renamed from: g */
    private Bitmap f56188g;

    /* renamed from: com.yandex.mobile.ads.impl.wq$a */
    public static final class a {

        /* renamed from: a */
        public final int f56189a;

        /* renamed from: b */
        public final int[] f56190b;

        /* renamed from: c */
        public final int[] f56191c;

        /* renamed from: d */
        public final int[] f56192d;

        public a(int i2, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f56189a = i2;
            this.f56190b = iArr;
            this.f56191c = iArr2;
            this.f56192d = iArr3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$b */
    public static final class b {

        /* renamed from: a */
        public final int f56193a;

        /* renamed from: b */
        public final int f56194b;

        /* renamed from: c */
        public final int f56195c;

        /* renamed from: d */
        public final int f56196d;

        /* renamed from: e */
        public final int f56197e;

        /* renamed from: f */
        public final int f56198f;

        public b(int i2, int i3, int i4, int i5, int i6, int i7) {
            this.f56193a = i2;
            this.f56194b = i3;
            this.f56195c = i4;
            this.f56196d = i5;
            this.f56197e = i6;
            this.f56198f = i7;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$c */
    public static final class c {

        /* renamed from: a */
        public final int f56199a;

        /* renamed from: b */
        public final boolean f56200b;

        /* renamed from: c */
        public final byte[] f56201c;

        /* renamed from: d */
        public final byte[] f56202d;

        public c(int i2, boolean z, byte[] bArr, byte[] bArr2) {
            this.f56199a = i2;
            this.f56200b = z;
            this.f56201c = bArr;
            this.f56202d = bArr2;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$d */
    public static final class d {

        /* renamed from: a */
        public final int f56203a;

        /* renamed from: b */
        public final int f56204b;

        /* renamed from: c */
        public final SparseArray<e> f56205c;

        public d(int i2, int i3, SparseArray sparseArray) {
            this.f56203a = i2;
            this.f56204b = i3;
            this.f56205c = sparseArray;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$e */
    public static final class e {

        /* renamed from: a */
        public final int f56206a;

        /* renamed from: b */
        public final int f56207b;

        public e(int i2, int i3) {
            this.f56206a = i2;
            this.f56207b = i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$f */
    public static final class f {

        /* renamed from: a */
        public final int f56208a;

        /* renamed from: b */
        public final boolean f56209b;

        /* renamed from: c */
        public final int f56210c;

        /* renamed from: d */
        public final int f56211d;

        /* renamed from: e */
        public final int f56212e;

        /* renamed from: f */
        public final int f56213f;

        /* renamed from: g */
        public final int f56214g;

        /* renamed from: h */
        public final int f56215h;

        /* renamed from: i */
        public final int f56216i;

        /* renamed from: j */
        public final SparseArray<g> f56217j;

        public f(int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, SparseArray sparseArray) {
            this.f56208a = i2;
            this.f56209b = z;
            this.f56210c = i3;
            this.f56211d = i4;
            this.f56212e = i5;
            this.f56213f = i6;
            this.f56214g = i7;
            this.f56215h = i8;
            this.f56216i = i9;
            this.f56217j = sparseArray;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$g */
    public static final class g {

        /* renamed from: a */
        public final int f56218a;

        /* renamed from: b */
        public final int f56219b;

        public g(int i2, int i3) {
            this.f56218a = i2;
            this.f56219b = i3;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wq$h */
    public static final class h {

        /* renamed from: a */
        public final int f56220a;

        /* renamed from: b */
        public final int f56221b;

        /* renamed from: c */
        public final SparseArray<f> f56222c = new SparseArray<>();

        /* renamed from: d */
        public final SparseArray<a> f56223d = new SparseArray<>();

        /* renamed from: e */
        public final SparseArray<c> f56224e = new SparseArray<>();

        /* renamed from: f */
        public final SparseArray<a> f56225f = new SparseArray<>();

        /* renamed from: g */
        public final SparseArray<c> f56226g = new SparseArray<>();

        /* renamed from: h */
        @Nullable
        public b f56227h;

        /* renamed from: i */
        @Nullable
        public d f56228i;

        public h(int i2, int i3) {
            this.f56220a = i2;
            this.f56221b = i3;
        }
    }

    public C5984wq(int i2, int i3) {
        Paint paint = new Paint();
        this.f56182a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f56183b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f56184c = new Canvas();
        this.f56185d = new b(719, 575, 0, 719, 0, 575);
        this.f56186e = new a(0, m29526a(), m29527b(), m29528c());
        this.f56187f = new h(i2, i3);
    }

    /* renamed from: a */
    private static int m29522a(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* renamed from: b */
    private static int[] m29527b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = m29522a(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i2 & 2) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0, (i2 & 4) != 0 ? KotlinVersion.MAX_COMPONENT_VALUE : 0);
            } else {
                iArr[i2] = m29522a(KotlinVersion.MAX_COMPONENT_VALUE, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    private static int[] m29528c() {
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
                iArr[i2] = m29522a(63, i4, i5, i3);
            } else {
                int i6 = i2 & 136;
                if (i6 == 0) {
                    iArr[i2] = m29522a(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 8) {
                    iArr[i2] = m29522a(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i6 == 128) {
                    iArr[i2] = m29522a(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i6 == 136) {
                    iArr[i2] = m29522a(KotlinVersion.MAX_COMPONENT_VALUE, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final List m29529a(int i2, byte[] bArr) {
        SparseArray<e> sparseArray;
        int i3;
        SparseArray<g> sparseArray2;
        f fVar;
        int i4;
        int i5;
        int i6;
        int i7;
        zo0 zo0Var = new zo0(i2, bArr);
        while (zo0Var.m30251b() >= 48 && zo0Var.m30252b(8) == 15) {
            h hVar = this.f56187f;
            int m30252b = zo0Var.m30252b(8);
            int i8 = 16;
            int m30252b2 = zo0Var.m30252b(16);
            int m30252b3 = zo0Var.m30252b(16);
            int m30256d = zo0Var.m30256d() + m30252b3;
            if (m30252b3 * 8 > zo0Var.m30251b()) {
                d90.m23842d("DvbParser", "Data field length exceeds limit");
                zo0Var.m30257d(zo0Var.m30251b());
            } else {
                switch (m30252b) {
                    case 16:
                        if (m30252b2 == hVar.f56220a) {
                            d dVar = hVar.f56228i;
                            zo0Var.m30252b(8);
                            int m30252b4 = zo0Var.m30252b(4);
                            int m30252b5 = zo0Var.m30252b(2);
                            zo0Var.m30257d(2);
                            int i9 = m30252b3 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i9 > 0) {
                                int m30252b6 = zo0Var.m30252b(8);
                                zo0Var.m30257d(8);
                                i9 -= 6;
                                sparseArray3.put(m30252b6, new e(zo0Var.m30252b(16), zo0Var.m30252b(16)));
                            }
                            d dVar2 = new d(m30252b4, m30252b5, sparseArray3);
                            if (m30252b5 != 0) {
                                hVar.f56228i = dVar2;
                                hVar.f56222c.clear();
                                hVar.f56223d.clear();
                                hVar.f56224e.clear();
                                break;
                            } else if (dVar != null && dVar.f56203a != m30252b4) {
                                hVar.f56228i = dVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        d dVar3 = hVar.f56228i;
                        if (m30252b2 == hVar.f56220a && dVar3 != null) {
                            int m30252b7 = zo0Var.m30252b(8);
                            zo0Var.m30257d(4);
                            boolean m30260f = zo0Var.m30260f();
                            zo0Var.m30257d(3);
                            int m30252b8 = zo0Var.m30252b(16);
                            int m30252b9 = zo0Var.m30252b(16);
                            zo0Var.m30252b(3);
                            int m30252b10 = zo0Var.m30252b(3);
                            zo0Var.m30257d(2);
                            int m30252b11 = zo0Var.m30252b(8);
                            int m30252b12 = zo0Var.m30252b(8);
                            int m30252b13 = zo0Var.m30252b(4);
                            int m30252b14 = zo0Var.m30252b(2);
                            zo0Var.m30257d(2);
                            int i10 = m30252b3 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i10 > 0) {
                                int m30252b15 = zo0Var.m30252b(i8);
                                int m30252b16 = zo0Var.m30252b(2);
                                zo0Var.m30252b(2);
                                int m30252b17 = zo0Var.m30252b(12);
                                zo0Var.m30257d(4);
                                int m30252b18 = zo0Var.m30252b(12);
                                i10 -= 6;
                                if (m30252b16 == 1 || m30252b16 == 2) {
                                    zo0Var.m30252b(8);
                                    zo0Var.m30252b(8);
                                    i10 -= 2;
                                }
                                sparseArray4.put(m30252b15, new g(m30252b17, m30252b18));
                                i8 = 16;
                            }
                            f fVar2 = new f(m30252b7, m30260f, m30252b8, m30252b9, m30252b10, m30252b11, m30252b12, m30252b13, m30252b14, sparseArray4);
                            if (dVar3.f56204b == 0 && (fVar = hVar.f56222c.get(m30252b7)) != null) {
                                SparseArray<g> sparseArray5 = fVar.f56217j;
                                for (int i11 = 0; i11 < sparseArray5.size(); i11++) {
                                    fVar2.f56217j.put(sparseArray5.keyAt(i11), sparseArray5.valueAt(i11));
                                }
                            }
                            hVar.f56222c.put(fVar2.f56208a, fVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (m30252b2 == hVar.f56220a) {
                            a m29523a = m29523a(zo0Var, m30252b3);
                            hVar.f56223d.put(m29523a.f56189a, m29523a);
                            break;
                        } else if (m30252b2 == hVar.f56221b) {
                            a m29523a2 = m29523a(zo0Var, m30252b3);
                            hVar.f56225f.put(m29523a2.f56189a, m29523a2);
                            break;
                        }
                        break;
                    case 19:
                        if (m30252b2 == hVar.f56220a) {
                            c m29524a = m29524a(zo0Var);
                            hVar.f56224e.put(m29524a.f56199a, m29524a);
                            break;
                        } else if (m30252b2 == hVar.f56221b) {
                            c m29524a2 = m29524a(zo0Var);
                            hVar.f56226g.put(m29524a2.f56199a, m29524a2);
                            break;
                        }
                        break;
                    case 20:
                        if (m30252b2 == hVar.f56220a) {
                            zo0Var.m30257d(4);
                            boolean m30260f2 = zo0Var.m30260f();
                            zo0Var.m30257d(3);
                            int m30252b19 = zo0Var.m30252b(16);
                            int m30252b20 = zo0Var.m30252b(16);
                            if (m30260f2) {
                                int m30252b21 = zo0Var.m30252b(16);
                                i4 = zo0Var.m30252b(16);
                                i7 = zo0Var.m30252b(16);
                                i6 = m30252b21;
                                i5 = zo0Var.m30252b(16);
                            } else {
                                i4 = m30252b19;
                                i5 = m30252b20;
                                i6 = 0;
                                i7 = 0;
                            }
                            hVar.f56227h = new b(m30252b19, m30252b20, i6, i4, i7, i5);
                            break;
                        }
                        break;
                }
                zo0Var.m30259e(m30256d - zo0Var.m30256d());
            }
        }
        h hVar2 = this.f56187f;
        d dVar4 = hVar2.f56228i;
        if (dVar4 == null) {
            return Collections.emptyList();
        }
        b bVar = hVar2.f56227h;
        if (bVar == null) {
            bVar = this.f56185d;
        }
        Bitmap bitmap = this.f56188g;
        if (bitmap == null || bVar.f56193a + 1 != bitmap.getWidth() || bVar.f56194b + 1 != this.f56188g.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(bVar.f56193a + 1, bVar.f56194b + 1, Bitmap.Config.ARGB_8888);
            this.f56188g = createBitmap;
            this.f56184c.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<e> sparseArray6 = dVar4.f56205c;
        int i12 = 0;
        while (i12 < sparseArray6.size()) {
            this.f56184c.save();
            e valueAt = sparseArray6.valueAt(i12);
            f fVar3 = this.f56187f.f56222c.get(sparseArray6.keyAt(i12));
            int i13 = valueAt.f56206a + bVar.f56195c;
            int i14 = valueAt.f56207b + bVar.f56197e;
            this.f56184c.clipRect(i13, i14, Math.min(fVar3.f56210c + i13, bVar.f56196d), Math.min(fVar3.f56211d + i14, bVar.f56198f));
            a aVar = this.f56187f.f56223d.get(fVar3.f56213f);
            if (aVar == null && (aVar = this.f56187f.f56225f.get(fVar3.f56213f)) == null) {
                aVar = this.f56186e;
            }
            SparseArray<g> sparseArray7 = fVar3.f56217j;
            int i15 = 0;
            while (i15 < sparseArray7.size()) {
                int keyAt = sparseArray7.keyAt(i15);
                g valueAt2 = sparseArray7.valueAt(i15);
                c cVar = this.f56187f.f56224e.get(keyAt);
                if (cVar == null) {
                    cVar = this.f56187f.f56226g.get(keyAt);
                }
                if (cVar != null) {
                    Paint paint = cVar.f56200b ? null : this.f56182a;
                    int i16 = fVar3.f56212e;
                    int i17 = valueAt2.f56218a + i13;
                    int i18 = valueAt2.f56219b + i14;
                    sparseArray = sparseArray6;
                    Canvas canvas = this.f56184c;
                    sparseArray2 = sparseArray7;
                    i3 = i12;
                    int[] iArr = i16 == 3 ? aVar.f56192d : i16 == 2 ? aVar.f56191c : aVar.f56190b;
                    Paint paint2 = paint;
                    m29525a(cVar.f56201c, iArr, i16, i17, i18, paint2, canvas);
                    m29525a(cVar.f56202d, iArr, i16, i17, i18 + 1, paint2, canvas);
                } else {
                    sparseArray = sparseArray6;
                    i3 = i12;
                    sparseArray2 = sparseArray7;
                }
                i15++;
                sparseArray6 = sparseArray;
                sparseArray7 = sparseArray2;
                i12 = i3;
            }
            SparseArray<e> sparseArray8 = sparseArray6;
            int i19 = i12;
            if (fVar3.f56209b) {
                int i20 = fVar3.f56212e;
                this.f56183b.setColor(i20 == 3 ? aVar.f56192d[fVar3.f56214g] : i20 == 2 ? aVar.f56191c[fVar3.f56215h] : aVar.f56190b[fVar3.f56216i]);
                this.f56184c.drawRect(i13, i14, fVar3.f56210c + i13, fVar3.f56211d + i14, this.f56183b);
            }
            arrayList.add(new C5751sl.a().m28303a(Bitmap.createBitmap(this.f56188g, i13, i14, fVar3.f56210c, fVar3.f56211d)).m28307b(i13 / bVar.f56193a).m28308b(0).m28302a(0, i14 / bVar.f56194b).m28301a(0).m28316d(fVar3.f56210c / bVar.f56193a).m28300a(fVar3.f56211d / bVar.f56194b).m28305a());
            this.f56184c.drawColor(0, PorterDuff.Mode.CLEAR);
            this.f56184c.restore();
            i12 = i19 + 1;
            sparseArray6 = sparseArray8;
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: d */
    public final void m29530d() {
        h hVar = this.f56187f;
        hVar.f56222c.clear();
        hVar.f56223d.clear();
        hVar.f56224e.clear();
        hVar.f56225f.clear();
        hVar.f56226g.clear();
        hVar.f56227h = null;
        hVar.f56228i = null;
    }

    /* renamed from: a */
    private static a m29523a(zo0 zo0Var, int i2) {
        int m30252b;
        int i3;
        int m30252b2;
        int i4;
        int i5;
        int i6 = 8;
        int m30252b3 = zo0Var.m30252b(8);
        zo0Var.m30257d(8);
        int i7 = 2;
        int i8 = i2 - 2;
        int[] m29526a = m29526a();
        int[] m29527b = m29527b();
        int[] m29528c = m29528c();
        while (i8 > 0) {
            int m30252b4 = zo0Var.m30252b(i6);
            int m30252b5 = zo0Var.m30252b(i6);
            int i9 = i8 - 2;
            int[] iArr = (m30252b5 & 128) != 0 ? m29526a : (m30252b5 & 64) != 0 ? m29527b : m29528c;
            if ((m30252b5 & 1) != 0) {
                i4 = zo0Var.m30252b(i6);
                i5 = zo0Var.m30252b(i6);
                m30252b = zo0Var.m30252b(i6);
                m30252b2 = zo0Var.m30252b(i6);
                i3 = i9 - 4;
            } else {
                int m30252b6 = zo0Var.m30252b(6) << i7;
                int m30252b7 = zo0Var.m30252b(4) << 4;
                m30252b = zo0Var.m30252b(4) << 4;
                i3 = i9 - 2;
                m30252b2 = zo0Var.m30252b(i7) << 6;
                i4 = m30252b6;
                i5 = m30252b7;
            }
            if (i4 == 0) {
                i5 = 0;
                m30252b = 0;
                m30252b2 = KotlinVersion.MAX_COMPONENT_VALUE;
            }
            byte b2 = (byte) (255 - (m30252b2 & KotlinVersion.MAX_COMPONENT_VALUE));
            double d2 = i4;
            int i10 = m30252b3;
            double d3 = i5 - 128;
            int i11 = (int) ((1.402d * d3) + d2);
            double d4 = m30252b - 128;
            int i12 = (int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d));
            int i13 = (int) ((d4 * 1.772d) + d2);
            int i14 = s91.f54530a;
            iArr[m30252b4] = m29522a(b2, Math.max(0, Math.min(i11, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i12, KotlinVersion.MAX_COMPONENT_VALUE)), Math.max(0, Math.min(i13, KotlinVersion.MAX_COMPONENT_VALUE)));
            i8 = i3;
            m30252b3 = i10;
            i6 = 8;
            i7 = 2;
        }
        return new a(m30252b3, m29526a, m29527b, m29528c);
    }

    /* renamed from: a */
    private static c m29524a(zo0 zo0Var) {
        byte[] bArr;
        int m30252b = zo0Var.m30252b(16);
        zo0Var.m30257d(4);
        int m30252b2 = zo0Var.m30252b(2);
        boolean m30260f = zo0Var.m30260f();
        zo0Var.m30257d(1);
        byte[] bArr2 = s91.f54535f;
        if (m30252b2 == 1) {
            zo0Var.m30257d(zo0Var.m30252b(8) * 16);
        } else if (m30252b2 == 0) {
            int m30252b3 = zo0Var.m30252b(16);
            int m30252b4 = zo0Var.m30252b(16);
            if (m30252b3 > 0) {
                bArr2 = new byte[m30252b3];
                zo0Var.m30253b(bArr2, m30252b3);
            }
            if (m30252b4 > 0) {
                bArr = new byte[m30252b4];
                zo0Var.m30253b(bArr, m30252b4);
                return new c(m30252b, m30260f, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(m30252b, m30260f, bArr2, bArr);
    }

    /* renamed from: a */
    private static int[] m29526a() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0167 A[LOOP:2: B:41:0x00cb->B:52:0x0167, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0208 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x023d A[LOOP:3: B:87:0x018b->B:98:0x023d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0237 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m29525a(byte[] r23, int[] r24, int r25, int r26, int r27, @androidx.annotation.Nullable android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C5984wq.m29525a(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }
}
