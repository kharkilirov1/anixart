package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;

/* loaded from: classes3.dex */
public abstract class PropertyReference1 extends PropertyReference implements KProperty1 {
    public PropertyReference1() {
    }

    @Override // kotlin.jvm.internal.CallableReference
    public KCallable computeReflected() {
        return Reflection.m32197e(this);
    }

    @Override // kotlin.reflect.KProperty1
    @SinceKotlin
    public Object getDelegate(Object obj) {
        return ((KProperty1) getReflected()).getDelegate(obj);
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return get(obj);
    }

    @SinceKotlin
    public PropertyReference1(Object obj) {
        super(obj);
    }

    @Override // kotlin.reflect.KProperty1
    public KProperty1.Getter getGetter() {
        return ((KProperty1) getReflected()).getGetter();
    }

    @SinceKotlin
    public PropertyReference1(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
