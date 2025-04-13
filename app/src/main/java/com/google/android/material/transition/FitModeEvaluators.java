package com.google.android.material.transition;

import android.graphics.RectF;

/* loaded from: classes.dex */
class FitModeEvaluators {

    /* renamed from: a */
    public static final FitModeEvaluator f19359a = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.1
        @Override // com.google.android.material.transition.FitModeEvaluator
        /* renamed from: a */
        public FitModeResult mo10582a(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float m10603e = TransitionUtils.m10603e(f5, f7, f3, f4, f2, true);
            float f9 = m10603e / f5;
            float f10 = m10603e / f7;
            return new FitModeResult(f9, f10, m10603e, f6 * f9, m10603e, f8 * f10);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        /* renamed from: b */
        public boolean mo10583b(FitModeResult fitModeResult) {
            return fitModeResult.f19364d > fitModeResult.f19366f;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        /* renamed from: c */
        public void mo10584c(RectF rectF, float f2, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f19366f - fitModeResult.f19364d) * f2;
        }
    };

    /* renamed from: b */
    public static final FitModeEvaluator f19360b = new FitModeEvaluator() { // from class: com.google.android.material.transition.FitModeEvaluators.2
        @Override // com.google.android.material.transition.FitModeEvaluator
        /* renamed from: a */
        public FitModeResult mo10582a(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float m10603e = TransitionUtils.m10603e(f6, f8, f3, f4, f2, true);
            float f9 = m10603e / f6;
            float f10 = m10603e / f8;
            return new FitModeResult(f9, f10, f5 * f9, m10603e, f7 * f10, m10603e);
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        /* renamed from: b */
        public boolean mo10583b(FitModeResult fitModeResult) {
            return fitModeResult.f19363c > fitModeResult.f19365e;
        }

        @Override // com.google.android.material.transition.FitModeEvaluator
        /* renamed from: c */
        public void mo10584c(RectF rectF, float f2, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.f19365e - fitModeResult.f19363c) / 2.0f) * f2;
            rectF.left += abs;
            rectF.right -= abs;
        }
    };
}
