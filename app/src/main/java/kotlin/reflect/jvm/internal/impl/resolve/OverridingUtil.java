package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeCheckerImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class OverridingUtil {

    /* renamed from: b */
    public static final List<ExternalOverridabilityCondition> f65892b = CollectionsKt.m32027j0(ServiceLoader.load(ExternalOverridabilityCondition.class, ExternalOverridabilityCondition.class.getClassLoader()));

    /* renamed from: c */
    public static final OverridingUtil f65893c = new OverridingUtil(new KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.1
        @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
        /* renamed from: a */
        public boolean mo33455a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
            return typeConstructor.equals(typeConstructor2);
        }
    });

    /* renamed from: a */
    public final KotlinTypeChecker.TypeConstructorEquality f65894a;

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$9 */
    public static /* synthetic */ class C67239 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f65901a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f65902b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f65903c;

        static {
            int[] iArr = new int[Modality.values().length];
            f65903c = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f65903c[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f65903c[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f65903c[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[OverrideCompatibilityInfo.Result.values().length];
            f65902b = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f65902b[2] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f65902b[1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[ExternalOverridabilityCondition.Result.values().length];
            f65901a = iArr3;
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f65901a[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f65901a[2] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f65901a[3] = 4;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static class OverrideCompatibilityInfo {

        /* renamed from: b */
        public static final OverrideCompatibilityInfo f65904b = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        public final Result f65905a;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(@NotNull Result result, @NotNull String str) {
            this.f65905a = result;
        }

        @NotNull
        /* renamed from: a */
        public static OverrideCompatibilityInfo m33509a(@NotNull String str) {
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        @NotNull
        /* renamed from: b */
        public static OverrideCompatibilityInfo m33510b(@NotNull String str) {
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }
    }

    public OverridingUtil(KotlinTypeChecker.TypeConstructorEquality typeConstructorEquality) {
        this.f65894a = typeConstructorEquality;
    }

    /* renamed from: a */
    public static boolean m33491a(@NotNull KotlinType kotlinType, @NotNull KotlinType kotlinType2, @NotNull KotlinTypeChecker kotlinTypeChecker) {
        return (KotlinTypeKt.m33667a(kotlinType) && KotlinTypeKt.m33667a(kotlinType2)) || kotlinTypeChecker.mo33701a(kotlinType, kotlinType2);
    }

    /* renamed from: b */
    public static void m33492b(@NotNull CallableMemberDescriptor callableMemberDescriptor, @NotNull Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor.mo32493g().m32496a()) {
            set.add(callableMemberDescriptor);
            return;
        }
        if (callableMemberDescriptor.mo32488e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
        Iterator<? extends CallableMemberDescriptor> it = callableMemberDescriptor.mo32488e().iterator();
        while (it.hasNext()) {
            m33492b(it.next(), set);
        }
    }

    /* renamed from: c */
    public static List<KotlinType> m33493c(CallableDescriptor callableDescriptor) {
        ReceiverParameterDescriptor mo32492k0 = callableDescriptor.mo32492k0();
        ArrayList arrayList = new ArrayList();
        if (mo32492k0 != null) {
            arrayList.add(mo32492k0.getType());
        }
        Iterator<ValueParameterDescriptor> it = callableDescriptor.mo32489f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005d, code lost:
    
        r8 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0124, code lost:
    
        if (r4 == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0126, code lost:
    
        r2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63991h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012b, code lost:
    
        r2 = ((kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) m33504r(r1, new kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C67195())).mo32495u(r15, r8, r2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        r16.mo32698d(r2, r1);
        r16.mo32620a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0146, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0129, code lost:
    
        r2 = kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.f63990g;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m33494d(@org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r14, @org.jetbrains.annotations.NotNull final kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy r16) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m33494d(java.util.Collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy):void");
    }

    @NotNull
    /* renamed from: f */
    public static <H> Collection<H> m33495f(@NotNull H h, @NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1, @NotNull Function1<H, Unit> function12) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        CallableDescriptor invoke = function1.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            CallableDescriptor invoke2 = function1.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result m33498i = m33498i(invoke, invoke2);
                if (m33498i == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (m33498i == OverrideCompatibilityInfo.Result.CONFLICT) {
                    function12.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m33496g(@org.jetbrains.annotations.NotNull java.util.Collection r11, @org.jetbrains.annotations.NotNull java.util.Collection r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r13, @org.jetbrains.annotations.NotNull final kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy r14) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m33496g(java.util.Collection, java.util.Collection, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.resolve.OverridingStrategy):void");
    }

    @Nullable
    /* renamed from: h */
    public static OverrideCompatibilityInfo m33497h(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        boolean z;
        boolean z2 = callableDescriptor instanceof FunctionDescriptor;
        if ((z2 && !(callableDescriptor2 instanceof FunctionDescriptor)) || (((z = callableDescriptor instanceof PropertyDescriptor)) && !(callableDescriptor2 instanceof PropertyDescriptor))) {
            return OverrideCompatibilityInfo.m33510b("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + callableDescriptor);
        }
        if (!callableDescriptor.getName().equals(callableDescriptor2.getName())) {
            return OverrideCompatibilityInfo.m33510b("Name mismatch");
        }
        OverrideCompatibilityInfo m33510b = (callableDescriptor.mo32492k0() == null) != (callableDescriptor2.mo32492k0() == null) ? OverrideCompatibilityInfo.m33510b("Receiver presence mismatch") : callableDescriptor.mo32489f().size() != callableDescriptor2.mo32489f().size() ? OverrideCompatibilityInfo.m33510b("Value parameter number mismatch") : null;
        if (m33510b != null) {
            return m33510b;
        }
        return null;
    }

    @Nullable
    /* renamed from: i */
    public static OverrideCompatibilityInfo.Result m33498i(CallableDescriptor callableDescriptor, CallableDescriptor callableDescriptor2) {
        OverridingUtil overridingUtil = f65893c;
        OverrideCompatibilityInfo.Result result = overridingUtil.m33507l(callableDescriptor2, callableDescriptor, null, false).f65905a;
        OverrideCompatibilityInfo.Result result2 = overridingUtil.m33507l(callableDescriptor, callableDescriptor2, null, false).f65905a;
        OverrideCompatibilityInfo.Result result3 = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (result == result3 && result2 == result3) {
            return result3;
        }
        OverrideCompatibilityInfo.Result result4 = OverrideCompatibilityInfo.Result.CONFLICT;
        return (result == result4 || result2 == result4) ? result4 : OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    /* renamed from: j */
    public static boolean m33499j(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2) {
        KotlinType returnType = callableDescriptor.getReturnType();
        KotlinType returnType2 = callableDescriptor2.getReturnType();
        if (!m33501o(callableDescriptor, callableDescriptor2)) {
            return false;
        }
        if (callableDescriptor instanceof FunctionDescriptor) {
            return m33500n(callableDescriptor, returnType, callableDescriptor2, returnType2);
        }
        if (!(callableDescriptor instanceof PropertyDescriptor)) {
            StringBuilder m24u = C0000a.m24u("Unexpected callable: ");
            m24u.append(callableDescriptor.getClass());
            throw new IllegalArgumentException(m24u.toString());
        }
        PropertyDescriptor propertyDescriptor = (PropertyDescriptor) callableDescriptor;
        PropertyDescriptor propertyDescriptor2 = (PropertyDescriptor) callableDescriptor2;
        PropertySetterDescriptor setter = propertyDescriptor.getSetter();
        PropertySetterDescriptor setter2 = propertyDescriptor2.getSetter();
        if ((setter == null || setter2 == null) ? true : m33501o(setter, setter2)) {
            return (propertyDescriptor.mo32575i0() && propertyDescriptor2.mo32575i0()) ? ((KotlinTypeCheckerImpl) f65893c.m33505e(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters())).mo33701a(returnType, returnType2) : (propertyDescriptor.mo32575i0() || !propertyDescriptor2.mo32575i0()) && m33500n(callableDescriptor, returnType, callableDescriptor2, returnType2);
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m33500n(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @NotNull CallableDescriptor callableDescriptor2, @NotNull KotlinType kotlinType2) {
        return ((KotlinTypeCheckerImpl) f65893c.m33505e(callableDescriptor.getTypeParameters(), callableDescriptor2.getTypeParameters())).f66370b.m33740i(kotlinType, kotlinType2);
    }

    /* renamed from: o */
    public static boolean m33501o(@NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2) {
        Integer m32578a = Visibilities.m32578a(declarationDescriptorWithVisibility.getVisibility(), declarationDescriptorWithVisibility2.getVisibility());
        return m32578a == null || m32578a.intValue() >= 0;
    }

    /* renamed from: p */
    public static <D extends CallableDescriptor> boolean m33502p(@NotNull D d, @NotNull D d2) {
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.f65869a.m33452a(d.mo32487a(), d2.mo32487a())) {
            return true;
        }
        CallableDescriptor mo32487a = d2.mo32487a();
        Name name = DescriptorUtils.f65875a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        DescriptorUtils.m33465a(d.mo32487a(), linkedHashSet);
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            if (DescriptorEquivalenceForOverrides.f65869a.m33452a(mo32487a, (CallableDescriptor) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m33503q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r6, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.Unit> r7) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m33503q(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* renamed from: r */
    public static <H> H m33504r(@NotNull Collection<H> collection, @NotNull Function1<H, CallableDescriptor> function1) {
        boolean z;
        if (collection.size() == 1) {
            return (H) CollectionsKt.m32043t(collection);
        }
        ArrayList arrayList = new ArrayList(2);
        List m31997J = CollectionsKt.m31997J(collection, function1);
        H h = (H) CollectionsKt.m32043t(collection);
        CallableDescriptor callableDescriptor = (CallableDescriptor) function1.invoke(h);
        for (H h2 : collection) {
            CallableDescriptor callableDescriptor2 = (CallableDescriptor) function1.invoke(h2);
            Iterator it = ((ArrayList) m31997J).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                }
                if (!m33499j(callableDescriptor2, (CallableDescriptor) it.next())) {
                    z = false;
                    break;
                }
            }
            if (z) {
                arrayList.add(h2);
            }
            if (m33499j(callableDescriptor2, callableDescriptor) && !m33499j(callableDescriptor, callableDescriptor2)) {
                h = h2;
            }
        }
        if (arrayList.isEmpty()) {
            return h;
        }
        if (arrayList.size() == 1) {
            return (H) CollectionsKt.m32043t(arrayList);
        }
        H h3 = null;
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!FlexibleTypesKt.m33658b(((CallableDescriptor) function1.invoke(next)).getReturnType())) {
                h3 = next;
                break;
            }
        }
        return h3 != null ? h3 : (H) CollectionsKt.m32043t(arrayList);
    }

    @NotNull
    /* renamed from: e */
    public final KotlinTypeChecker m33505e(@NotNull List<TypeParameterDescriptor> list, @NotNull List<TypeParameterDescriptor> list2) {
        if (list.isEmpty()) {
            return KotlinTypeCheckerImpl.m33702c(this.f65894a);
        }
        final HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < list.size(); i2++) {
            hashMap.put(list.get(i2).mo32440j(), list2.get(i2).mo32440j());
        }
        return KotlinTypeCheckerImpl.m33702c(new KotlinTypeChecker.TypeConstructorEquality() { // from class: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.3
            @Override // kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.TypeConstructorEquality
            /* renamed from: a */
            public boolean mo33455a(@NotNull TypeConstructor typeConstructor, @NotNull TypeConstructor typeConstructor2) {
                if (OverridingUtil.this.f65894a.mo33455a(typeConstructor, typeConstructor2)) {
                    return true;
                }
                TypeConstructor typeConstructor3 = (TypeConstructor) hashMap.get(typeConstructor);
                TypeConstructor typeConstructor4 = (TypeConstructor) hashMap.get(typeConstructor2);
                if (typeConstructor3 == null || !typeConstructor3.equals(typeConstructor2)) {
                    return typeConstructor4 != null && typeConstructor4.equals(typeConstructor);
                }
                return true;
            }
        });
    }

    @NotNull
    /* renamed from: k */
    public OverrideCompatibilityInfo m33506k(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor) {
        return m33507l(callableDescriptor, callableDescriptor2, classDescriptor, false);
    }

    @NotNull
    /* renamed from: l */
    public OverrideCompatibilityInfo m33507l(@NotNull CallableDescriptor callableDescriptor, @NotNull CallableDescriptor callableDescriptor2, @Nullable ClassDescriptor classDescriptor, boolean z) {
        ExternalOverridabilityCondition.Contract contract = ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
        OverrideCompatibilityInfo m33508m = m33508m(callableDescriptor, callableDescriptor2, z);
        boolean z2 = m33508m.f65905a == OverrideCompatibilityInfo.Result.OVERRIDABLE;
        for (ExternalOverridabilityCondition externalOverridabilityCondition : f65892b) {
            if (externalOverridabilityCondition.mo32672a() != contract && (!z2 || externalOverridabilityCondition.mo32672a() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int ordinal = externalOverridabilityCondition.mo32673b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal();
                if (ordinal == 0) {
                    z2 = true;
                } else {
                    if (ordinal == 1) {
                        return OverrideCompatibilityInfo.m33509a("External condition failed");
                    }
                    if (ordinal == 2) {
                        return OverrideCompatibilityInfo.m33510b("External condition");
                    }
                }
            }
        }
        if (!z2) {
            return m33508m;
        }
        for (ExternalOverridabilityCondition externalOverridabilityCondition2 : f65892b) {
            if (externalOverridabilityCondition2.mo32672a() == contract) {
                int ordinal2 = externalOverridabilityCondition2.mo32673b(callableDescriptor, callableDescriptor2, classDescriptor).ordinal();
                if (ordinal2 == 0) {
                    StringBuilder m24u = C0000a.m24u("Contract violation in ");
                    m24u.append(externalOverridabilityCondition2.getClass().getName());
                    m24u.append(" condition. It's not supposed to end with success");
                    throw new IllegalStateException(m24u.toString());
                }
                if (ordinal2 == 1) {
                    return OverrideCompatibilityInfo.m33509a("External condition failed");
                }
                if (ordinal2 == 2) {
                    return OverrideCompatibilityInfo.m33510b("External condition");
                }
            }
        }
        return OverrideCompatibilityInfo.f65904b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        r14.remove();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd A[LOOP:1: B:19:0x005e->B:25:0x00bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[SYNTHETIC] */
    @org.jetbrains.annotations.NotNull
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo m33508m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m33508m(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, boolean):kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo");
    }
}
