package kotlin.reflect.jvm.internal.impl.util;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.util.Check;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: modifierChecks.kt */
/* loaded from: classes3.dex */
public abstract class ReturnsCheck implements Check {

    /* renamed from: a */
    @NotNull
    public final String f66462a;

    /* renamed from: b */
    @NotNull
    public final Function1<KotlinBuiltIns, KotlinType> f66463b;

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsBoolean extends ReturnsCheck {

        /* renamed from: c */
        public static final ReturnsBoolean f66464c = new ReturnsBoolean();

        public ReturnsBoolean() {
            super("Boolean", new Function1<KotlinBuiltIns, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsBoolean.1
                @Override // kotlin.jvm.functions.Function1
                public SimpleType invoke(KotlinBuiltIns kotlinBuiltIns) {
                    KotlinBuiltIns receiver$0 = kotlinBuiltIns;
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    SimpleType booleanType = receiver$0.m32400h();
                    Intrinsics.m32175d(booleanType, "booleanType");
                    return booleanType;
                }
            }, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsInt extends ReturnsCheck {

        /* renamed from: c */
        public static final ReturnsInt f66466c = new ReturnsInt();

        public ReturnsInt() {
            super("Int", new Function1<KotlinBuiltIns, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsInt.1
                @Override // kotlin.jvm.functions.Function1
                public SimpleType invoke(KotlinBuiltIns kotlinBuiltIns) {
                    KotlinBuiltIns receiver$0 = kotlinBuiltIns;
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    SimpleType intType = receiver$0.m32406p();
                    Intrinsics.m32175d(intType, "intType");
                    return intType;
                }
            }, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    public static final class ReturnsUnit extends ReturnsCheck {

        /* renamed from: c */
        public static final ReturnsUnit f66468c = new ReturnsUnit();

        public ReturnsUnit() {
            super("Unit", new Function1<KotlinBuiltIns, SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.util.ReturnsCheck.ReturnsUnit.1
                @Override // kotlin.jvm.functions.Function1
                public SimpleType invoke(KotlinBuiltIns kotlinBuiltIns) {
                    KotlinBuiltIns receiver$0 = kotlinBuiltIns;
                    Intrinsics.m32180i(receiver$0, "receiver$0");
                    SimpleType unitType = receiver$0.m32394A();
                    Intrinsics.m32175d(unitType, "unitType");
                    return unitType;
                }
            }, null);
        }
    }

    public ReturnsCheck(@NotNull String str, @NotNull Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this.f66463b = function1;
        this.f66462a = C0000a.m14k("must return ", str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @Nullable
    /* renamed from: a */
    public String mo33760a(@NotNull FunctionDescriptor functionDescriptor) {
        return Check.DefaultImpls.m33762a(this, functionDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    /* renamed from: b */
    public boolean mo33761b(@NotNull FunctionDescriptor functionDescriptor) {
        return Intrinsics.m32174c(functionDescriptor.getReturnType(), this.f66463b.invoke(DescriptorUtilsKt.m33534g(functionDescriptor)));
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.Check
    @NotNull
    public String getDescription() {
        return this.f66462a;
    }
}
