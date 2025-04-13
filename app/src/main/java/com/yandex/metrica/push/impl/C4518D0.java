package com.yandex.metrica.push.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.yandex.metrica.push.impl.D0 */
/* loaded from: classes2.dex */
public class C4518D0 {

    /* renamed from: a */
    @NonNull
    private final InterfaceC4544Q0 f47290a;

    public C4518D0(@NonNull Context context) {
        this.f47290a = new C4545R0(context).m21472a();
    }

    @Nullable
    /* renamed from: a */
    public Bitmap m21425a(@NonNull Context context, @NonNull String str, float f2, float f3) {
        float f4 = context.getResources().getDisplayMetrics().density;
        float f5 = f2 * f4;
        float f6 = f4 * f3;
        byte[] mo21471a = this.f47290a.mo21471a(str);
        if (mo21471a == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(mo21471a, 0, mo21471a.length, options);
        float max = Math.max(f2 > 0.0f ? options.outWidth / f5 : 1.0f, f3 > 0.0f ? options.outHeight / f6 : 1.0f);
        options.inJustDecodeBounds = false;
        options.inSampleSize = Math.round(max);
        return BitmapFactory.decodeByteArray(mo21471a, 0, mo21471a.length, options);
    }
}
