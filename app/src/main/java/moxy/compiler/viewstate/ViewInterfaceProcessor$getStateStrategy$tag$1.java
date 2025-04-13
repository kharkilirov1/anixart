package moxy.compiler.viewstate;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;
import moxy.viewstate.strategy.StateStrategyType;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewInterfaceProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final /* synthetic */ class ViewInterfaceProcessor$getStateStrategy$tag$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new ViewInterfaceProcessor$getStateStrategy$tag$1();

    public ViewInterfaceProcessor$getStateStrategy$tag$1() {
        super(StateStrategyType.class, "tag", "tag()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    @Nullable
    public Object get(@Nullable Object obj) {
        return ((StateStrategyType) obj).tag();
    }
}
