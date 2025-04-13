package com.skydoves.balloon.extensions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewAnimationUtils;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewExtension.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"balloon_release"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ViewExtensionKt {
    @TargetApi
    @MainThread
    /* renamed from: a */
    public static final void m13880a(@NotNull final View view, final long j2) {
        view.setVisibility(4);
        view.post(new Runnable() { // from class: com.skydoves.balloon.extensions.ViewExtensionKt$circularRevealed$1
            @Override // java.lang.Runnable
            public final void run() {
                if (view.isAttachedToWindow()) {
                    view.setVisibility(0);
                    View view2 = view;
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, (view.getRight() + view2.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, 0.0f, Math.max(view.getWidth(), view.getHeight()));
                    createCircularReveal.setDuration(j2);
                    createCircularReveal.start();
                }
            }
        });
    }

    @TargetApi
    @MainThread
    /* renamed from: b */
    public static final void m13881b(@NotNull final View view, final long j2, @NotNull final Function0<Unit> function0) {
        view.post(new Runnable() { // from class: com.skydoves.balloon.extensions.ViewExtensionKt$circularUnRevealed$1
            @Override // java.lang.Runnable
            public final void run() {
                if (view.isAttachedToWindow()) {
                    View view2 = view;
                    Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view2, (view.getRight() + view2.getLeft()) / 2, (view.getBottom() + view.getTop()) / 2, Math.max(view.getWidth(), view.getHeight()), 0.0f);
                    createCircularReveal.setDuration(j2);
                    createCircularReveal.start();
                    createCircularReveal.addListener(new AnimatorListenerAdapter() { // from class: com.skydoves.balloon.extensions.ViewExtensionKt$circularUnRevealed$1.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(@Nullable Animator animator) {
                            super.onAnimationEnd(animator);
                            function0.invoke();
                        }
                    });
                }
            }
        });
    }
}
