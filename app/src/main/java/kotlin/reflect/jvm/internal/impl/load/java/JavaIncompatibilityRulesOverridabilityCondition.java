package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;

/* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* loaded from: classes3.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    /* renamed from: a */
    public static final Companion f64343a = new Companion(null);

    /* compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final boolean m32679a(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor) {
            Intrinsics.m32180i(superDescriptor, "superDescriptor");
            Intrinsics.m32180i(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.f64122f.size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
                functionDescriptor.mo32489f().size();
                SimpleFunctionDescriptor mo32487a = javaMethodDescriptor.mo32487a();
                Intrinsics.m32175d(mo32487a, "subDescriptor.original");
                List<ValueParameterDescriptor> mo32489f = mo32487a.mo32489f();
                Intrinsics.m32175d(mo32489f, "subDescriptor.original.valueParameters");
                FunctionDescriptor mo32487a2 = functionDescriptor.mo32487a();
                Intrinsics.m32175d(mo32487a2, "superDescriptor.original");
                List<ValueParameterDescriptor> mo32489f2 = mo32487a2.mo32489f();
                Intrinsics.m32175d(mo32489f2, "superDescriptor.original.valueParameters");
                Iterator it = ((ArrayList) CollectionsKt.m32039p0(mo32489f, mo32489f2)).iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ValueParameterDescriptor subParameter = (ValueParameterDescriptor) pair.f63055b;
                    ValueParameterDescriptor superParameter = (ValueParameterDescriptor) pair.f63056c;
                    Intrinsics.m32175d(subParameter, "subParameter");
                    boolean z = m32680b((FunctionDescriptor) subDescriptor, subParameter) instanceof JvmType.Primitive;
                    Intrinsics.m32175d(superParameter, "superParameter");
                    if (z != (m32680b(functionDescriptor, superParameter) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType m32680b(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r8) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.m32680b(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor):kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType");
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    /* renamed from: a */
    public ExternalOverridabilityCondition.Contract mo32672a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0043, code lost:
    
        if (((java.util.ArrayList) kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.f64307d).contains(r1) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ad, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.m32174c(r1, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.m32928a(r4, false, false, 2)) != false) goto L46;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result mo32673b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r11) {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r0 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            java.lang.String r1 = "superDescriptor"
            kotlin.jvm.internal.Intrinsics.m32180i(r9, r1)
            java.lang.String r1 = "subDescriptor"
            kotlin.jvm.internal.Intrinsics.m32180i(r10, r1)
            boolean r1 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Laf
            boolean r1 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r1 == 0) goto Laf
            boolean r1 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.m32376D(r10)
            if (r1 == 0) goto L1e
            goto Laf
        L1e:
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r1 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64317g
            r4 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r4
            kotlin.reflect.jvm.internal.impl.name.Name r5 = r4.getName()
            java.lang.String r6 = "subDescriptor.name"
            kotlin.jvm.internal.Intrinsics.m32175d(r5, r6)
            boolean r1 = r1.m32671b(r5)
            if (r1 != 0) goto L47
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName r1 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.f64309f
            kotlin.reflect.jvm.internal.impl.name.Name r1 = r4.getName()
            kotlin.jvm.internal.Intrinsics.m32175d(r1, r6)
            java.util.List<kotlin.reflect.jvm.internal.impl.name.Name> r5 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName.f64307d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L47
            goto Laf
        L47:
            r1 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r1 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m32693f(r1)
            boolean r5 = r4.mo32525s0()
            boolean r6 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r6 != 0) goto L58
            r7 = 0
            goto L59
        L58:
            r7 = r9
        L59:
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r7 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r7
            if (r7 == 0) goto L66
            boolean r7 = r7.mo32525s0()
            if (r5 == r7) goto L64
            goto L66
        L64:
            r5 = 0
            goto L67
        L66:
            r5 = 1
        L67:
            if (r5 == 0) goto L72
            if (r1 == 0) goto Lb0
            boolean r5 = r4.mo32525s0()
            if (r5 != 0) goto L72
            goto Lb0
        L72:
            boolean r5 = r11 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor
            if (r5 == 0) goto Laf
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r5 = r4.mo32523d0()
            if (r5 == 0) goto L7d
            goto Laf
        L7d:
            if (r1 == 0) goto Laf
            boolean r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.m32694g(r11, r1)
            if (r11 == 0) goto L86
            goto Laf
        L86:
            boolean r11 = r1 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r11 == 0) goto Lb0
            if (r6 == 0) goto Lb0
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r11 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.m32670a(r1)
            if (r11 == 0) goto Lb0
            r11 = 2
            java.lang.String r1 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.m32928a(r4, r3, r3, r11)
            r4 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = r4.mo32487a()
            java.lang.String r5 = "superDescriptor.original"
            kotlin.jvm.internal.Intrinsics.m32175d(r4, r5)
            java.lang.String r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.m32928a(r4, r3, r3, r11)
            boolean r11 = kotlin.jvm.internal.Intrinsics.m32174c(r1, r11)
            if (r11 == 0) goto Lb0
        Laf:
            r2 = 0
        Lb0:
            if (r2 == 0) goto Lb3
            return r0
        Lb3:
            kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition$Companion r11 = kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.f64343a
            boolean r9 = r11.m32679a(r9, r10)
            if (r9 == 0) goto Lbc
            return r0
        Lbc:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r9 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.mo32673b(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }
}
