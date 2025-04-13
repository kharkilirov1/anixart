package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes3.dex */
public final class MethodSignatureMappingKt {
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor) == false) goto L38;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m32928a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r3, boolean r4, boolean r5, int r6) {
        /*
            r0 = r6 & 1
            r1 = 1
            if (r0 == 0) goto L6
            r4 = 1
        L6:
            r6 = r6 & 2
            if (r6 == 0) goto Lb
            r5 = 1
        Lb:
            java.lang.String r6 = "receiver$0"
            kotlin.jvm.internal.Intrinsics.m32180i(r3, r6)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r5 == 0) goto L2c
            boolean r5 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            if (r5 == 0) goto L1e
            java.lang.String r5 = "<init>"
            goto L29
        L1e:
            kotlin.reflect.jvm.internal.impl.name.Name r5 = r3.getName()
            java.lang.String r5 = r5.f65606b
            java.lang.String r0 = "name.asString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r5, r0)
        L29:
            r6.append(r5)
        L2c:
            java.lang.String r5 = "("
            r6.append(r5)
            java.util.List r5 = r3.mo32489f()
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r0
            java.lang.String r2 = "parameter"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r0 = r0.getType()
            java.lang.String r2 = "parameter.type"
            kotlin.jvm.internal.Intrinsics.m32175d(r0, r2)
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r0 = m32930c(r0)
            r6.append(r0)
            goto L39
        L5b:
            java.lang.String r5 = ")"
            r6.append(r5)
            if (r4 == 0) goto La8
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor
            r5 = 0
            if (r4 == 0) goto L68
            goto L8a
        L68:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r3.getReturnType()
            if (r4 == 0) goto La4
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.m32387O(r4)
            if (r4 == 0) goto L89
            kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r3.getReturnType()
            if (r4 == 0) goto L85
            boolean r4 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.m33694d(r4)
            if (r4 != 0) goto L89
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor
            if (r4 != 0) goto L89
            goto L8a
        L85:
            kotlin.jvm.internal.Intrinsics.m32188q()
            throw r5
        L89:
            r1 = 0
        L8a:
            if (r1 == 0) goto L92
            java.lang.String r3 = "V"
            r6.append(r3)
            goto La8
        L92:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = r3.getReturnType()
            if (r3 == 0) goto La0
            kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r3 = m32930c(r3)
            r6.append(r3)
            goto La8
        La0:
            kotlin.jvm.internal.Intrinsics.m32188q()
            throw r5
        La4:
            kotlin.jvm.internal.Intrinsics.m32188q()
            throw r5
        La8:
            java.lang.String r3 = r6.toString()
            java.lang.String r4 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.m32175d(r3, r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.m32928a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, boolean, boolean, int):java.lang.String");
    }

    @Nullable
    /* renamed from: b */
    public static final String m32929b(@NotNull CallableDescriptor receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f64806a;
        if (DescriptorUtils.m33480p(receiver$0)) {
            return null;
        }
        DeclarationDescriptor mo32437b = receiver$0.mo32437b();
        if (!(mo32437b instanceof ClassDescriptor)) {
            mo32437b = null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) mo32437b;
        if (classDescriptor != null) {
            Name name = classDescriptor.getName();
            Intrinsics.m32175d(name, "classDescriptor.name");
            if (name.f65607c) {
                return null;
            }
            CallableDescriptor mo32487a = receiver$0.mo32487a();
            if (!(mo32487a instanceof SimpleFunctionDescriptor)) {
                mo32487a = null;
            }
            SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) mo32487a;
            if (simpleFunctionDescriptor != null) {
                return signatureBuildingComponents.m32942k(classDescriptor, m32928a(simpleFunctionDescriptor, false, false, 3));
            }
        }
        return null;
    }

    @NotNull
    /* renamed from: c */
    public static final JvmType m32930c(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        return (JvmType) TypeSignatureMappingKt.m32953f(receiver$0, JvmTypeFactoryImpl.f64799a, TypeMappingMode.f64809j, TypeMappingConfigurationImpl.f64808a, null, FunctionsKt.f66484c, false);
    }
}
