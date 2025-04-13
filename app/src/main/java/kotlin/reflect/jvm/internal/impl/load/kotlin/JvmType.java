package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes3.dex */
public abstract class JvmType {

    /* compiled from: methodSignatureMapping.kt */
    public static final class Array extends JvmType {

        /* renamed from: a */
        @NotNull
        public final JvmType f64796a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType elementType) {
            super(null);
            Intrinsics.m32180i(elementType, "elementType");
            this.f64796a = elementType;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class Object extends JvmType {

        /* renamed from: a */
        @NotNull
        public final String f64797a;

        public Object(@NotNull String str) {
            super(null);
            this.f64797a = str;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class Primitive extends JvmType {

        /* renamed from: a */
        @Nullable
        public final JvmPrimitiveType f64798a;

        public Primitive(@Nullable JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.f64798a = jvmPrimitiveType;
        }
    }

    public JvmType() {
    }

    @NotNull
    public String toString() {
        return JvmTypeFactoryImpl.f64799a.mo32915a(this);
    }

    public JvmType(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
