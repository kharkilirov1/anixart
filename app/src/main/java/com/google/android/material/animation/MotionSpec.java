package com.google.android.material.animation;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.AnimatorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import androidx.collection.SimpleArrayMap;
import androidx.emoji2.text.flatbuffer.C0321a;
import java.util.ArrayList;
import java.util.List;
import p000a.C0000a;

/* loaded from: classes.dex */
public class MotionSpec {

    /* renamed from: a */
    public final SimpleArrayMap<String, MotionTiming> f17354a = new SimpleArrayMap<>();

    /* renamed from: b */
    public final SimpleArrayMap<String, PropertyValuesHolder[]> f17355b = new SimpleArrayMap<>();

    @Nullable
    /* renamed from: a */
    public static MotionSpec m9743a(@NonNull Context context, @NonNull TypedArray typedArray, @StyleableRes int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return m9744b(context, resourceId);
    }

    @Nullable
    /* renamed from: b */
    public static MotionSpec m9744b(@NonNull Context context, @AnimatorRes int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return m9745c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return m9745c(arrayList);
        } catch (Exception e2) {
            StringBuilder m24u = C0000a.m24u("Can't load animation resource ID #0x");
            m24u.append(Integer.toHexString(i2));
            Log.w("MotionSpec", m24u.toString(), e2);
            return null;
        }
    }

    @NonNull
    /* renamed from: c */
    public static MotionSpec m9745c(@NonNull List<Animator> list) {
        MotionSpec motionSpec = new MotionSpec();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = list.get(i2);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            motionSpec.f17355b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                interpolator = AnimationUtils.f17343b;
            } else if (interpolator instanceof AccelerateInterpolator) {
                interpolator = AnimationUtils.f17344c;
            } else if (interpolator instanceof DecelerateInterpolator) {
                interpolator = AnimationUtils.f17345d;
            }
            MotionTiming motionTiming = new MotionTiming(startDelay, duration, interpolator);
            motionTiming.f17359d = objectAnimator.getRepeatCount();
            motionTiming.f17360e = objectAnimator.getRepeatMode();
            motionSpec.f17354a.put(propertyName, motionTiming);
        }
        return motionSpec;
    }

    /* renamed from: d */
    public MotionTiming m9746d(String str) {
        if (this.f17354a.get(str) != null) {
            return this.f17354a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MotionSpec) {
            return this.f17354a.equals(((MotionSpec) obj).f17354a);
        }
        return false;
    }

    public int hashCode() {
        return this.f17354a.hashCode();
    }

    @NonNull
    public String toString() {
        StringBuilder m2872a = C0321a.m2872a('\n');
        m2872a.append(getClass().getName());
        m2872a.append('{');
        m2872a.append(Integer.toHexString(System.identityHashCode(this)));
        m2872a.append(" timings: ");
        m2872a.append(this.f17354a);
        m2872a.append("}\n");
        return m2872a.toString();
    }
}
