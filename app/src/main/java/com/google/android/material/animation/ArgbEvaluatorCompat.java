package com.google.android.material.animation;

import android.animation.TypeEvaluator;
import androidx.annotation.NonNull;
import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
public class ArgbEvaluatorCompat implements TypeEvaluator<Integer> {

    /* renamed from: a */
    public static final ArgbEvaluatorCompat f17347a = new ArgbEvaluatorCompat();

    @Override // android.animation.TypeEvaluator
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer evaluate(float f2, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f3 = ((intValue >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((intValue >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f5 = ((intValue >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        int intValue2 = num2.intValue();
        float f6 = ((intValue2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((intValue2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f8 = ((intValue2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float pow = (float) Math.pow(f4, 2.2d);
        float pow2 = (float) Math.pow(f5, 2.2d);
        float pow3 = (float) Math.pow((intValue & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(f7, 2.2d);
        float pow5 = (float) Math.pow(f8, 2.2d);
        float pow6 = (float) Math.pow((intValue2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f, 2.2d);
        float m4a = C0000a.m4a(f6, f3, f2, f3);
        float m4a2 = C0000a.m4a(pow4, pow, f2, pow);
        float m4a3 = C0000a.m4a(pow5, pow2, f2, pow2);
        float m4a4 = C0000a.m4a(pow6, pow3, f2, pow3);
        float pow7 = ((float) Math.pow(m4a2, 0.45454545454545453d)) * 255.0f;
        float pow8 = ((float) Math.pow(m4a3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(m4a4, 0.45454545454545453d)) * 255.0f) | (Math.round(pow7) << 16) | (Math.round(m4a * 255.0f) << 24) | (Math.round(pow8) << 8));
    }
}
