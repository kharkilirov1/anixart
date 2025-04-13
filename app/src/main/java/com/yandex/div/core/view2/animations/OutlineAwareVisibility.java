package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.TransitionListenerAdapter;
import androidx.transition.TransitionValues;
import androidx.transition.Visibility;
import com.yandex.div.internal.widget.TransientView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OutlineAwareVisibility.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/animations/OutlineAwareVisibility;", "Landroidx/transition/Visibility;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class OutlineAwareVisibility extends Visibility {
    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: R */
    public Animator mo4285R(@NotNull ViewGroup sceneRoot, @Nullable TransitionValues transitionValues, int i2, @Nullable TransitionValues transitionValues2, int i3) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Object obj = transitionValues2 == null ? null : transitionValues2.f6318b;
        final TransientView transientView = obj instanceof TransientView ? (TransientView) obj : null;
        if (transientView != null) {
            transientView.setTransient(true);
        }
        mo4237a(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onAppear$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NotNull Transition transition) {
                Intrinsics.m32179h(transition, "transition");
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.setTransient(false);
                }
                Transition.this.mo4255z(this);
            }
        });
        return super.mo4285R(sceneRoot, transitionValues, i2, transitionValues2, i3);
    }

    @Override // androidx.transition.Visibility
    @Nullable
    /* renamed from: T */
    public Animator mo4286T(@NotNull ViewGroup sceneRoot, @Nullable TransitionValues transitionValues, int i2, @Nullable TransitionValues transitionValues2, int i3) {
        Intrinsics.m32179h(sceneRoot, "sceneRoot");
        Object obj = transitionValues == null ? null : transitionValues.f6318b;
        final TransientView transientView = obj instanceof TransientView ? (TransientView) obj : null;
        if (transientView != null) {
            transientView.setTransient(true);
        }
        mo4237a(new TransitionListenerAdapter() { // from class: com.yandex.div.core.view2.animations.OutlineAwareVisibility$onDisappear$$inlined$doOnEnd$1
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NotNull Transition transition) {
                Intrinsics.m32179h(transition, "transition");
                TransientView transientView2 = transientView;
                if (transientView2 != null) {
                    transientView2.setTransient(false);
                }
                Transition.this.mo4255z(this);
            }
        });
        return super.mo4286T(sceneRoot, transitionValues, i2, transitionValues2, i3);
    }
}
