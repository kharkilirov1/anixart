package com.swiftsoft.anixartd.presentation.main.filtered;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.filtered.FilteredUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.filtered.FilteredUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.episodes.C2569c;
import com.swiftsoft.anixartd.repository.FilterRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnFailed;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.Iterator;
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

/* compiled from: FilteredPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/filtered/FilteredPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/filtered/FilteredView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class FilteredPresenter extends MvpPresenter<FilteredView> {

    /* renamed from: a */
    @NotNull
    public FilterRepository f26388a;

    /* renamed from: b */
    @NotNull
    public Prefs f26389b;

    /* renamed from: c */
    @NotNull
    public FilteredUiLogic f26390c;

    /* renamed from: d */
    @NotNull
    public FilteredUiController f26391d;

    /* renamed from: e */
    @NotNull
    public Listener f26392e;

    /* compiled from: FilteredPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/filtered/FilteredPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/filtered/FilteredUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends FilteredUiController.Listener {
    }

    @Inject
    public FilteredPresenter(@NotNull FilterRepository filterRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(filterRepository, "filterRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26388a = filterRepository;
        this.f26389b = prefs;
        this.f26390c = new FilteredUiLogic();
        this.f26391d = new FilteredUiController();
        this.f26392e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.DescModel.Listener
            /* renamed from: c */
            public void mo14643c() {
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = FilteredPresenter.this.f26390c.f29095r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    FilteredPresenter.this.getViewState().mo14647i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = FilteredPresenter.this.f26390c.f29095r.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Release) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Release release = (Release) obj;
                if (release != null) {
                    EventBusKt.m16327a(new OnBottomSheet(release));
                }
            }
        };
    }

    /* renamed from: a */
    public final void m14642a(final boolean z) {
        FilterRepository filterRepository = this.f26388a;
        FilteredUiLogic filteredUiLogic = this.f26390c;
        int i2 = filteredUiLogic.f29094q;
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setCategoryId(filteredUiLogic.f29079b);
        filterRequest.setStatusId(filteredUiLogic.f29080c);
        filterRequest.setStartYear(filteredUiLogic.f29081d);
        filterRequest.setEndYear(filteredUiLogic.f29082e);
        if (filteredUiLogic.f29083f.length() > 0) {
            filterRequest.setStudio(filteredUiLogic.f29083f);
        }
        Integer num = filteredUiLogic.f29084g;
        if (num != null && num.intValue() == 1) {
            filterRequest.setEpisodesFrom(r6);
            filterRequest.setEpisodesTo(12);
        } else if (num != null && num.intValue() == 2) {
            filterRequest.setEpisodesFrom(13);
            filterRequest.setEpisodesTo(25);
        } else if (num != null && num.intValue() == 3) {
            filterRequest.setEpisodesFrom(26);
            filterRequest.setEpisodesTo(100);
        } else if (num != null && num.intValue() == 4) {
            filterRequest.setEpisodesFrom(100);
        }
        Integer num2 = filteredUiLogic.f29085h;
        filterRequest.setSort(num2 != null ? num2 : 0);
        if (filteredUiLogic.f29086i.length() > 0) {
            filterRequest.setCountry(filteredUiLogic.f29086i);
        }
        filterRequest.setSeason(filteredUiLogic.f29087j);
        Integer num3 = filteredUiLogic.f29088k;
        if (num3 != null && num3.intValue() == 1) {
            filterRequest.setEpisodeDurationFrom(1);
            filterRequest.setEpisodeDurationTo(10);
        } else if (num3 != null && num3.intValue() == 2) {
            filterRequest.setEpisodeDurationFrom(11);
            filterRequest.setEpisodeDurationTo(30);
        } else if (num3 != null && num3.intValue() == 3) {
            filterRequest.setEpisodeDurationFrom(31);
        }
        filterRequest.getGenres().addAll(filteredUiLogic.f29089l);
        filterRequest.getProfileListExclusions().addAll(filteredUiLogic.f29090m);
        filterRequest.getTypes().addAll(filteredUiLogic.f29091n);
        filterRequest.getAgeRatings().addAll(filteredUiLogic.f29092o);
        filterRequest.setGenresExcludeModeEnabled(filteredUiLogic.f29093p);
        FilterRepository.m15295a(filterRepository, i2, filterRequest, null, 4).m31367i(new C2569c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter$onFiltered$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14645b();
                }
                return Unit.f63088a;
            }
        }, 29)).m31368j(new C2549a(this, 8)).m31370l(new C2573a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter$onFiltered$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                FilteredUiLogic filteredUiLogic2 = FilteredPresenter.this.f26390c;
                List<Release> releases = pageableResponse2.getContent();
                Objects.requireNonNull(filteredUiLogic2);
                Intrinsics.m32179h(releases, "releases");
                boolean z2 = filteredUiLogic2.f29096s;
                if (z2) {
                    filteredUiLogic2.f29095r.addAll(releases);
                } else {
                    if (z2) {
                        filteredUiLogic2.f29094q = 0;
                        filteredUiLogic2.f29095r.clear();
                        filteredUiLogic2.f29096s = false;
                    }
                    filteredUiLogic2.f29095r.addAll(releases);
                    filteredUiLogic2.f29096s = true;
                }
                FilteredPresenter filteredPresenter = FilteredPresenter.this;
                filteredPresenter.f26391d.setData(Integer.valueOf(filteredPresenter.f26389b.m14081x()), Boolean.valueOf(FilteredPresenter.this.f26389b.m14047C()), FilteredPresenter.this.f26390c.f29095r, Boolean.valueOf(pageableResponse2.getContent().size() >= 25), FilteredPresenter.this.f26392e);
                return Unit.f63088a;
            }
        }, 0), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.filtered.FilteredPresenter$onFiltered$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (FilteredPresenter.this.f26391d.isEmpty()) {
                    FilteredPresenter.this.getViewState().mo14646c();
                } else {
                    EventBusKt.m16327a(new OnFailed());
                }
                return Unit.f63088a;
            }
        }, 1), Functions.f59621b, Functions.f59622c);
    }
}
