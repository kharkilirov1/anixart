package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.EmojiCompat;

@RequiresApi
@RestrictTo
/* loaded from: classes.dex */
class EmojiTransformationMethod implements TransformationMethod {

    /* renamed from: b */
    @Nullable
    public final TransformationMethod f4134b;

    public EmojiTransformationMethod(@Nullable TransformationMethod transformationMethod) {
        this.f4134b = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@Nullable CharSequence charSequence, @NonNull View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4134b;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || EmojiCompat.m2796a().m2799b() != 1) ? charSequence : EmojiCompat.m2796a().m2804i(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i2, Rect rect) {
        TransformationMethod transformationMethod = this.f4134b;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i2, rect);
        }
    }
}
