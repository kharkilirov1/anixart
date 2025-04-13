package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: RawType.kt */
/* loaded from: classes3.dex */
public final class RawTypeImpl$render$3 extends Lambda implements Function2<String, String, String> {

    /* renamed from: b */
    public static final RawTypeImpl$render$3 f64637b = new RawTypeImpl$render$3();

    public RawTypeImpl$render$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke(@NotNull String receiver$0, @NotNull String newArgs) {
        String m33902b0;
        Intrinsics.m32180i(receiver$0, "receiver$0");
        Intrinsics.m32180i(newArgs, "newArgs");
        if (!StringsKt.m33921s(receiver$0, '<', false, 2, null)) {
            return receiver$0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(StringsKt.m33904d0(receiver$0, '<', null, 2, null));
        sb.append('<');
        sb.append(newArgs);
        sb.append('>');
        m33902b0 = StringsKt.m33902b0(receiver$0, '>', (r3 & 2) != 0 ? receiver$0 : null);
        sb.append(m33902b0);
        return sb.toString();
    }
}
