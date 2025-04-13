package com.yandex.mobile.ads.nativeads.template;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.nativeads.template.b */
/* loaded from: classes3.dex */
final class C6251b {

    /* renamed from: b */
    @VisibleForTesting
    public static final int f57925b = Color.parseColor("#eaeaea");

    /* renamed from: a */
    private final ImageView[] f57926a;

    public C6251b(@NonNull ImageView... imageViewArr) {
        this.f57926a = imageViewArr;
        m30722b();
    }

    /* renamed from: a */
    public final void m30721a() {
        for (ImageView imageView : this.f57926a) {
            ColorDrawable colorDrawable = (ColorDrawable) imageView.getBackground();
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", KotlinVersion.MAX_COMPONENT_VALUE, 0));
                ofPropertyValuesHolder.setTarget(colorDrawable);
                ofPropertyValuesHolder.setDuration(500L);
                ofPropertyValuesHolder.start();
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, KotlinVersion.MAX_COMPONENT_VALUE));
                ofPropertyValuesHolder2.setTarget(drawable);
                ofPropertyValuesHolder2.setDuration(500L);
                ofPropertyValuesHolder2.start();
            }
        }
    }

    /* renamed from: b */
    public final void m30722b() {
        for (ImageView imageView : this.f57926a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f57925b);
                }
            }
        }
    }
}
