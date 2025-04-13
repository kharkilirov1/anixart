package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* compiled from: KTypeParameter.kt */
@SinceKotlin
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/KClassifier;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface KTypeParameter extends KClassifier {
    @NotNull
    String getName();

    @NotNull
    List<KType> getUpperBounds();

    @NotNull
    /* renamed from: m */
    KVariance mo32217m();
}
