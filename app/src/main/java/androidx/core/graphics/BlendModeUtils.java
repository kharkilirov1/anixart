package androidx.core.graphics;

import android.graphics.BlendMode;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
class BlendModeUtils {

    /* renamed from: androidx.core.graphics.BlendModeUtils$1 */
    public static /* synthetic */ class C02341 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3365a;

        static {
            int[] iArr = new int[BlendModeCompat.values().length];
            f3365a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3365a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3365a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3365a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3365a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3365a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3365a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3365a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3365a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3365a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3365a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3365a[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3365a[12] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3365a[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3365a[14] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3365a[15] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3365a[16] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f3365a[17] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f3365a[18] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f3365a[19] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f3365a[20] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f3365a[21] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f3365a[22] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f3365a[23] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f3365a[24] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f3365a[25] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f3365a[26] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f3365a[27] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f3365a[28] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    @RequiresApi
    public static class Api29Impl {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static Object m1771a(@NonNull BlendModeCompat blendModeCompat) {
            switch (blendModeCompat) {
                case CLEAR:
                    return BlendMode.CLEAR;
                case SRC:
                    return BlendMode.SRC;
                case DST:
                    return BlendMode.DST;
                case SRC_OVER:
                    return BlendMode.SRC_OVER;
                case DST_OVER:
                    return BlendMode.DST_OVER;
                case SRC_IN:
                    return BlendMode.SRC_IN;
                case DST_IN:
                    return BlendMode.DST_IN;
                case SRC_OUT:
                    return BlendMode.SRC_OUT;
                case DST_OUT:
                    return BlendMode.DST_OUT;
                case SRC_ATOP:
                    return BlendMode.SRC_ATOP;
                case DST_ATOP:
                    return BlendMode.DST_ATOP;
                case XOR:
                    return BlendMode.XOR;
                case PLUS:
                    return BlendMode.PLUS;
                case MODULATE:
                    return BlendMode.MODULATE;
                case SCREEN:
                    return BlendMode.SCREEN;
                case OVERLAY:
                    return BlendMode.OVERLAY;
                case DARKEN:
                    return BlendMode.DARKEN;
                case LIGHTEN:
                    return BlendMode.LIGHTEN;
                case COLOR_DODGE:
                    return BlendMode.COLOR_DODGE;
                case COLOR_BURN:
                    return BlendMode.COLOR_BURN;
                case HARD_LIGHT:
                    return BlendMode.HARD_LIGHT;
                case SOFT_LIGHT:
                    return BlendMode.SOFT_LIGHT;
                case DIFFERENCE:
                    return BlendMode.DIFFERENCE;
                case EXCLUSION:
                    return BlendMode.EXCLUSION;
                case MULTIPLY:
                    return BlendMode.MULTIPLY;
                case HUE:
                    return BlendMode.HUE;
                case SATURATION:
                    return BlendMode.SATURATION;
                case COLOR:
                    return BlendMode.COLOR;
                case LUMINOSITY:
                    return BlendMode.LUMINOSITY;
                default:
                    return null;
            }
        }
    }
}
