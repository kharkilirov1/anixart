package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

/* loaded from: classes3.dex */
public abstract class PropertyReference2 extends PropertyReference implements KProperty2 {
    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.f63352a.mo32207i(this);
    }

    @Override // kotlin.reflect.KProperty2
    public KProperty2.Getter getGetter() {
        return ((KProperty2) getReflected()).getGetter();
    }

    @Override // kotlin.jvm.functions.Function2
    public Object invoke(Object obj, Object obj2) {
        return ((PropertyReference2Impl) this).m32192h(obj, obj2);
    }
}
