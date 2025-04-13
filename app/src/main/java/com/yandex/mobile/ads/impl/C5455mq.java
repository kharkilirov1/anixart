package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.mq */
/* loaded from: classes3.dex */
final class C5455mq implements InterfaceC6118ze<Drawable> {

    /* renamed from: a */
    @NonNull
    private final vy0 f52775a = new vy0();

    /* renamed from: b */
    @NonNull
    private final C4918cf f52776b = new C4918cf();

    /* renamed from: com.yandex.mobile.ads.impl.mq$a */
    public static class a {

        /* renamed from: a */
        private final int f52777a;

        /* renamed from: b */
        private final int f52778b;

        /* renamed from: c */
        private final int f52779c;

        /* renamed from: d */
        private final int f52780d;

        public a(int i2) {
            this.f52777a = Color.alpha(i2);
            this.f52778b = Color.red(i2);
            this.f52779c = Color.green(i2);
            this.f52780d = Color.blue(i2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f52777a == aVar.f52777a && this.f52778b == aVar.f52778b && this.f52779c == aVar.f52779c && this.f52780d == aVar.f52780d;
        }

        public final int hashCode() {
            return (((((this.f52777a * 31) + this.f52778b) * 31) + this.f52779c) * 31) + this.f52780d;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6118ze
    /* renamed from: a */
    public final boolean mo22806a(@NonNull Drawable drawable, @NonNull Bitmap bitmap) {
        Bitmap m29285a;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                m29285a = bitmapDrawable.getBitmap();
                Objects.requireNonNull(this.f52776b);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(m29285a, 1, 1, true);
                Objects.requireNonNull(this.f52776b);
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
                a aVar = new a(createScaledBitmap.getPixel(0, 0));
                a aVar2 = new a(createScaledBitmap2.getPixel(0, 0));
                return Math.abs(aVar.f52777a - aVar2.f52777a) <= 20 && Math.abs(aVar.f52778b - aVar2.f52778b) <= 20 && Math.abs(aVar.f52779c - aVar2.f52779c) <= 20 && Math.abs(aVar.f52780d - aVar2.f52780d) <= 20;
            }
        }
        m29285a = this.f52775a.m29285a(drawable);
        Objects.requireNonNull(this.f52776b);
        Bitmap createScaledBitmap3 = Bitmap.createScaledBitmap(m29285a, 1, 1, true);
        Objects.requireNonNull(this.f52776b);
        Bitmap createScaledBitmap22 = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
        a aVar3 = new a(createScaledBitmap3.getPixel(0, 0));
        a aVar22 = new a(createScaledBitmap22.getPixel(0, 0));
        if (Math.abs(aVar3.f52777a - aVar22.f52777a) <= 20) {
        }
    }
}
