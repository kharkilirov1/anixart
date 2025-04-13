package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KType.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/KType;", "Lkotlin/reflect/KAnnotatedElement;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface KType extends KAnnotatedElement {

    /* compiled from: KType.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: c */
    List<KTypeProjection> mo32218c();

    @Nullable
    /* renamed from: e */
    KClassifier mo32219e();
}
