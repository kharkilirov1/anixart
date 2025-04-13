package com.swiftsoft.anixartd.presentation.main.collection;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.CollectionResponse;
import com.swiftsoft.anixartd.network.response.collection.DeleteCollectionResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.bookmarks.C2557b;
import com.swiftsoft.anixartd.repository.AuthRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnAddFavoriteCollection;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import com.swiftsoft.anixartd.utils.OnDeleteFavoriteCollection;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import moxy.InjectViewState;
import moxy.MvpPresenter;
import org.jetbrains.annotations.NotNull;

/* compiled from: CollectionPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/CollectionPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/collection/CollectionView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionPresenter extends MvpPresenter<CollectionView> {

    /* renamed from: a */
    @NotNull
    public CollectionRepository f26069a;

    /* renamed from: b */
    @NotNull
    public AuthRepository f26070b;

    /* renamed from: c */
    @NotNull
    public Prefs f26071c;

    /* renamed from: d */
    @NotNull
    public Listener f26072d;

    /* renamed from: e */
    @NotNull
    public CollectionUiLogic f26073e;

    /* renamed from: f */
    @NotNull
    public CollectionUiController f26074f;

    /* compiled from: CollectionPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/CollectionPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionUiController.Listener {
    }

    @Inject
    public CollectionPresenter(@NotNull CollectionRepository collectionRepository, @NotNull AuthRepository authRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(authRepository, "authRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26069a = collectionRepository;
        this.f26070b = authRepository;
        this.f26071c = prefs;
        this.f26072d = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: D0 */
            public void mo14381D0() {
                CollectionPresenter.this.getViewState().mo14391D0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: E0 */
            public void mo14382E0() {
                CollectionPresenter.this.getViewState().mo14392E0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: Q0 */
            public void mo14383Q0() {
                CollectionPresenter.this.getViewState().mo14394Q0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: W0 */
            public void mo14384W0() {
                if (CollectionPresenter.this.f26071c.m14083z()) {
                    CollectionPresenter.this.getViewState().mo14411m();
                } else {
                    CollectionPresenter.this.getViewState().mo14396W0();
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionCountReleaseModel.Listener
            /* renamed from: Y */
            public void mo14385Y() {
                CollectionPresenter.this.getViewState().mo14397Y();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: a */
            public void mo14386a() {
                if (CollectionPresenter.this.f26071c.m14083z()) {
                    CollectionPresenter.this.getViewState().mo14411m();
                    return;
                }
                Collection m15675b = CollectionPresenter.this.f26073e.m15675b();
                if (m15675b.getIsFavorite()) {
                    EventBusKt.m16327a(new OnDeleteFavoriteCollection(m15675b));
                } else {
                    EventBusKt.m16327a(new OnAddFavoriteCollection(m15675b));
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ErrorModel.Listener
            /* renamed from: c */
            public void mo14387c() {
                CollectionPresenter.this.m14377a(true, false);
                CollectionPresenter collectionPresenter = CollectionPresenter.this;
                if (collectionPresenter.f26073e.f29002l) {
                    collectionPresenter.m14380f();
                } else {
                    CollectionPresenter.m14376d(collectionPresenter, false, false, 3);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = CollectionPresenter.this.f26073e.f29001k.iterator();
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
                    CollectionPresenter.this.getViewState().mo14405i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: i0 */
            public void mo14388i0() {
                CollectionPresenter.this.getViewState().mo14406i0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: j0 */
            public void mo14389j0() {
                CollectionPresenter.this.getViewState().mo14410j0();
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = CollectionPresenter.this.f26073e.f29001k.iterator();
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

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionHeaderModel.Listener
            /* renamed from: p0 */
            public void mo14390p0() {
                CollectionPresenter.this.getViewState().mo14413p0();
            }
        };
        this.f26073e = new CollectionUiLogic();
        this.f26074f = new CollectionUiController();
    }

    /* renamed from: b */
    public static /* synthetic */ void m14375b(CollectionPresenter collectionPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        collectionPresenter.m14377a(z, z2);
    }

    /* renamed from: d */
    public static void m14376d(CollectionPresenter collectionPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = collectionPresenter.f26074f.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        collectionPresenter.m14378c(z, z2);
    }

    /* renamed from: a */
    public final void m14377a(boolean z, boolean z2) {
        Collection m15675b = this.f26073e.m15675b();
        String avatar = this.f26070b.f27327c.getAvatar();
        if (avatar == null) {
            avatar = "https://anixstatic.com/avatars/no_avatar.jpg";
        }
        String str = avatar;
        Profile creator = m15675b.getCreator();
        boolean z3 = false;
        if (creator != null && creator.getId() == this.f26071c.m14061d()) {
            z3 = true;
        }
        boolean z4 = !this.f26073e.f29002l;
        CollectionUiController collectionUiController = this.f26074f;
        Boolean valueOf = Boolean.valueOf(z3);
        CollectionUiLogic collectionUiLogic = this.f26073e;
        collectionUiController.setData(m15675b, str, valueOf, collectionUiLogic.f29001k, Long.valueOf(collectionUiLogic.f28995e), Long.valueOf(this.f26073e.f28996f), Long.valueOf(this.f26073e.f28997g), Long.valueOf(this.f26073e.f28998h), Long.valueOf(this.f26073e.f28999i), Long.valueOf(this.f26073e.f29000j), Boolean.valueOf(z4), Boolean.valueOf(z), Boolean.valueOf(z2), this.f26072d);
    }

    /* renamed from: c */
    public final void m14378c(final boolean z, final boolean z2) {
        Observables.f62894a.m31860a(this.f26069a.m15284a(this.f26073e.f28993c), this.f26069a.m15286c(this.f26073e.f28993c, 0)).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onCollection$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14400b();
                }
                if (z2) {
                    this.getViewState().mo14402d();
                }
                return Unit.f63088a;
            }
        }, 11)).m31368j(new C2553a(z, this, z2, 1)).m31370l(new C2557b(new Function1<Pair<? extends CollectionResponse, ? extends PageableResponse<Release>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onCollection$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends CollectionResponse, ? extends PageableResponse<Release>> pair) {
                Pair<? extends CollectionResponse, ? extends PageableResponse<Release>> pair2 = pair;
                CollectionResponse collectionResponse = (CollectionResponse) pair2.f63055b;
                PageableResponse pageableResponse = (PageableResponse) pair2.f63056c;
                if (collectionResponse.isSuccess()) {
                    Collection collection = collectionResponse.getCollection();
                    if (collection == null) {
                        CollectionPresenter.this.getViewState().mo14401c();
                    } else {
                        CollectionUiLogic collectionUiLogic = CollectionPresenter.this.f26073e;
                        Objects.requireNonNull(collectionUiLogic);
                        collectionUiLogic.f28992b = collection;
                        collectionUiLogic.f28995e = pageableResponse.getTotalCount();
                        collectionUiLogic.f28996f = collectionResponse.getWatchingCount();
                        collectionUiLogic.f28997g = collectionResponse.getPlanCount();
                        collectionUiLogic.f28998h = collectionResponse.getCompletedCount();
                        collectionUiLogic.f28999i = collectionResponse.getHoldOnCount();
                        collectionUiLogic.f29000j = collectionResponse.getDroppedCount();
                        List releases = pageableResponse.getContent();
                        Intrinsics.m32179h(releases, "releases");
                        if (collectionUiLogic.f29002l) {
                            collectionUiLogic.m15674a();
                        }
                        collectionUiLogic.f29001k.addAll(releases);
                        collectionUiLogic.f29002l = true;
                        CollectionPresenter.m14375b(CollectionPresenter.this, pageableResponse.getContent().size() >= 25, false, 2);
                        CollectionPresenter.this.getViewState().mo14398Y3(CollectionPresenter.this.f26073e.m15675b());
                    }
                } else {
                    int code = collectionResponse.getCode();
                    if (code == 2) {
                        CollectionPresenter.this.getViewState().mo14401c();
                    } else if (code == 3) {
                        CollectionPresenter.this.getViewState().mo14408i4();
                    } else if (code == 4) {
                        CollectionPresenter.this.getViewState().mo14414s3();
                    }
                }
                return Unit.f63088a;
            }
        }, 12), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onCollection$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                if (CollectionPresenter.this.f26074f.isEmpty()) {
                    CollectionPresenter.this.getViewState().mo14401c();
                } else {
                    CollectionPresenter.m14375b(CollectionPresenter.this, false, true, 1);
                }
                th2.printStackTrace();
                CollectionPresenter.this.getViewState().mo14401c();
                return Unit.f63088a;
            }
        }, 13), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m14379e() {
        CollectionRepository collectionRepository = this.f26069a;
        collectionRepository.f27337b.delete(this.f26073e.f28993c, collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onDelete$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                CollectionPresenter.this.getViewState().mo14404h();
                return Unit.f63088a;
            }
        }, 8)).m31368j(new C2549a(this, 5)).m31370l(new C2557b(new Function1<DeleteCollectionResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onDelete$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(DeleteCollectionResponse deleteCollectionResponse) {
                if (deleteCollectionResponse.isSuccess()) {
                    CollectionPresenter.this.f26073e.m15675b().setDelete(true);
                    CollectionPresenter.this.getViewState().mo14395T1();
                } else {
                    CollectionPresenter.this.getViewState().mo14407i3();
                }
                return Unit.f63088a;
            }
        }, 9), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onDelete$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CollectionPresenter.this.getViewState().mo14407i3();
                return Unit.f63088a;
            }
        }, 10), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m14380f() {
        CollectionRepository collectionRepository = this.f26069a;
        CollectionUiLogic collectionUiLogic = this.f26073e;
        collectionRepository.m15286c(collectionUiLogic.f28993c, collectionUiLogic.f28994d).m31370l(new C2557b(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onReleases$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                CollectionUiLogic collectionUiLogic2 = CollectionPresenter.this.f26073e;
                collectionUiLogic2.f28995e = pageableResponse2.getTotalCount();
                List<Release> releases = pageableResponse2.getContent();
                Intrinsics.m32179h(releases, "releases");
                boolean z = collectionUiLogic2.f29002l;
                if (z) {
                    collectionUiLogic2.f29001k.addAll(releases);
                } else {
                    if (z) {
                        collectionUiLogic2.m15674a();
                    }
                    collectionUiLogic2.f29001k.addAll(releases);
                    collectionUiLogic2.f29002l = true;
                }
                CollectionPresenter.m14375b(CollectionPresenter.this, !pageableResponse2.getContent().isEmpty(), false, 2);
                return Unit.f63088a;
            }
        }, 6), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.CollectionPresenter$onReleases$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                Throwable th2 = th;
                if (CollectionPresenter.this.f26074f.isEmpty()) {
                    CollectionPresenter.this.getViewState().mo14401c();
                } else {
                    CollectionPresenter.m14375b(CollectionPresenter.this, false, true, 1);
                }
                th2.printStackTrace();
                return Unit.f63088a;
            }
        }, 7), Functions.f59621b, Functions.f59622c);
    }

    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        m14376d(this, false, false, 3);
    }
}
