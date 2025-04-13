package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.yandex.mobile.ads.C4632R;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.impl.C5606pv;
import java.util.Arrays;

/* renamed from: com.yandex.mobile.ads.impl.qq */
/* loaded from: classes3.dex */
public final class C5653qq {

    /* renamed from: a */
    private static final int[] f54123a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f54124b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, CharsToNameCanonicalizer.MAX_ENTRIES_FOR_REUSE, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f54125c = {64, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle, 128, 192, 224, 256, 384, 448, RecyclerView.ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN, 640, 768, 896, RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE, 1152, 1280, 1536, 1920, RecyclerView.ViewHolder.FLAG_MOVED, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, RecyclerView.ViewHolder.FLAG_APPEARED_IN_PRE_LAYOUT, 6144, 7680};

    /* renamed from: a */
    public static C5606pv m27774a(byte[] bArr, @Nullable String str, @Nullable String str2) {
        zo0 zo0Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            zo0Var = new zo0(bArr.length, bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b2 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b2;
                }
            }
            zo0Var = new zo0(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                zo0 zo0Var2 = new zo0(copyOf.length, copyOf);
                while (zo0Var2.m30251b() >= 16) {
                    zo0Var2.m30257d(2);
                    zo0Var.m30248a(zo0Var2.m30252b(14));
                }
            }
            zo0Var.m30249a(copyOf.length, copyOf);
        }
        zo0Var.m30257d(60);
        int i4 = f54123a[zo0Var.m30252b(6)];
        int i5 = f54124b[zo0Var.m30252b(4)];
        int m30252b = zo0Var.m30252b(5);
        int i6 = m30252b < 29 ? (f54125c[m30252b] * 1000) / 2 : -1;
        zo0Var.m30257d(10);
        return new C5606pv.a().m27555c(str).m27561f("audio/vnd.dts").m27552b(i6).m27554c(i4 + (zo0Var.m30252b(2) > 0 ? 1 : 0)).m27569n(i5).m27544a((DrmInitData) null).m27559e(str2).m27550a();
    }
}
