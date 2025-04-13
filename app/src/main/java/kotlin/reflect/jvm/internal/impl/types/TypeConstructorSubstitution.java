package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public abstract class TypeConstructorSubstitution extends TypeSubstitution {

    /* renamed from: b */
    public static final Companion f66342b = new Companion(null);

    /* compiled from: TypeSubstitution.kt */
    public static final class Companion {
        public Companion() {
        }

        @JvmStatic
        @JvmOverloads
        @NotNull
        /* renamed from: c */
        public static TypeConstructorSubstitution m33675c(Companion companion, final Map map, final boolean z, int i2) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            Intrinsics.m32180i(map, "map");
            return new TypeConstructorSubstitution() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution$Companion$createByConstructorsMap$1
                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* renamed from: a */
                public boolean mo33644a() {
                    return z;
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
                /* renamed from: e */
                public boolean mo33646e() {
                    return map.isEmpty();
                }

                @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
                @Nullable
                /* renamed from: g */
                public TypeProjection mo33674g(@NotNull TypeConstructor key) {
                    Intrinsics.m32180i(key, "key");
                    return (TypeProjection) map.get(key);
                }
            };
        }

        @JvmStatic
        @NotNull
        /* renamed from: a */
        public final TypeSubstitution m33676a(@NotNull KotlinType kotlinType) {
            return m33677b(kotlinType.mo33515H0(), kotlinType.mo33514G0());
        }

        @JvmStatic
        @NotNull
        /* renamed from: b */
        public final TypeSubstitution m33677b(@NotNull TypeConstructor typeConstructor, @NotNull List<? extends TypeProjection> arguments) {
            Intrinsics.m32180i(typeConstructor, "typeConstructor");
            Intrinsics.m32180i(arguments, "arguments");
            List<TypeParameterDescriptor> parameters = typeConstructor.getParameters();
            Intrinsics.m32175d(parameters, "typeConstructor.parameters");
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) CollectionsKt.m31992E(parameters);
            if (!(typeParameterDescriptor != null ? typeParameterDescriptor.mo32501m0() : false)) {
                return new IndexedParametersSubstitution(parameters, arguments);
            }
            List<TypeParameterDescriptor> parameters2 = typeConstructor.getParameters();
            Intrinsics.m32175d(parameters2, "typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(parameters2, 10));
            for (TypeParameterDescriptor it : parameters2) {
                Intrinsics.m32175d(it, "it");
                arrayList.add(it.mo32440j());
            }
            return m33675c(this, MapsKt.m32067l(CollectionsKt.m32039p0(arrayList, arguments)), false, 2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    @Nullable
    /* renamed from: d */
    public TypeProjection mo32783d(@NotNull KotlinType kotlinType) {
        return mo33674g(kotlinType.mo33515H0());
    }

    @Nullable
    /* renamed from: g */
    public abstract TypeProjection mo33674g(@NotNull TypeConstructor typeConstructor);
}
