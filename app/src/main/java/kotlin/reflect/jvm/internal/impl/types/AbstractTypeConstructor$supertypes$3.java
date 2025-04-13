package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;

/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes3.dex */
public final class AbstractTypeConstructor$supertypes$3 extends Lambda implements Function1<AbstractTypeConstructor.Supertypes, Unit> {

    /* renamed from: b */
    public final /* synthetic */ AbstractTypeConstructor f66286b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractTypeConstructor$supertypes$3(AbstractTypeConstructor abstractTypeConstructor) {
        super(1);
        this.f66286b = abstractTypeConstructor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Unit invoke(AbstractTypeConstructor.Supertypes supertypes) {
        AbstractTypeConstructor.Supertypes supertypes2 = supertypes;
        Intrinsics.m32180i(supertypes2, "supertypes");
        Collection<KotlinType> mo32562a = this.f66286b.mo32452h().mo32562a(this.f66286b, supertypes2.f66283b, new Function1<TypeConstructor, Collection<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends KotlinType> invoke(TypeConstructor typeConstructor) {
                TypeConstructor it = typeConstructor;
                Intrinsics.m32180i(it, "it");
                return AbstractTypeConstructor.m33640d(AbstractTypeConstructor$supertypes$3.this.f66286b, it, false);
            }
        }, new Function1<KotlinType, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3$resultWithoutCycles$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(KotlinType kotlinType) {
                KotlinType it = kotlinType;
                Intrinsics.m32180i(it, "it");
                AbstractTypeConstructor$supertypes$3.this.f66286b.mo32607j(it);
                return Unit.f63088a;
            }
        });
        if (mo32562a.isEmpty()) {
            KotlinType mo32606f = this.f66286b.mo32606f();
            mo32562a = mo32606f != null ? CollectionsKt.m31993F(mo32606f) : null;
            if (mo32562a == null) {
                mo32562a = EmptyList.f63144b;
            }
        }
        this.f66286b.mo32452h().mo32562a(this.f66286b, mo32562a, new Function1<TypeConstructor, Collection<? extends KotlinType>>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.2
            @Override // kotlin.jvm.functions.Function1
            public Collection<? extends KotlinType> invoke(TypeConstructor typeConstructor) {
                TypeConstructor it = typeConstructor;
                Intrinsics.m32180i(it, "it");
                return AbstractTypeConstructor.m33640d(AbstractTypeConstructor$supertypes$3.this.f66286b, it, true);
            }
        }, new Function1<KotlinType, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$3.3
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(KotlinType kotlinType) {
                KotlinType it = kotlinType;
                Intrinsics.m32180i(it, "it");
                Objects.requireNonNull(AbstractTypeConstructor$supertypes$3.this.f66286b);
                return Unit.f63088a;
            }
        });
        List<? extends KotlinType> list = (List) (mo32562a instanceof List ? mo32562a : null);
        if (list == null) {
            list = CollectionsKt.m32027j0(mo32562a);
        }
        supertypes2.f66282a = list;
        return Unit.f63088a;
    }
}
