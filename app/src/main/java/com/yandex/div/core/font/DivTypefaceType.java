package com.yandex.div.core.font;

import android.graphics.Typeface;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public enum DivTypefaceType {
    REGULAR,
    MEDIUM,
    BOLD,
    LIGHT;

    /* renamed from: com.yandex.div.core.font.DivTypefaceType$1 */
    public static /* synthetic */ class C28311 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31278a;

        static {
            int[] iArr = new int[DivTypefaceType.values().length];
            f31278a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31278a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31278a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    public Typeface m16695a(@NonNull DivTypefaceProvider divTypefaceProvider) {
        int ordinal = ordinal();
        return ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? divTypefaceProvider.getRegular() : divTypefaceProvider.getLight() : divTypefaceProvider.getBold() : divTypefaceProvider.getMedium();
    }
}
