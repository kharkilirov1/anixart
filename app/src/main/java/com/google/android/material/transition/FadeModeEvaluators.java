package com.google.android.material.transition;

import kotlin.KotlinVersion;
import p000a.C0000a;

/* loaded from: classes.dex */
class FadeModeEvaluators {

    /* renamed from: a */
    public static final FadeModeEvaluator f19337a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10576a(float f2, float f3, float f4, float f5) {
            return new FadeModeResult(KotlinVersion.MAX_COMPONENT_VALUE, TransitionUtils.m10604f(0, KotlinVersion.MAX_COMPONENT_VALUE, f3, f4, f2), true);
        }
    };

    /* renamed from: b */
    public static final FadeModeEvaluator f19338b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10576a(float f2, float f3, float f4, float f5) {
            return FadeModeResult.m10577a(TransitionUtils.m10604f(KotlinVersion.MAX_COMPONENT_VALUE, 0, f3, f4, f2), KotlinVersion.MAX_COMPONENT_VALUE);
        }
    };

    /* renamed from: c */
    public static final FadeModeEvaluator f19339c = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10576a(float f2, float f3, float f4, float f5) {
            return FadeModeResult.m10577a(TransitionUtils.m10604f(KotlinVersion.MAX_COMPONENT_VALUE, 0, f3, f4, f2), TransitionUtils.m10604f(0, KotlinVersion.MAX_COMPONENT_VALUE, f3, f4, f2));
        }
    };

    /* renamed from: d */
    public static final FadeModeEvaluator f19340d = new FadeModeEvaluator() { // from class: com.google.android.material.transition.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10576a(float f2, float f3, float f4, float f5) {
            float m4a = C0000a.m4a(f4, f3, f5, f3);
            return FadeModeResult.m10577a(TransitionUtils.m10604f(KotlinVersion.MAX_COMPONENT_VALUE, 0, f3, m4a, f2), TransitionUtils.m10604f(0, KotlinVersion.MAX_COMPONENT_VALUE, m4a, f4, f2));
        }
    };
}
