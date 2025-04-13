package kotlin.reflect;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KParameter.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KAnnotatedElement;", "Kind", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface KParameter extends KAnnotatedElement {

    /* compiled from: KParameter.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    /* compiled from: KParameter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m31884d2 = {"Lkotlin/reflect/KParameter$Kind;", "", "INSTANCE", "EXTENSION_RECEIVER", "VALUE", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
    public enum Kind {
        INSTANCE,
        EXTENSION_RECEIVER,
        VALUE
    }

    @NotNull
    /* renamed from: g */
    Kind mo32244g();

    @Nullable
    String getName();

    @NotNull
    KType getType();

    /* renamed from: j */
    boolean mo32245j();
}
