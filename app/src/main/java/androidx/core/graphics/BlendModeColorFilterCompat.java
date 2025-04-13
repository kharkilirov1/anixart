package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;

/* loaded from: classes.dex */
public class BlendModeColorFilterCompat {

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        /* renamed from: a */
        public static ColorFilter m1770a(int i2, Object obj) {
            return new BlendModeColorFilter(i2, (BlendMode) obj);
        }
    }

    @Nullable
    /* renamed from: a */
    public static ColorFilter m1769a(int i2, @NonNull BlendModeCompat blendModeCompat) {
        PorterDuff.Mode mode;
        if (Build.VERSION.SDK_INT >= 29) {
            Object m1771a = BlendModeUtils.Api29Impl.m1771a(blendModeCompat);
            if (m1771a != null) {
                return Api29Impl.m1770a(i2, m1771a);
            }
            return null;
        }
        switch (blendModeCompat) {
            case CLEAR:
                mode = PorterDuff.Mode.CLEAR;
                break;
            case SRC:
                mode = PorterDuff.Mode.SRC;
                break;
            case DST:
                mode = PorterDuff.Mode.DST;
                break;
            case SRC_OVER:
                mode = PorterDuff.Mode.SRC_OVER;
                break;
            case DST_OVER:
                mode = PorterDuff.Mode.DST_OVER;
                break;
            case SRC_IN:
                mode = PorterDuff.Mode.SRC_IN;
                break;
            case DST_IN:
                mode = PorterDuff.Mode.DST_IN;
                break;
            case SRC_OUT:
                mode = PorterDuff.Mode.SRC_OUT;
                break;
            case DST_OUT:
                mode = PorterDuff.Mode.DST_OUT;
                break;
            case SRC_ATOP:
                mode = PorterDuff.Mode.SRC_ATOP;
                break;
            case DST_ATOP:
                mode = PorterDuff.Mode.DST_ATOP;
                break;
            case XOR:
                mode = PorterDuff.Mode.XOR;
                break;
            case PLUS:
                mode = PorterDuff.Mode.ADD;
                break;
            case MODULATE:
                mode = PorterDuff.Mode.MULTIPLY;
                break;
            case SCREEN:
                mode = PorterDuff.Mode.SCREEN;
                break;
            case OVERLAY:
                mode = PorterDuff.Mode.OVERLAY;
                break;
            case DARKEN:
                mode = PorterDuff.Mode.DARKEN;
                break;
            case LIGHTEN:
                mode = PorterDuff.Mode.LIGHTEN;
                break;
            default:
                mode = null;
                break;
        }
        if (mode != null) {
            return new PorterDuffColorFilter(i2, mode);
        }
        return null;
    }
}
