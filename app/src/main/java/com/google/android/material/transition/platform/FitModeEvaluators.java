package com.google.android.material.transition.platform;

import android.graphics.RectF;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class FitModeEvaluators {

    /* renamed from: a */
    public static final FitModeEvaluator f19481a = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.1
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        /* renamed from: a */
        public FitModeResult mo10614a(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float m10637e = TransitionUtils.m10637e(f5, f7, f3, f4, f2, true);
            float f9 = m10637e / f5;
            float f10 = m10637e / f7;
            return new FitModeResult(f9, f10, m10637e, f6 * f9, m10637e, f8 * f10);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        /* renamed from: b */
        public boolean mo10615b(FitModeResult fitModeResult) {
            return fitModeResult.f19486d > fitModeResult.f19488f;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        /* renamed from: c */
        public void mo10616c(RectF rectF, float f2, FitModeResult fitModeResult) {
            rectF.bottom -= Math.abs(fitModeResult.f19488f - fitModeResult.f19486d) * f2;
        }
    };

    /* renamed from: b */
    public static final FitModeEvaluator f19482b = new FitModeEvaluator() { // from class: com.google.android.material.transition.platform.FitModeEvaluators.2
        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        /* renamed from: a */
        public FitModeResult mo10614a(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            float m10637e = TransitionUtils.m10637e(f6, f8, f3, f4, f2, true);
            float f9 = m10637e / f6;
            float f10 = m10637e / f8;
            return new FitModeResult(f9, f10, f5 * f9, m10637e, f7 * f10, m10637e);
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        /* renamed from: b */
        public boolean mo10615b(FitModeResult fitModeResult) {
            return fitModeResult.f19485c > fitModeResult.f19487e;
        }

        @Override // com.google.android.material.transition.platform.FitModeEvaluator
        /* renamed from: c */
        public void mo10616c(RectF rectF, float f2, FitModeResult fitModeResult) {
            float abs = (Math.abs(fitModeResult.f19487e - fitModeResult.f19485c) / 2.0f) * f2;
            rectF.left += abs;
            rectF.right -= abs;
        }
    };
}
