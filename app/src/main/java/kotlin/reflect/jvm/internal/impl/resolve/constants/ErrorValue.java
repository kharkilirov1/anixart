package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public abstract class ErrorValue extends ConstantValue<Unit> {

    /* renamed from: b */
    public static final Companion f65927b = new Companion(null);

    /* compiled from: constantValues.kt */
    public static final class Companion {
        public Companion() {
        }

        @NotNull
        /* renamed from: a */
        public final ErrorValue m33526a(@NotNull String message) {
            Intrinsics.m32180i(message, "message");
            return new ErrorValueWithMessage(message);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* compiled from: constantValues.kt */
    public static final class ErrorValueWithMessage extends ErrorValue {

        /* renamed from: c */
        @NotNull
        public final String f65928c;

        public ErrorValueWithMessage(@NotNull String str) {
            this.f65928c = str;
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        /* renamed from: a */
        public KotlinType mo33521a(ModuleDescriptor module) {
            Intrinsics.m32180i(module, "module");
            return ErrorUtils.m33652c(this.f65928c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
        @NotNull
        public String toString() {
            return this.f65928c;
        }
    }

    public ErrorValue() {
        super(Unit.f63088a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: b */
    public Unit mo33522b() {
        throw new UnsupportedOperationException();
    }
}
