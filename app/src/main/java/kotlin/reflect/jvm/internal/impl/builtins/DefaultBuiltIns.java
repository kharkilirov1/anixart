package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: DefaultBuiltIns.kt */
/* loaded from: classes3.dex */
public final class DefaultBuiltIns extends KotlinBuiltIns {

    /* renamed from: n */
    public static final BuiltInsInitializer<DefaultBuiltIns> f63722n = new BuiltInsInitializer<>(new Function0<DefaultBuiltIns>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns$Companion$initializer$1
        @Override // kotlin.jvm.functions.Function0
        public DefaultBuiltIns invoke() {
            return new DefaultBuiltIns(null);
        }
    });

    /* compiled from: DefaultBuiltIns.kt */
    public static final class Companion {
    }

    public DefaultBuiltIns() {
        super(new LockBasedStorageManager());
        m32395c();
    }

    public DefaultBuiltIns(DefaultConstructorMarker defaultConstructorMarker) {
        super(new LockBasedStorageManager());
        m32395c();
    }
}
