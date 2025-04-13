package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: SpecialTypes.kt */
/* loaded from: classes3.dex */
public final class LazyWrappedType extends WrappedType {

    /* renamed from: a */
    public final NotNullLazyValue<KotlinType> f66325a;

    public LazyWrappedType(@NotNull StorageManager storageManager, @NotNull Function0<? extends KotlinType> function0) {
        Intrinsics.m32180i(storageManager, "storageManager");
        this.f66325a = storageManager.mo33623c(function0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    @NotNull
    /* renamed from: K0 */
    public KotlinType mo33668K0() {
        return this.f66325a.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.WrappedType
    /* renamed from: L0 */
    public boolean mo33669L0() {
        return this.f66325a.m33634i();
    }
}
