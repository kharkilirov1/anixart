package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.C4632R;
import p000a.C0000a;

/* loaded from: classes.dex */
public class PathParser {

    public static class ExtractFloatResult {

        /* renamed from: a */
        public boolean f3373a;
    }

    /* renamed from: a */
    public static boolean m1786a(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            if (pathDataNodeArr[i2].f3374a != pathDataNodeArr2[i2].f3374a || pathDataNodeArr[i2].f3375b.length != pathDataNodeArr2[i2].f3375b.length) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static float[] m1787b(float[] fArr, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (i2 < 0 || i2 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i4 = i3 - i2;
        int min = Math.min(i4, length - i2);
        float[] fArr2 = new float[i4];
        System.arraycopy(fArr, i2, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4 A[Catch: NumberFormatException -> 0x00c8, LOOP:3: B:29:0x0073->B:40:0x00a4, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00c8, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0073, B:31:0x0079, B:36:0x0087, B:40:0x00a4, B:54:0x008f, B:58:0x0098, B:44:0x00a9, B:45:0x00b6, B:50:0x00bb, B:64:0x00c0), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9 A[Catch: NumberFormatException -> 0x00c8, TryCatch #0 {NumberFormatException -> 0x00c8, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0073, B:31:0x0079, B:36:0x0087, B:40:0x00a4, B:54:0x008f, B:58:0x0098, B:44:0x00a9, B:45:0x00b6, B:50:0x00bb, B:64:0x00c0), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bb A[Catch: NumberFormatException -> 0x00c8, TryCatch #0 {NumberFormatException -> 0x00c8, blocks: (B:26:0x005a, B:28:0x006d, B:29:0x0073, B:31:0x0079, B:36:0x0087, B:40:0x00a4, B:54:0x008f, B:58:0x0098, B:44:0x00a9, B:45:0x00b6, B:50:0x00bb, B:64:0x00c0), top: B:25:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.graphics.PathParser.PathDataNode[] m1788c(java.lang.String r16) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.m1788c(java.lang.String):androidx.core.graphics.PathParser$PathDataNode[]");
    }

    /* renamed from: d */
    public static Path m1789d(String str) {
        Path path = new Path();
        PathDataNode[] m1788c = m1788c(str);
        if (m1788c == null) {
            return null;
        }
        try {
            PathDataNode.m1792b(m1788c, path);
            return path;
        } catch (RuntimeException e2) {
            throw new RuntimeException(C0000a.m14k("Error in parsing ", str), e2);
        }
    }

    /* renamed from: e */
    public static PathDataNode[] m1790e(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i2 = 0; i2 < pathDataNodeArr.length; i2++) {
            pathDataNodeArr2[i2] = new PathDataNode(pathDataNodeArr[i2]);
        }
        return pathDataNodeArr2;
    }

    public static class PathDataNode {

        /* renamed from: a */
        public char f3374a;

        /* renamed from: b */
        public float[] f3375b;

        public PathDataNode(char c2, float[] fArr) {
            this.f3374a = c2;
            this.f3375b = fArr;
        }

        /* renamed from: a */
        public static void m1791a(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f8);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f2;
            double d4 = f3;
            double d5 = (d4 * sin) + (d3 * cos);
            double d6 = d3;
            double d7 = f6;
            double d8 = d5 / d7;
            double d9 = f7;
            double d10 = ((d4 * cos) + ((-f2) * sin)) / d9;
            double d11 = d4;
            double d12 = f5;
            double d13 = ((d12 * sin) + (f4 * cos)) / d7;
            double d14 = ((d12 * cos) + ((-f4) * sin)) / d9;
            double d15 = d8 - d13;
            double d16 = d10 - d14;
            double d17 = (d8 + d13) / 2.0d;
            double d18 = (d10 + d14) / 2.0d;
            double d19 = (d16 * d16) + (d15 * d15);
            if (d19 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d20 = (1.0d / d19) - 0.25d;
            if (d20 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d19);
                float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
                m1791a(path, f2, f3, f4, f5, f6 * sqrt, f7 * sqrt, f8, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d20);
            double d21 = d15 * sqrt2;
            double d22 = sqrt2 * d16;
            if (z == z2) {
                d = d17 - d22;
                d2 = d18 + d21;
            } else {
                d = d17 + d22;
                d2 = d18 - d21;
            }
            double atan2 = Math.atan2(d10 - d2, d8 - d);
            double atan22 = Math.atan2(d14 - d2, d13 - d) - atan2;
            int i2 = 0;
            if (z2 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d23 = d * d7;
            double d24 = d2 * d9;
            double d25 = (d23 * cos) - (d24 * sin);
            double d26 = (d24 * cos) + (d23 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d27 = -d7;
            double d28 = d27 * cos2;
            double d29 = d9 * sin2;
            double d30 = (d28 * sin3) - (d29 * cos3);
            double d31 = d27 * sin2;
            double d32 = d9 * cos2;
            double d33 = (cos3 * d32) + (sin3 * d31);
            double d34 = atan22 / ceil;
            double d35 = atan2;
            while (i2 < ceil) {
                double d36 = d35 + d34;
                double sin4 = Math.sin(d36);
                double cos4 = Math.cos(d36);
                double d37 = d34;
                double d38 = (((d7 * cos2) * cos4) + d25) - (d29 * sin4);
                double d39 = d25;
                double d40 = (d32 * sin4) + (d7 * sin2 * cos4) + d26;
                double d41 = (d28 * sin4) - (d29 * cos4);
                double d42 = (cos4 * d32) + (sin4 * d31);
                double d43 = d36 - d35;
                double tan = Math.tan(d43 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d30 * sqrt3) + d6), (float) ((d33 * sqrt3) + d11), (float) (d38 - (sqrt3 * d41)), (float) (d40 - (sqrt3 * d42)), (float) d38, (float) d40);
                i2++;
                d32 = d32;
                d31 = d31;
                ceil = ceil;
                cos2 = cos2;
                d35 = d36;
                d7 = d7;
                d33 = d42;
                d30 = d41;
                d6 = d38;
                d11 = d40;
                d34 = d37;
                d25 = d39;
            }
        }

        /* renamed from: b */
        public static void m1792b(PathDataNode[] pathDataNodeArr, Path path) {
            int i2;
            int i3;
            float[] fArr;
            char c2;
            int i4;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f20;
            PathDataNode[] pathDataNodeArr2 = pathDataNodeArr;
            float[] fArr2 = new float[6];
            char c3 = 'm';
            char c4 = 0;
            char c5 = 'm';
            int i5 = 0;
            while (i5 < pathDataNodeArr2.length) {
                char c6 = pathDataNodeArr2[i5].f3374a;
                float[] fArr3 = pathDataNodeArr2[i5].f3375b;
                float f21 = fArr2[c4];
                float f22 = fArr2[1];
                float f23 = fArr2[2];
                float f24 = fArr2[3];
                float f25 = fArr2[4];
                float f26 = fArr2[5];
                switch (c6) {
                    case C4632R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                    case C4632R.styleable.AppCompatTheme_selectableItemBackground /* 97 */:
                        i2 = 7;
                        break;
                    case C4632R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                    case C4632R.styleable.AppCompatTheme_spinnerDropDownItemStyle /* 99 */:
                        i2 = 6;
                        break;
                    case C4632R.styleable.AppCompatTheme_imageButtonStyle /* 72 */:
                    case C4632R.styleable.AppCompatTheme_panelBackground /* 86 */:
                    case C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary /* 104 */:
                    case C4632R.styleable.AppCompatTheme_windowActionBarOverlay /* 118 */:
                        i2 = 1;
                        break;
                    case C4632R.styleable.AppCompatTheme_listPreferredItemHeightSmall /* 81 */:
                    case C4632R.styleable.AppCompatTheme_listPreferredItemPaddingLeft /* 83 */:
                    case C4632R.styleable.AppCompatTheme_toolbarStyle /* 113 */:
                    case C4632R.styleable.AppCompatTheme_tooltipFrameBackground /* 115 */:
                        i2 = 4;
                        break;
                    case 'Z':
                    case C4632R.styleable.AppCompatTheme_windowFixedWidthMajor /* 122 */:
                        path.close();
                        path.moveTo(f25, f26);
                        f21 = f25;
                        f23 = f21;
                        f22 = f26;
                        f24 = f22;
                    default:
                        i2 = 2;
                        break;
                }
                float f27 = f25;
                float f28 = f26;
                float f29 = f21;
                float f30 = f22;
                int i6 = 0;
                while (i6 < fArr3.length) {
                    if (c6 != 'A') {
                        if (c6 != 'C') {
                            if (c6 == 'H') {
                                i3 = i6;
                                fArr = fArr3;
                                c2 = c6;
                                i4 = i5;
                                int i7 = i3 + 0;
                                path.lineTo(fArr[i7], f30);
                                f29 = fArr[i7];
                            } else if (c6 == 'Q') {
                                i3 = i6;
                                fArr = fArr3;
                                c2 = c6;
                                i4 = i5;
                                int i8 = i3 + 0;
                                int i9 = i3 + 1;
                                int i10 = i3 + 2;
                                int i11 = i3 + 3;
                                path.quadTo(fArr[i8], fArr[i9], fArr[i10], fArr[i11]);
                                f2 = fArr[i8];
                                f3 = fArr[i9];
                                f29 = fArr[i10];
                                f30 = fArr[i11];
                            } else if (c6 == 'V') {
                                i3 = i6;
                                fArr = fArr3;
                                c2 = c6;
                                i4 = i5;
                                int i12 = i3 + 0;
                                path.lineTo(f29, fArr[i12]);
                                f30 = fArr[i12];
                            } else if (c6 != 'a') {
                                if (c6 != 'c') {
                                    if (c6 == 'h') {
                                        i3 = i6;
                                        int i13 = i3 + 0;
                                        path.rLineTo(fArr3[i13], 0.0f);
                                        f29 += fArr3[i13];
                                    } else if (c6 != 'q') {
                                        if (c6 == 'v') {
                                            i3 = i6;
                                            f11 = f30;
                                            int i14 = i3 + 0;
                                            path.rLineTo(0.0f, fArr3[i14]);
                                            f12 = fArr3[i14];
                                        } else if (c6 == 'L') {
                                            i3 = i6;
                                            int i15 = i3 + 0;
                                            int i16 = i3 + 1;
                                            path.lineTo(fArr3[i15], fArr3[i16]);
                                            f29 = fArr3[i15];
                                            f30 = fArr3[i16];
                                        } else if (c6 == 'M') {
                                            i3 = i6;
                                            int i17 = i3 + 0;
                                            float f31 = fArr3[i17];
                                            int i18 = i3 + 1;
                                            float f32 = fArr3[i18];
                                            if (i3 > 0) {
                                                path.lineTo(fArr3[i17], fArr3[i18]);
                                                f29 = f31;
                                                f30 = f32;
                                            } else {
                                                path.moveTo(fArr3[i17], fArr3[i18]);
                                                f27 = f31;
                                                f28 = f32;
                                                f29 = f27;
                                                f30 = f28;
                                            }
                                        } else if (c6 == 'S') {
                                            i3 = i6;
                                            float f33 = f30;
                                            float f34 = f29;
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f13 = (f33 * 2.0f) - f24;
                                                f14 = (f34 * 2.0f) - f23;
                                            } else {
                                                f14 = f34;
                                                f13 = f33;
                                            }
                                            int i19 = i3 + 0;
                                            int i20 = i3 + 1;
                                            int i21 = i3 + 2;
                                            int i22 = i3 + 3;
                                            path.cubicTo(f14, f13, fArr3[i19], fArr3[i20], fArr3[i21], fArr3[i22]);
                                            float f35 = fArr3[i19];
                                            float f36 = fArr3[i20];
                                            f10 = fArr3[i21];
                                            f9 = fArr3[i22];
                                            f23 = f35;
                                            f24 = f36;
                                            f29 = f10;
                                            f30 = f9;
                                        } else if (c6 == 'T') {
                                            i3 = i6;
                                            float f37 = f30;
                                            float f38 = f29;
                                            if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                f15 = (f38 * 2.0f) - f23;
                                                f16 = (f37 * 2.0f) - f24;
                                            } else {
                                                f15 = f38;
                                                f16 = f37;
                                            }
                                            int i23 = i3 + 0;
                                            int i24 = i3 + 1;
                                            path.quadTo(f15, f16, fArr3[i23], fArr3[i24]);
                                            f24 = f16;
                                            f23 = f15;
                                            fArr = fArr3;
                                            c2 = c6;
                                            i4 = i5;
                                            f29 = fArr3[i23];
                                            f30 = fArr3[i24];
                                        } else if (c6 == 'l') {
                                            i3 = i6;
                                            f11 = f30;
                                            int i25 = i3 + 0;
                                            int i26 = i3 + 1;
                                            path.rLineTo(fArr3[i25], fArr3[i26]);
                                            f29 += fArr3[i25];
                                            f12 = fArr3[i26];
                                        } else if (c6 == c3) {
                                            i3 = i6;
                                            int i27 = i3 + 0;
                                            f29 += fArr3[i27];
                                            int i28 = i3 + 1;
                                            f30 += fArr3[i28];
                                            if (i3 > 0) {
                                                path.rLineTo(fArr3[i27], fArr3[i28]);
                                            } else {
                                                path.rMoveTo(fArr3[i27], fArr3[i28]);
                                                f28 = f30;
                                                f27 = f29;
                                                f29 = f27;
                                                f30 = f28;
                                            }
                                        } else if (c6 != 's') {
                                            if (c6 == 't') {
                                                if (c5 == 'q' || c5 == 't' || c5 == 'Q' || c5 == 'T') {
                                                    f19 = f29 - f23;
                                                    f20 = f30 - f24;
                                                } else {
                                                    f20 = 0.0f;
                                                    f19 = 0.0f;
                                                }
                                                int i29 = i6 + 0;
                                                int i30 = i6 + 1;
                                                path.rQuadTo(f19, f20, fArr3[i29], fArr3[i30]);
                                                float f39 = f19 + f29;
                                                float f40 = f20 + f30;
                                                f29 += fArr3[i29];
                                                f30 += fArr3[i30];
                                                f24 = f40;
                                                f23 = f39;
                                            }
                                            i3 = i6;
                                        } else {
                                            if (c5 == 'c' || c5 == 's' || c5 == 'C' || c5 == 'S') {
                                                f17 = f30 - f24;
                                                f18 = f29 - f23;
                                            } else {
                                                f18 = 0.0f;
                                                f17 = 0.0f;
                                            }
                                            int i31 = i6 + 0;
                                            int i32 = i6 + 1;
                                            int i33 = i6 + 2;
                                            int i34 = i6 + 3;
                                            i3 = i6;
                                            f4 = f30;
                                            float f41 = f29;
                                            path.rCubicTo(f18, f17, fArr3[i31], fArr3[i32], fArr3[i33], fArr3[i34]);
                                            f5 = fArr3[i31] + f41;
                                            f6 = fArr3[i32] + f4;
                                            f7 = f41 + fArr3[i33];
                                            f8 = fArr3[i34];
                                        }
                                        f30 = f11 + f12;
                                    } else {
                                        i3 = i6;
                                        f4 = f30;
                                        float f42 = f29;
                                        int i35 = i3 + 0;
                                        int i36 = i3 + 1;
                                        int i37 = i3 + 2;
                                        int i38 = i3 + 3;
                                        path.rQuadTo(fArr3[i35], fArr3[i36], fArr3[i37], fArr3[i38]);
                                        f5 = fArr3[i35] + f42;
                                        f6 = fArr3[i36] + f4;
                                        float f43 = f42 + fArr3[i37];
                                        float f44 = fArr3[i38];
                                        f7 = f43;
                                        f8 = f44;
                                    }
                                    fArr = fArr3;
                                    c2 = c6;
                                    i4 = i5;
                                } else {
                                    i3 = i6;
                                    f4 = f30;
                                    float f45 = f29;
                                    int i39 = i3 + 2;
                                    int i40 = i3 + 3;
                                    int i41 = i3 + 4;
                                    int i42 = i3 + 5;
                                    path.rCubicTo(fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i39], fArr3[i40], fArr3[i41], fArr3[i42]);
                                    f5 = fArr3[i39] + f45;
                                    f6 = fArr3[i40] + f4;
                                    f7 = f45 + fArr3[i41];
                                    f8 = fArr3[i42];
                                }
                                f9 = f4 + f8;
                                f23 = f5;
                                f24 = f6;
                                f10 = f7;
                                f29 = f10;
                                f30 = f9;
                                fArr = fArr3;
                                c2 = c6;
                                i4 = i5;
                            } else {
                                i3 = i6;
                                float f46 = f30;
                                float f47 = f29;
                                int i43 = i3 + 5;
                                int i44 = i3 + 6;
                                fArr = fArr3;
                                c2 = c6;
                                i4 = i5;
                                m1791a(path, f47, f46, fArr3[i43] + f47, fArr3[i44] + f46, fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i3 + 2], fArr3[i3 + 3] != 0.0f, fArr3[i3 + 4] != 0.0f);
                                f29 = f47 + fArr[i43];
                                f30 = f46 + fArr[i44];
                            }
                            i6 = i3 + i2;
                            c5 = c2;
                            c6 = c5;
                            fArr3 = fArr;
                            i5 = i4;
                            c3 = 'm';
                        } else {
                            i3 = i6;
                            fArr = fArr3;
                            c2 = c6;
                            i4 = i5;
                            int i45 = i3 + 2;
                            int i46 = i3 + 3;
                            int i47 = i3 + 4;
                            int i48 = i3 + 5;
                            path.cubicTo(fArr[i3 + 0], fArr[i3 + 1], fArr[i45], fArr[i46], fArr[i47], fArr[i48]);
                            float f48 = fArr[i47];
                            float f49 = fArr[i48];
                            f2 = fArr[i45];
                            f29 = f48;
                            f30 = f49;
                            f3 = fArr[i46];
                        }
                        f23 = f2;
                        f24 = f3;
                        i6 = i3 + i2;
                        c5 = c2;
                        c6 = c5;
                        fArr3 = fArr;
                        i5 = i4;
                        c3 = 'm';
                    } else {
                        i3 = i6;
                        fArr = fArr3;
                        c2 = c6;
                        i4 = i5;
                        int i49 = i3 + 5;
                        int i50 = i3 + 6;
                        m1791a(path, f29, f30, fArr[i49], fArr[i50], fArr[i3 + 0], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f, fArr[i3 + 4] != 0.0f);
                        f29 = fArr[i49];
                        f30 = fArr[i50];
                    }
                    f24 = f30;
                    f23 = f29;
                    i6 = i3 + i2;
                    c5 = c2;
                    c6 = c5;
                    fArr3 = fArr;
                    i5 = i4;
                    c3 = 'm';
                }
                int i51 = i5;
                fArr2[0] = f29;
                fArr2[1] = f30;
                fArr2[2] = f23;
                fArr2[3] = f24;
                fArr2[4] = f27;
                fArr2[5] = f28;
                i5 = i51 + 1;
                c5 = pathDataNodeArr[i51].f3374a;
                c3 = 'm';
                c4 = 0;
                pathDataNodeArr2 = pathDataNodeArr;
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.f3374a = pathDataNode.f3374a;
            float[] fArr = pathDataNode.f3375b;
            this.f3375b = PathParser.m1787b(fArr, 0, fArr.length);
        }
    }
}
