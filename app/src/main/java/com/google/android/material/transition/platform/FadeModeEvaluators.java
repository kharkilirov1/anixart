package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;
import kotlin.KotlinVersion;
import p000a.C0000a;

@RequiresApi
/* loaded from: classes.dex */
class FadeModeEvaluators {

    /* renamed from: a */
    public static final FadeModeEvaluator f19459a = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10608a(float f2, float f3, float f4, float f5) {
            return new FadeModeResult(KotlinVersion.MAX_COMPONENT_VALUE, TransitionUtils.m10638f(0, KotlinVersion.MAX_COMPONENT_VALUE, f3, f4, f2), true);
        }
    };

    /* renamed from: b */
    public static final FadeModeEvaluator f19460b = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10608a(float f2, float f3, float f4, float f5) {
            return FadeModeResult.m10609a(TransitionUtils.m10638f(KotlinVersion.MAX_COMPONENT_VALUE, 0, f3, f4, f2), KotlinVersion.MAX_COMPONENT_VALUE);
        }
    };

    /* renamed from: c */
    public static final FadeModeEvaluator f19461c = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.3
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10608a(float f2, float f3, float f4, float f5) {
            return FadeModeResult.m10609a(TransitionUtils.m10638f(KotlinVersion.MAX_COMPONENT_VALUE, 0, f3, f4, f2), TransitionUtils.m10638f(0, KotlinVersion.MAX_COMPONENT_VALUE, f3, f4, f2));
        }
    };

    /* renamed from: d */
    public static final FadeModeEvaluator f19462d = new FadeModeEvaluator() { // from class: com.google.android.material.transition.platform.FadeModeEvaluators.4
        @Override // com.google.android.material.transition.platform.FadeModeEvaluator
        /* renamed from: a */
        public FadeModeResult mo10608a(float f2, float f3, float f4, float f5) {
            float m4a = C0000a.m4a(f4, f3, f5, f3);
            return FadeModeResult.m10609a(TransitionUtils.m10638f(KotlinVersion.MAX_COMPONENT_VALUE, 0, f3, m4a, f2), TransitionUtils.m10638f(0, KotlinVersion.MAX_COMPONENT_VALUE, m4a, f4, f2));
        }
    };
}
