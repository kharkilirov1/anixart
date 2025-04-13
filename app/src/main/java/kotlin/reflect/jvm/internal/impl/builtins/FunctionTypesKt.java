package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.constants.StringValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: functionTypes.kt */
/* loaded from: classes3.dex */
public final class FunctionTypesKt {
    @JvmOverloads
    @NotNull
    /* renamed from: a */
    public static final SimpleType m32365a(@NotNull KotlinBuiltIns builtIns, @NotNull Annotations annotations, @Nullable KotlinType kotlinType, @NotNull List<? extends KotlinType> parameterTypes, @Nullable List<Name> list, @NotNull KotlinType returnType, boolean z) {
        Annotations annotations2;
        Map map;
        Name name;
        Intrinsics.m32180i(builtIns, "builtIns");
        Intrinsics.m32180i(annotations, "annotations");
        Intrinsics.m32180i(parameterTypes, "parameterTypes");
        Intrinsics.m32180i(returnType, "returnType");
        int i2 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + (kotlinType != null ? 1 : 0) + 1);
        TypeProjectionImpl typeProjectionImpl = kotlinType != null ? new TypeProjectionImpl(Variance.INVARIANT, kotlinType) : null;
        if (typeProjectionImpl != null) {
            arrayList.add(typeProjectionImpl);
        }
        for (Object obj : parameterTypes) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            KotlinType kotlinType2 = (KotlinType) obj;
            if (list == null || (name = list.get(i2)) == null || name.f65607c) {
                name = null;
            }
            if (name != null) {
                FqName fqName = KotlinBuiltIns.f63730l.f63797x;
                Intrinsics.m32175d(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
                Name m33211d = Name.m33211d("name");
                String str = name.f65606b;
                Intrinsics.m32175d(str, "name.asString()");
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = new BuiltInAnnotationDescriptor(builtIns, fqName, MapsKt.m32063h(new Pair(m33211d, new StringValue(str))));
                int i4 = Annotations.f64023H1;
                kotlinType2 = TypeUtilsKt.m33753h(kotlinType2, Annotations.Companion.f64025b.m32594a(CollectionsKt.m32001N(kotlinType2.getAnnotations(), builtInAnnotationDescriptor)));
            }
            arrayList.add(TypeUtilsKt.m33746a(kotlinType2));
            i2 = i3;
        }
        arrayList.add(new TypeProjectionImpl(Variance.INVARIANT, returnType));
        int size = parameterTypes.size();
        if (kotlinType != null) {
            size++;
        }
        ClassDescriptor m32414z = z ? builtIns.m32414z(size) : builtIns.m32402j("Function" + size);
        Intrinsics.m32175d(m32414z, "if (suspendFunction) bui…tFunction(parameterCount)");
        if (kotlinType != null) {
            KotlinBuiltIns.FqNames fqNames = KotlinBuiltIns.f63730l;
            FqName fqName2 = fqNames.f63796w;
            Intrinsics.m32175d(fqName2, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
            if (annotations.mo32593h(fqName2) == null) {
                int i5 = Annotations.f64023H1;
                Annotations.Companion companion = Annotations.Companion.f64025b;
                FqName fqName3 = fqNames.f63796w;
                Intrinsics.m32175d(fqName3, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
                map = EmptyMap.f63145b;
                annotations2 = companion.m32594a(CollectionsKt.m32001N(annotations, new BuiltInAnnotationDescriptor(builtIns, fqName3, map)));
                return KotlinTypeFactory.m33664b(annotations2, m32414z, arrayList);
            }
        }
        annotations2 = annotations;
        return KotlinTypeFactory.m33664b(annotations2, m32414z, arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* renamed from: b */
    public static final Name m32366b(@NotNull KotlinType kotlinType) {
        String str;
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.f63730l.f63797x;
        Intrinsics.m32175d(fqName, "KotlinBuiltIns.FQ_NAMES.parameterName");
        AnnotationDescriptor mo32593h = annotations.mo32593h(fqName);
        if (mo32593h != null) {
            Object m32012Y = CollectionsKt.m32012Y(mo32593h.mo32586a().values());
            if (!(m32012Y instanceof StringValue)) {
                m32012Y = null;
            }
            StringValue stringValue = (StringValue) m32012Y;
            if (stringValue != null && (str = (String) stringValue.f65921a) != null) {
                if (!Name.m33212e(str)) {
                    str = null;
                }
                if (str != null) {
                    return Name.m33211d(str);
                }
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: c */
    public static final FunctionClassDescriptor.Kind m32367c(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !KotlinBuiltIns.m32386N(declarationDescriptor)) {
            return null;
        }
        FqNameUnsafe m33468d = DescriptorUtils.m33468d(declarationDescriptor);
        Intrinsics.m32175d(m33468d, "DescriptorUtils.getFqName(this)");
        if (!m33468d.m33204d() || m33468d.m33203c()) {
            return null;
        }
        BuiltInFictitiousFunctionClassFactory.Companion companion = BuiltInFictitiousFunctionClassFactory.f63839c;
        String str = m33468d.m33206f().f65606b;
        Intrinsics.m32175d(str, "shortName().asString()");
        FqName m33198c = m33468d.m33207g().m33198c();
        Intrinsics.m32175d(m33198c, "toSafe().parent()");
        return companion.m32428a(str, m33198c);
    }

    @Nullable
    /* renamed from: d */
    public static final KotlinType m32368d(@NotNull KotlinType kotlinType) {
        m32371g(kotlinType);
        if (m32373i(kotlinType)) {
            return ((TypeProjection) CollectionsKt.m32044u(kotlinType.mo33514G0())).getType();
        }
        return null;
    }

    @NotNull
    /* renamed from: e */
    public static final KotlinType m32369e(@NotNull KotlinType kotlinType) {
        m32371g(kotlinType);
        KotlinType type = ((TypeProjection) CollectionsKt.m31991D(kotlinType.mo33514G0())).getType();
        Intrinsics.m32175d(type, "arguments.last().type");
        return type;
    }

    @NotNull
    /* renamed from: f */
    public static final List<TypeProjection> m32370f(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        m32371g(receiver$0);
        List<TypeProjection> mo33514G0 = receiver$0.mo33514G0();
        return mo33514G0.subList((m32371g(receiver$0) && m32373i(receiver$0)) ? 1 : 0, mo33514G0.size() - 1);
    }

    /* renamed from: g */
    public static final boolean m32371g(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ClassifierDescriptor mo32449b = receiver$0.mo33515H0().mo32449b();
        FunctionClassDescriptor.Kind m32367c = mo32449b != null ? m32367c(mo32449b) : null;
        return m32367c == FunctionClassDescriptor.Kind.f63856d || m32367c == FunctionClassDescriptor.Kind.f63857e;
    }

    /* renamed from: h */
    public static final boolean m32372h(@NotNull KotlinType receiver$0) {
        Intrinsics.m32180i(receiver$0, "receiver$0");
        ClassifierDescriptor mo32449b = receiver$0.mo33515H0().mo32449b();
        return (mo32449b != null ? m32367c(mo32449b) : null) == FunctionClassDescriptor.Kind.f63857e;
    }

    /* renamed from: i */
    public static final boolean m32373i(@NotNull KotlinType kotlinType) {
        Annotations annotations = kotlinType.getAnnotations();
        FqName fqName = KotlinBuiltIns.f63730l.f63796w;
        Intrinsics.m32175d(fqName, "KotlinBuiltIns.FQ_NAMES.extensionFunctionType");
        return annotations.mo32593h(fqName) != null;
    }
}
