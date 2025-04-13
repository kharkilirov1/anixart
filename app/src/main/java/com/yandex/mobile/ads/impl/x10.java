package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.tw0;

/* loaded from: classes3.dex */
public final class x10 extends zv0<Bitmap> {

    /* renamed from: v */
    private static final Object f56321v = new Object();

    /* renamed from: p */
    private final Object f56322p;

    /* renamed from: q */
    @Nullable
    @GuardedBy
    private tw0.InterfaceC5822b<Bitmap> f56323q;

    /* renamed from: r */
    private final Bitmap.Config f56324r;

    /* renamed from: s */
    private final int f56325s;

    /* renamed from: t */
    private final int f56326t;

    /* renamed from: u */
    private final ImageView.ScaleType f56327u;

    public x10(String str, tw0.InterfaceC5822b<Bitmap> interfaceC5822b, int i2, int i3, ImageView.ScaleType scaleType, Bitmap.Config config, @Nullable tw0.InterfaceC5821a interfaceC5821a) {
        super(0, str, interfaceC5821a);
        this.f56322p = new Object();
        m30310a(new C4982do(2.0f, 1000, 2));
        this.f56323q = interfaceC5822b;
        this.f56324r = config;
        this.f56325s = i2;
        this.f56326t = i3;
        this.f56327u = scaleType;
    }

    /* renamed from: b */
    private tw0<Bitmap> m29625b(km0 km0Var) {
        Bitmap decodeByteArray;
        byte[] bArr = km0Var.f52033b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f56325s == 0 && this.f56326t == 0) {
            options.inPreferredConfig = this.f56324r;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            int m29624a = m29624a(this.f56325s, this.f56326t, i2, i3, this.f56327u);
            int m29624a2 = m29624a(this.f56326t, this.f56325s, i3, i2, this.f56327u);
            options.inJustDecodeBounds = false;
            float f2 = 1.0f;
            while (true) {
                float f3 = 2.0f * f2;
                if (f3 > Math.min(i2 / m29624a, i3 / m29624a2)) {
                    break;
                }
                f2 = f3;
            }
            options.inSampleSize = (int) f2;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > m29624a || decodeByteArray.getHeight() > m29624a2)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, m29624a, m29624a2, true);
                decodeByteArray.recycle();
                decodeByteArray = createScaledBitmap;
            }
        }
        return decodeByteArray == null ? tw0.m28763a(new dp0(km0Var)) : tw0.m28764a(decodeByteArray, k00.m26002a(km0Var));
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final void mo23873a(Bitmap bitmap) {
        tw0.InterfaceC5822b<Bitmap> interfaceC5822b;
        Bitmap bitmap2 = bitmap;
        synchronized (this.f56322p) {
            interfaceC5822b = this.f56323q;
        }
        if (interfaceC5822b != null) {
            interfaceC5822b.mo22924a(bitmap2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: h */
    public final int mo29626h() {
        return 1;
    }

    /* renamed from: a */
    private static int m29624a(int i2, int i3, int i4, int i5, ImageView.ScaleType scaleType) {
        if (i2 == 0 && i3 == 0) {
            return i4;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i2 == 0 ? i4 : i2;
        }
        if (i2 == 0) {
            return (int) (i4 * (i3 / i5));
        }
        if (i3 == 0) {
            return i2;
        }
        double d = i5 / i4;
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d2 = i3;
            return ((double) i2) * d < d2 ? (int) (d2 / d) : i2;
        }
        double d3 = i3;
        return ((double) i2) * d > d3 ? (int) (d3 / d) : i2;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final tw0<Bitmap> mo22616a(km0 km0Var) {
        tw0<Bitmap> m29625b;
        synchronized (f56321v) {
            try {
                try {
                    m29625b = m29625b(km0Var);
                } catch (OutOfMemoryError e2) {
                    Object[] objArr = {Integer.valueOf(km0Var.f52033b.length), mo27673m()};
                    boolean z = rh1.f54313a;
                    n60.m26810c("Caught OOM for %d byte image, url=%s", objArr);
                    return tw0.m28763a(new dp0(e2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m29625b;
    }

    @Override // com.yandex.mobile.ads.impl.zv0
    /* renamed from: a */
    public final void mo26796a() {
        super.mo26796a();
        synchronized (this.f56322p) {
            this.f56323q = null;
        }
    }
}
