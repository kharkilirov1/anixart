package com.swiftsoft.anixartd.presentation.main.episodes.torlook;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Torlook;
import com.swiftsoft.anixartd.network.response.TorlookPageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.episodes.torlook.TorlookUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.torlook.TorlookUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.episodes.C2569c;
import com.swiftsoft.anixartd.presentation.main.episodes.CallableC2571e;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableDefer;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: TorlookPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/episodes/torlook/TorlookPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/episodes/torlook/TorlookView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class TorlookPresenter extends MvpPresenter<TorlookView> {

    /* renamed from: a */
    @NotNull
    public Prefs f26350a;

    /* renamed from: b */
    @NotNull
    public Listener f26351b;

    /* renamed from: c */
    @NotNull
    public TorlookUiLogic f26352c;

    /* renamed from: d */
    @NotNull
    public TorlookUiController f26353d;

    /* compiled from: TorlookPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/episodes/torlook/TorlookPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/episodes/torlook/TorlookUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends TorlookUiController.Listener {
    }

    @Inject
    public TorlookPresenter(@NotNull Prefs prefs) {
        Intrinsics.m32179h(prefs, "prefs");
        this.f26350a = prefs;
        this.f26351b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.torlook.TorlookModel.Listener
            /* renamed from: N0 */
            public void mo14621N0(@NotNull String link) {
                Intrinsics.m32179h(link, "link");
                TorlookPresenter.this.getViewState().mo14623N0(link);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                TorlookPresenter torlookPresenter = TorlookPresenter.this;
                TorlookUiController torlookUiController = torlookPresenter.f26353d;
                List<Torlook> list = torlookPresenter.f26352c.f29067h;
                String m14619a = torlookPresenter.m14619a();
                Boolean bool = Boolean.FALSE;
                torlookUiController.setData(list, m14619a, "", bool, bool, this);
                TorlookPresenter torlookPresenter2 = TorlookPresenter.this;
                torlookPresenter2.m14620b(torlookPresenter2.f26353d.isEmpty(), false);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.episodes.torlook.TorlookModel.Listener
            /* renamed from: n0 */
            public void mo14622n0(@NotNull String magnetLink) {
                Intrinsics.m32179h(magnetLink, "magnetLink");
                final TorlookPresenter torlookPresenter = TorlookPresenter.this;
                Objects.requireNonNull(torlookPresenter);
                new ObservableDefer(new CallableC2571e(magnetLink, 2)).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2569c(new Function1<String, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter$onParseMagnetLink$2
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(String str) {
                        String response = str;
                        Intrinsics.m32178g(response, "response");
                        if (response.length() > 0) {
                            TorlookPresenter.this.getViewState().mo14630n0(response);
                        } else {
                            TorlookPresenter.this.getViewState().mo14631t1();
                        }
                        return Unit.f63088a;
                    }
                }, 21), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter$onParseMagnetLink$3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Unit invoke(Throwable th) {
                        th.printStackTrace();
                        TorlookPresenter.this.getViewState().mo14631t1();
                        return Unit.f63088a;
                    }
                }, 22), Functions.f59621b, Functions.f59622c);
            }
        };
        this.f26352c = new TorlookUiLogic();
        this.f26353d = new TorlookUiController();
    }

    /* renamed from: a */
    public final String m14619a() {
        return StringsKt.m33914n0(this.f26352c.f29061b + ' ' + this.f26352c.f29062c).toString();
    }

    /* renamed from: b */
    public final void m14620b(final boolean z, final boolean z2) {
        new ObservableDefer(new CallableC2572a(this, 0)).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter$onLoad$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14625b();
                }
                if (z2) {
                    this.getViewState().mo14627d();
                }
                return Unit.f63088a;
            }
        }, 18)).m31365g(new C2553a(z, this, z2, 6)).m31370l(new C2569c(new Function1<TorlookPageableResponse<Torlook>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter$onLoad$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(TorlookPageableResponse<Torlook> torlookPageableResponse) {
                TorlookPageableResponse<Torlook> torlookPageableResponse2 = torlookPageableResponse;
                if (torlookPageableResponse2.isSuccess()) {
                    TorlookUiLogic torlookUiLogic = TorlookPresenter.this.f26352c;
                    List<Torlook> torlookItems = torlookPageableResponse2.getContent();
                    torlookPageableResponse2.getTotalCount();
                    String resultDate = torlookPageableResponse2.getResultDate();
                    boolean needForce = torlookPageableResponse2.getNeedForce();
                    Objects.requireNonNull(torlookUiLogic);
                    Intrinsics.m32179h(torlookItems, "torlookItems");
                    Intrinsics.m32179h(resultDate, "resultDate");
                    boolean z3 = torlookUiLogic.f29070k;
                    if (z3) {
                        torlookUiLogic.f29067h.addAll(torlookItems);
                        torlookUiLogic.f29068i = resultDate;
                        torlookUiLogic.f29069j = needForce;
                    } else {
                        if (z3) {
                            torlookUiLogic.f29067h.clear();
                        }
                        torlookUiLogic.f29067h.addAll(torlookItems);
                        torlookUiLogic.f29068i = resultDate;
                        torlookUiLogic.f29069j = needForce;
                        torlookUiLogic.f29070k = true;
                    }
                    TorlookPresenter torlookPresenter = TorlookPresenter.this;
                    TorlookUiController torlookUiController = torlookPresenter.f26353d;
                    List<Torlook> list = torlookPresenter.f26352c.f29067h;
                    String m14619a = torlookPresenter.m14619a();
                    TorlookUiLogic torlookUiLogic2 = TorlookPresenter.this.f26352c;
                    torlookUiController.setData(list, m14619a, torlookUiLogic2.f29068i, Boolean.valueOf(torlookUiLogic2.f29069j), Boolean.FALSE, TorlookPresenter.this.f26351b);
                }
                return Unit.f63088a;
            }
        }, 19), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookPresenter$onLoad$5
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                TorlookPresenter torlookPresenter = TorlookPresenter.this;
                torlookPresenter.f26353d.setData(torlookPresenter.f26352c.f29067h, torlookPresenter.m14619a(), "", Boolean.FALSE, Boolean.TRUE, TorlookPresenter.this.f26351b);
                return Unit.f63088a;
            }
        }, 20), Functions.f59621b, Functions.f59622c);
    }
}
