package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.transition.Transition;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import androidx.fragment.app.FragmentAnim;
import androidx.fragment.app.SpecialEffectsController;
import com.swiftsoft.anixartd.C2507R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class DefaultSpecialEffectsController extends SpecialEffectsController {

    /* renamed from: androidx.fragment.app.DefaultSpecialEffectsController$10 */
    public static /* synthetic */ class C033010 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4220a;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f4220a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4220a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4220a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4220a[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class AnimationInfo extends SpecialEffectsInfo {

        /* renamed from: c */
        public boolean f4247c;

        /* renamed from: d */
        public boolean f4248d;

        /* renamed from: e */
        @Nullable
        public FragmentAnim.AnimationOrAnimator f4249e;

        public AnimationInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z) {
            super(operation, cancellationSignal);
            this.f4248d = false;
            this.f4247c = z;
        }

        @Nullable
        /* renamed from: c */
        public FragmentAnim.AnimationOrAnimator m2955c(@NonNull Context context) {
            int m2973a;
            if (this.f4248d) {
                return this.f4249e;
            }
            SpecialEffectsController.Operation operation = this.f4250a;
            Fragment fragment = operation.f4501c;
            boolean z = false;
            boolean z2 = operation.f4499a == SpecialEffectsController.Operation.State.VISIBLE;
            boolean z3 = this.f4247c;
            int nextTransition = fragment.getNextTransition();
            int popEnterAnim = z3 ? z2 ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z2 ? fragment.getEnterAnim() : fragment.getExitAnim();
            fragment.setAnimations(0, 0, 0, 0);
            ViewGroup viewGroup = fragment.mContainer;
            FragmentAnim.AnimationOrAnimator animationOrAnimator = null;
            if (viewGroup != null && viewGroup.getTag(C2507R.id.visible_removing_fragment_view_tag) != null) {
                fragment.mContainer.setTag(C2507R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = fragment.mContainer;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z2, popEnterAnim);
                if (onCreateAnimation != null) {
                    animationOrAnimator = new FragmentAnim.AnimationOrAnimator(onCreateAnimation);
                } else {
                    Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z2, popEnterAnim);
                    if (onCreateAnimator != null) {
                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(onCreateAnimator);
                    } else {
                        if (popEnterAnim == 0 && nextTransition != 0) {
                            if (nextTransition == 4097) {
                                popEnterAnim = z2 ? C2507R.animator.fragment_open_enter : C2507R.animator.fragment_open_exit;
                            } else if (nextTransition != 8194) {
                                if (nextTransition == 8197) {
                                    m2973a = z2 ? FragmentAnim.m2973a(context, R.attr.activityCloseEnterAnimation) : FragmentAnim.m2973a(context, R.attr.activityCloseExitAnimation);
                                } else if (nextTransition == 4099) {
                                    popEnterAnim = z2 ? C2507R.animator.fragment_fade_enter : C2507R.animator.fragment_fade_exit;
                                } else if (nextTransition != 4100) {
                                    popEnterAnim = -1;
                                } else {
                                    m2973a = z2 ? FragmentAnim.m2973a(context, R.attr.activityOpenEnterAnimation) : FragmentAnim.m2973a(context, R.attr.activityOpenExitAnimation);
                                }
                                popEnterAnim = m2973a;
                            } else {
                                popEnterAnim = z2 ? C2507R.animator.fragment_close_enter : C2507R.animator.fragment_close_exit;
                            }
                        }
                        if (popEnterAnim != 0) {
                            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
                            if (equals) {
                                try {
                                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimation);
                                    } else {
                                        z = true;
                                    }
                                } catch (Resources.NotFoundException e2) {
                                    throw e2;
                                } catch (RuntimeException unused) {
                                }
                            }
                            if (!z) {
                                try {
                                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                                    if (loadAnimator != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimator);
                                    }
                                } catch (RuntimeException e3) {
                                    if (equals) {
                                        throw e3;
                                    }
                                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                                    if (loadAnimation2 != null) {
                                        animationOrAnimator = new FragmentAnim.AnimationOrAnimator(loadAnimation2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.f4249e = animationOrAnimator;
            this.f4248d = true;
            return animationOrAnimator;
        }
    }

    public static class SpecialEffectsInfo {

        /* renamed from: a */
        @NonNull
        public final SpecialEffectsController.Operation f4250a;

        /* renamed from: b */
        @NonNull
        public final CancellationSignal f4251b;

        public SpecialEffectsInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal) {
            this.f4250a = operation;
            this.f4251b = cancellationSignal;
        }

        /* renamed from: a */
        public void m2956a() {
            SpecialEffectsController.Operation operation = this.f4250a;
            if (operation.f4503e.remove(this.f4251b) && operation.f4503e.isEmpty()) {
                operation.mo3156b();
            }
        }

        /* renamed from: b */
        public boolean m2957b() {
            SpecialEffectsController.Operation.State state;
            SpecialEffectsController.Operation.State m3161c = SpecialEffectsController.Operation.State.m3161c(this.f4250a.f4501c.mView);
            SpecialEffectsController.Operation.State state2 = this.f4250a.f4499a;
            return m3161c == state2 || !(m3161c == (state = SpecialEffectsController.Operation.State.VISIBLE) || state2 == state);
        }
    }

    public static class TransitionInfo extends SpecialEffectsInfo {

        /* renamed from: c */
        @Nullable
        public final Object f4252c;

        /* renamed from: d */
        public final boolean f4253d;

        /* renamed from: e */
        @Nullable
        public final Object f4254e;

        public TransitionInfo(@NonNull SpecialEffectsController.Operation operation, @NonNull CancellationSignal cancellationSignal, boolean z, boolean z2) {
            super(operation, cancellationSignal);
            if (operation.f4499a == SpecialEffectsController.Operation.State.VISIBLE) {
                this.f4252c = z ? operation.f4501c.getReenterTransition() : operation.f4501c.getEnterTransition();
                this.f4253d = z ? operation.f4501c.getAllowReturnTransitionOverlap() : operation.f4501c.getAllowEnterTransitionOverlap();
            } else {
                this.f4252c = z ? operation.f4501c.getReturnTransition() : operation.f4501c.getExitTransition();
                this.f4253d = true;
            }
            if (!z2) {
                this.f4254e = null;
            } else if (z) {
                this.f4254e = operation.f4501c.getSharedElementReturnTransition();
            } else {
                this.f4254e = operation.f4501c.getSharedElementEnterTransition();
            }
        }

        @Nullable
        /* renamed from: c */
        public final FragmentTransitionImpl m2958c(Object obj) {
            if (obj == null) {
                return null;
            }
            FragmentTransitionImpl fragmentTransitionImpl = FragmentTransition.f4451a;
            if (obj instanceof Transition) {
                return fragmentTransitionImpl;
            }
            FragmentTransitionImpl fragmentTransitionImpl2 = FragmentTransition.f4452b;
            if (fragmentTransitionImpl2 != null && fragmentTransitionImpl2.mo3126e(obj)) {
                return fragmentTransitionImpl2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + this.f4250a.f4501c + " is not a valid framework Transition or AndroidX Transition");
        }
    }

    public DefaultSpecialEffectsController(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x09e0 A[LOOP:6: B:158:0x09da->B:160:0x09e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x081a  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo2951b(@androidx.annotation.NonNull java.util.List<androidx.fragment.app.SpecialEffectsController.Operation> r41, final boolean r42) {
        /*
            Method dump skipped, instructions count: 2587
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.DefaultSpecialEffectsController.mo2951b(java.util.List, boolean):void");
    }

    /* renamed from: j */
    public void m2952j(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (ViewGroupCompat.m2370a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m2952j(arrayList, childAt);
            }
        }
    }

    /* renamed from: k */
    public void m2953k(Map<String, View> map, @NonNull View view) {
        String m2165E = ViewCompat.m2165E(view);
        if (m2165E != null) {
            map.put(m2165E, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    m2953k(map, childAt);
                }
            }
        }
    }

    /* renamed from: l */
    public void m2954l(@NonNull ArrayMap<String, View> arrayMap, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(ViewCompat.m2165E(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
