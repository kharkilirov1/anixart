package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class ChangeBounds extends Transition {

    /* renamed from: C */
    public static final String[] f6136C = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: D */
    public static final Property<ViewBounds, PointF> f6137D;

    /* renamed from: E */
    public static final Property<ViewBounds, PointF> f6138E;

    /* renamed from: F */
    public static final Property<View, PointF> f6139F;

    /* renamed from: G */
    public static final Property<View, PointF> f6140G;

    /* renamed from: H */
    public static final Property<View, PointF> f6141H;

    /* renamed from: androidx.transition.ChangeBounds$10 */
    public class C060610 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f6143a;

        /* renamed from: b */
        public final /* synthetic */ BitmapDrawable f6144b;

        /* renamed from: c */
        public final /* synthetic */ View f6145c;

        /* renamed from: d */
        public final /* synthetic */ float f6146d;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = this.f6143a;
            ViewUtilsBase viewUtilsBase = ViewUtils.f6341a;
            ViewOverlayApi18 viewOverlayApi18 = new ViewOverlayApi18(viewGroup);
            viewOverlayApi18.f6340a.remove(this.f6144b);
            ViewUtils.f6341a.mo4277f(this.f6145c, this.f6146d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$8 */
    public class C06138 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f6147a;

        /* renamed from: b */
        public final /* synthetic */ View f6148b;

        /* renamed from: c */
        public final /* synthetic */ Rect f6149c;

        /* renamed from: d */
        public final /* synthetic */ int f6150d;

        /* renamed from: e */
        public final /* synthetic */ int f6151e;

        /* renamed from: f */
        public final /* synthetic */ int f6152f;

        /* renamed from: g */
        public final /* synthetic */ int f6153g;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6147a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f6147a) {
                return;
            }
            ViewCompat.m2210l0(this.f6148b, this.f6149c);
            ViewUtils.m4273b(this.f6148b, this.f6150d, this.f6151e, this.f6152f, this.f6153g);
        }
    }

    public static class ViewBounds {

        /* renamed from: a */
        public int f6156a;

        /* renamed from: b */
        public int f6157b;

        /* renamed from: c */
        public int f6158c;

        /* renamed from: d */
        public int f6159d;

        /* renamed from: e */
        public View f6160e;

        /* renamed from: f */
        public int f6161f;

        /* renamed from: g */
        public int f6162g;

        public ViewBounds(View view) {
            this.f6160e = view;
        }
    }

    static {
        new Property<Drawable, PointF>(PointF.class, "boundsOrigin") { // from class: androidx.transition.ChangeBounds.1

            /* renamed from: a */
            public Rect f6142a = new Rect();

            @Override // android.util.Property
            public PointF get(Drawable drawable) {
                drawable.copyBounds(this.f6142a);
                Rect rect = this.f6142a;
                return new PointF(rect.left, rect.top);
            }

            @Override // android.util.Property
            public void set(Drawable drawable, PointF pointF) {
                Drawable drawable2 = drawable;
                PointF pointF2 = pointF;
                drawable2.copyBounds(this.f6142a);
                this.f6142a.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
                drawable2.setBounds(this.f6142a);
            }
        };
        String str = "topLeft";
        f6137D = new Property<ViewBounds, PointF>(PointF.class, str) { // from class: androidx.transition.ChangeBounds.2
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                ViewBounds viewBounds2 = viewBounds;
                PointF pointF2 = pointF;
                Objects.requireNonNull(viewBounds2);
                viewBounds2.f6156a = Math.round(pointF2.x);
                int round = Math.round(pointF2.y);
                viewBounds2.f6157b = round;
                int i2 = viewBounds2.f6161f + 1;
                viewBounds2.f6161f = i2;
                if (i2 == viewBounds2.f6162g) {
                    ViewUtils.m4273b(viewBounds2.f6160e, viewBounds2.f6156a, round, viewBounds2.f6158c, viewBounds2.f6159d);
                    viewBounds2.f6161f = 0;
                    viewBounds2.f6162g = 0;
                }
            }
        };
        String str2 = "bottomRight";
        f6138E = new Property<ViewBounds, PointF>(PointF.class, str2) { // from class: androidx.transition.ChangeBounds.3
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ PointF get(ViewBounds viewBounds) {
                return null;
            }

            @Override // android.util.Property
            public void set(ViewBounds viewBounds, PointF pointF) {
                ViewBounds viewBounds2 = viewBounds;
                PointF pointF2 = pointF;
                Objects.requireNonNull(viewBounds2);
                viewBounds2.f6158c = Math.round(pointF2.x);
                int round = Math.round(pointF2.y);
                viewBounds2.f6159d = round;
                int i2 = viewBounds2.f6162g + 1;
                viewBounds2.f6162g = i2;
                if (viewBounds2.f6161f == i2) {
                    ViewUtils.m4273b(viewBounds2.f6160e, viewBounds2.f6156a, viewBounds2.f6157b, viewBounds2.f6158c, round);
                    viewBounds2.f6161f = 0;
                    viewBounds2.f6162g = 0;
                }
            }
        };
        f6139F = new Property<View, PointF>(PointF.class, str2) { // from class: androidx.transition.ChangeBounds.4
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                ViewUtils.m4273b(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
            }
        };
        f6140G = new Property<View, PointF>(PointF.class, str) { // from class: androidx.transition.ChangeBounds.5
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                ViewUtils.m4273b(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
            }
        };
        f6141H = new Property<View, PointF>(PointF.class, "position") { // from class: androidx.transition.ChangeBounds.6
            @Override // android.util.Property
            public /* bridge */ /* synthetic */ PointF get(View view) {
                return null;
            }

            @Override // android.util.Property
            public void set(View view, PointF pointF) {
                View view2 = view;
                PointF pointF2 = pointF;
                int round = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                ViewUtils.m4273b(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
            }
        };
    }

    /* renamed from: O */
    public final void m4186O(TransitionValues transitionValues) {
        View view = transitionValues.f6318b;
        if (!ViewCompat.m2174N(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        transitionValues.f6317a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        transitionValues.f6317a.put("android:changeBounds:parent", transitionValues.f6318b.getParent());
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4186O(transitionValues);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4186O(transitionValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        int i2;
        ChangeBounds changeBounds;
        ObjectAnimator m4218a;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        Map<String, Object> map = transitionValues.f6317a;
        Map<String, Object> map2 = transitionValues2.f6317a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = transitionValues2.f6318b;
        Rect rect = (Rect) transitionValues.f6317a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) transitionValues2.f6317a.get("android:changeBounds:bounds");
        int i3 = rect.left;
        int i4 = rect2.left;
        int i5 = rect.top;
        int i6 = rect2.top;
        int i7 = rect.right;
        int i8 = rect2.right;
        int i9 = rect.bottom;
        int i10 = rect2.bottom;
        int i11 = i7 - i3;
        int i12 = i9 - i5;
        int i13 = i8 - i4;
        int i14 = i10 - i6;
        Rect rect3 = (Rect) transitionValues.f6317a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) transitionValues2.f6317a.get("android:changeBounds:clip");
        if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
            i2 = 0;
        } else {
            i2 = (i3 == i4 && i5 == i6) ? 0 : 1;
            if (i7 != i8 || i9 != i10) {
                i2++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i2++;
        }
        int i15 = i2;
        if (i15 <= 0) {
            return null;
        }
        ViewUtils.m4273b(view, i3, i5, i7, i9);
        if (i15 != 2) {
            changeBounds = this;
            m4218a = (i3 == i4 && i5 == i6) ? ObjectAnimatorUtils.m4218a(view, f6139F, changeBounds.f6288y.mo4184a(i7, i9, i8, i10)) : ObjectAnimatorUtils.m4218a(view, f6140G, changeBounds.f6288y.mo4184a(i3, i5, i4, i6));
        } else if (i11 == i13 && i12 == i14) {
            changeBounds = this;
            m4218a = ObjectAnimatorUtils.m4218a(view, f6141H, changeBounds.f6288y.mo4184a(i3, i5, i4, i6));
        } else {
            changeBounds = this;
            ViewBounds viewBounds = new ViewBounds(view);
            ObjectAnimator m4218a2 = ObjectAnimatorUtils.m4218a(viewBounds, f6137D, changeBounds.f6288y.mo4184a(i3, i5, i4, i6));
            ObjectAnimator m4218a3 = ObjectAnimatorUtils.m4218a(viewBounds, f6138E, changeBounds.f6288y.mo4184a(i7, i9, i8, i10));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(m4218a2, m4218a3);
            animatorSet.addListener(new AnimatorListenerAdapter(changeBounds, viewBounds) { // from class: androidx.transition.ChangeBounds.7
                private ViewBounds mViewBounds;

                {
                    this.mViewBounds = viewBounds;
                }
            });
            m4218a = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            final ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            ViewGroupUtils.m4271a(viewGroup4, true);
            changeBounds.mo4237a(new TransitionListenerAdapter(changeBounds) { // from class: androidx.transition.ChangeBounds.9

                /* renamed from: a */
                public boolean f6154a = false;

                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                /* renamed from: b */
                public void mo4191b(@NonNull Transition transition) {
                    ViewGroupUtils.m4271a(viewGroup4, false);
                }

                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                /* renamed from: c */
                public void mo4192c(@NonNull Transition transition) {
                    if (!this.f6154a) {
                        ViewGroupUtils.m4271a(viewGroup4, false);
                    }
                    transition.mo4255z(this);
                }

                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                /* renamed from: d */
                public void mo4193d(@NonNull Transition transition) {
                    ViewGroupUtils.m4271a(viewGroup4, false);
                    this.f6154a = true;
                }

                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                /* renamed from: e */
                public void mo4194e(@NonNull Transition transition) {
                    ViewGroupUtils.m4271a(viewGroup4, true);
                }
            });
        }
        return m4218a;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: t */
    public String[] mo4190t() {
        return f6136C;
    }
}
