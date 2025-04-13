package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class ValueParameterCountCheck implements Check {

    /* renamed from: a */
    @NotNull
    public final String f66470a;

    /* compiled from: modifierChecks.kt */
    public static final class AtLeast extends ValueParameterCountCheck {

        /* renamed from: b */
        public final int f66471b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public AtLeast(int r3) {
            /*
                r2 = this;
                java.lang.String r0 = "must have at least "
                java.lang.String r1 = " value parameter"
                java.lang.StringBuilder r0 = p000a.C0000a.m25v(r0, r3, r1)
                r1 = 1
                if (r3 <= r1) goto Le
                java.lang.String r1 = "s"
                goto L10
            Le:
                java.lang.String r1 = ""
            L10:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f66471b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.util.ValueParameterCountCheck.AtLeast.<init>(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* renamed from: b */
        public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
            return functionDescriptor.mo32489f().size() >= this.f66471b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class Equals extends ValueParameterCountCheck {

        /* renamed from: b */
        public final int f66472b;

        public Equals(int i2) {
            super(C0000a.m8e("must have exactly ", i2, " value parameters"), null);
            this.f66472b = i2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* renamed from: b */
        public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
            return functionDescriptor.mo32489f().size() == this.f66472b;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class NoValueParameters extends ValueParameterCountCheck {

        /* renamed from: b */
        public static final NoValueParameters f66473b = new NoValueParameters();

        public NoValueParameters() {
            super("must have no value parameters", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* renamed from: b */
        public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
            return functionDescriptor.mo32489f().isEmpty();
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class SingleValueParameter extends ValueParameterCountCheck {

        /* renamed from: b */
        public static final SingleValueParameter f66474b = new SingleValueParameter();

        public SingleValueParameter() {
            super("must have a single value parameter", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* renamed from: b */
        public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
            return functionDescriptor.mo32489f().size() == 1;
        }
    }

    public ValueParameterCountCheck(@NotNull String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66470a = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* renamed from: a */
    public String mo33760a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m33762a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f66470a;
    }
}
