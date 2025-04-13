package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class ArrayValue extends ConstantValue<List<? extends ConstantValue<?>>> {

    /* renamed from: b */
    public final Function1<ModuleDescriptor, KotlinType> f65920b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ArrayValue(@NotNull List<? extends ConstantValue<?>> list, @NotNull Function1<? super ModuleDescriptor, ? extends KotlinType> computeType) {
        super(list);
        Intrinsics.m32180i(computeType, "computeType");
        this.f65920b = computeType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    /* renamed from: a */
    public KotlinType mo33521a(@NotNull ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        KotlinType invoke = this.f65920b.invoke(module);
        if (!KotlinBuiltIns.m32375C(invoke)) {
            KotlinBuiltIns.m32382J(invoke);
        }
        return invoke;
    }
}
