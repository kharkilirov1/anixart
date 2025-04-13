package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsInitializer;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;

/* compiled from: JvmBuiltInsSettings.kt */
/* loaded from: classes3.dex */
final class FallbackBuiltIns extends KotlinBuiltIns {

    /* renamed from: o */
    public static final Companion f63868o = new Companion(null);

    /* renamed from: n */
    public static final BuiltInsInitializer<FallbackBuiltIns> f63867n = new BuiltInsInitializer<>(new Function0<FallbackBuiltIns>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.FallbackBuiltIns$Companion$initializer$1
        @Override // kotlin.jvm.functions.Function0
        public FallbackBuiltIns invoke() {
            return new FallbackBuiltIns(null);
        }
    });

    /* compiled from: JvmBuiltInsSettings.kt */
    public static final class Companion {
        public Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public FallbackBuiltIns() {
        super(new LockBasedStorageManager());
        m32395c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns
    /* renamed from: s */
    public /* bridge */ /* synthetic */ PlatformDependentDeclarationFilter mo32409s() {
        return PlatformDependentDeclarationFilter.All.f64060a;
    }

    public FallbackBuiltIns(DefaultConstructorMarker defaultConstructorMarker) {
        super(new LockBasedStorageManager());
        m32395c();
    }
}
