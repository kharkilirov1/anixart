package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class CheckResult {

    /* renamed from: a */
    public final boolean f66420a;

    /* compiled from: modifierChecks.kt */
    public static final class IllegalFunctionName extends CheckResult {

        /* renamed from: b */
        public static final IllegalFunctionName f66421b = new IllegalFunctionName();

        public IllegalFunctionName() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class IllegalSignature extends CheckResult {
        public IllegalSignature(@NotNull String str) {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class SuccessCheck extends CheckResult {

        /* renamed from: b */
        public static final SuccessCheck f66422b = new SuccessCheck();

        public SuccessCheck() {
            super(true, null);
        }
    }

    public CheckResult(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66420a = z;
    }
}
