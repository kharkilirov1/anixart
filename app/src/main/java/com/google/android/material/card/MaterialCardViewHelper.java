package com.google.android.material.card;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes.dex */
class MaterialCardViewHelper {

    /* renamed from: a */
    public static final double f17745a = Math.cos(Math.toRadians(45.0d));

    /* renamed from: b */
    public static final Drawable f17746b;

    /* renamed from: com.google.android.material.card.MaterialCardViewHelper$1 */
    class C12441 extends InsetDrawable {
        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        f17746b = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }
}
