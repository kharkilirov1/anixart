package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

@RequiresApi
/* loaded from: classes.dex */
class FragmentTransitionCompat21 extends FragmentTransitionImpl {

    @RequiresApi
    public static class Api19Impl {
    }

    /* renamed from: t */
    public static boolean m3122t(Transition transition) {
        return (FragmentTransitionImpl.m3141i(transition.getTargetIds()) && FragmentTransitionImpl.m3141i(transition.getTargetNames()) && FragmentTransitionImpl.m3141i(transition.getTargetTypes())) ? false : true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: a */
    public void mo3123a(Object obj, View view) {
        ((Transition) obj).addTarget(view);
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
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo3124b(transitionSet.getTransitionAt(i2), arrayList);
                i2++;
            }
            return;
        }
        if (m3122t(transition) || !FragmentTransitionImpl.m3141i(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i2 < size) {
            transition.addTarget(arrayList.get(i2));
            i2++;
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: c */
    public void mo3125c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: k */
    public Object mo3129k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: l */
    public void mo3130l(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new Transition.TransitionListener(this) { // from class: androidx.fragment.app.FragmentTransitionCompat21.2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
                view.setVisibility(8);
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((View) arrayList.get(i2)).setVisibility(0);
                }
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                transition.removeListener(this);
                transition.addListener(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: m */
    public void mo3131m(Object obj, final Object obj2, final ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, final Object obj4, final ArrayList<View> arrayList3) {
        final Object obj5 = null;
        final ArrayList arrayList4 = null;
        ((Transition) obj).addListener(new Transition.TransitionListener() { // from class: androidx.fragment.app.FragmentTransitionCompat21.3
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                transition.removeListener(this);
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                Object obj6 = obj2;
                if (obj6 != null) {
                    FragmentTransitionCompat21.this.m3138u(obj6, arrayList, null);
                }
                Object obj7 = obj5;
                if (obj7 != null) {
                    FragmentTransitionCompat21.this.m3138u(obj7, arrayList4, null);
                }
                Object obj8 = obj4;
                if (obj8 != null) {
                    FragmentTransitionCompat21.this.m3138u(obj8, arrayList3, null);
                }
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: n */
    public void mo3132n(Object obj, final Rect rect) {
        ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback(this) { // from class: androidx.fragment.app.FragmentTransitionCompat21.5
            @Override // android.transition.Transition.EpicenterCallback
            public Rect onGetEpicenter(Transition transition) {
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
            ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback(this) { // from class: androidx.fragment.app.FragmentTransitionCompat21.1
                @Override // android.transition.Transition.EpicenterCallback
                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: p */
    public void mo3134p(@NonNull Fragment fragment, @NonNull Object obj, @NonNull CancellationSignal cancellationSignal, @NonNull final Runnable runnable) {
        ((Transition) obj).addListener(new Transition.TransitionListener(this) { // from class: androidx.fragment.app.FragmentTransitionCompat21.4
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                runnable.run();
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: q */
    public void mo3135q(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransitionImpl.m3139d(targets, arrayList.get(i2));
        }
        targets.add(view);
        arrayList.add(view);
        mo3124b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: r */
    public void mo3136r(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m3138u(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    /* renamed from: s */
    public Object mo3137s(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: u */
    public void m3138u(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                m3138u(transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
            return;
        }
        if (m3122t(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i2 < size) {
            transition.addTarget(arrayList2.get(i2));
            i2++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }
}
