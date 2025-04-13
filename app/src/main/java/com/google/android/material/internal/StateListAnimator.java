package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes.dex */
public final class StateListAnimator {

    /* renamed from: a */
    public final ArrayList<Tuple> f18327a = new ArrayList<>();

    /* renamed from: b */
    @Nullable
    public Tuple f18328b = null;

    /* renamed from: c */
    @Nullable
    public ValueAnimator f18329c = null;

    /* renamed from: d */
    public final Animator.AnimatorListener f18330d = new AnimatorListenerAdapter() { // from class: com.google.android.material.internal.StateListAnimator.1
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StateListAnimator stateListAnimator = StateListAnimator.this;
            if (stateListAnimator.f18329c == animator) {
                stateListAnimator.f18329c = null;
            }
        }
    };

    public static class Tuple {

        /* renamed from: a */
        public final int[] f18332a;

        /* renamed from: b */
        public final ValueAnimator f18333b;

        public Tuple(int[] iArr, ValueAnimator valueAnimator) {
            this.f18332a = iArr;
            this.f18333b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m10149a(int[] iArr, ValueAnimator valueAnimator) {
        Tuple tuple = new Tuple(iArr, valueAnimator);
        valueAnimator.addListener(this.f18330d);
        this.f18327a.add(tuple);
    }

    /* renamed from: b */
    public void m10150b(int[] iArr) {
        Tuple tuple;
        ValueAnimator valueAnimator;
        int size = this.f18327a.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                tuple = null;
                break;
            }
            tuple = this.f18327a.get(i2);
            if (StateSet.stateSetMatches(tuple.f18332a, iArr)) {
                break;
            } else {
                i2++;
            }
        }
        Tuple tuple2 = this.f18328b;
        if (tuple == tuple2) {
            return;
        }
        if (tuple2 != null && (valueAnimator = this.f18329c) != null) {
            valueAnimator.cancel();
            this.f18329c = null;
        }
        this.f18328b = tuple;
        if (tuple != null) {
            ValueAnimator valueAnimator2 = tuple.f18333b;
            this.f18329c = valueAnimator2;
            valueAnimator2.start();
        }
    }
}
