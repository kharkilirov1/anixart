package com.yandex.mobile.ads.fullscreen.template.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.C5113g9;
import com.yandex.mobile.ads.impl.f11;
import com.yandex.mobile.ads.impl.ga0;

/* loaded from: classes2.dex */
public class ExtendedTextView extends TextView {

    /* renamed from: a */
    @NonNull
    private ga0 f48270a;

    /* renamed from: b */
    @Nullable
    private final C5113g9 f48271b;

    public ExtendedTextView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        C5113g9 c5113g9;
        super.onLayout(z, i2, i3, i4, i5);
        if ((Build.VERSION.SDK_INT >= 27) || (c5113g9 = this.f48271b) == null) {
            return;
        }
        c5113g9.m24824a();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i3) {
        ga0.C5115a mo22622a = this.f48270a.mo22622a(i2, i3);
        super.onMeasure(mo22622a.f50538a, mo22622a.f50539b);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        C5113g9 c5113g9;
        super.onTextChanged(charSequence, i2, i3, i4);
        if ((Build.VERSION.SDK_INT >= 27) || (c5113g9 = this.f48271b) == null) {
            return;
        }
        c5113g9.m24827b();
    }

    public void setAutoSizeTextType(int i2) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C5113g9 c5113g9 = this.f48271b;
        if (c5113g9 != null) {
            c5113g9.m24825a(i2);
        }
    }

    public void setMeasureSpecProvider(@NonNull ga0 ga0Var) {
        this.f48270a = ga0Var;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f2) {
        if (Build.VERSION.SDK_INT >= 27) {
            super.setTextSize(i2, f2);
            return;
        }
        C5113g9 c5113g9 = this.f48271b;
        if (c5113g9 != null) {
            c5113g9.m24826a(i2, f2);
        }
    }

    public ExtendedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint
    public ExtendedTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f48270a = new f11();
        this.f48271b = new C5113g9(this);
    }
}
