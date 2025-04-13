package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import com.yandex.mobile.ads.impl.ga0;

/* loaded from: classes3.dex */
public final class at0 implements ga0 {

    /* renamed from: a */
    @NonNull
    private final ga0.C5115a f48650a = new ga0.C5115a();

    /* renamed from: b */
    @NonNull
    private final C5172ha f48651b;

    /* renamed from: c */
    private final float f48652c;

    public at0(float f2) {
        this.f48652c = f2;
        this.f48651b = new C5172ha(f2);
    }

    @Override // com.yandex.mobile.ads.impl.ga0
    @NonNull
    /* renamed from: a */
    public final ga0.C5115a mo22622a(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
                int m25096a = this.f48651b.m25096a(size);
                if (mode2 == Integer.MIN_VALUE) {
                    m25096a = Math.min(size2, m25096a);
                }
                i3 = View.MeasureSpec.makeMeasureSpec(m25096a, 1073741824);
                ga0.C5115a c5115a = this.f48650a;
                c5115a.f50538a = i2;
                c5115a.f50539b = i3;
                return c5115a;
            }
        }
        if (mode2 == 1073741824) {
            if (mode == Integer.MIN_VALUE || mode == 0) {
                int m25097b = this.f48651b.m25097b(size2);
                if (mode == Integer.MIN_VALUE) {
                    m25097b = Math.min(size, m25097b);
                }
                i2 = View.MeasureSpec.makeMeasureSpec(m25097b, 1073741824);
                ga0.C5115a c5115a2 = this.f48650a;
                c5115a2.f50538a = i2;
                c5115a2.f50539b = i3;
                return c5115a2;
            }
        }
        if (mode2 == Integer.MIN_VALUE && mode == Integer.MIN_VALUE && size2 != 0 && size != 0) {
            if (size / size2 > this.f48652c) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f48651b.m25097b(size2), 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
            } else {
                int m25096a2 = this.f48651b.m25096a(size);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                i3 = View.MeasureSpec.makeMeasureSpec(m25096a2, 1073741824);
                i2 = makeMeasureSpec;
            }
        }
        ga0.C5115a c5115a22 = this.f48650a;
        c5115a22.f50538a = i2;
        c5115a22.f50539b = i3;
        return c5115a22;
    }
}
