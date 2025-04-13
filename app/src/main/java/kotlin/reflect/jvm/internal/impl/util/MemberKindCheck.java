package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class MemberKindCheck implements Check {

    /* renamed from: a */
    @NotNull
    public final String f66432a;

    /* compiled from: modifierChecks.kt */
    public static final class Member extends MemberKindCheck {

        /* renamed from: b */
        public static final Member f66433b = new Member();

        public Member() {
            super("must be a member function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* renamed from: b */
        public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
            return functionDescriptor.mo32490f0() != null;
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class MemberOrExtension extends MemberKindCheck {

        /* renamed from: b */
        public static final MemberOrExtension f66434b = new MemberOrExtension();

        public MemberOrExtension() {
            super("must be a member or an extension function", null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.Check
        /* renamed from: b */
        public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
            return (functionDescriptor.mo32490f0() == null && functionDescriptor.mo32492k0() == null) ? false : true;
        }
    }

    public MemberKindCheck(@NotNull String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66432a = str;
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
        return this.f66432a;
    }
}
