package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;
import p000a.C0000a;

/* loaded from: classes3.dex */
public abstract class PropertyReference extends CallableReference implements KProperty {
    public PropertyReference() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && Intrinsics.m32174c(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof KProperty) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    @SinceKotlin
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        StringBuilder m24u = C0000a.m24u("property ");
        m24u.append(getName());
        m24u.append(" (Kotlin reflection is not available)");
        return m24u.toString();
    }

    @SinceKotlin
    public PropertyReference(Object obj) {
        super(obj);
    }

    @Override // kotlin.jvm.internal.CallableReference
    @SinceKotlin
    public KProperty getReflected() {
        return (KProperty) super.getReflected();
    }

    @SinceKotlin
    public PropertyReference(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
    }
}
