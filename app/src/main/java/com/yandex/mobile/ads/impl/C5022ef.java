package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Array;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.ef */
/* loaded from: classes3.dex */
public final class C5022ef {
    @NonNull
    /* renamed from: a */
    public static Bitmap m24135a(@NonNull Bitmap bitmap) {
        try {
            return m24136b(bitmap);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    @NonNull
    /* renamed from: b */
    private static Bitmap m24136b(@NonNull Bitmap bitmap) {
        int[] iArr;
        int i2 = 0;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.1f), Math.round(bitmap.getHeight() * 0.1f), false);
        int i3 = 1;
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i4 = width * height;
        int[] iArr2 = new int[i4];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[RecyclerView.ViewHolder.FLAG_ADAPTER_FULLUPDATE];
        for (int i7 = 0; i7 < 1024; i7++) {
            iArr7[i7] = i7 / 4;
        }
        int[][] iArr8 = (int[][]) Array.newInstance((Class<?>) int.class, 3, 3);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < height) {
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i11 <= i3) {
                int i21 = iArr2[Math.min(i5, Math.max(i11, i2)) + i9];
                int i22 = i11 + 1;
                int[] iArr9 = iArr8[i22];
                iArr9[i2] = (i21 & 16711680) >> 16;
                iArr9[1] = (i21 & 65280) >> 8;
                iArr9[2] = i21 & KotlinVersion.MAX_COMPONENT_VALUE;
                int abs = 2 - StrictMath.abs(i11);
                int i23 = iArr9[i2];
                i12 = (i23 * abs) + i12;
                int i24 = iArr9[1];
                i13 = (i24 * abs) + i13;
                int i25 = iArr9[2];
                i14 = (abs * i25) + i14;
                if (i11 > 0) {
                    i18 += i23;
                    i20 += i24;
                    i19 += i25;
                } else {
                    i17 += i23;
                    i16 += i24;
                    i15 += i25;
                }
                i11 = i22;
                i3 = 1;
            }
            int i26 = 1;
            int i27 = 0;
            while (i27 < width) {
                iArr3[i9] = iArr7[i12];
                iArr4[i9] = iArr7[i13];
                iArr5[i9] = iArr7[i14];
                int i28 = i12 - i17;
                int i29 = i13 - i16;
                int i30 = i14 - i15;
                int[] iArr10 = iArr8[((i26 - 1) + 3) % 3];
                int i31 = i17 - iArr10[i2];
                int i32 = i16 - iArr10[1];
                int i33 = i15 - iArr10[2];
                if (i8 == 0) {
                    iArr6[i27] = Math.min(i27 + 1 + 1, i5);
                }
                int i34 = iArr2[i10 + iArr6[i27]];
                int i35 = (i34 & 16711680) >> 16;
                iArr10[0] = i35;
                int i36 = (i34 & 65280) >> 8;
                iArr10[1] = i36;
                int i37 = i34 & KotlinVersion.MAX_COMPONENT_VALUE;
                iArr10[2] = i37;
                int i38 = i18 + i35;
                int i39 = i20 + i36;
                int i40 = i19 + i37;
                i12 = i28 + i38;
                i13 = i29 + i39;
                i14 = i30 + i40;
                i26 = (i26 + 1) % 3;
                int[] iArr11 = iArr8[i26 % 3];
                int i41 = iArr11[0];
                i17 = i31 + i41;
                int i42 = iArr11[1];
                i16 = i32 + i42;
                int i43 = iArr11[2];
                i15 = i33 + i43;
                i18 = i38 - i41;
                i20 = i39 - i42;
                i19 = i40 - i43;
                i9++;
                i27++;
                i2 = 0;
            }
            i10 += width;
            i8++;
            i2 = 0;
            i3 = 1;
        }
        int i44 = 0;
        while (i44 < width) {
            int i45 = width * (-1);
            Bitmap bitmap2 = copy;
            int[] iArr12 = iArr6;
            int i46 = -1;
            int i47 = 0;
            int i48 = 0;
            int i49 = 0;
            int i50 = 0;
            int i51 = 0;
            int i52 = 0;
            int i53 = 0;
            int i54 = 0;
            int i55 = 0;
            for (int i56 = 1; i46 <= i56; i56 = 1) {
                int max = Math.max(0, i45) + i44;
                int i57 = i46 + 1;
                int[] iArr13 = iArr8[i57];
                iArr13[0] = iArr3[max];
                iArr13[1] = iArr4[max];
                iArr13[2] = iArr5[max];
                int abs2 = 2 - StrictMath.abs(i46);
                i47 = (iArr3[max] * abs2) + i47;
                i48 = (iArr4[max] * abs2) + i48;
                i49 = (iArr5[max] * abs2) + i49;
                if (i46 > 0) {
                    i53 += iArr13[0];
                    i55 += iArr13[1];
                    i54 += iArr13[2];
                } else {
                    i52 += iArr13[0];
                    i51 += iArr13[1];
                    i50 += iArr13[2];
                }
                if (i46 < i6) {
                    i45 += width;
                }
                i46 = i57;
            }
            int i58 = i44;
            int i59 = 0;
            int i60 = 1;
            while (i59 < height) {
                iArr2[i58] = (iArr2[i58] & (-16777216)) | (iArr7[i47] << 16) | (iArr7[i48] << 8) | iArr7[i49];
                int i61 = i47 - i52;
                int i62 = i48 - i51;
                int i63 = i49 - i50;
                int[] iArr14 = iArr8[((i60 - 1) + 3) % 3];
                int i64 = i52 - iArr14[0];
                int i65 = i51 - iArr14[1];
                int i66 = i50 - iArr14[2];
                if (i44 == 0) {
                    iArr = iArr7;
                    iArr12[i59] = Math.min(i59 + 2, i6) * width;
                } else {
                    iArr = iArr7;
                }
                int i67 = iArr12[i59] + i44;
                int i68 = iArr3[i67];
                iArr14[0] = i68;
                int i69 = iArr4[i67];
                iArr14[1] = i69;
                int i70 = iArr5[i67];
                iArr14[2] = i70;
                int i71 = i53 + i68;
                int i72 = i55 + i69;
                int i73 = i54 + i70;
                i47 = i61 + i71;
                i48 = i62 + i72;
                i49 = i63 + i73;
                i60 = (i60 + 1) % 3;
                int[] iArr15 = iArr8[i60];
                int i74 = iArr15[0];
                i52 = i64 + i74;
                int i75 = iArr15[1];
                i51 = i65 + i75;
                int i76 = iArr15[2];
                i50 = i66 + i76;
                i53 = i71 - i74;
                i55 = i72 - i75;
                i54 = i73 - i76;
                i58 += width;
                i59++;
                iArr7 = iArr;
            }
            i44++;
            copy = bitmap2;
            iArr6 = iArr12;
            iArr7 = iArr7;
        }
        Bitmap bitmap3 = copy;
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmap3;
    }
}
