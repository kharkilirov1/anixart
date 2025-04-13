package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;

/* compiled from: TypesJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 2, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class TypesJVMKt {

    /* compiled from: TypesJVM.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63434a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f63434a = iArr;
        }
    }

    /* renamed from: a */
    public static final String m32246a(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            Sequence m33847o = SequencesKt.m33847o(type, TypesJVMKt$typeToString$unwrap$1.f63435d);
            StringBuilder sb = new StringBuilder();
            Iterator it = m33847o.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            sb.append(((Class) next).getName());
            sb.append(StringsKt.m33888N(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, SequencesKt.m33837e(m33847o)));
            name = sb.toString();
        } else {
            name = cls.getName();
        }
        Intrinsics.m32178g(name, "{\n        if (type.isArr…   } else type.name\n    }");
        return name;
    }

    @ExperimentalStdlibApi
    /* renamed from: b */
    public static final Type m32247b(KType kType, boolean z) {
        KClassifier mo32219e = kType.mo32219e();
        if (mo32219e instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) mo32219e);
        }
        if (!(mo32219e instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
        }
        KClass kClass = (KClass) mo32219e;
        Class m32148c = z ? JvmClassMappingKt.m32148c(kClass) : JvmClassMappingKt.m32147b(kClass);
        List<KTypeProjection> mo32218c = kType.mo32218c();
        if (mo32218c.isEmpty()) {
            return m32148c;
        }
        if (!m32148c.isArray()) {
            return m32248c(m32148c, mo32218c);
        }
        if (m32148c.getComponentType().isPrimitive()) {
            return m32148c;
        }
        KTypeProjection kTypeProjection = (KTypeProjection) CollectionsKt.m32013Z(mo32218c);
        if (kTypeProjection == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
        }
        KVariance kVariance = kTypeProjection.f63417a;
        KType kType2 = kTypeProjection.f63418b;
        int i2 = kVariance == null ? -1 : WhenMappings.f63434a[kVariance.ordinal()];
        if (i2 == -1 || i2 == 1) {
            return m32148c;
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.m32176e(kType2);
        Type m32247b = m32247b(kType2, false);
        return m32247b instanceof Class ? m32148c : new GenericArrayTypeImpl(m32247b);
    }

    @ExperimentalStdlibApi
    /* renamed from: c */
    public static final Type m32248c(Class<?> cls, List<KTypeProjection> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m32249d((KTypeProjection) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(m32249d((KTypeProjection) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type m32248c = m32248c(declaringClass, list.subList(length, list.size()));
        List<KTypeProjection> subList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(subList, 10));
        Iterator<T> it3 = subList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(m32249d((KTypeProjection) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, m32248c, arrayList3);
    }

    /* renamed from: d */
    public static final Type m32249d(KTypeProjection kTypeProjection) {
        KVariance kVariance = kTypeProjection.f63417a;
        if (kVariance == null) {
            return WildcardTypeImpl.f63436d;
        }
        KType kType = kTypeProjection.f63418b;
        Intrinsics.m32176e(kType);
        int ordinal = kVariance.ordinal();
        if (ordinal == 0) {
            return m32247b(kType, true);
        }
        if (ordinal == 1) {
            return new WildcardTypeImpl(null, m32247b(kType, true));
        }
        if (ordinal == 2) {
            return new WildcardTypeImpl(m32247b(kType, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
