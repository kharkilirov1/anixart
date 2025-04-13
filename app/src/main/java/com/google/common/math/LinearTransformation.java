package com.google.common.math;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;

@Beta
@GwtIncompatible
/* loaded from: classes2.dex */
public abstract class LinearTransformation {

    public static final class LinearTransformationBuilder {
    }

    public static final class NaNLinearTransformation extends LinearTransformation {
        public String toString() {
            return "NaN";
        }
    }

    public static final class RegularLinearTransformation extends LinearTransformation {
        public String toString() {
            Double valueOf = Double.valueOf(0.0d);
            return String.format("y = %g * x + %g", valueOf, valueOf);
        }
    }

    public static final class VerticalLinearTransformation extends LinearTransformation {
        public String toString() {
            return String.format("x = %g", Double.valueOf(0.0d));
        }
    }
}
