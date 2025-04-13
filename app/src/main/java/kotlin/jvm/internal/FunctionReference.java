package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import p000a.C0000a;

/* loaded from: classes3.dex */
public class FunctionReference extends CallableReference implements FunctionBase, KFunction {

    /* renamed from: b */
    public final int f63344b;

    /* renamed from: c */
    @SinceKotlin
    public final int f63345c;

    public FunctionReference(int i2) {
        this(i2, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public KCallable computeReflected() {
        return Reflection.f63352a.mo32199a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.f63345c == functionReference.f63345c && this.f63344b == functionReference.f63344b && Intrinsics.m32174c(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.m32174c(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof KFunction) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionBase
    /* renamed from: getArity */
    public int getF63252e() {
        return this.f63344b;
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public KFunction getReflected() {
        return (KFunction) super.getReflected();
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
    @SinceKotlin
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        StringBuilder m24u = C0000a.m24u("function ");
        m24u.append(getName());
        m24u.append(" (Kotlin reflection is not available)");
        return m24u.toString();
    }

    @SinceKotlin
    public FunctionReference(int i2, Object obj) {
        this(i2, obj, null, null, null, 0);
    }

    @SinceKotlin
    public FunctionReference(int i2, Object obj, Class cls, String str, String str2, int i3) {
        super(obj, cls, str, str2, (i3 & 1) == 1);
        this.f63344b = i2;
        this.f63345c = i3 >> 1;
    }
}
