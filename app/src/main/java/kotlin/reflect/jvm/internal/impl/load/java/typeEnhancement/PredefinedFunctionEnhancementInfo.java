package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.EmptyList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: predefinedEnhancementInfo.kt */
/* loaded from: classes3.dex */
public final class PredefinedFunctionEnhancementInfo {

    /* renamed from: a */
    @Nullable
    public final TypeEnhancementInfo f64700a;

    /* renamed from: b */
    @NotNull
    public final List<TypeEnhancementInfo> f64701b;

    public PredefinedFunctionEnhancementInfo(@Nullable TypeEnhancementInfo typeEnhancementInfo, @NotNull List<TypeEnhancementInfo> list) {
        this.f64700a = typeEnhancementInfo;
        this.f64701b = list;
    }

    public PredefinedFunctionEnhancementInfo() {
        EmptyList emptyList = EmptyList.f63144b;
        this.f64700a = null;
        this.f64701b = emptyList;
    }
}
