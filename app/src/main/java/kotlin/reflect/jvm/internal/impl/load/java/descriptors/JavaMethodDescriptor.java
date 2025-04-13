package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import java.util.List;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class JavaMethodDescriptor extends SimpleFunctionDescriptorImpl implements JavaCallableMemberDescriptor {

    /* renamed from: E */
    public static final CallableDescriptor.UserDataKey<ValueParameterDescriptor> f64427E = new CallableDescriptor.UserDataKey<ValueParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.1
    };

    /* renamed from: D */
    public ParameterNamesStatus f64428D;

    public enum ParameterNamesStatus {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* renamed from: b */
        public final boolean f64434b;

        /* renamed from: c */
        public final boolean f64435c;

        ParameterNamesStatus(boolean z, boolean z2) {
            this.f64434b = z;
            this.f64435c = z2;
        }
    }

    public JavaMethodDescriptor(@NotNull DeclarationDescriptor declarationDescriptor, @Nullable SimpleFunctionDescriptor simpleFunctionDescriptor, @NotNull Annotations annotations, @NotNull Name name, @NotNull CallableMemberDescriptor.Kind kind, @NotNull SourceElement sourceElement) {
        super(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        this.f64428D = null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    /* renamed from: B */
    public boolean mo32486B() {
        return this.f64428D.f64435c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    /* renamed from: O */
    public FunctionDescriptorImpl mo32459O(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement) {
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            name = this.f64102b;
        }
        JavaMethodDescriptor javaMethodDescriptor = new JavaMethodDescriptor(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, sourceElement);
        ParameterNamesStatus parameterNamesStatus = this.f64428D;
        javaMethodDescriptor.m32712P0(parameterNamesStatus.f64434b, parameterNamesStatus.f64435c);
        return javaMethodDescriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (r2.f66424b.m33872d(r3) == false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[LOOP:0: B:2:0x000d->B:27:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl
    @org.jetbrains.annotations.NotNull
    /* renamed from: O0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl mo32650O0(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor r2, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor> r4, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.KotlinType r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.Modality r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Visibility r7, @org.jetbrains.annotations.Nullable java.util.Map<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey<?>, ?> r8) {
        /*
            r0 = this;
            super.mo32650O0(r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.reflect.jvm.internal.impl.util.OperatorChecks r1 = kotlin.reflect.jvm.internal.impl.util.OperatorChecks.f66438b
            java.util.List r1 = r1.m33764a()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.util.Checks r2 = (kotlin.reflect.jvm.internal.impl.util.Checks) r2
            java.util.Objects.requireNonNull(r2)
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r2.f66423a
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L30
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r0.getName()
            kotlin.reflect.jvm.internal.impl.name.Name r6 = r2.f66423a
            boolean r3 = kotlin.jvm.internal.Intrinsics.m32174c(r3, r6)
            r3 = r3 ^ r4
            if (r3 == 0) goto L30
            goto L56
        L30:
            kotlin.text.Regex r3 = r2.f66424b
            if (r3 == 0) goto L48
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r0.getName()
            java.lang.String r3 = r3.f65606b
            java.lang.String r6 = "functionDescriptor.name.asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r6)
            kotlin.text.Regex r6 = r2.f66424b
            boolean r3 = r6.m33872d(r3)
            if (r3 != 0) goto L48
            goto L56
        L48:
            java.util.Collection<kotlin.reflect.jvm.internal.impl.name.Name> r3 = r2.f66425c
            if (r3 == 0) goto L57
            kotlin.reflect.jvm.internal.impl.name.Name r6 = r0.getName()
            boolean r3 = r3.contains(r6)
            if (r3 != 0) goto L57
        L56:
            r4 = 0
        L57:
            if (r4 != 0) goto L5a
            goto Ld
        L5a:
            kotlin.reflect.jvm.internal.impl.util.Check[] r1 = r2.f66427e
            int r3 = r1.length
        L5d:
            if (r5 >= r3) goto L70
            r4 = r1[r5]
            java.lang.String r4 = r4.mo33760a(r0)
            if (r4 == 0) goto L6d
            kotlin.reflect.jvm.internal.impl.util.CheckResult$IllegalSignature r1 = new kotlin.reflect.jvm.internal.impl.util.CheckResult$IllegalSignature
            r1.<init>(r4)
            goto L86
        L6d:
            int r5 = r5 + 1
            goto L5d
        L70:
            kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, java.lang.String> r1 = r2.f66426d
            java.lang.Object r1 = r1.invoke(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L81
            kotlin.reflect.jvm.internal.impl.util.CheckResult$IllegalSignature r2 = new kotlin.reflect.jvm.internal.impl.util.CheckResult$IllegalSignature
            r2.<init>(r1)
            r1 = r2
            goto L86
        L81:
            kotlin.reflect.jvm.internal.impl.util.CheckResult$SuccessCheck r1 = kotlin.reflect.jvm.internal.impl.util.CheckResult.SuccessCheck.f66422b
            goto L86
        L84:
            kotlin.reflect.jvm.internal.impl.util.CheckResult$IllegalFunctionName r1 = kotlin.reflect.jvm.internal.impl.util.CheckResult.IllegalFunctionName.f66421b
        L86:
            boolean r1 = r1.f66420a
            r0.f64128l = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor.mo32650O0(kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor, java.util.List, java.util.List, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.descriptors.Modality, kotlin.reflect.jvm.internal.impl.descriptors.Visibility, java.util.Map):kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl");
    }

    /* renamed from: P0 */
    public void m32712P0(boolean z, boolean z2) {
        this.f64428D = z ? z2 ? ParameterNamesStatus.STABLE_SYNTHESIZED : ParameterNamesStatus.STABLE_DECLARED : z2 ? ParameterNamesStatus.NON_STABLE_SYNTHESIZED : ParameterNamesStatus.NON_STABLE_DECLARED;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor
    /* renamed from: w */
    public JavaCallableMemberDescriptor mo32710w(KotlinType kotlinType, List list, KotlinType kotlinType2, Pair pair) {
        List<ValueParameterDescriptor> m32714a = UtilKt.m32714a(list, this.f64122f, this);
        ReceiverParameterDescriptor m33460e = kotlinType == null ? null : DescriptorFactory.m33460e(this, kotlinType, Annotations.Companion.f64024a);
        FunctionDescriptorImpl.CopyConfiguration copyConfiguration = (FunctionDescriptorImpl.CopyConfiguration) mo32524s();
        copyConfiguration.f64151g = m32714a;
        copyConfiguration.f64154j = kotlinType2;
        copyConfiguration.f64152h = m33460e;
        copyConfiguration.f64159o = true;
        copyConfiguration.f64158n = true;
        JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) copyConfiguration.mo32527A();
        if (pair != null) {
            javaMethodDescriptor.m32625H0((CallableDescriptor.UserDataKey) pair.f63055b, pair.f63056c);
        }
        return javaMethodDescriptor;
    }
}
