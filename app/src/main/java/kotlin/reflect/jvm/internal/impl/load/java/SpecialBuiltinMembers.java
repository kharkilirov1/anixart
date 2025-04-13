package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: specialBuiltinMembers.kt */
@JvmName
/* loaded from: classes3.dex */
public final class SpecialBuiltinMembers {
    @NotNull
    /* renamed from: a */
    public static final FqName m32688a(@NotNull FqName fqName, @NotNull String str) {
        return new FqName(fqName.f65597a.m33201a(Name.m33211d(str)), fqName);
    }

    @NotNull
    /* renamed from: b */
    public static final FqName m32689b(@NotNull FqNameUnsafe fqNameUnsafe, @NotNull String str) {
        FqName m33207g = fqNameUnsafe.m33201a(Name.m33211d(str)).m33207g();
        Intrinsics.m32175d(m33207g, "child(Name.identifier(name)).toSafe()");
        return m33207g;
    }

    @NotNull
    /* renamed from: c */
    public static final NameAndSignature m32690c(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        return new NameAndSignature(Name.m33211d(str2), SignatureBuildingComponents.f64806a.m32941j(str, str2 + '(' + str3 + ')' + str4));
    }

    @Nullable
    /* renamed from: d */
    public static final String m32691d(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.m32180i(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor m32692e = KotlinBuiltIns.m32376D(callableMemberDescriptor) ? m32692e(callableMemberDescriptor) : null;
        if (m32692e == null) {
            return null;
        }
        CallableMemberDescriptor m33538k = DescriptorUtilsKt.m33538k(m32692e);
        if (m33538k instanceof PropertyDescriptor) {
            return BuiltinSpecialProperties.f64334e.m32674a(m33538k);
        }
        if (!(m33538k instanceof SimpleFunctionDescriptor)) {
            return null;
        }
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.f64309f;
        Map<String, Name> map = BuiltinMethodsWithDifferentJvmName.f64306c;
        String m32929b = MethodSignatureMappingKt.m32929b((SimpleFunctionDescriptor) m33538k);
        Name name = m32929b != null ? (Name) ((LinkedHashMap) map).get(m32929b) : null;
        if (name != null) {
            return name.f65606b;
        }
        return null;
    }

    @Nullable
    /* renamed from: e */
    public static final <T extends CallableMemberDescriptor> T m32692e(@NotNull T receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName = BuiltinMethodsWithDifferentJvmName.f64309f;
        if (!((ArrayList) BuiltinMethodsWithDifferentJvmName.f64307d).contains(receiver$0.getName())) {
            BuiltinSpecialProperties builtinSpecialProperties = BuiltinSpecialProperties.f64334e;
            if (!BuiltinSpecialProperties.f64333d.contains(DescriptorUtilsKt.m33538k(receiver$0).getName())) {
                return null;
            }
        }
        if ((receiver$0 instanceof PropertyDescriptor) || (receiver$0 instanceof PropertyAccessorDescriptor)) {
            return (T) DescriptorUtilsKt.m33531d(receiver$0, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                    CallableMemberDescriptor it = callableMemberDescriptor;
                    Intrinsics.m32180i(it, "it");
                    return Boolean.valueOf(BuiltinSpecialProperties.f64334e.m32675b(DescriptorUtilsKt.m33538k(it)));
                }
            }, 1);
        }
        if (receiver$0 instanceof SimpleFunctionDescriptor) {
            return (T) DescriptorUtilsKt.m33531d(receiver$0, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2
                @Override // kotlin.jvm.functions.Function1
                public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
                    CallableMemberDescriptor it = callableMemberDescriptor;
                    Intrinsics.m32180i(it, "it");
                    BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName2 = BuiltinMethodsWithDifferentJvmName.f64309f;
                    final SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) it;
                    return Boolean.valueOf(KotlinBuiltIns.m32376D(simpleFunctionDescriptor) && DescriptorUtilsKt.m33531d(simpleFunctionDescriptor, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor2) {
                            CallableMemberDescriptor it2 = callableMemberDescriptor2;
                            Intrinsics.m32180i(it2, "it");
                            BuiltinMethodsWithDifferentJvmName builtinMethodsWithDifferentJvmName3 = BuiltinMethodsWithDifferentJvmName.f64309f;
                            Map<String, Name> map = BuiltinMethodsWithDifferentJvmName.f64306c;
                            String m32929b = MethodSignatureMappingKt.m32929b(SimpleFunctionDescriptor.this);
                            if (map != null) {
                                return Boolean.valueOf(map.containsKey(m32929b));
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                        }
                    }, 1) != null);
                }
            }, 1);
        }
        return null;
    }

    @Nullable
    /* renamed from: f */
    public static final <T extends CallableMemberDescriptor> T m32693f(@NotNull T receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        T t = (T) m32692e(receiver$0);
        if (t != null) {
            return t;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f64317g;
        Name name = receiver$0.getName();
        Intrinsics.m32175d(name, "name");
        if (builtinMethodsWithSpecialGenericSignature.m32671b(name)) {
            return (T) DescriptorUtilsKt.m33531d(receiver$0, false, new Function1<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2
                /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
                
                    if (r3 != null) goto L26;
                 */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5) {
                    /*
                        r4 = this;
                        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r5
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.Intrinsics.m32180i(r5, r0)
                        boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.m32376D(r5)
                        r1 = 1
                        r2 = 0
                        if (r0 == 0) goto L58
                        java.util.List<kotlin.reflect.jvm.internal.impl.load.java.NameAndSignature> r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64311a
                        java.util.Set<kotlin.reflect.jvm.internal.impl.name.Name> r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64315e
                        kotlin.reflect.jvm.internal.impl.name.Name r3 = r5.getName()
                        boolean r0 = r0.contains(r3)
                        r3 = 0
                        if (r0 != 0) goto L1f
                        goto L55
                    L1f:
                        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 r0 = new kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, java.lang.Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
                            static {
                                /*
                                    kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1 r0 = new kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
                                    r0.<init>()
                                    
                                    // error: 0x0005: SPUT 
  (r0 I:kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1)
 kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1.b kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C6588xdb572182.<clinit>():void");
                            }

                            {
                                /*
                                    r1 = this;
                                    r0 = 1
                                    r1.<init>(r0)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C6588xdb572182.<init>():void");
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2) {
                                /*
                                    r1 = this;
                                    kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r2
                                    java.lang.String r0 = "it"
                                    kotlin.jvm.internal.Intrinsics.m32180i(r2, r0)
                                    boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
                                    if (r0 == 0) goto L1b
                                    kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64317g
                                    java.util.Set<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64316f
                                    java.lang.String r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.m32929b(r2)
                                    boolean r2 = kotlin.collections.CollectionsKt.m32034n(r0, r2)
                                    if (r2 == 0) goto L1b
                                    r2 = 1
                                    goto L1c
                                L1b:
                                    r2 = 0
                                L1c:
                                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                                    return r2
                                */
                                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.C6588xdb572182.invoke(java.lang.Object):java.lang.Object");
                            }
                        }
                        kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m33531d(r5, r2, r0, r1)
                        if (r5 == 0) goto L55
                        java.lang.String r5 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.m32929b(r5)
                        if (r5 == 0) goto L55
                        java.util.List<java.lang.String> r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64312b
                        java.util.ArrayList r0 = (java.util.ArrayList) r0
                        boolean r0 = r0.contains(r5)
                        if (r0 == 0) goto L3a
                        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$SpecialSignatureInfo r3 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo.ONE_COLLECTION_PARAMETER
                        goto L55
                    L3a:
                        java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$TypeSafeBarrierDescription> r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.f64314d
                        java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
                        java.lang.Object r5 = r0.get(r5)
                        if (r5 == 0) goto L51
                        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$TypeSafeBarrierDescription r5 = (kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription) r5
                        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$TypeSafeBarrierDescription r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.TypeSafeBarrierDescription.f64322c
                        if (r5 != r0) goto L4d
                        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$SpecialSignatureInfo r5 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC
                        goto L4f
                    L4d:
                        kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$SpecialSignatureInfo r5 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC
                    L4f:
                        r3 = r5
                        goto L55
                    L51:
                        kotlin.jvm.internal.Intrinsics.m32188q()
                        throw r3
                    L55:
                        if (r3 == 0) goto L58
                        goto L59
                    L58:
                        r1 = 0
                    L59:
                        java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2.invoke(java.lang.Object):java.lang.Object");
                }
            }, 1);
        }
        return null;
    }

    /* renamed from: g */
    public static final boolean m32694g(@NotNull ClassDescriptor receiver$0, @NotNull CallableDescriptor specialCallableDescriptor) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(specialCallableDescriptor, "specialCallableDescriptor");
        DeclarationDescriptor mo32437b = specialCallableDescriptor.mo32437b();
        if (mo32437b == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        }
        SimpleType mo32502r = ((ClassDescriptor) mo32437b).mo32502r();
        Intrinsics.m32175d(mo32502r, "(specialCallableDescript…ssDescriptor).defaultType");
        ClassDescriptor m33472h = DescriptorUtils.m33472h(receiver$0);
        while (true) {
            if (m33472h == null) {
                return false;
            }
            if (!(m33472h instanceof JavaClassDescriptor)) {
                if (TypeCheckingProcedure.m33732c(m33472h.mo32502r(), mo32502r) != null) {
                    return !KotlinBuiltIns.m32376D(m33472h);
                }
            }
            m33472h = DescriptorUtils.m33472h(m33472h);
        }
    }
}
