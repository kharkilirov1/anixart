package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import org.jetbrains.annotations.NotNull;

/* compiled from: SupertypeLoopChecker.kt */
/* loaded from: classes3.dex */
public interface SupertypeLoopChecker {

    /* compiled from: SupertypeLoopChecker.kt */
    public static final class EMPTY implements SupertypeLoopChecker {

        /* renamed from: a */
        public static final EMPTY f63981a = new EMPTY();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker
        @NotNull
        /* renamed from: a */
        public Collection<KotlinType> mo32562a(@NotNull TypeConstructor currentTypeConstructor, @NotNull Collection<? extends KotlinType> superTypes, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function12) {
            Intrinsics.m32180i(currentTypeConstructor, "currentTypeConstructor");
            Intrinsics.m32180i(superTypes, "superTypes");
            return superTypes;
        }
    }

    @NotNull
    /* renamed from: a */
    Collection<KotlinType> mo32562a(@NotNull TypeConstructor typeConstructor, @NotNull Collection<? extends KotlinType> collection, @NotNull Function1<? super TypeConstructor, ? extends Iterable<? extends KotlinType>> function1, @NotNull Function1<? super KotlinType, Unit> function12);
}
