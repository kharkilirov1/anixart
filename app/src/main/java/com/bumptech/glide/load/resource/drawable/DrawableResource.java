package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class DrawableResource<T extends Drawable> implements Resource<T>, Initializable {

    /* renamed from: b */
    public final T f8592b;

    public DrawableResource(T t) {
        Objects.requireNonNull(t, "Argument must not be null");
        this.f8592b = t;
    }

    /* renamed from: a */
    public void mo5053a() {
        T t = this.f8592b;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof GifDrawable) {
            ((GifDrawable) t).m5204c().prepareToDraw();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    @NonNull
    public Object get() {
        Drawable.ConstantState constantState = this.f8592b.getConstantState();
        return constantState == null ? this.f8592b : constantState.newDrawable();
    }
}
