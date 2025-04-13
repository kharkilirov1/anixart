package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ga0;
import java.util.Objects;

/* renamed from: com.yandex.mobile.ads.impl.k7 */
/* loaded from: classes3.dex */
public final class C5324k7 implements ga0 {

    /* renamed from: a */
    @NonNull
    private final Context f51881a;

    /* renamed from: b */
    @NonNull
    private final C6034xo f51882b = new C6034xo();

    /* renamed from: c */
    @NonNull
    private final C6084yo f51883c = new C6084yo();

    public C5324k7(@NonNull Context context) {
        this.f51881a = context.getApplicationContext();
    }

    @Override // com.yandex.mobile.ads.impl.ga0
    @NonNull
    /* renamed from: a */
    public final ga0.C5115a mo22622a(int i2, int i3) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode != 0) {
            Context context = this.f51881a;
            int i4 = tg1.f55120b;
            int i5 = context.getResources().getDisplayMetrics().widthPixels;
            C6084yo c6084yo = this.f51883c;
            Context context2 = this.f51881a;
            Objects.requireNonNull(c6084yo);
            int m29954a = C6084yo.m29954a(context2, 420.0f);
            int i6 = this.f51881a.getResources().getConfiguration().orientation;
            if (this.f51882b.m29779a(this.f51881a) != 1 || i6 != 1) {
                i5 = Math.min(i5, m29954a);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, size), 1073741824);
        }
        if (mode2 != 0) {
            Context context3 = this.f51881a;
            int i7 = tg1.f55120b;
            int i8 = context3.getResources().getDisplayMetrics().heightPixels;
            C6084yo c6084yo2 = this.f51883c;
            Context context4 = this.f51881a;
            Objects.requireNonNull(c6084yo2);
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(Math.min(i8, C6084yo.m29954a(context4, 350.0f)), size2), 1073741824);
        }
        ga0.C5115a c5115a = new ga0.C5115a();
        c5115a.f50539b = i3;
        c5115a.f50538a = i2;
        return c5115a;
    }
}
