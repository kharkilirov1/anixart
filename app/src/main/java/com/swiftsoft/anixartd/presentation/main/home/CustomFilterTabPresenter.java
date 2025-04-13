package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.CustomFilter;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.filter.FilterRequest;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.home.CustomFilterTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.home.CustomFilterTabUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.filtered.C2573a;
import com.swiftsoft.anixartd.repository.FilterRepository;
import com.swiftsoft.anixartd.repository.HomeRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.yandex.div2.C3033a;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: CustomFilterTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/home/CustomFilterTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/home/CustomFilterTabView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CustomFilterTabPresenter extends MvpPresenter<CustomFilterTabView> {

    /* renamed from: a */
    @NotNull
    public HomeRepository f26408a;

    /* renamed from: b */
    @NotNull
    public FilterRepository f26409b;

    /* renamed from: c */
    @NotNull
    public Prefs f26410c;

    /* renamed from: d */
    @NotNull
    public CustomFilterTabUiLogic f26411d;

    /* renamed from: e */
    @NotNull
    public CustomFilterTabUiController f26412e;

    /* renamed from: f */
    @NotNull
    public Listener f26413f;

    /* compiled from: CustomFilterTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/home/CustomFilterTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/home/CustomFilterTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CustomFilterTabUiController.Listener {
    }

    @Inject
    public CustomFilterTabPresenter(@NotNull HomeRepository homeRepository, @NotNull FilterRepository filterRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(homeRepository, "homeRepository");
        Intrinsics.m32179h(filterRepository, "filterRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26408a = homeRepository;
        this.f26409b = filterRepository;
        this.f26410c = prefs;
        this.f26411d = new CustomFilterTabUiLogic();
        this.f26412e = new CustomFilterTabUiController();
        this.f26413f = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.home.CustomFilterEmptyModel.Listener
            /* renamed from: J0 */
            public void mo14656J0() {
                CustomFilterTabPresenter.this.getViewState().mo14664J0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.extra.LiteVersionModel.Listener
            /* renamed from: T */
            public void mo14657T() {
                CustomFilterTabPresenter.this.getViewState().mo14665T();
            }

            @Override // com.swiftsoft.anixartd.ui.model.extra.UpdateAvailableModel.Listener
            /* renamed from: V */
            public void mo14658V() {
                CustomFilterTabPresenter.this.getViewState().mo14666V();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.home.CustomFilterHintBigModel.Listener
            /* renamed from: a */
            public void mo14659a() {
                C3033a.m17749k(CustomFilterTabPresenter.this.f26410c.f25344a, "CUSTOM_TAB_HINT", false);
                CustomFilterTabPresenter.this.m14653a(false, false);
            }

            @Override // com.swiftsoft.anixartd.ui.model.extra.ImpMessageModel.Listener
            /* renamed from: a0 */
            public void mo14660a0(@NotNull String impMessageLink) {
                Intrinsics.m32179h(impMessageLink, "impMessageLink");
                CustomFilterTabPresenter.this.getViewState().mo14668a0(impMessageLink);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                CustomFilterTabPresenter.this.m14653a(true, false);
                CustomFilterTabPresenter.m14652d(CustomFilterTabPresenter.this, false, false, 3);
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = CustomFilterTabPresenter.this.f26411d.f29101d.iterator();
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
                    CustomFilterTabPresenter.this.getViewState().mo14673i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = CustomFilterTabPresenter.this.f26411d.f29101d.iterator();
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

            @Override // com.swiftsoft.anixartd.ui.model.main.home.CustomFilterHintBigModel.Listener
            /* renamed from: l0 */
            public void mo14661l0() {
                CustomFilterTabPresenter.this.getViewState().mo14674l0();
            }
        };
    }

    /* renamed from: d */
    public static void m14652d(CustomFilterTabPresenter customFilterTabPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = customFilterTabPresenter.f26412e.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        customFilterTabPresenter.m14655c(z, z2);
    }

    /* renamed from: a */
    public final void m14653a(boolean z, boolean z2) {
        CustomFilterTabUiController customFilterTabUiController = this.f26412e;
        Integer valueOf = Integer.valueOf(this.f26410c.m14081x());
        Objects.requireNonNull(this.f26411d);
        customFilterTabUiController.setData(valueOf, 0L, this.f26411d.f29101d, Boolean.valueOf(z), Boolean.valueOf(z2), Integer.valueOf(this.f26410c.m14068k()), Boolean.valueOf(this.f26410c.m14063f()), this.f26410c.m14065h(), this.f26410c.m14062e(), this.f26410c.m14066i(), this.f26410c.m14064g(), Boolean.valueOf(this.f26410c.f25344a.getBoolean("CUSTOM_TAB_HINT", true)), this.f26413f);
    }

    /* renamed from: b */
    public final void m14654b() {
        CustomFilterTabUiLogic customFilterTabUiLogic = this.f26411d;
        if (customFilterTabUiLogic.f28956a) {
            customFilterTabUiLogic.f29099b = 0;
            customFilterTabUiLogic.f29101d.clear();
            customFilterTabUiLogic.f29102e = false;
            m14655c(false, true);
        }
    }

    /* renamed from: c */
    public final void m14655c(final boolean z, final boolean z2) {
        FilterRequest filterRequest;
        FilterRepository filterRepository = this.f26409b;
        CustomFilterTabUiLogic customFilterTabUiLogic = this.f26411d;
        int i2 = customFilterTabUiLogic.f29099b;
        CustomFilter customFilter = customFilterTabUiLogic.f29100c;
        if (customFilter == null) {
            filterRequest = new FilterRequest();
        } else {
            FilterRequest filterRequest2 = new FilterRequest();
            filterRequest2.setCategoryId(customFilter.getSelectedCategoryId());
            filterRequest2.setStatusId(customFilter.getSelectedStatusId());
            filterRequest2.setStartYear(customFilter.getSelectedStartYear());
            filterRequest2.setEndYear(customFilter.getSelectedEndYear());
            if (customFilter.getSelectedStudio().length() > 0) {
                filterRequest2.setStudio(customFilter.getSelectedStudio());
            }
            Integer selectedEpisodes = customFilter.getSelectedEpisodes();
            if (selectedEpisodes != null && selectedEpisodes.intValue() == 1) {
                filterRequest2.setEpisodesFrom(0);
                filterRequest2.setEpisodesTo(12);
            } else if (selectedEpisodes != null && selectedEpisodes.intValue() == 2) {
                filterRequest2.setEpisodesFrom(13);
                filterRequest2.setEpisodesTo(25);
            } else if (selectedEpisodes != null && selectedEpisodes.intValue() == 3) {
                filterRequest2.setEpisodesFrom(26);
                filterRequest2.setEpisodesTo(100);
            } else if (selectedEpisodes != null && selectedEpisodes.intValue() == 4) {
                filterRequest2.setEpisodesFrom(100);
            }
            int selectedSort = customFilter.getSelectedSort();
            if (selectedSort == null) {
                selectedSort = 0;
            }
            filterRequest2.setSort(selectedSort);
            if (customFilter.getSelectedCountry().length() > 0) {
                filterRequest2.setCountry(customFilter.getSelectedCountry());
            }
            filterRequest2.setSeason(customFilter.getSelectedSeason());
            Integer selectedEpisodeDuration = customFilter.getSelectedEpisodeDuration();
            if (selectedEpisodeDuration != null && selectedEpisodeDuration.intValue() == 1) {
                filterRequest2.setEpisodeDurationFrom(1);
                filterRequest2.setEpisodeDurationTo(10);
            } else if (selectedEpisodeDuration != null && selectedEpisodeDuration.intValue() == 2) {
                filterRequest2.setEpisodeDurationFrom(11);
                filterRequest2.setEpisodeDurationTo(30);
            } else if (selectedEpisodeDuration != null && selectedEpisodeDuration.intValue() == 3) {
                filterRequest2.setEpisodeDurationFrom(31);
            }
            filterRequest2.getGenres().addAll(customFilter.getSelectedGenres());
            List<Integer> profileListExclusions = filterRequest2.getProfileListExclusions();
            List<String> selectedProfileListExclusions = customFilter.getSelectedProfileListExclusions();
            ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(selectedProfileListExclusions, 10));
            Iterator<T> it = selectedProfileListExclusions.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            profileListExclusions.addAll(arrayList);
            List<Long> types = filterRequest2.getTypes();
            List<String> selectedTypes = customFilter.getSelectedTypes();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.m32032m(selectedTypes, 10));
            Iterator<T> it2 = selectedTypes.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(Long.parseLong((String) it2.next())));
            }
            types.addAll(arrayList2);
            List<Integer> ageRatings = filterRequest2.getAgeRatings();
            List<String> selectedAgeRatings = customFilter.getSelectedAgeRatings();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.m32032m(selectedAgeRatings, 10));
            Iterator<T> it3 = selectedAgeRatings.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Integer.valueOf(Integer.parseInt((String) it3.next())));
            }
            ageRatings.addAll(arrayList3);
            filterRequest2.setGenresExcludeModeEnabled(customFilter.getIsGenresExcludeModeEnabled());
            filterRequest = filterRequest2;
        }
        FilterRepository.m15295a(filterRepository, i2, filterRequest, null, 4).m31367i(new C2573a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter$onReleases$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14669b();
                }
                if (z2) {
                    this.getViewState().mo14671d();
                }
                return Unit.f63088a;
            }
        }, 2)).m31368j(new C2549a(this, 9)).m31370l(new C2573a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter$onReleases$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                CustomFilterTabUiLogic customFilterTabUiLogic2 = CustomFilterTabPresenter.this.f26411d;
                List<Release> releases = pageableResponse2.getContent();
                Objects.requireNonNull(customFilterTabUiLogic2);
                Intrinsics.m32179h(releases, "releases");
                boolean z3 = customFilterTabUiLogic2.f29102e;
                if (z3) {
                    customFilterTabUiLogic2.f29101d.addAll(releases);
                } else {
                    if (z3) {
                        customFilterTabUiLogic2.f29101d.clear();
                    }
                    customFilterTabUiLogic2.f29101d.addAll(releases);
                    customFilterTabUiLogic2.f29102e = true;
                }
                CustomFilterTabPresenter.this.m14653a(pageableResponse2.getContent().size() >= 25, false);
                return Unit.f63088a;
            }
        }, 3), new C2573a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabPresenter$onReleases$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (CustomFilterTabPresenter.this.f26412e.isEmpty()) {
                    CustomFilterTabView viewState = CustomFilterTabPresenter.this.getViewState();
                    Intrinsics.m32178g(viewState, "viewState");
                    viewState.mo14670c1(null);
                } else {
                    CustomFilterTabPresenter.this.m14653a(false, true);
                }
                return Unit.f63088a;
            }
        }, 4), Functions.f59621b, Functions.f59622c);
    }
}
