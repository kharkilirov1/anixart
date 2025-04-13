package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* compiled from: FunctionClassScope.kt */
/* loaded from: classes3.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {

    public final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[FunctionClassDescriptor.Kind.values().length];
            iArr[FunctionClassDescriptor.Kind.f63856d.ordinal()] = 1;
            iArr[FunctionClassDescriptor.Kind.f63857e.ordinal()] = 2;
        }
    }

    public FunctionClassScope(@NotNull StorageManager storageManager, @NotNull FunctionClassDescriptor functionClassDescriptor) {
        super(storageManager, functionClassDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    @NotNull
    /* renamed from: g */
    public List<FunctionDescriptor> mo32457g() {
        ClassDescriptor classDescriptor = this.f65986c;
        if (classDescriptor == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        }
        int ordinal = ((FunctionClassDescriptor) classDescriptor).f63849j.ordinal();
        return ordinal != 0 ? ordinal != 1 ? EmptyList.f63144b : CollectionsKt.m31993F(FunctionInvokeDescriptor.f63864D.m32461a((FunctionClassDescriptor) this.f65986c, true)) : CollectionsKt.m31993F(FunctionInvokeDescriptor.f63864D.m32461a((FunctionClassDescriptor) this.f65986c, false));
    }
}
