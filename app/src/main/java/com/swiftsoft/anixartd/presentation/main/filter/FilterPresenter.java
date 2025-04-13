package com.swiftsoft.anixartd.presentation.main.filter;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.network.response.common.TypeResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.filter.FilterUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.episodes.C2569c;
import com.swiftsoft.anixartd.repository.HomeRepository;
import com.swiftsoft.anixartd.repository.TypeRepository;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: FilterPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/filter/FilterPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/filter/FilterView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FilterPresenter extends MvpPresenter<FilterView> {

    /* renamed from: a */
    @NotNull
    public HomeRepository f26378a;

    /* renamed from: b */
    @NotNull
    public TypeRepository f26379b;

    /* renamed from: c */
    @NotNull
    public Prefs f26380c;

    /* renamed from: d */
    @NotNull
    public FilterUiLogic f26381d;

    @Inject
    public FilterPresenter(@NotNull HomeRepository homeRepository, @NotNull TypeRepository typeRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(homeRepository, "homeRepository");
        Intrinsics.m32179h(typeRepository, "typeRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26378a = homeRepository;
        this.f26379b = typeRepository;
        this.f26380c = prefs;
        this.f26381d = new FilterUiLogic();
    }

    /* renamed from: a */
    public final void m14638a() {
        this.f26379b.m15316a().m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter$onFilter$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                FilterPresenter.this.getViewState().mo14640b();
                return Unit.f63088a;
            }
        }, 26)).m31368j(new C2549a(this, 7)).m31370l(new C2569c(new Function1<TypeResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter$onFilter$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(TypeResponse typeResponse) {
                List<Type> types = typeResponse.getTypes();
                FilterUiLogic filterUiLogic = FilterPresenter.this.f26381d;
                Objects.requireNonNull(filterUiLogic);
                Intrinsics.m32179h(types, "types");
                if (filterUiLogic.f28956a) {
                    filterUiLogic.f29078b.clear();
                }
                filterUiLogic.f29078b.addAll(types);
                filterUiLogic.f28956a = true;
                FilterPresenter.this.getViewState().mo14641e2();
                return Unit.f63088a;
            }
        }, 27), new C2569c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.filter.FilterPresenter$onFilter$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }
}
