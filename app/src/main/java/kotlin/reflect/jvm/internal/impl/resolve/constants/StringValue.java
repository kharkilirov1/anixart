package kotlin.reflect.jvm.internal.impl.resolve.constants;

import androidx.emoji2.text.flatbuffer.C0321a;
import androidx.room.util.C0576a;
import com.fasterxml.jackson.core.JsonFactory;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import org.jetbrains.annotations.NotNull;

/* compiled from: constantValues.kt */
/* loaded from: classes3.dex */
public final class StringValue extends ConstantValue<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StringValue(@NotNull String value) {
        super(value);
        Intrinsics.m32180i(value, "value");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: a */
    public KotlinType mo33521a(ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        SimpleType m32413y = module.mo32547n().m32413y();
        Intrinsics.m32175d(m32413y, "module.builtIns.stringType");
        return m32413y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        return C0576a.m4118q(C0321a.m2872a(JsonFactory.DEFAULT_QUOTE_CHAR), (String) this.f65921a, JsonFactory.DEFAULT_QUOTE_CHAR);
    }
}
