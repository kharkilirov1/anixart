package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringBuilderJVM.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/text/SystemProperties;", "", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
final class SystemProperties {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final String f66909a;

    static {
        String property = System.getProperty("line.separator");
        Intrinsics.m32176e(property);
        f66909a = property;
    }
}
