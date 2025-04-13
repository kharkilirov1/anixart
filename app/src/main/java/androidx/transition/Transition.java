package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0000a;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: n */
    public ArrayList<TransitionValues> f6277n;

    /* renamed from: o */
    public ArrayList<TransitionValues> f6278o;

    /* renamed from: w */
    public TransitionPropagation f6286w;

    /* renamed from: x */
    public EpicenterCallback f6287x;

    /* renamed from: z */
    public static final int[] f6264z = {2, 1, 3, 4};

    /* renamed from: A */
    public static final PathMotion f6262A = new PathMotion() { // from class: androidx.transition.Transition.1
        @Override // androidx.transition.PathMotion
        /* renamed from: a */
        public Path mo4184a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    };

    /* renamed from: B */
    public static ThreadLocal<ArrayMap<Animator, AnimationInfo>> f6263B = new ThreadLocal<>();

    /* renamed from: b */
    public String f6265b = getClass().getName();

    /* renamed from: c */
    public long f6266c = -1;

    /* renamed from: d */
    public long f6267d = -1;

    /* renamed from: e */
    public TimeInterpolator f6268e = null;

    /* renamed from: f */
    public ArrayList<Integer> f6269f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f6270g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<View> f6271h = null;

    /* renamed from: i */
    public ArrayList<View> f6272i = null;

    /* renamed from: j */
    public TransitionValuesMaps f6273j = new TransitionValuesMaps();

    /* renamed from: k */
    public TransitionValuesMaps f6274k = new TransitionValuesMaps();

    /* renamed from: l */
    public TransitionSet f6275l = null;

    /* renamed from: m */
    public int[] f6276m = f6264z;

    /* renamed from: p */
    public boolean f6279p = false;

    /* renamed from: q */
    public ArrayList<Animator> f6280q = new ArrayList<>();

    /* renamed from: r */
    public int f6281r = 0;

    /* renamed from: s */
    public boolean f6282s = false;

    /* renamed from: t */
    public boolean f6283t = false;

    /* renamed from: u */
    public ArrayList<TransitionListener> f6284u = null;

    /* renamed from: v */
    public ArrayList<Animator> f6285v = new ArrayList<>();

    /* renamed from: y */
    public PathMotion f6288y = f6262A;

    public static class AnimationInfo {

        /* renamed from: a */
        public View f6292a;

        /* renamed from: b */
        public String f6293b;

        /* renamed from: c */
        public TransitionValues f6294c;

        /* renamed from: d */
        public WindowIdImpl f6295d;

        /* renamed from: e */
        public Transition f6296e;

        public AnimationInfo(View view, String str, Transition transition, WindowIdImpl windowIdImpl, TransitionValues transitionValues) {
            this.f6292a = view;
            this.f6293b = str;
            this.f6294c = transitionValues;
            this.f6295d = windowIdImpl;
            this.f6296e = transition;
        }
    }

    public static class ArrayListManager {
    }

    public static abstract class EpicenterCallback {
        /* renamed from: a */
        public abstract Rect mo4210a(@NonNull Transition transition);
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface MatchOrder {
    }

    public interface TransitionListener {
        /* renamed from: a */
        void mo4211a(@NonNull Transition transition);

        /* renamed from: b */
        void mo4191b(@NonNull Transition transition);

        /* renamed from: c */
        void mo4192c(@NonNull Transition transition);

        /* renamed from: d */
        void mo4193d(@NonNull Transition transition);

        /* renamed from: e */
        void mo4194e(@NonNull Transition transition);
    }

    /* renamed from: d */
    public static void m4223d(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.f6320a.put(view, transitionValues);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (transitionValuesMaps.f6321b.indexOfKey(id2) >= 0) {
                transitionValuesMaps.f6321b.put(id2, null);
            } else {
                transitionValuesMaps.f6321b.put(id2, view);
            }
        }
        String m2165E = ViewCompat.m2165E(view);
        if (m2165E != null) {
            if (transitionValuesMaps.f6323d.containsKey(m2165E)) {
                transitionValuesMaps.f6323d.put(m2165E, null);
            } else {
                transitionValuesMaps.f6323d.put(m2165E, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (transitionValuesMaps.f6322c.m1096k(itemIdAtPosition) < 0) {
                    ViewCompat.m2214n0(view, true);
                    transitionValuesMaps.f6322c.m1098m(itemIdAtPosition, view);
                    return;
                }
                View m1094h = transitionValuesMaps.f6322c.m1094h(itemIdAtPosition);
                if (m1094h != null) {
                    ViewCompat.m2214n0(m1094h, false);
                    transitionValuesMaps.f6322c.m1098m(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: s */
    public static ArrayMap<Animator, AnimationInfo> m4224s() {
        ArrayMap<Animator, AnimationInfo> arrayMap = f6263B.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ArrayMap<Animator, AnimationInfo> arrayMap2 = new ArrayMap<>();
        f6263B.set(arrayMap2);
        return arrayMap2;
    }

    /* renamed from: x */
    public static boolean m4225x(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f6317a.get(str);
        Object obj2 = transitionValues2.f6317a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    @NonNull
    /* renamed from: D */
    public Transition mo4226D(@NonNull View view) {
        this.f6270g.remove(view);
        return this;
    }

    @RestrictTo
    /* renamed from: E */
    public void mo4227E(View view) {
        if (this.f6282s) {
            if (!this.f6283t) {
                for (int size = this.f6280q.size() - 1; size >= 0; size--) {
                    this.f6280q.get(size).resume();
                }
                ArrayList<TransitionListener> arrayList = this.f6284u;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f6284u.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((TransitionListener) arrayList2.get(i2)).mo4194e(this);
                    }
                }
            }
            this.f6282s = false;
        }
    }

    @RestrictTo
    /* renamed from: F */
    public void mo4228F() {
        m4235M();
        final ArrayMap<Animator, AnimationInfo> m4224s = m4224s();
        Iterator<Animator> it = this.f6285v.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m4224s.containsKey(next)) {
                m4235M();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            m4224s.remove(animator);
                            Transition.this.f6280q.remove(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationStart(Animator animator) {
                            Transition.this.f6280q.add(animator);
                        }
                    });
                    long j2 = this.f6267d;
                    if (j2 >= 0) {
                        next.setDuration(j2);
                    }
                    long j3 = this.f6266c;
                    if (j3 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f6268e;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public void onAnimationEnd(Animator animator) {
                            Transition.this.m4246n();
                            animator.removeListener(this);
                        }
                    });
                    next.start();
                }
            }
        }
        this.f6285v.clear();
        m4246n();
    }

    @NonNull
    /* renamed from: G */
    public Transition mo4229G(long j2) {
        this.f6267d = j2;
        return this;
    }

    /* renamed from: H */
    public void mo4230H(@Nullable EpicenterCallback epicenterCallback) {
        this.f6287x = epicenterCallback;
    }

    @NonNull
    /* renamed from: I */
    public Transition mo4231I(@Nullable TimeInterpolator timeInterpolator) {
        this.f6268e = timeInterpolator;
        return this;
    }

    /* renamed from: J */
    public void mo4232J(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f6288y = f6262A;
        } else {
            this.f6288y = pathMotion;
        }
    }

    /* renamed from: K */
    public void mo4233K(@Nullable TransitionPropagation transitionPropagation) {
        this.f6286w = transitionPropagation;
    }

    @NonNull
    /* renamed from: L */
    public Transition mo4234L(long j2) {
        this.f6266c = j2;
        return this;
    }

    @RestrictTo
    /* renamed from: M */
    public void m4235M() {
        if (this.f6281r == 0) {
            ArrayList<TransitionListener> arrayList = this.f6284u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6284u.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((TransitionListener) arrayList2.get(i2)).mo4211a(this);
                }
            }
            this.f6283t = false;
        }
        this.f6281r++;
    }

    /* renamed from: N */
    public String mo4236N(String str) {
        StringBuilder m24u = C0000a.m24u(str);
        m24u.append(getClass().getSimpleName());
        m24u.append("@");
        m24u.append(Integer.toHexString(hashCode()));
        m24u.append(": ");
        String sb = m24u.toString();
        if (this.f6267d != -1) {
            sb = C0000a.m19p(C0000a.m27x(sb, "dur("), this.f6267d, ") ");
        }
        if (this.f6266c != -1) {
            sb = C0000a.m19p(C0000a.m27x(sb, "dly("), this.f6266c, ") ");
        }
        if (this.f6268e != null) {
            StringBuilder m27x = C0000a.m27x(sb, "interp(");
            m27x.append(this.f6268e);
            m27x.append(") ");
            sb = m27x.toString();
        }
        if (this.f6269f.size() <= 0 && this.f6270g.size() <= 0) {
            return sb;
        }
        String m14k = C0000a.m14k(sb, "tgts(");
        if (this.f6269f.size() > 0) {
            for (int i2 = 0; i2 < this.f6269f.size(); i2++) {
                if (i2 > 0) {
                    m14k = C0000a.m14k(m14k, ", ");
                }
                StringBuilder m24u2 = C0000a.m24u(m14k);
                m24u2.append(this.f6269f.get(i2));
                m14k = m24u2.toString();
            }
        }
        if (this.f6270g.size() > 0) {
            for (int i3 = 0; i3 < this.f6270g.size(); i3++) {
                if (i3 > 0) {
                    m14k = C0000a.m14k(m14k, ", ");
                }
                StringBuilder m24u3 = C0000a.m24u(m14k);
                m24u3.append(this.f6270g.get(i3));
                m14k = m24u3.toString();
            }
        }
        return C0000a.m14k(m14k, ")");
    }

    @NonNull
    /* renamed from: a */
    public Transition mo4237a(@NonNull TransitionListener transitionListener) {
        if (this.f6284u == null) {
            this.f6284u = new ArrayList<>();
        }
        this.f6284u.add(transitionListener);
        return this;
    }

    @NonNull
    /* renamed from: b */
    public Transition mo4238b(@IdRes int i2) {
        if (i2 != 0) {
            this.f6269f.add(Integer.valueOf(i2));
        }
        return this;
    }

    @NonNull
    /* renamed from: c */
    public Transition mo4239c(@NonNull View view) {
        this.f6270g.add(view);
        return this;
    }

    @RestrictTo
    public void cancel() {
        for (int size = this.f6280q.size() - 1; size >= 0; size--) {
            this.f6280q.get(size).cancel();
        }
        ArrayList<TransitionListener> arrayList = this.f6284u;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f6284u.clone();
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((TransitionListener) arrayList2.get(i2)).mo4193d(this);
        }
    }

    /* renamed from: e */
    public abstract void mo4187e(@NonNull TransitionValues transitionValues);

    /* renamed from: f */
    public final void m4240f(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        ArrayList<View> arrayList = this.f6271h;
        if (arrayList == null || !arrayList.contains(view)) {
            if (view.getParent() instanceof ViewGroup) {
                TransitionValues transitionValues = new TransitionValues(view);
                if (z) {
                    mo4188h(transitionValues);
                } else {
                    mo4187e(transitionValues);
                }
                transitionValues.f6319c.add(this);
                mo4241g(transitionValues);
                if (z) {
                    m4223d(this.f6273j, view, transitionValues);
                } else {
                    m4223d(this.f6274k, view, transitionValues);
                }
            }
            if (view instanceof ViewGroup) {
                ArrayList<View> arrayList2 = this.f6272i;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        m4240f(viewGroup.getChildAt(i2), z);
                    }
                }
            }
        }
    }

    /* renamed from: g */
    public void mo4241g(TransitionValues transitionValues) {
        String[] mo4262b;
        if (this.f6286w == null || transitionValues.f6317a.isEmpty() || (mo4262b = this.f6286w.mo4262b()) == null) {
            return;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= mo4262b.length) {
                z = true;
                break;
            } else if (!transitionValues.f6317a.containsKey(mo4262b[i2])) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            return;
        }
        this.f6286w.mo4261a(transitionValues);
    }

    /* renamed from: h */
    public abstract void mo4188h(@NonNull TransitionValues transitionValues);

    /* renamed from: i */
    public void m4242i(ViewGroup viewGroup, boolean z) {
        m4243j(z);
        if (this.f6269f.size() <= 0 && this.f6270g.size() <= 0) {
            m4240f(viewGroup, z);
            return;
        }
        for (int i2 = 0; i2 < this.f6269f.size(); i2++) {
            View findViewById = viewGroup.findViewById(this.f6269f.get(i2).intValue());
            if (findViewById != null) {
                TransitionValues transitionValues = new TransitionValues(findViewById);
                if (z) {
                    mo4188h(transitionValues);
                } else {
                    mo4187e(transitionValues);
                }
                transitionValues.f6319c.add(this);
                mo4241g(transitionValues);
                if (z) {
                    m4223d(this.f6273j, findViewById, transitionValues);
                } else {
                    m4223d(this.f6274k, findViewById, transitionValues);
                }
            }
        }
        for (int i3 = 0; i3 < this.f6270g.size(); i3++) {
            View view = this.f6270g.get(i3);
            TransitionValues transitionValues2 = new TransitionValues(view);
            if (z) {
                mo4188h(transitionValues2);
            } else {
                mo4187e(transitionValues2);
            }
            transitionValues2.f6319c.add(this);
            mo4241g(transitionValues2);
            if (z) {
                m4223d(this.f6273j, view, transitionValues2);
            } else {
                m4223d(this.f6274k, view, transitionValues2);
            }
        }
    }

    /* renamed from: j */
    public void m4243j(boolean z) {
        if (z) {
            this.f6273j.f6320a.clear();
            this.f6273j.f6321b.clear();
            this.f6273j.f6322c.m1090c();
        } else {
            this.f6274k.f6320a.clear();
            this.f6274k.f6321b.clear();
            this.f6274k.f6322c.m1090c();
        }
    }

    @Override // 
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f6285v = new ArrayList<>();
            transition.f6273j = new TransitionValuesMaps();
            transition.f6274k = new TransitionValuesMaps();
            transition.f6277n = null;
            transition.f6278o = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: l */
    public Animator mo4189l(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        return null;
    }

    @RestrictTo
    /* renamed from: m */
    public void mo4245m(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        Animator mo4189l;
        int i2;
        int i3;
        View view;
        Animator animator;
        TransitionValues transitionValues;
        Animator animator2;
        TransitionValues transitionValues2;
        ArrayMap<Animator, AnimationInfo> m4224s = m4224s();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            TransitionValues transitionValues3 = arrayList.get(i4);
            TransitionValues transitionValues4 = arrayList2.get(i4);
            if (transitionValues3 != null && !transitionValues3.f6319c.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f6319c.contains(this)) {
                transitionValues4 = null;
            }
            if (transitionValues3 != null || transitionValues4 != null) {
                if ((transitionValues3 == null || transitionValues4 == null || mo4252v(transitionValues3, transitionValues4)) && (mo4189l = mo4189l(viewGroup, transitionValues3, transitionValues4)) != null) {
                    if (transitionValues4 != null) {
                        view = transitionValues4.f6318b;
                        String[] mo4190t = mo4190t();
                        if (mo4190t != null && mo4190t.length > 0) {
                            transitionValues2 = new TransitionValues(view);
                            i2 = size;
                            TransitionValues transitionValues5 = transitionValuesMaps2.f6320a.get(view);
                            if (transitionValues5 != null) {
                                int i5 = 0;
                                while (i5 < mo4190t.length) {
                                    transitionValues2.f6317a.put(mo4190t[i5], transitionValues5.f6317a.get(mo4190t[i5]));
                                    i5++;
                                    i4 = i4;
                                    transitionValues5 = transitionValues5;
                                }
                            }
                            i3 = i4;
                            int size2 = m4224s.size();
                            int i6 = 0;
                            while (true) {
                                if (i6 >= size2) {
                                    animator2 = mo4189l;
                                    break;
                                }
                                AnimationInfo animationInfo = m4224s.get(m4224s.m1122i(i6));
                                if (animationInfo.f6294c != null && animationInfo.f6292a == view && animationInfo.f6293b.equals(this.f6265b) && animationInfo.f6294c.equals(transitionValues2)) {
                                    animator2 = null;
                                    break;
                                }
                                i6++;
                            }
                        } else {
                            i2 = size;
                            i3 = i4;
                            animator2 = mo4189l;
                            transitionValues2 = null;
                        }
                        animator = animator2;
                        transitionValues = transitionValues2;
                    } else {
                        i2 = size;
                        i3 = i4;
                        view = transitionValues3.f6318b;
                        animator = mo4189l;
                        transitionValues = null;
                    }
                    if (animator != null) {
                        TransitionPropagation transitionPropagation = this.f6286w;
                        if (transitionPropagation != null) {
                            long mo4202c = transitionPropagation.mo4202c(viewGroup, this, transitionValues3, transitionValues4);
                            sparseIntArray.put(this.f6285v.size(), (int) mo4202c);
                            j2 = Math.min(mo4202c, j2);
                        }
                        long j3 = j2;
                        String str = this.f6265b;
                        ViewUtilsBase viewUtilsBase = ViewUtils.f6341a;
                        m4224s.put(animator, new AnimationInfo(view, str, this, new WindowIdApi18(viewGroup), transitionValues));
                        this.f6285v.add(animator);
                        j2 = j3;
                    }
                    i4 = i3 + 1;
                    size = i2;
                }
            }
            i2 = size;
            i3 = i4;
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator3 = this.f6285v.get(sparseIntArray.keyAt(i7));
                animator3.setStartDelay(animator3.getStartDelay() + (sparseIntArray.valueAt(i7) - j2));
            }
        }
    }

    @RestrictTo
    /* renamed from: n */
    public void m4246n() {
        int i2 = this.f6281r - 1;
        this.f6281r = i2;
        if (i2 == 0) {
            ArrayList<TransitionListener> arrayList = this.f6284u;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f6284u.clone();
                int size = arrayList2.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((TransitionListener) arrayList2.get(i3)).mo4192c(this);
                }
            }
            for (int i4 = 0; i4 < this.f6273j.f6322c.m1100o(); i4++) {
                View m1101p = this.f6273j.f6322c.m1101p(i4);
                if (m1101p != null) {
                    ViewCompat.m2214n0(m1101p, false);
                }
            }
            for (int i5 = 0; i5 < this.f6274k.f6322c.m1100o(); i5++) {
                View m1101p2 = this.f6274k.f6322c.m1101p(i5);
                if (m1101p2 != null) {
                    ViewCompat.m2214n0(m1101p2, false);
                }
            }
            this.f6283t = true;
        }
    }

    /* renamed from: o */
    public final ArrayList<View> m4247o(ArrayList<View> arrayList, View view, boolean z) {
        if (view == null) {
            return arrayList;
        }
        if (z) {
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            if (arrayList.contains(view)) {
                return arrayList;
            }
            arrayList.add(view);
            return arrayList;
        }
        if (arrayList == null) {
            return arrayList;
        }
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @RestrictTo
    /* renamed from: p */
    public void mo4248p(ViewGroup viewGroup) {
        ArrayMap<Animator, AnimationInfo> m4224s = m4224s();
        int size = m4224s.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        ViewUtilsBase viewUtilsBase = ViewUtils.f6341a;
        WindowIdApi18 windowIdApi18 = new WindowIdApi18(viewGroup);
        ArrayMap arrayMap = new ArrayMap(m4224s);
        m4224s.clear();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AnimationInfo animationInfo = (AnimationInfo) arrayMap.m1126m(i2);
            if (animationInfo.f6292a != null && windowIdApi18.equals(animationInfo.f6295d)) {
                ((Animator) arrayMap.m1122i(i2)).end();
            }
        }
    }

    @Nullable
    /* renamed from: q */
    public Rect m4249q() {
        EpicenterCallback epicenterCallback = this.f6287x;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.mo4210a(this);
    }

    /* renamed from: r */
    public TransitionValues m4250r(View view, boolean z) {
        TransitionSet transitionSet = this.f6275l;
        if (transitionSet != null) {
            return transitionSet.m4250r(view, z);
        }
        ArrayList<TransitionValues> arrayList = z ? this.f6277n : this.f6278o;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            TransitionValues transitionValues = arrayList.get(i3);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.f6318b == view) {
                i2 = i3;
                break;
            }
            i3++;
        }
        if (i2 >= 0) {
            return (z ? this.f6278o : this.f6277n).get(i2);
        }
        return null;
    }

    @Nullable
    /* renamed from: t */
    public String[] mo4190t() {
        return null;
    }

    public String toString() {
        return mo4236N("");
    }

    @Nullable
    /* renamed from: u */
    public TransitionValues m4251u(@NonNull View view, boolean z) {
        TransitionSet transitionSet = this.f6275l;
        if (transitionSet != null) {
            return transitionSet.m4251u(view, z);
        }
        return (z ? this.f6273j : this.f6274k).f6320a.get(view);
    }

    /* renamed from: v */
    public boolean mo4252v(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return false;
        }
        String[] mo4190t = mo4190t();
        if (mo4190t == null) {
            Iterator<String> it = transitionValues.f6317a.keySet().iterator();
            while (it.hasNext()) {
                if (m4225x(transitionValues, transitionValues2, it.next())) {
                }
            }
            return false;
        }
        for (String str : mo4190t) {
            if (!m4225x(transitionValues, transitionValues2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: w */
    public boolean m4253w(View view) {
        int id2 = view.getId();
        ArrayList<View> arrayList = this.f6271h;
        if (arrayList == null || !arrayList.contains(view)) {
            return (this.f6269f.size() == 0 && this.f6270g.size() == 0) || this.f6269f.contains(Integer.valueOf(id2)) || this.f6270g.contains(view);
        }
        return false;
    }

    @RestrictTo
    /* renamed from: y */
    public void mo4254y(View view) {
        if (this.f6283t) {
            return;
        }
        for (int size = this.f6280q.size() - 1; size >= 0; size--) {
            this.f6280q.get(size).pause();
        }
        ArrayList<TransitionListener> arrayList = this.f6284u;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f6284u.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((TransitionListener) arrayList2.get(i2)).mo4191b(this);
            }
        }
        this.f6282s = true;
    }

    @NonNull
    /* renamed from: z */
    public Transition mo4255z(@NonNull TransitionListener transitionListener) {
        ArrayList<TransitionListener> arrayList = this.f6284u;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(transitionListener);
        if (this.f6284u.size() == 0) {
            this.f6284u = null;
        }
        return this;
    }
}
