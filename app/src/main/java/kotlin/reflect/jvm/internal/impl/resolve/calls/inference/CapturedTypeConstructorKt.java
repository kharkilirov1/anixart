package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.IndexedParametersSubstitution;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CapturedTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class CapturedTypeConstructorKt {
    /* renamed from: a */
    public static final TypeProjection m33518a(@NotNull final TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor) {
        if (typeParameterDescriptor != null) {
            Variance mo33671a = typeProjection.mo33671a();
            Variance variance = Variance.INVARIANT;
            if (mo33671a != variance) {
                if (typeParameterDescriptor.mo32500m() != typeProjection.mo33671a()) {
                    CapturedTypeConstructor capturedTypeConstructor = new CapturedTypeConstructor(typeProjection);
                    int i2 = Annotations.f64023H1;
                    return new TypeProjectionImpl(variance, new CapturedType(typeProjection, capturedTypeConstructor, false, Annotations.Companion.f64024a));
                }
                if (!typeProjection.mo33672b()) {
                    return new TypeProjectionImpl(variance, typeProjection.getType());
                }
                StorageManager storageManager = LockBasedStorageManager.f66255e;
                Intrinsics.m32175d(storageManager, "LockBasedStorageManager.NO_LOCKS");
                return new TypeProjectionImpl(variance, new LazyWrappedType(storageManager, new Function0<KotlinType>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$createCapturedIfNeeded$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public KotlinType invoke() {
                        KotlinType type = TypeProjection.this.getType();
                        Intrinsics.m32175d(type, "this@createCapturedIfNeeded.type");
                        return type;
                    }
                }));
            }
        }
        return typeProjection;
    }

    @NotNull
    /* renamed from: b */
    public static TypeSubstitution m33519b(final TypeSubstitution typeSubstitution, final boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if (!(typeSubstitution instanceof IndexedParametersSubstitution)) {
            return new DelegatedTypeSubstitution(typeSubstitution, z, typeSubstitution) { // from class: kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt$wrapWithCapturingSubstitution$2

                /* renamed from: c */
                public final /* synthetic */ boolean f65919c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(typeSubstitution);
                    this.f65919c = z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* renamed from: b */
                public boolean mo33520b() {
                    return this.f65919c;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.DelegatedTypeSubstitution, kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                @Nullable
                /* renamed from: d */
                public TypeProjection mo32783d(@NotNull KotlinType kotlinType) {
                    TypeProjection mo32783d = super.mo32783d(kotlinType);
                    if (mo32783d == null) {
                        return null;
                    }
                    ClassifierDescriptor mo32449b = kotlinType.mo33515H0().mo32449b();
                    return CapturedTypeConstructorKt.m33518a(mo32783d, (TypeParameterDescriptor) (mo32449b instanceof TypeParameterDescriptor ? mo32449b : null));
                }
            };
        }
        IndexedParametersSubstitution indexedParametersSubstitution = (IndexedParametersSubstitution) typeSubstitution;
        TypeParameterDescriptor[] other = indexedParametersSubstitution.f66320b;
        TypeProjection[] typeProjectionArr = indexedParametersSubstitution.f66321c;
        Intrinsics.m32179h(typeProjectionArr, "<this>");
        Intrinsics.m32179h(other, "other");
        int min = Math.min(typeProjectionArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i3 = 0; i3 < min; i3++) {
            arrayList.add(new Pair(typeProjectionArr[i3], other[i3]));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList2.add(m33518a((TypeProjection) pair.f63055b, (TypeParameterDescriptor) pair.f63056c));
        }
        Object[] array = arrayList2.toArray(new TypeProjection[0]);
        if (array != null) {
            return new IndexedParametersSubstitution(other, (TypeProjection[]) array, z);
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }
}
