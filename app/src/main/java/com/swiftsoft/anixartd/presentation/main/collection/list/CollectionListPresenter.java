package com.swiftsoft.anixartd.presentation.main.collection.list;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionListUiController;
import com.swiftsoft.anixartd.p015ui.logic.Pagination;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.list.CollectionListUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.collection.comments.replies.C2561b;
import com.swiftsoft.anixartd.repository.CollectionRepository;
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

/* compiled from: CollectionListPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionListPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionListView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionListPresenter extends MvpPresenter<CollectionListView> {

    /* renamed from: a */
    @NotNull
    public CollectionRepository f26199a;

    /* renamed from: b */
    @NotNull
    public Prefs f26200b;

    /* renamed from: c */
    @NotNull
    public Listener f26201c;

    /* renamed from: d */
    @NotNull
    public CollectionListUiLogic f26202d;

    /* renamed from: e */
    @NotNull
    public CollectionListUiController f26203e;

    /* compiled from: CollectionListPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/list/CollectionListPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionListUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionListUiController.Listener {
    }

    @Inject
    public CollectionListPresenter(@NotNull CollectionRepository collectionRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26199a = collectionRepository;
        this.f26200b = prefs;
        this.f26201c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.collections.HeaderCollectionModel.Listener
            /* renamed from: M */
            public void mo14518M() {
                if (CollectionListPresenter.this.f26200b.m14083z()) {
                    CollectionListPresenter.this.getViewState().mo14529m();
                } else {
                    CollectionListPresenter.this.getViewState().mo14521M();
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.ExtraCollectionModel.Listener
            /* renamed from: a */
            public void mo14519a(int i2) {
                CollectionListPresenter collectionListPresenter = CollectionListPresenter.this;
                collectionListPresenter.f26202d.f29016e = i2;
                collectionListPresenter.getViewState().mo14528l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.HeaderCollectionModel.Listener
            /* renamed from: a1 */
            public void mo14520a1() {
                if (CollectionListPresenter.this.f26200b.m14083z()) {
                    CollectionListPresenter.this.getViewState().mo14529m();
                } else {
                    CollectionListPresenter.this.getViewState().mo14523a1();
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionModel.Listener
            /* renamed from: d0 */
            public void mo14363d0(long j2) {
                Object obj;
                Iterator<T> it = CollectionListPresenter.this.f26202d.f29014c.iterator();
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
                    CollectionListPresenter.this.getViewState().mo14530v(collection);
                }
            }
        };
        this.f26202d = new CollectionListUiLogic();
        this.f26203e = new CollectionListUiController();
    }

    /* renamed from: b */
    public static void m14516b(CollectionListPresenter collectionListPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = collectionListPresenter.f26203e.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        collectionListPresenter.m14517a(z, z2);
    }

    /* renamed from: a */
    public final void m14517a(final boolean z, final boolean z2) {
        CollectionRepository collectionRepository = this.f26199a;
        CollectionListUiLogic collectionListUiLogic = this.f26202d;
        Pagination pagination = collectionListUiLogic.f29013b;
        collectionRepository.m15285b(pagination.f28953c, pagination.f28954d, collectionListUiLogic.f29015d, collectionListUiLogic.f29016e).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter$onCollections$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14524b();
                }
                if (z2) {
                    this.getViewState().mo14526d();
                }
                return Unit.f63088a;
            }
        }, 14)).m31368j(new C2553a(z, this, z2, 4)).m31370l(new C2561b(new Function1<PageableResponse<Collection>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter$onCollections$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Collection> pageableResponse) {
                PageableResponse<Collection> pageableResponse2 = pageableResponse;
                Pagination pagination2 = CollectionListPresenter.this.f26202d.f29013b;
                if (!pagination2.f28955e) {
                    pagination2.m15661a(pageableResponse2.getTotalPageCount(), pageableResponse2.getCurrentPage());
                }
                CollectionListUiLogic collectionListUiLogic2 = CollectionListPresenter.this.f26202d;
                List<Collection> collections = pageableResponse2.getContent();
                Objects.requireNonNull(collectionListUiLogic2);
                Intrinsics.m32179h(collections, "collections");
                boolean z3 = collectionListUiLogic2.f29017f;
                if (z3) {
                    collectionListUiLogic2.f29014c.addAll(collections);
                } else {
                    if (z3) {
                        collectionListUiLogic2.f29014c.clear();
                    }
                    collectionListUiLogic2.f29014c.addAll(collections);
                    collectionListUiLogic2.f29017f = true;
                }
                CollectionListPresenter collectionListPresenter = CollectionListPresenter.this;
                CollectionListUiController collectionListUiController = collectionListPresenter.f26203e;
                CollectionListUiLogic collectionListUiLogic3 = collectionListPresenter.f26202d;
                collectionListUiController.setData(collectionListUiLogic3.f29014c, Integer.valueOf(collectionListUiLogic3.f29016e), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), CollectionListPresenter.this.f26201c);
                return Unit.f63088a;
            }
        }, 15), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.list.CollectionListPresenter$onCollections$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CollectionListPresenter.this.getViewState().mo14525c();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }
}
