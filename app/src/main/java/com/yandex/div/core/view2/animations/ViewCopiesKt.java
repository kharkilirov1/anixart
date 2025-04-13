package com.yandex.div.core.view2.animations;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.ImageView;
import androidx.annotation.MainThread;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.ViewGroupKt$children$1;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import com.swiftsoft.anixartd.C2507R;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.divs.widgets.DivImageView;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewCopies.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"div_release"}, m31885k = 2, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ViewCopiesKt {
    @MainThread
    @NotNull
    /* renamed from: a */
    public static final View m16906a(@NotNull final View view, @NotNull ViewGroup viewGroup, @NotNull Transition transition, @NotNull int[] iArr) {
        Object tag = view.getTag(C2507R.id.save_overlay_view);
        View view2 = tag instanceof View ? (View) tag : null;
        if (view2 != null) {
            return view2;
        }
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        m16908c(imageView, view);
        imageView.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        imageView.layout(0, 0, view.getWidth(), view.getHeight());
        int[] iArr2 = new int[2];
        viewGroup.getLocationOnScreen(iArr2);
        imageView.offsetLeftAndRight(iArr[0] - iArr2[0]);
        imageView.offsetTopAndBottom(iArr[1] - iArr2[1]);
        view.setTag(C2507R.id.save_overlay_view, imageView);
        final ViewGroupOverlay overlay = viewGroup.getOverlay();
        view.setVisibility(4);
        overlay.add(imageView);
        transition.mo4237a(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$replace$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: a */
            public void mo4211a(@NotNull Transition transition2) {
                Intrinsics.m32179h(transition2, "transition");
                view.setVisibility(4);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: b */
            public void mo4191b(@NotNull Transition transition2) {
                Intrinsics.m32179h(transition2, "transition");
                overlay.remove(imageView);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NotNull Transition transition2) {
                Intrinsics.m32179h(transition2, "transition");
                view.setTag(C2507R.id.save_overlay_view, null);
                view.setVisibility(0);
                overlay.remove(imageView);
                transition2.mo4255z(this);
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: e */
            public void mo4194e(@NotNull Transition transition2) {
                Intrinsics.m32179h(transition2, "transition");
                if (imageView.getParent() == null) {
                    overlay.add(imageView);
                }
            }
        });
        m16907b(view, new Function0<Unit>() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                ViewCopiesKt.m16908c(imageView, view);
                return Unit.f63088a;
            }
        });
        if (ViewCompat.m2173M(imageView)) {
            imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$createOrGetVisualCopy$$inlined$doOnDetach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view3) {
                    Intrinsics.m32179h(view3, "view");
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view3) {
                    Intrinsics.m32179h(view3, "view");
                    imageView.removeOnAttachStateChangeListener(this);
                    ViewCopiesKt.m16907b(view, null);
                }
            });
        } else {
            m16907b(view, null);
        }
        return imageView;
    }

    /* renamed from: b */
    public static final void m16907b(@NotNull View view, @Nullable Function0<Unit> function0) {
        Intrinsics.m32179h(view, "<this>");
        if (view instanceof DivImageView) {
            ((DivImageView) view).setImageChangeCallback(function0);
        } else if (view instanceof ViewGroup) {
            Iterator<View> it = ((ViewGroupKt$children$1) ViewGroupKt.m2377b((ViewGroup) view)).iterator();
            while (it.hasNext()) {
                m16907b(it.next(), function0);
            }
        }
    }

    /* renamed from: c */
    public static final void m16908c(final ImageView imageView, final View view) {
        Bitmap bitmap;
        ImageView imageView2 = view instanceof ImageView ? (ImageView) view : null;
        Object drawable = imageView2 == null ? null : imageView2.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        final Function0<Unit> function0 = new Function0<Unit>() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$drawAndSet$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                Intrinsics.m32178g(createBitmap, "createBitmap(view.width,… Bitmap.Config.ARGB_8888)");
                View view2 = view;
                Canvas canvas = new Canvas(createBitmap);
                canvas.translate(-view2.getScrollX(), -view2.getScrollY());
                view2.draw(canvas);
                imageView.setImageBitmap(createBitmap);
                return Unit.f63088a;
            }
        };
        if (ViewsKt.m16768b(view)) {
            function0.invoke();
        } else if (!ViewsKt.m16768b(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.animations.ViewCopiesKt$setScreenshotFromView$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    Intrinsics.m32179h(view2, "view");
                    view2.removeOnLayoutChangeListener(this);
                    Function0.this.invoke();
                }
            });
        } else {
            function0.invoke();
        }
    }
}
