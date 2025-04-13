package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.transition.Transition;
import java.util.ArrayList;

@SuppressLint
@RestrictTo
/* loaded from: classes.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    /* renamed from: t */
    public static boolean m4208t(Transition transition) {
        return (FragmentTransitionImpl.m3141i(transition.f6269f) && FragmentTransitionImpl.m3141i(null) && FragmentTransitionImpl.m3141i(null)) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: a */
    public void mo3123a(Object obj, View view) {
        ((Transition) obj).mo4239c(view);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: b */
    public void mo3124b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int m4265Q = transitionSet.m4265Q();
            while (i2 < m4265Q) {
                mo3124b(transitionSet.m4264P(i2), arrayList);
                i2++;
            }
            return;
        }
        if (m4208t(transition) || !FragmentTransitionImpl.m3141i(transition.f6270g)) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            transition.mo4239c(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: c */
    public void mo3125c(ViewGroup viewGroup, Object obj) {
        TransitionManager.m4256a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: e */
    public boolean mo3126e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: f */
    public Object mo3127f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: j */
    public Object mo3128j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.m4263O(transition);
            transitionSet.m4263O(transition2);
            transitionSet.m4268T(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.m4263O(transition);
        }
        transitionSet2.m4263O(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: k */
    public Object mo3129k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m4263O((Transition) obj);
        }
        transitionSet.m4263O((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: l */
    public void mo3130l(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).mo4237a(new Transition.TransitionListener(this) { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: a */
            public void mo4211a(@NonNull Transition transition) {
                transition.mo4255z(this);
                transition.mo4237a(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: b */
            public void mo4191b(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NonNull Transition transition) {
                transition.mo4255z(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList.get(i2)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: d */
            public void mo4193d(@NonNull Transition transition) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: e */
            public void mo4194e(@NonNull Transition transition) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: m */
    public void mo3131m(Object obj, final Object obj2, final ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        final Object obj5 = null;
        final ArrayList arrayList4 = null;
        ((Transition) obj).mo4237a(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: a */
            public void mo4211a(@NonNull Transition transition) {
                Object obj6 = obj2;
                if (obj6 != null) {
                    FragmentTransitionSupport.this.m4209u(obj6, arrayList, null);
                }
                Object obj7 = obj5;
                if (obj7 != null) {
                    FragmentTransitionSupport.this.m4209u(obj7, arrayList4, null);
                }
                Object obj8 = obj4;
                if (obj8 != null) {
                    FragmentTransitionSupport.this.m4209u(obj8, arrayList3, null);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NonNull Transition transition) {
                transition.mo4255z(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: n */
    public void mo3132n(Object obj, final Rect rect) {
        ((Transition) obj).mo4230H(new Transition.EpicenterCallback(this) { // from class: androidx.transition.FragmentTransitionSupport.6
            @Override // androidx.transition.Transition.EpicenterCallback
            /* renamed from: a */
            public Rect mo4210a(@NonNull Transition transition) {
                Rect rect2 = rect;
                if (rect2 == null || rect2.isEmpty()) {
                    return null;
                }
                return rect;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: o */
    public void mo3133o(Object obj, View view) {
        if (view != null) {
            final Rect rect = new Rect();
            m3142h(view, rect);
            ((Transition) obj).mo4230H(new Transition.EpicenterCallback(this) { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                /* renamed from: a */
                public Rect mo4210a(@NonNull Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: p */
    public void mo3134p(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull final Runnable runnable) {
        final Transition transition = (Transition) obj;
        cancellationSignal.m1947c(new CancellationSignal.OnCancelListener(this) { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public void onCancel() {
                transition.cancel();
            }
        });
        transition.mo4237a(new Transition.TransitionListener(this) { // from class: androidx.transition.FragmentTransitionSupport.5
            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: a */
            public void mo4211a(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: b */
            public void mo4191b(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: c */
            public void mo4192c(@NonNull Transition transition2) {
                runnable.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: d */
            public void mo4193d(@NonNull Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            /* renamed from: e */
            public void mo4194e(@NonNull Transition transition2) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: q */
    public void mo3135q(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList<View> arrayList2 = transitionSet.f6270g;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransitionImpl.m3139d(arrayList2, arrayList.get(i2));
        }
        arrayList2.add(view);
        arrayList.add(view);
        mo3124b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: r */
    public void mo3136r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.f6270g.clear();
            transitionSet.f6270g.addAll(arrayList2);
            m4209u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: s */
    public Object mo3137s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m4263O((Transition) obj);
        return transitionSet;
    }

    /* renamed from: u */
    public void m4209u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int m4265Q = transitionSet.m4265Q();
            while (i2 < m4265Q) {
                m4209u(transitionSet.m4264P(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (m4208t(transition)) {
            return;
        }
        ArrayList<View> arrayList3 = transition.f6270g;
        if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i2 < size) {
                transition.mo4239c(arrayList2.get(i2));
                i2++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.mo4226D(arrayList.get(size2));
            }
        }
    }
}
