package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.name.SpecialNames;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmClassName;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: typeSignatureMapping.kt */
/* loaded from: classes3.dex */
public final class TypeSignatureMappingKt {
    @Nullable
    /* renamed from: a */
    public static final KotlinType m32948a(@NotNull KotlinType kotlinType, @NotNull HashSet<ClassifierDescriptor> hashSet) {
        KotlinType kotlinType2;
        KotlinType m32948a;
        ClassConstructorDescriptor mo32434P;
        List<ValueParameterDescriptor> mo32489f;
        ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
        if (mo32449b == null) {
            throw new AssertionError("Type with a declaration expected: " + kotlinType);
        }
        if (!hashSet.add(mo32449b)) {
            return null;
        }
        if (!(mo32449b instanceof TypeParameterDescriptor)) {
            if (!(mo32449b instanceof ClassDescriptor) || !((ClassDescriptor) mo32449b).isInline()) {
                return kotlinType;
            }
            ClassifierDescriptor mo32449b2 = kotlinType.mo33515H0().mo32449b();
            if (!(mo32449b2 instanceof ClassDescriptor)) {
                mo32449b2 = null;
            }
            ClassDescriptor classDescriptor = (ClassDescriptor) mo32449b2;
            ValueParameterDescriptor valueParameterDescriptor = (classDescriptor == null || !classDescriptor.isInline() || (mo32434P = classDescriptor.mo32434P()) == null || (mo32489f = mo32434P.mo32489f()) == null) ? null : (ValueParameterDescriptor) CollectionsKt.m32013Z(mo32489f);
            if (valueParameterDescriptor != null) {
                MemberScope mo32791p = kotlinType.mo32791p();
                Name name = valueParameterDescriptor.getName();
                Intrinsics.m32175d(name, "parameter.name");
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) CollectionsKt.m32012Y(mo32791p.mo32617e(name, NoLookupLocation.FOR_ALREADY_TRACKED));
                if (propertyDescriptor != null) {
                    kotlinType2 = propertyDescriptor.getType();
                    if (kotlinType2 != null || (m32948a = m32948a(kotlinType2, hashSet)) == null) {
                        return null;
                    }
                    if (kotlinType.mo32838I0()) {
                        return (TypeUtils.m33694d(m32948a) || KotlinBuiltIns.m32383K(m32948a)) ? kotlinType : TypeUtilsKt.m33752g(m32948a);
                    }
                }
            }
            kotlinType2 = null;
            if (kotlinType2 != null) {
            }
            return null;
        }
        m32948a = m32948a(m32952e((TypeParameterDescriptor) mo32449b), hashSet);
        if (m32948a == null) {
            return null;
        }
        if (!TypeUtils.m33694d(m32948a) && kotlinType.mo32838I0()) {
            return TypeUtilsKt.m33752g(m32948a);
        }
        return m32948a;
    }

    @NotNull
    /* renamed from: b */
    public static final String m32949b(@NotNull ClassDescriptor klass, @NotNull TypeMappingConfiguration<?> typeMappingConfiguration, boolean z) {
        Intrinsics.m32180i(klass, "klass");
        Intrinsics.m32180i(typeMappingConfiguration, "typeMappingConfiguration");
        DeclarationDescriptor mo32437b = klass.mo32437b();
        if (z) {
            mo32437b = m32951d(mo32437b);
        }
        Name name = klass.getName();
        Name name2 = SpecialNames.f65609a;
        if (name == null || name.f65607c) {
            name = SpecialNames.f65611c;
        }
        Intrinsics.m32175d(name, "SpecialNames.safeIdentifier(klass.name)");
        String m33215b = name.m33215b();
        Intrinsics.m32175d(m33215b, "SpecialNames.safeIdentifier(klass.name).identifier");
        if (mo32437b instanceof PackageFragmentDescriptor) {
            FqName mo32550d = ((PackageFragmentDescriptor) mo32437b).mo32550d();
            if (mo32550d.m33197b()) {
                return m33215b;
            }
            StringBuilder sb = new StringBuilder();
            String str = mo32550d.f65597a.f65602a;
            Intrinsics.m32175d(str, "fqName.asString()");
            sb.append(StringsKt.m33890P(str, '.', JsonPointer.SEPARATOR, false, 4, null));
            sb.append(JsonPointer.SEPARATOR);
            sb.append(m33215b);
            return sb.toString();
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) (!(mo32437b instanceof ClassDescriptor) ? null : mo32437b);
        if (classDescriptor == null) {
            throw new IllegalArgumentException("Unexpected container: " + mo32437b + " for " + klass);
        }
        String mo32945c = typeMappingConfiguration.mo32945c(classDescriptor);
        if (mo32945c == null) {
            mo32945c = m32949b(classDescriptor, typeMappingConfiguration, z);
        }
        return mo32945c + '$' + m33215b;
    }

    /* renamed from: c */
    public static final String m32950c(boolean z) {
        String str = JvmClassName.m33543a(ClassId.m33188i(z ? DescriptorUtils.f65880f : DescriptorUtils.f65879e)).f65940a;
        Intrinsics.m32175d(str, "JvmClassName.byClassId(C…vel(fqName)).internalName");
        return str;
    }

    /* renamed from: d */
    public static final DeclarationDescriptor m32951d(DeclarationDescriptor declarationDescriptor) {
        DeclarationDescriptor declarationDescriptor2 = (ClassDescriptor) (!(declarationDescriptor instanceof ClassDescriptor) ? null : declarationDescriptor);
        if (declarationDescriptor2 == null) {
            declarationDescriptor2 = (PackageFragmentDescriptor) (!(declarationDescriptor instanceof PackageFragmentDescriptor) ? null : declarationDescriptor);
        }
        if (declarationDescriptor2 != null) {
            return declarationDescriptor2;
        }
        if (declarationDescriptor != null) {
            return m32951d(declarationDescriptor.mo32437b());
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        r2 = r1;
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.reflect.jvm.internal.impl.types.KotlinType m32952e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor r6) {
        /*
            java.util.List r6 = r6.getUpperBounds()
            java.lang.String r0 = "descriptor.upperBounds"
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
            r6.isEmpty()
            java.util.Iterator r0 = r6.iterator()
        L10:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            r3 = r1
            kotlin.reflect.jvm.internal.impl.types.KotlinType r3 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r3
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r3 = r3.mo33515H0()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r3 = r3.mo32449b()
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
            if (r4 != 0) goto L2b
            goto L2c
        L2b:
            r2 = r3
        L2c:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r2 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r2
            r3 = 0
            if (r2 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = r2.mo32438g()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r5 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE
            if (r4 == r5) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = r2.mo32438g()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r4 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS
            if (r2 == r4) goto L42
            r3 = 1
        L42:
            if (r3 == 0) goto L10
            r2 = r1
        L45:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
            if (r2 == 0) goto L4a
            goto L56
        L4a:
            java.lang.Object r6 = kotlin.collections.CollectionsKt.m32044u(r6)
            java.lang.String r0 = "upperBounds.first()"
            kotlin.jvm.internal.Intrinsics.m32175d(r6, r0)
            r2 = r6
            kotlin.reflect.jvm.internal.impl.types.KotlinType r2 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r2
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.m32952e(kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x0194, code lost:
    
        if (r11 != false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6  */
    @org.jetbrains.annotations.NotNull
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> T m32953f(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory<T> r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode r24, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration<? extends T> r25, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter<T> r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super kotlin.reflect.jvm.internal.impl.types.KotlinType, ? super T, ? super kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.Unit> r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 924
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.TypeSignatureMappingKt.m32953f(kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmTypeFactory, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingMode, kotlin.reflect.jvm.internal.impl.load.kotlin.TypeMappingConfiguration, kotlin.reflect.jvm.internal.impl.load.kotlin.JvmDescriptorTypeWriter, kotlin.jvm.functions.Function3, boolean):java.lang.Object");
    }
}
