package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000a.C0000a;

/* compiled from: utils.kt */
/* loaded from: classes3.dex */
public final class UtilsKt {
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt$debugInfo$1$1] */
    /* renamed from: a */
    public static final String m33744a(@NotNull TypeConstructor typeConstructor) {
        final StringBuilder sb = new StringBuilder();
        ?? r1 = new Function1<String, StringBuilder>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.UtilsKt$debugInfo$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StringBuilder invoke(@NotNull String receiver$0) {
                Intrinsics.m32180i(receiver$0, "receiver$0");
                StringBuilder sb2 = sb;
                sb2.append(receiver$0);
                StringsKt.m33917p(sb2);
                return sb2;
            }
        };
        r1.invoke("type: " + typeConstructor);
        StringBuilder m24u = C0000a.m24u("hashCode: ");
        m24u.append(typeConstructor.hashCode());
        r1.invoke(m24u.toString());
        StringBuilder m24u2 = C0000a.m24u("javaClass: ");
        m24u2.append(typeConstructor.getClass().getCanonicalName());
        r1.invoke(m24u2.toString());
        for (DeclarationDescriptor mo32449b = typeConstructor.mo32449b(); mo32449b != null; mo32449b = mo32449b.mo32437b()) {
            StringBuilder m24u3 = C0000a.m24u("fqName: ");
            m24u3.append(DescriptorRenderer.f65766a.mo33363r(mo32449b));
            r1.invoke(m24u3.toString());
            StringBuilder m24u4 = C0000a.m24u("javaClass: ");
            m24u4.append(mo32449b.getClass().getCanonicalName());
            r1.invoke(m24u4.toString());
        }
        String sb2 = sb.toString();
        Intrinsics.m32175d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
