package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
import p000a.C0000a;

/* loaded from: classes.dex */
public class TransitionSet extends Transition {

    /* renamed from: E */
    public int f6306E;

    /* renamed from: C */
    public ArrayList<Transition> f6304C = new ArrayList<>();

    /* renamed from: D */
    public boolean f6305D = true;

    /* renamed from: F */
    public boolean f6307F = false;

    /* renamed from: G */
    public int f6308G = 0;

    public static class TransitionSetListener extends TransitionListenerAdapter {

        /* renamed from: a */
        public TransitionSet f6310a;

        public TransitionSetListener(TransitionSet transitionSet) {
            this.f6310a = transitionSet;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        /* renamed from: a */
        public void mo4211a(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f6310a;
            if (transitionSet.f6307F) {
                return;
            }
            transitionSet.m4235M();
            this.f6310a.f6307F = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        /* renamed from: c */
        public void mo4192c(@NonNull Transition transition) {
            TransitionSet transitionSet = this.f6310a;
            int i2 = transitionSet.f6306E - 1;
            transitionSet.f6306E = i2;
            if (i2 == 0) {
                transitionSet.f6307F = false;
                transitionSet.m4246n();
            }
            transition.mo4255z(this);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: D */
    public Transition mo4226D(@NonNull View view) {
        for (int i2 = 0; i2 < this.f6304C.size(); i2++) {
            this.f6304C.get(i2).mo4226D(view);
        }
        this.f6270g.remove(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo
    /* renamed from: E */
    public void mo4227E(View view) {
        super.mo4227E(view);
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).mo4227E(view);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo
    /* renamed from: F */
    public void mo4228F() {
        if (this.f6304C.isEmpty()) {
            m4235M();
            m4246n();
            return;
        }
        TransitionSetListener transitionSetListener = new TransitionSetListener(this);
        Iterator<Transition> it = this.f6304C.iterator();
        while (it.hasNext()) {
            it.next().mo4237a(transitionSetListener);
        }
        this.f6306E = this.f6304C.size();
        if (this.f6305D) {
            Iterator<Transition> it2 = this.f6304C.iterator();
            while (it2.hasNext()) {
                it2.next().mo4228F();
            }
            return;
        }
        for (int i2 = 1; i2 < this.f6304C.size(); i2++) {
            Transition transition = this.f6304C.get(i2 - 1);
            final Transition transition2 = this.f6304C.get(i2);
            transition.mo4237a(new TransitionListenerAdapter(this) { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                /* renamed from: c */
                public void mo4192c(@NonNull Transition transition3) {
                    transition2.mo4228F();
                    transition3.mo4255z(this);
                }
            });
        }
        Transition transition3 = this.f6304C.get(0);
        if (transition3 != null) {
            transition3.mo4228F();
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: G */
    public /* bridge */ /* synthetic */ Transition mo4229G(long j2) {
        m4266R(j2);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: H */
    public void mo4230H(Transition.EpicenterCallback epicenterCallback) {
        this.f6287x = epicenterCallback;
        this.f6308G |= 8;
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).mo4230H(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: I */
    public /* bridge */ /* synthetic */ Transition mo4231I(@Nullable TimeInterpolator timeInterpolator) {
        m4267S(timeInterpolator);
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: J */
    public void mo4232J(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f6288y = Transition.f6262A;
        } else {
            this.f6288y = pathMotion;
        }
        this.f6308G |= 4;
        if (this.f6304C != null) {
            for (int i2 = 0; i2 < this.f6304C.size(); i2++) {
                this.f6304C.get(i2).mo4232J(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: K */
    public void mo4233K(TransitionPropagation transitionPropagation) {
        this.f6286w = transitionPropagation;
        this.f6308G |= 2;
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).mo4233K(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: L */
    public Transition mo4234L(long j2) {
        this.f6266c = j2;
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: N */
    public String mo4236N(String str) {
        String mo4236N = super.mo4236N(str);
        for (int i2 = 0; i2 < this.f6304C.size(); i2++) {
            StringBuilder m27x = C0000a.m27x(mo4236N, "\n");
            m27x.append(this.f6304C.get(i2).mo4236N(str + "  "));
            mo4236N = m27x.toString();
        }
        return mo4236N;
    }

    @NonNull
    /* renamed from: O */
    public TransitionSet m4263O(@NonNull Transition transition) {
        this.f6304C.add(transition);
        transition.f6275l = this;
        long j2 = this.f6267d;
        if (j2 >= 0) {
            transition.mo4229G(j2);
        }
        if ((this.f6308G & 1) != 0) {
            transition.mo4231I(this.f6268e);
        }
        if ((this.f6308G & 2) != 0) {
            transition.mo4233K(this.f6286w);
        }
        if ((this.f6308G & 4) != 0) {
            transition.mo4232J(this.f6288y);
        }
        if ((this.f6308G & 8) != 0) {
            transition.mo4230H(this.f6287x);
        }
        return this;
    }

    @Nullable
    /* renamed from: P */
    public Transition m4264P(int i2) {
        if (i2 < 0 || i2 >= this.f6304C.size()) {
            return null;
        }
        return this.f6304C.get(i2);
    }

    /* renamed from: Q */
    public int m4265Q() {
        return this.f6304C.size();
    }

    @NonNull
    /* renamed from: R */
    public TransitionSet m4266R(long j2) {
        ArrayList<Transition> arrayList;
        this.f6267d = j2;
        if (j2 >= 0 && (arrayList = this.f6304C) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6304C.get(i2).mo4229G(j2);
            }
        }
        return this;
    }

    @NonNull
    /* renamed from: S */
    public TransitionSet m4267S(@Nullable TimeInterpolator timeInterpolator) {
        this.f6308G |= 1;
        ArrayList<Transition> arrayList = this.f6304C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6304C.get(i2).mo4231I(timeInterpolator);
            }
        }
        this.f6268e = timeInterpolator;
        return this;
    }

    @NonNull
    /* renamed from: T */
    public TransitionSet m4268T(int i2) {
        if (i2 == 0) {
            this.f6305D = true;
        } else {
            if (i2 != 1) {
                throw new AndroidRuntimeException(C0000a.m7d("Invalid parameter for TransitionSet ordering: ", i2));
            }
            this.f6305D = false;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: a */
    public Transition mo4237a(@NonNull Transition.TransitionListener transitionListener) {
        super.mo4237a(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: b */
    public Transition mo4238b(@IdRes int i2) {
        for (int i3 = 0; i3 < this.f6304C.size(); i3++) {
            this.f6304C.get(i3).mo4238b(i2);
        }
        super.mo4238b(i2);
        return this;
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: c */
    public Transition mo4239c(@NonNull View view) {
        for (int i2 = 0; i2 < this.f6304C.size(); i2++) {
            this.f6304C.get(i2).mo4239c(view);
        }
        this.f6270g.add(view);
        return this;
    }

    @Override // androidx.transition.Transition
    @RestrictTo
    public void cancel() {
        super.cancel();
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).cancel();
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        if (m4253w(transitionValues.f6318b)) {
            Iterator<Transition> it = this.f6304C.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m4253w(transitionValues.f6318b)) {
                    next.mo4187e(transitionValues);
                    transitionValues.f6319c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: g */
    public void mo4241g(TransitionValues transitionValues) {
        super.mo4241g(transitionValues);
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).mo4241g(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        if (m4253w(transitionValues.f6318b)) {
            Iterator<Transition> it = this.f6304C.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m4253w(transitionValues.f6318b)) {
                    next.mo4188h(transitionValues);
                    transitionValues.f6319c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f6304C = new ArrayList<>();
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition clone = this.f6304C.get(i2).clone();
            transitionSet.f6304C.add(clone);
            clone.f6275l = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    @RestrictTo
    /* renamed from: m */
    public void mo4245m(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList<TransitionValues> arrayList, ArrayList<TransitionValues> arrayList2) {
        long j2 = this.f6266c;
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = this.f6304C.get(i2);
            if (j2 > 0 && (this.f6305D || i2 == 0)) {
                long j3 = transition.f6266c;
                if (j3 > 0) {
                    transition.mo4234L(j3 + j2);
                } else {
                    transition.mo4234L(j2);
                }
            }
            transition.mo4245m(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo
    /* renamed from: p */
    public void mo4248p(ViewGroup viewGroup) {
        super.mo4248p(viewGroup);
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).mo4248p(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    @RestrictTo
    /* renamed from: y */
    public void mo4254y(View view) {
        super.mo4254y(view);
        int size = this.f6304C.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f6304C.get(i2).mo4254y(view);
        }
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: z */
    public Transition mo4255z(@NonNull Transition.TransitionListener transitionListener) {
        super.mo4255z(transitionListener);
        return this;
    }
}
