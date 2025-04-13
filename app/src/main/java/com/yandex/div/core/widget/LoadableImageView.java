package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.CallSuper;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.divs.widgets.LoadableImage;
import com.yandex.div.core.view2.drawable.ScaleDrawable;
import com.yandex.div.internal.widget.AspectImageView;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoadableImageView.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0012\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u000e\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0017J\u0012\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0017J\u0018\u0010\u0013\u001a\u00020\u00062\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0011R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010*\u001a\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R.\u00102\u001a\u0004\u0018\u00010\u00042\b\u0010+\u001a\u0004\u0018\u00010\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, m31884d2 = {"Lcom/yandex/div/core/widget/LoadableImageView;", "Lcom/yandex/div/internal/widget/AspectImageView;", "Lcom/yandex/div/core/view2/divs/widgets/LoadableImage;", "Lcom/yandex/div/core/widget/DivExtendableView;", "Landroid/graphics/drawable/Drawable;", "drawable", "", "setPlaceholder", "setPreview", "Landroid/graphics/Bitmap;", "bitmap", "setImage", "Ljava/util/concurrent/Future;", "getLoadingTask", "setImageDrawable", "bm", "setImageBitmap", "Lkotlin/Function0;", "callback", "setImageChangeCallback", "k", "Landroid/graphics/Bitmap;", "getCurrentBitmapWithoutFilters$div_release", "()Landroid/graphics/Bitmap;", "setCurrentBitmapWithoutFilters$div_release", "(Landroid/graphics/Bitmap;)V", "currentBitmapWithoutFilters", "Lcom/yandex/div/core/images/LoadReference;", "l", "Lcom/yandex/div/core/images/LoadReference;", "getLoadReference$div_release", "()Lcom/yandex/div/core/images/LoadReference;", "setLoadReference$div_release", "(Lcom/yandex/div/core/images/LoadReference;)V", "loadReference", "Lcom/yandex/div/core/widget/DivViewDelegate;", "n", "Lcom/yandex/div/core/widget/DivViewDelegate;", "getDelegate", "()Lcom/yandex/div/core/widget/DivViewDelegate;", "setDelegate", "(Lcom/yandex/div/core/widget/DivViewDelegate;)V", "delegate", "value", "o", "Landroid/graphics/drawable/Drawable;", "getExternalImage", "()Landroid/graphics/drawable/Drawable;", "setExternalImage", "(Landroid/graphics/drawable/Drawable;)V", "externalImage", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class LoadableImageView extends AspectImageView implements LoadableImage, DivExtendableView {

    /* renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Bitmap currentBitmapWithoutFilters;

    /* renamed from: l, reason: from kotlin metadata */
    @Nullable
    public LoadReference loadReference;

    /* renamed from: m */
    @Nullable
    public Function0<Unit> f33056m;

    /* renamed from: n, reason: from kotlin metadata */
    @Nullable
    public DivViewDelegate delegate;

    /* renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Drawable externalImage;

    public LoadableImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z) {
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.m17136c(z);
        }
        super.buildDrawingCache(z);
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    /* renamed from: f */
    public void mo17108f() {
        setTag(C2507R.id.bitmap_load_references_tag, null);
    }

    @Nullable
    /* renamed from: getCurrentBitmapWithoutFilters$div_release, reason: from getter */
    public final Bitmap getCurrentBitmapWithoutFilters() {
        return this.currentBitmapWithoutFilters;
    }

    @Nullable
    public DivViewDelegate getDelegate() {
        return this.delegate;
    }

    @Nullable
    public final Drawable getExternalImage() {
        return this.externalImage;
    }

    @Nullable
    /* renamed from: getLoadReference$div_release, reason: from getter */
    public final LoadReference getLoadReference() {
        return this.loadReference;
    }

    @Override // com.yandex.div.core.view2.divs.widgets.LoadableImage
    @Nullable
    public Future<?> getLoadingTask() {
        Object tag = getTag(C2507R.id.bitmap_load_references_tag);
        if (tag instanceof Future) {
            return (Future) tag;
        }
        return null;
    }

    /* renamed from: i */
    public void m17179i() {
        setTag(C2507R.id.image_loaded_flag, Boolean.TRUE);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable dr) {
        Drawable invalidateDrawable;
        Intrinsics.m32179h(dr, "dr");
        DivViewDelegate delegate = getDelegate();
        if (delegate != null && (invalidateDrawable = delegate.invalidateDrawable(dr)) != null) {
            dr = invalidateDrawable;
        }
        super.invalidateDrawable(dr);
    }

    /* renamed from: j */
    public boolean m17180j() {
        return Intrinsics.m32174c(getTag(C2507R.id.image_loaded_flag), Boolean.TRUE);
    }

    /* renamed from: k */
    public boolean m17181k() {
        return Intrinsics.m32174c(getTag(C2507R.id.image_loaded_flag), Boolean.FALSE);
    }

    /* renamed from: l */
    public void mo17100l() {
        setTag(C2507R.id.image_loaded_flag, null);
    }

    /* renamed from: m */
    public final Drawable m17182m(Drawable drawable) {
        if (!m17183n()) {
            return drawable;
        }
        if (!(drawable instanceof BitmapDrawable)) {
            return (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) ? drawable : new ScaleDrawable(drawable, getContext().getResources().getDisplayMetrics().density);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        Bitmap bitmap = bitmapDrawable.getBitmap();
        if (bitmap != null) {
            bitmap.setDensity(160);
        }
        bitmapDrawable.setTargetDensity(getContext().getResources().getDisplayMetrics());
        return drawable;
    }

    /* renamed from: n */
    public final boolean m17183n() {
        return (getLayoutParams().width == -2 && getLayoutParams().height == -2) || getImageScale() == AspectImageView.Scale.NO_SCALE;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        DivViewDelegate delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onAttachedToWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DivViewDelegate delegate = getDelegate();
        if (delegate == null) {
            return;
        }
        delegate.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NotNull View changedView, int i2) {
        Intrinsics.m32179h(changedView, "changedView");
        DivViewDelegate delegate = getDelegate();
        boolean z = false;
        if (delegate != null && !delegate.m17135b(changedView, i2)) {
            z = true;
        }
        if (z) {
            super.onVisibilityChanged(changedView, i2);
        }
    }

    public final void setCurrentBitmapWithoutFilters$div_release(@Nullable Bitmap bitmap) {
        this.currentBitmapWithoutFilters = bitmap;
    }

    public void setDelegate(@Nullable DivViewDelegate divViewDelegate) {
        this.delegate = divViewDelegate;
    }

    public final void setExternalImage(@Nullable Drawable drawable) {
        this.externalImage = drawable == null ? null : m17182m(drawable);
        invalidate();
    }

    public void setImage(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageBitmap(@Nullable Bitmap bm) {
        if (this.externalImage == null) {
            if (m17183n() && bm != null) {
                bm.setDensity(160);
            }
            super.setImageBitmap(bm);
            Function0<Unit> function0 = this.f33056m;
            if (function0 == null) {
                return;
            }
            function0.invoke();
            return;
        }
        Drawable drawable = getDrawable();
        Drawable drawable2 = this.externalImage;
        if (drawable != drawable2) {
            super.setImageDrawable(drawable2);
        }
        Function0<Unit> function02 = this.f33056m;
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }

    public final void setImageChangeCallback(@Nullable Function0<Unit> callback) {
        this.f33056m = callback;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    @CallSuper
    public void setImageDrawable(@Nullable Drawable drawable) {
        if (this.externalImage == null) {
            super.setImageDrawable(drawable == null ? null : m17182m(drawable));
            Function0<Unit> function0 = this.f33056m;
            if (function0 == null) {
                return;
            }
            function0.invoke();
            return;
        }
        Drawable drawable2 = getDrawable();
        Drawable drawable3 = this.externalImage;
        if (drawable2 != drawable3) {
            super.setImageDrawable(drawable3);
        }
        Function0<Unit> function02 = this.f33056m;
        if (function02 == null) {
            return;
        }
        function02.invoke();
    }

    public final void setLoadReference$div_release(@Nullable LoadReference loadReference) {
        this.loadReference = loadReference;
    }

    public void setPlaceholder(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    public void setPreview(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
    }

    @Override // android.view.View
    public void unscheduleDrawable(@Nullable Drawable drawable) {
        DivViewDelegate delegate = getDelegate();
        if (delegate != null) {
            delegate.m17134a(drawable);
        }
        super.unscheduleDrawable(drawable);
    }

    public void setImage(@Nullable Drawable drawable) {
        setImageDrawable(drawable);
        Object drawable2 = getDrawable();
        if ((drawable2 instanceof Animatable) && this.externalImage == null) {
            ((Animatable) drawable2).start();
        }
    }

    public void setPreview(@Nullable Bitmap bitmap) {
        setImageBitmap(bitmap);
    }
}
