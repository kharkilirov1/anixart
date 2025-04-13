package com.stfalcon.imageviewer.viewer.view;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.transition.TransitionManager;
import com.stfalcon.imageviewer.common.extensions.ViewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: View.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"<anonymous>", "", "T", "Landroid/view/View;", "run", "com/stfalcon/imageviewer/common/extensions/ViewKt$postApply$1"}, m31885k = 3, m31886mv = {1, 1, 15})
/* loaded from: classes2.dex */
public final class TransitionImageAnimator$doOpenTransition$$inlined$postApply$1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ View f25326b;

    /* renamed from: c */
    public final /* synthetic */ TransitionImageAnimator f25327c;

    /* renamed from: d */
    public final /* synthetic */ Function0 f25328d;

    /* renamed from: e */
    public final /* synthetic */ int[] f25329e;

    public TransitionImageAnimator$doOpenTransition$$inlined$postApply$1(View view, TransitionImageAnimator transitionImageAnimator, Function0 function0, int[] iArr) {
        this.f25326b = view;
        this.f25327c = transitionImageAnimator;
        this.f25328d = function0;
        this.f25329e = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final ImageView imageView = this.f25327c.f25323c;
        if (imageView != null) {
            imageView.postDelayed(new Runnable() { // from class: com.stfalcon.imageviewer.viewer.view.TransitionImageAnimator$doOpenTransition$$inlined$postApply$1$lambda$1
                @Override // java.lang.Runnable
                public final void run() {
                    ((ImageView) imageView).setVisibility(4);
                }
            }, 50L);
        }
        TransitionManager.m4256a(this.f25327c.m14040b(), this.f25327c.m14039a(new Function0<Unit>() { // from class: com.stfalcon.imageviewer.viewer.view.TransitionImageAnimator$doOpenTransition$$inlined$postApply$1$lambda$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public Unit invoke() {
                TransitionImageAnimator$doOpenTransition$$inlined$postApply$1 transitionImageAnimator$doOpenTransition$$inlined$postApply$1 = TransitionImageAnimator$doOpenTransition$$inlined$postApply$1.this;
                TransitionImageAnimator transitionImageAnimator = transitionImageAnimator$doOpenTransition$$inlined$postApply$1.f25327c;
                if (!transitionImageAnimator.f25322b) {
                    transitionImageAnimator.f25321a = false;
                    transitionImageAnimator$doOpenTransition$$inlined$postApply$1.f25328d.invoke();
                }
                return Unit.f63088a;
            }
        }));
        FrameLayout makeViewMatchParent = this.f25327c.f25325e;
        Intrinsics.m32180i(makeViewMatchParent, "$this$makeViewMatchParent");
        ViewKt.m14020b(makeViewMatchParent, 0, 0, 0, 0);
        ViewKt.m14024f(makeViewMatchParent, -1, -1);
        ImageView makeViewMatchParent2 = this.f25327c.f25324d;
        Intrinsics.m32180i(makeViewMatchParent2, "$this$makeViewMatchParent");
        ViewKt.m14020b(makeViewMatchParent2, 0, 0, 0, 0);
        ViewKt.m14024f(makeViewMatchParent2, -1, -1);
        ViewKt.m14020b(this.f25327c.m14040b(), Integer.valueOf(this.f25329e[0]), Integer.valueOf(this.f25329e[1]), Integer.valueOf(this.f25329e[2]), Integer.valueOf(this.f25329e[3]));
        this.f25327c.f25325e.requestLayout();
    }
}
