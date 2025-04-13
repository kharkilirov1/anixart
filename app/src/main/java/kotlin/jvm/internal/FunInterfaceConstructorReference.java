package kotlin.jvm.internal;

import java.util.Objects;
import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;

@SinceKotlin
/* loaded from: classes3.dex */
public class FunInterfaceConstructorReference extends FunctionReference {
    @Override // kotlin.jvm.internal.FunctionReference
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FunInterfaceConstructorReference)) {
            return false;
        }
        Objects.requireNonNull((FunInterfaceConstructorReference) obj);
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public /* bridge */ /* synthetic */ KCallable getReflected() {
        getReflected();
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    /* renamed from: h */
    public KFunction getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public int hashCode() {
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public String toString() {
        new StringBuilder().append("fun interface ");
        throw null;
    }
}
