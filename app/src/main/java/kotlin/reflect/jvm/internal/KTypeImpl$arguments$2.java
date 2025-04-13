package kotlin.reflect.jvm.internal;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.structure.ReflectClassUtilKt;
import p000a.C0000a;

/* compiled from: KTypeImpl.kt */
@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m31884d2 = {"<anonymous>", "", "Lkotlin/reflect/KTypeProjection;", "invoke"}, m31885k = 3, m31886mv = {1, 1, 13})
/* loaded from: classes3.dex */
public final class KTypeImpl$arguments$2 extends Lambda implements Function0<List<? extends KTypeProjection>> {

    /* renamed from: b */
    public final /* synthetic */ KTypeImpl f63620b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl) {
        super(0);
        this.f63620b = kTypeImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public List<? extends KTypeProjection> invoke() {
        KTypeProjection kTypeProjection;
        List<TypeProjection> mo33514G0 = this.f63620b.f63615e.mo33514G0();
        if (mo33514G0.isEmpty()) {
            return EmptyList.f63144b;
        }
        final Lazy m31880a = LazyKt.m31880a(LazyThreadSafetyMode.PUBLICATION, new Function0<List<? extends Type>>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$parameterizedTypeArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public List<? extends Type> invoke() {
                return ReflectClassUtilKt.m33800d(KTypeImpl$arguments$2.this.f63620b.m32302i());
            }
        });
        final KProperty kProperty = KTypeImpl.f63611f[3];
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(mo33514G0, 10));
        final int i2 = 0;
        for (Object obj : mo33514G0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.m32023h0();
                throw null;
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (typeProjection.mo33672b()) {
                KTypeProjection.Companion companion = KTypeProjection.f63415c;
                kTypeProjection = KTypeProjection.f63416d;
            } else {
                KotlinType type = typeProjection.getType();
                Intrinsics.m32175d(type, "typeProjection.type");
                KTypeImpl kTypeImpl = new KTypeImpl(type, new Function0<Type>() { // from class: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$$special$$inlined$mapIndexed$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Type invoke() {
                        Type m32302i = this.f63620b.m32302i();
                        if (m32302i instanceof Class) {
                            Class cls = (Class) m32302i;
                            Class componentType = cls.isArray() ? cls.getComponentType() : Object.class;
                            Intrinsics.m32175d(componentType, "if (javaType.isArray) ja…Type else Any::class.java");
                            return componentType;
                        }
                        if (m32302i instanceof GenericArrayType) {
                            if (i2 == 0) {
                                Type genericComponentType = ((GenericArrayType) m32302i).getGenericComponentType();
                                Intrinsics.m32175d(genericComponentType, "javaType.genericComponentType");
                                return genericComponentType;
                            }
                            StringBuilder m24u = C0000a.m24u("Array type has been queried for a non-0th argument: ");
                            m24u.append(this.f63620b);
                            throw new KotlinReflectionInternalError(m24u.toString());
                        }
                        if (!(m32302i instanceof ParameterizedType)) {
                            StringBuilder m24u2 = C0000a.m24u("Non-generic type has been queried for arguments: ");
                            m24u2.append(this.f63620b);
                            throw new KotlinReflectionInternalError(m24u2.toString());
                        }
                        Type type2 = (Type) ((List) m31880a.getValue()).get(i2);
                        if (type2 instanceof WildcardType) {
                            WildcardType wildcardType = (WildcardType) type2;
                            Type[] lowerBounds = wildcardType.getLowerBounds();
                            Intrinsics.m32175d(lowerBounds, "argument.lowerBounds");
                            Type type3 = (Type) ArraysKt.m31927C(lowerBounds);
                            if (type3 != null) {
                                type2 = type3;
                            } else {
                                Type[] upperBounds = wildcardType.getUpperBounds();
                                Intrinsics.m32175d(upperBounds, "argument.upperBounds");
                                type2 = (Type) ArraysKt.m31926B(upperBounds);
                            }
                        }
                        Intrinsics.m32175d(type2, "if (argument !is Wildcar…ument.upperBounds.first()");
                        return type2;
                    }
                });
                int ordinal = typeProjection.mo33671a().ordinal();
                if (ordinal == 0) {
                    KTypeProjection.Companion companion2 = KTypeProjection.f63415c;
                    kTypeProjection = new KTypeProjection(KVariance.INVARIANT, kTypeImpl);
                } else if (ordinal == 1) {
                    KTypeProjection.Companion companion3 = KTypeProjection.f63415c;
                    kTypeProjection = new KTypeProjection(KVariance.IN, kTypeImpl);
                } else {
                    if (ordinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    KTypeProjection.Companion companion4 = KTypeProjection.f63415c;
                    kTypeProjection = new KTypeProjection(KVariance.OUT, kTypeImpl);
                }
            }
            arrayList.add(kTypeProjection);
            i2 = i3;
        }
        return arrayList;
    }
}
