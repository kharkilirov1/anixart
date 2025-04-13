package moxy.compiler.presenterbinder;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;
import moxy.presenter.ProvidePresenter;
import org.jetbrains.annotations.Nullable;

/* compiled from: InjectPresenterProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
final /* synthetic */ class InjectPresenterProcessor$collectPresenterProviders$2$tag$1 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new InjectPresenterProcessor$collectPresenterProviders$2$tag$1();

    public InjectPresenterProcessor$collectPresenterProviders$2$tag$1() {
        super(ProvidePresenter.class, "tag", "tag()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    @Nullable
    public Object get(@Nullable Object obj) {
        return ((ProvidePresenter) obj).tag();
    }
}
