package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class ByteValue extends IntegerValueConstant<Byte> {
    public ByteValue(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: a */
    public KotlinType mo33521a(ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        KotlinBuiltIns mo32547n = module.mo32547n();
        Objects.requireNonNull(mo32547n);
        SimpleType m32412w = mo32547n.m32412w(PrimitiveType.BYTE);
        Intrinsics.m32175d(m32412w, "module.builtIns.byteType");
        return m32412w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return ((int) ((Number) this.f65921a).byteValue()) + ".toByte()";
    }
}
