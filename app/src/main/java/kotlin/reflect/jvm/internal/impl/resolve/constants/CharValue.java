package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
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
public final class CharValue extends IntegerValueConstant<Character> {
    public CharValue(char c2) {
        super(Character.valueOf(c2));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    /* renamed from: a */
    public KotlinType mo33521a(ModuleDescriptor module) {
        Intrinsics.m32180i(module, "module");
        KotlinBuiltIns mo32547n = module.mo32547n();
        Objects.requireNonNull(mo32547n);
        SimpleType m32412w = mo32547n.m32412w(PrimitiveType.CHAR);
        Intrinsics.m32175d(m32412w, "module.builtIns.charType");
        return m32412w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        String ch;
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Integer.valueOf(((Character) this.f65921a).charValue());
        char charValue = ((Character) this.f65921a).charValue();
        switch (charValue) {
            case '\b':
                ch = "\\b";
                break;
            case '\t':
                ch = "\\t";
                break;
            case '\n':
                ch = "\\n";
                break;
            case 11:
            default:
                byte type = (byte) Character.getType(charValue);
                if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
                    z = true;
                }
                ch = z ? Character.toString(charValue) : "?";
                Intrinsics.m32175d(ch, "if (isPrintableUnicode(c…cter.toString(c) else \"?\"");
                break;
            case '\f':
                ch = "\\f";
                break;
            case '\r':
                ch = "\\r";
                break;
        }
        objArr[1] = ch;
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(objArr, 2));
        Intrinsics.m32175d(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
