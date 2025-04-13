package com.google.android.exoplayer2.audio;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.C4632R;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class Ac3Util {

    /* renamed from: a */
    public static final int[] f10273a = {1, 2, 3, 6};

    /* renamed from: b */
    public static final int[] f10274b = {48000, 44100, 32000};

    /* renamed from: c */
    public static final int[] f10275c = {24000, 22050, 16000};

    /* renamed from: d */
    public static final int[] f10276d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    public static final int[] f10277e = {32, 40, 48, 56, 64, 80, 96, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 160, 192, 224, 256, 320, 384, 448, RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN, 576, 640};

    /* renamed from: f */
    public static final int[] f10278f = {69, 87, C4632R.styleable.AppCompatTheme_textAppearanceListItemSecondary, C4632R.styleable.AppCompatTheme_windowFixedHeightMinor, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class SyncFrameInfo {

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface StreamType {
        }
    }

    /* renamed from: a */
    public static int m6104a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f10274b;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = f10278f;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + iArr2[i4]) * 2;
        }
        int i6 = f10277e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }
}
