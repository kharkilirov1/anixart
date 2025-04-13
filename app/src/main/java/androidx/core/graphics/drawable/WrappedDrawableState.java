package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class WrappedDrawableState extends Drawable.ConstantState {

    /* renamed from: a */
    public int f3421a;

    /* renamed from: b */
    public Drawable.ConstantState f3422b;

    /* renamed from: c */
    public ColorStateList f3423c;

    /* renamed from: d */
    public PorterDuff.Mode f3424d;

    public WrappedDrawableState(@Nullable WrappedDrawableState wrappedDrawableState) {
        this.f3423c = null;
        this.f3424d = WrappedDrawableApi14.f3413h;
        if (wrappedDrawableState != null) {
            this.f3421a = wrappedDrawableState.f3421a;
            this.f3422b = wrappedDrawableState.f3422b;
            this.f3423c = wrappedDrawableState.f3423c;
            this.f3424d = wrappedDrawableState.f3424d;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.f3421a;
        Drawable.ConstantState constantState = this.f3422b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable() {
        return new WrappedDrawableApi21(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    @NonNull
    public Drawable newDrawable(@Nullable Resources resources) {
        return new WrappedDrawableApi21(this, resources);
    }
}
