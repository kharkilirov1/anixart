package com.swiftsoft.anixartd.presentation.main.search;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Related;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.Search;
import com.swiftsoft.anixartd.p015ui.controller.main.search.SearchUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.search.SearchUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.video.C2619b;
import com.swiftsoft.anixartd.repository.SearchRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import io.reactivex.Scheduler;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.operators.observable.ObservableInterval;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SearchPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/search/SearchPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/search/SearchView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SearchPresenter extends MvpPresenter<SearchView> {

    /* renamed from: a */
    @NotNull
    public SearchRepository f27205a;

    /* renamed from: b */
    @NotNull
    public Prefs f27206b;

    /* renamed from: c */
    @NotNull
    public SearchUiLogic f27207c;

    /* renamed from: d */
    @NotNull
    public SearchUiController f27208d;

    /* renamed from: e */
    @NotNull
    public Listener f27209e;

    /* compiled from: SearchPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/search/SearchPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/search/SearchUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends SearchUiController.Listener {
    }

    @Inject
    public SearchPresenter(@NotNull SearchRepository searchRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(searchRepository, "searchRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27205a = searchRepository;
        this.f27206b = prefs;
        this.f27207c = new SearchUiLogic();
        this.f27208d = new SearchUiController();
        this.f27209e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.search.SearchPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.search.SearchRelatedModel.Listener
            /* renamed from: a */
            public void mo15218a(long j2, @NotNull String nameRu, @Nullable String str, @NotNull String image) {
                Intrinsics.m32179h(nameRu, "nameRu");
                Intrinsics.m32179h(image, "image");
                SearchPresenter.this.getViewState().mo15223Q2(j2, nameRu, str, image);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.search.SearchModel.Listener
            /* renamed from: b */
            public void mo15219b(long j2) {
                Object obj;
                Iterator<T> it = SearchPresenter.this.f27207c.f29350k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Search) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Search search = (Search) obj;
                if (search != null) {
                    SearchPresenter.this.getViewState().mo15221C2(search.getQuery());
                    SearchPresenter.this.f27207c.m15705a();
                    SearchPresenter.m15210g(SearchPresenter.this, false, false, 2);
                    SearchPresenter.this.f27207c.m15709e(search.getQuery());
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.DescModel.Listener
            /* renamed from: c */
            public void mo14643c() {
                SearchPresenter searchPresenter = SearchPresenter.this;
                SearchRepository searchRepository2 = searchPresenter.f27205a;
                String m15708d = searchPresenter.f27207c.m15708d();
                Objects.requireNonNull(searchRepository2);
                searchRepository2.f27395c.deleteAll(m15708d);
                SearchPresenter.this.f27207c.f29350k.clear();
                SearchPresenter.this.m15212b();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionModel.Listener
            /* renamed from: d0 */
            public void mo14363d0(long j2) {
                Object obj;
                Iterator<T> it = SearchPresenter.this.f27207c.f29352m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Collection) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Collection collection = (Collection) obj;
                if (collection != null) {
                    SearchPresenter.this.getViewState().mo15231v(collection);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.ProfileModel.Listener
            /* renamed from: f */
            public void mo15220f(long j2) {
                Object obj;
                Iterator<T> it = SearchPresenter.this.f27207c.f29353n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((Profile) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                Profile profile = (Profile) obj;
                if (profile != null) {
                    SearchPresenter.this.getViewState().mo15230j3(profile);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = SearchPresenter.this.f27207c.f29351l.iterator();
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
                    SearchPresenter.this.getViewState().mo15229i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = SearchPresenter.this.f27207c.f29351l.iterator();
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

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00aa, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_PLANS") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e2, code lost:
    
        r6.m15216f(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_DROPPED") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bc, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_HOLD_ON") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c5, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_HISTORY") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_COMPLETED") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d7, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_WATCHING") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        if (r9.equals("INNER_TAB_BOOKMARKS_FAVORITES") != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0111, code lost:
    
        if (r9.equals("TAB_COLLECTIONS_PROFILE") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a5, code lost:
    
        r6.m15213c(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011b, code lost:
    
        if (r9.equals("TAB_HOME") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0199, code lost:
    
        r6.m15216f(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0125, code lost:
    
        if (r9.equals("SECTION_MY_COLLECTIONS") != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0197, code lost:
    
        if (r9.equals("TAB_DISCOVER") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a3, code lost:
    
        if (r9.equals("SECTION_COLLECTIONS") != false) goto L64;
     */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m15210g(final com.swiftsoft.anixartd.presentation.main.search.SearchPresenter r6, final boolean r7, final boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.search.SearchPresenter.m15210g(com.swiftsoft.anixartd.presentation.main.search.SearchPresenter, boolean, boolean, int):void");
    }

    /* renamed from: a */
    public final void m15211a() {
        this.f27207c.m15705a();
        m15212b();
    }

    /* renamed from: b */
    public final void m15212b() {
        SearchUiController searchUiController = this.f27208d;
        Integer valueOf = Integer.valueOf(this.f27206b.m14081x());
        Boolean valueOf2 = Boolean.valueOf(this.f27206b.m14047C());
        SearchUiLogic searchUiLogic = this.f27207c;
        String str = searchUiLogic.f29349j;
        List<Search> list = searchUiLogic.f29350k;
        List<Release> list2 = searchUiLogic.f29351l;
        List<Collection> list3 = searchUiLogic.f29352m;
        List<Profile> list4 = searchUiLogic.f29353n;
        Related related = searchUiLogic.f29354o;
        if (related == null) {
            related = new Related();
        }
        Related related2 = related;
        Integer valueOf3 = Integer.valueOf(this.f27207c.f29341b);
        SearchUiLogic searchUiLogic2 = this.f27207c;
        searchUiController.setData(valueOf, valueOf2, str, list, list2, list3, list4, related2, valueOf3, searchUiLogic2.f29342c, searchUiLogic2.f29343d, Boolean.valueOf(searchUiLogic2.f29359t), this.f27209e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        if (r0.equals("TAB_COLLECTIONS_PROFILE") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008c, code lost:
    
        r0 = r13.f27205a;
        r1 = r13.f27207c;
        r8 = r1.f29348i;
        r9 = r1.m15707c();
        java.util.Objects.requireNonNull(r0);
        r0 = r0.f27393a.profileCollectionSearch(r6, r8, r9, r10, r0.f27394b.m14080w()).m31372n(io.reactivex.schedulers.Schedulers.f62901c).m31369k(io.reactivex.android.schedulers.AndroidSchedulers.m31390a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r0.equals("SECTION_MY_COLLECTIONS") != false) goto L24;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15213c(final boolean r14, final boolean r15) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.search.SearchPresenter.m15213c(boolean, boolean):void");
    }

    /* renamed from: d */
    public final void m15214d(@NotNull final Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        if (this.f27207c.f28956a) {
            if (collection.getDelete()) {
                CollectionsKt.m32005R(this.f27207c.f29352m, new Function1<Collection, Boolean>() { // from class: com.swiftsoft.anixartd.presentation.main.search.SearchPresenter$onFetchCollection$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Boolean invoke(Collection collection2) {
                        Collection it = collection2;
                        Intrinsics.m32179h(it, "it");
                        return Boolean.valueOf(it.getId() == Collection.this.getId());
                    }
                });
            } else {
                SearchUiLogic searchUiLogic = this.f27207c;
                Objects.requireNonNull(searchUiLogic);
                Iterator<Collection> it = searchUiLogic.f29352m.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else {
                        if (it.next().getId() == collection.getId()) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (i2 >= 0) {
                    searchUiLogic.f29352m.set(i2, collection);
                }
            }
            SearchUiController searchUiController = this.f27208d;
            Integer valueOf = Integer.valueOf(this.f27206b.m14081x());
            Boolean valueOf2 = Boolean.valueOf(this.f27206b.m14047C());
            SearchUiLogic searchUiLogic2 = this.f27207c;
            String str = searchUiLogic2.f29349j;
            List<Search> list = searchUiLogic2.f29350k;
            List<Release> list2 = searchUiLogic2.f29351l;
            List<Collection> list3 = searchUiLogic2.f29352m;
            List<Profile> list4 = searchUiLogic2.f29353n;
            Related related = searchUiLogic2.f29354o;
            Integer valueOf3 = Integer.valueOf(searchUiLogic2.f29341b);
            SearchUiLogic searchUiLogic3 = this.f27207c;
            searchUiController.setData(valueOf, valueOf2, str, list, list2, list3, list4, related, valueOf3, searchUiLogic3.f29342c, searchUiLogic3.f29343d, Boolean.valueOf(searchUiLogic3.f29359t), this.f27209e);
        }
    }

    /* renamed from: e */
    public final void m15215e(int i2, @NotNull String str, @NotNull String str2, @Nullable Long l2, @Nullable Long l3, boolean z) {
        SearchUiLogic searchUiLogic = this.f27207c;
        Objects.requireNonNull(searchUiLogic);
        searchUiLogic.f29341b = i2;
        searchUiLogic.f29342c = str;
        searchUiLogic.f29343d = str2;
        searchUiLogic.f29344e = l2;
        searchUiLogic.f29345f = l3;
        searchUiLogic.f28956a = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler scheduler = Schedulers.f62900b;
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(scheduler, "scheduler is null");
        new ObservableInterval(Math.max(0L, 1L), Math.max(0L, 1L), timeUnit, scheduler).m31370l(new C2619b(new Function1<Long, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.search.SearchPresenter$onLogic$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Long l4) {
                SearchUiLogic searchUiLogic2 = SearchPresenter.this.f27207c;
                if (!Intrinsics.m32174c(searchUiLogic2.f29346g, searchUiLogic2.f29347h)) {
                    SearchPresenter.this.f27207c.m15705a();
                    SearchPresenter.m15210g(SearchPresenter.this, false, false, 2);
                    SearchUiLogic searchUiLogic3 = SearchPresenter.this.f27207c;
                    searchUiLogic3.m15709e(searchUiLogic3.f29346g);
                }
                return Unit.f63088a;
            }
        }, 19), Functions.f59623d, Functions.f59621b, Functions.f59622c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_PLANS") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0089, code lost:
    
        r0 = r9.f27205a;
        r1 = r9.f27207c;
        r7 = r1.f29348i;
        r1 = r1.f29343d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0095, code lost:
    
        switch(r1.hashCode()) {
            case -1817489912: goto L45;
            case -1630519434: goto L42;
            case 45737322: goto L39;
            case 879690667: goto L36;
            case 2121300245: goto L33;
            default: goto L49;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        if (r1.equals("INNER_TAB_BOOKMARKS_PLANS") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c0, code lost:
    
        r2 = r9.f27207c.m15707c();
        java.util.Objects.requireNonNull(r0);
        r0 = r0.f27393a.profileListSearch(r1, r7, r2, r0.f27394b.m14080w()).m31372n(io.reactivex.schedulers.Schedulers.f62901c).m31369k(io.reactivex.android.schedulers.AndroidSchedulers.m31390a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        if (r1.equals("INNER_TAB_BOOKMARKS_DROPPED") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r1 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r1.equals("INNER_TAB_BOOKMARKS_HOLD_ON") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        r1 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r1.equals("INNER_TAB_BOOKMARKS_COMPLETED") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        r1 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
    
        if (r1.equals("INNER_TAB_BOOKMARKS_WATCHING") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ec, code lost:
    
        throw new java.lang.Exception("Invalid inner position");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0041, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_DROPPED") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_HOLD_ON") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0080, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_COMPLETED") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0087, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_WATCHING") != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013a, code lost:
    
        if (r0.equals("TAB_HOME") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0145, code lost:
    
        r0 = r9.f27205a;
        r1 = r9.f27207c;
        r3 = r1.f29348i;
        r4 = r1.m15707c();
        java.util.Objects.requireNonNull(r0);
        r0 = com.swiftsoft.anixartd.network.api.SearchApi.DefaultImpls.releaseSearch$default(r0.f27393a, r3, r4, r0.f27394b.m14080w(), null, 8, null).m31372n(io.reactivex.schedulers.Schedulers.f62901c).m31369k(io.reactivex.android.schedulers.AndroidSchedulers.m31390a());
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0143, code lost:
    
        if (r0.equals("TAB_DISCOVER") != false) goto L61;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m15216f(final boolean r10, final boolean r11) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.search.SearchPresenter.m15216f(boolean, boolean):void");
    }

    /* renamed from: h */
    public final void m15217h() {
        SearchUiLogic searchUiLogic = this.f27207c;
        if (searchUiLogic.f28956a) {
            searchUiLogic.m15705a();
            if (this.f27208d.isEmpty()) {
                m15210g(this, false, false, 3);
            } else {
                m15210g(this, false, false, 2);
            }
        }
    }
}
