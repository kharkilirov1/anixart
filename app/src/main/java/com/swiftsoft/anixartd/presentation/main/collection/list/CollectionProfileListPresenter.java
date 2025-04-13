package com.swiftsoft.anixartd.presentation.main.collection.list;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionProfileListUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.list.CollectionProfileListUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.C2561b;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: CollectionProfileListPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionProfileListPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionProfileListView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionProfileListPresenter extends MvpPresenter<CollectionProfileListView> {

    /* renamed from: a */
    @NotNull
    public CollectionRepository f26213a;

    /* renamed from: b */
    @NotNull
    public Prefs f26214b;

    /* renamed from: c */
    @NotNull
    public Listener f26215c;

    /* renamed from: d */
    @NotNull
    public CollectionProfileListUiLogic f26216d;

    /* renamed from: e */
    @NotNull
    public CollectionProfileListUiController f26217e;

    /* compiled from: CollectionProfileListPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionProfileListPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionProfileListUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionProfileListUiController.Listener {
    }

    @Inject
    public CollectionProfileListPresenter(@NotNull CollectionRepository collectionRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26213a = collectionRepository;
        this.f26214b = prefs;
        this.f26215c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.collections.HeaderMyListCollectionModel.Listener
            /* renamed from: M */
            public void mo14533M() {
                CollectionProfileListPresenter.this.getViewState().mo14534M();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionModel.Listener
            /* renamed from: d0 */
            public void mo14363d0(long j2) {
                Object obj;
                Iterator<T> it = CollectionProfileListPresenter.this.f26216d.f29022e.iterator();
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
                    CollectionProfileListPresenter.this.getViewState().mo14541v(collection);
                }
            }
        };
        this.f26216d = new CollectionProfileListUiLogic();
        this.f26217e = new CollectionProfileListUiController();
    }

    /* renamed from: b */
    public static void m14531b(CollectionProfileListPresenter collectionProfileListPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = collectionProfileListPresenter.f26217e.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        collectionProfileListPresenter.m14532a(z, z2);
    }

    /* renamed from: a */
    public final void m14532a(final boolean z, final boolean z2) {
        CollectionRepository collectionRepository = this.f26213a;
        CollectionProfileListUiLogic collectionProfileListUiLogic = this.f26216d;
        collectionRepository.f27336a.profileCollections(collectionProfileListUiLogic.f29019b, collectionProfileListUiLogic.f29021d, collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter$onCollections$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14536b();
                }
                if (z2) {
                    this.getViewState().mo14538d();
                }
                return Unit.f63088a;
            }
        }, 17)).m31368j(new C2553a(z, this, z2, 5)).m31370l(new C2561b(new Function1<PageableResponse<Collection>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter$onCollections$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Collection> pageableResponse) {
                PageableResponse<Collection> pageableResponse2 = pageableResponse;
                CollectionProfileListUiLogic collectionProfileListUiLogic2 = CollectionProfileListPresenter.this.f26216d;
                List<Collection> collections = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(collectionProfileListUiLogic2);
                Intrinsics.m32179h(collections, "collections");
                boolean z3 = collectionProfileListUiLogic2.f29024g;
                if (z3) {
                    collectionProfileListUiLogic2.f29022e.addAll(collections);
                    collectionProfileListUiLogic2.f29023f = totalCount;
                } else {
                    if (z3) {
                        collectionProfileListUiLogic2.f29022e.clear();
                    }
                    collectionProfileListUiLogic2.f29022e.addAll(collections);
                    collectionProfileListUiLogic2.f29023f = totalCount;
                    collectionProfileListUiLogic2.f29024g = true;
                }
                CollectionProfileListPresenter collectionProfileListPresenter = CollectionProfileListPresenter.this;
                CollectionProfileListUiController collectionProfileListUiController = collectionProfileListPresenter.f26217e;
                List<Collection> list = collectionProfileListPresenter.f26216d.f29022e;
                Boolean valueOf = Boolean.valueOf(pageableResponse2.getContent().size() >= 25);
                CollectionProfileListPresenter collectionProfileListPresenter2 = CollectionProfileListPresenter.this;
                collectionProfileListUiController.setData(list, valueOf, Boolean.valueOf(collectionProfileListPresenter2.f26216d.f29019b == collectionProfileListPresenter2.f26214b.m14061d()), Boolean.valueOf(CollectionProfileListPresenter.this.f26216d.f29020c), CollectionProfileListPresenter.this.f26215c);
                return Unit.f63088a;
            }
        }, 18), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionProfileListPresenter$onCollections$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CollectionProfileListPresenter.this.getViewState().mo14537c();
                return Unit.f63088a;
            }
        }, 19), Functions.f59621b, Functions.f59622c);
    }
}
