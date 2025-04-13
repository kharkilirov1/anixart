package moxy.compiler.presenterbinder;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;
import moxy.presenter.ProvidePresenterTag;
import org.jetbrains.annotations.Nullable;

/* compiled from: InjectPresenterProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final /* synthetic */ class InjectPresenterProcessor$collectTagProviders$2$presenterId$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new InjectPresenterProcessor$collectTagProviders$2$presenterId$1();

    public InjectPresenterProcessor$collectTagProviders$2$presenterId$1() {
        super(ProvidePresenterTag.class, "presenterId", "presenterId()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    @Nullable
    public Object get(@Nullable Object obj) {
        return ((ProvidePresenterTag) obj).presenterId();
    }
}
