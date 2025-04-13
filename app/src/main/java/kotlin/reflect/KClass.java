package kotlin.reflect;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KClass.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, m31884d2 = {"Lkotlin/reflect/KClass;", "", "T", "Lkotlin/reflect/KDeclarationContainer;", "Lkotlin/reflect/KAnnotatedElement;", "Lkotlin/reflect/KClassifier;", "kotlin-stdlib"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes3.dex */
public interface KClass<T> extends KDeclarationContainer, KAnnotatedElement, KClassifier {

    /* compiled from: KClass.kt */
    @Metadata(m31885k = 3, m31886mv = {1, 7, 1}, m31888xi = 48)
    public static final class DefaultImpls {
    }

    @NotNull
    /* renamed from: a */
    List<KType> mo32164a();

    @Nullable
    /* renamed from: b */
    String mo32165b();

    @Nullable
    /* renamed from: d */
    String mo32166d();

    @Nullable
    /* renamed from: f */
    T mo32167f();
}
