package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AbstractTypeConstructor.kt */
/* loaded from: classes3.dex */
public abstract class AbstractTypeConstructor implements TypeConstructor {

    /* renamed from: a */
    public final NotNullLazyValue<Supertypes> f66281a;

    /* compiled from: AbstractTypeConstructor.kt */
    public static final class Supertypes {

        /* renamed from: a */
        @NotNull
        public List<? extends KotlinType> f66282a;

        /* renamed from: b */
        @NotNull
        public final Collection<KotlinType> f66283b;

        /* JADX WARN: Multi-variable type inference failed */
        public Supertypes(@NotNull Collection<? extends KotlinType> allSupertypes) {
            Intrinsics.m32180i(allSupertypes, "allSupertypes");
            this.f66283b = allSupertypes;
            this.f66282a = CollectionsKt.m31993F(ErrorUtils.f66308c);
        }
    }

    public AbstractTypeConstructor(@NotNull StorageManager storageManager) {
        Intrinsics.m32180i(storageManager, "storageManager");
        this.f66281a = storageManager.mo33625e(new Function0<Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public AbstractTypeConstructor.Supertypes invoke() {
                return new AbstractTypeConstructor.Supertypes(AbstractTypeConstructor.this.mo32451e());
            }
        }, new Function1<Boolean, Supertypes>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeConstructor$supertypes$2
            @Override // kotlin.jvm.functions.Function1
            public AbstractTypeConstructor.Supertypes invoke(Boolean bool) {
                bool.booleanValue();
                return new AbstractTypeConstructor.Supertypes(CollectionsKt.m31993F(ErrorUtils.f66308c));
            }
        }, new AbstractTypeConstructor$supertypes$3(this));
    }

    @NotNull
    /* renamed from: d */
    public static final Collection m33640d(AbstractTypeConstructor abstractTypeConstructor, @NotNull TypeConstructor typeConstructor, boolean z) {
        Objects.requireNonNull(abstractTypeConstructor);
        AbstractTypeConstructor abstractTypeConstructor2 = (AbstractTypeConstructor) (!(typeConstructor instanceof AbstractTypeConstructor) ? null : typeConstructor);
        if (abstractTypeConstructor2 != null) {
            return CollectionsKt.m32002O(abstractTypeConstructor2.f66281a.invoke().f66283b, abstractTypeConstructor2.mo33639g(z));
        }
        Collection<KotlinType> supertypes = typeConstructor.mo32602a();
        Intrinsics.m32175d(supertypes, "supertypes");
        return supertypes;
    }

    @NotNull
    /* renamed from: e */
    public abstract Collection<KotlinType> mo32451e();

    @Nullable
    /* renamed from: f */
    public KotlinType mo32606f() {
        return null;
    }

    @NotNull
    /* renamed from: g */
    public Collection<KotlinType> mo33639g(boolean z) {
        return EmptyList.f63144b;
    }

    @NotNull
    /* renamed from: h */
    public abstract SupertypeLoopChecker mo32452h();

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public List<KotlinType> mo32602a() {
        return this.f66281a.invoke().f66282a;
    }

    /* renamed from: j */
    public void mo32607j(@NotNull KotlinType kotlinType) {
    }
}
