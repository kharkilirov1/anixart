package moxy.compiler.presenterbinder;

import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.KProperty1;
import moxy.presenter.ProvidePresenter;
import org.jetbrains.annotations.Nullable;

/* compiled from: InjectPresenterProcessor.kt */
@Metadata(m31882bv = {1, 0, 3}, m31885k = 3, m31886mv = {1, 4, 0})
/* renamed from: moxy.compiler.presenterbinder.InjectPresenterProcessor$collectPresenterProviders$2$presenterId$1 */
/* loaded from: classes3.dex */
final /* synthetic */ class C6864x18097eb5 extends PropertyReference1Impl {
    public static final KProperty1 INSTANCE = new C6864x18097eb5();

    public C6864x18097eb5() {
        super(ProvidePresenter.class, "presenterId", "presenterId()Ljava/lang/String;", 0);
    }

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    @Nullable
    public Object get(@Nullable Object obj) {
        return ((ProvidePresenter) obj).presenterId();
    }
}
