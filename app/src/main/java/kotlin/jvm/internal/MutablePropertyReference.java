package kotlin.jvm.internal;

import kotlin.SinceKotlin;
import kotlin.reflect.KMutableProperty;

/* loaded from: classes3.dex */
public abstract class MutablePropertyReference extends PropertyReference implements KMutableProperty {
    public MutablePropertyReference() {
    }

    @SinceKotlin
    public MutablePropertyReference(Object obj) {
        super(obj);
    }

    @SinceKotlin
    public MutablePropertyReference(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, i2);
    }
}
