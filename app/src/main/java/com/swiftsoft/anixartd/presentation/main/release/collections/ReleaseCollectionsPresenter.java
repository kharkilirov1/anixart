package com.swiftsoft.anixartd.presentation.main.release.collections;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseCollectionsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseCollectionsUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.release.C2614b;
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

/* compiled from: ReleaseCollectionsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/collections/ReleaseCollectionsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/collections/ReleaseCollectionsView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCollectionsPresenter extends MvpPresenter<ReleaseCollectionsView> {

    /* renamed from: a */
    @NotNull
    public CollectionRepository f27023a;

    /* renamed from: b */
    @NotNull
    public Listener f27024b;

    /* renamed from: c */
    @NotNull
    public ReleaseCollectionsUiLogic f27025c;

    /* renamed from: d */
    @NotNull
    public ReleaseCollectionsUiController f27026d;

    /* compiled from: ReleaseCollectionsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/collections/ReleaseCollectionsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCollectionsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseCollectionsUiController.Listener {
    }

    @Inject
    public ReleaseCollectionsPresenter(@NotNull CollectionRepository collectionRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27023a = collectionRepository;
        this.f27024b = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.collections.ExtraReleaseCollectionModel.Listener
            /* renamed from: a */
            public void mo15078a(int i2) {
                ReleaseCollectionsPresenter releaseCollectionsPresenter = ReleaseCollectionsPresenter.this;
                releaseCollectionsPresenter.f27025c.f29264d = i2;
                releaseCollectionsPresenter.getViewState().mo15084l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionModel.Listener
            /* renamed from: d0 */
            public void mo14363d0(long j2) {
                Object obj;
                Iterator<T> it = ReleaseCollectionsPresenter.this.f27025c.f29266f.iterator();
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
                    ReleaseCollectionsPresenter.this.getViewState().mo15085v(collection);
                }
            }
        };
        this.f27025c = new ReleaseCollectionsUiLogic();
        this.f27026d = new ReleaseCollectionsUiController();
    }

    /* renamed from: b */
    public static void m15076b(ReleaseCollectionsPresenter releaseCollectionsPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = releaseCollectionsPresenter.f27026d.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        releaseCollectionsPresenter.m15077a(z, z2);
    }

    /* renamed from: a */
    public final void m15077a(final boolean z, final boolean z2) {
        CollectionRepository collectionRepository = this.f27023a;
        ReleaseCollectionsUiLogic releaseCollectionsUiLogic = this.f27025c;
        collectionRepository.f27336a.releaseCollections(releaseCollectionsUiLogic.f29262b, releaseCollectionsUiLogic.f29265e, releaseCollectionsUiLogic.f29264d, collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter$onReleaseCollections$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo15080b();
                }
                if (z2) {
                    this.getViewState().mo15082d();
                }
                return Unit.f63088a;
            }
        }, 22)).m31368j(new C2553a(z, this, z2, 16)).m31370l(new C2614b(new Function1<PageableResponse<Collection>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter$onReleaseCollections$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Collection> pageableResponse) {
                PageableResponse<Collection> pageableResponse2 = pageableResponse;
                ReleaseCollectionsUiLogic releaseCollectionsUiLogic2 = ReleaseCollectionsPresenter.this.f27025c;
                List<Collection> collections = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(releaseCollectionsUiLogic2);
                Intrinsics.m32179h(collections, "collections");
                boolean z3 = releaseCollectionsUiLogic2.f29268h;
                if (z3) {
                    releaseCollectionsUiLogic2.f29266f.addAll(collections);
                    releaseCollectionsUiLogic2.f29267g = totalCount;
                } else {
                    if (z3) {
                        releaseCollectionsUiLogic2.f29266f.clear();
                    }
                    releaseCollectionsUiLogic2.f29266f.addAll(collections);
                    releaseCollectionsUiLogic2.f29267g = totalCount;
                    releaseCollectionsUiLogic2.f29268h = true;
                }
                ReleaseCollectionsPresenter releaseCollectionsPresenter = ReleaseCollectionsPresenter.this;
                ReleaseCollectionsUiController releaseCollectionsUiController = releaseCollectionsPresenter.f27026d;
                Release release = releaseCollectionsPresenter.f27025c.f29263c;
                if (release == null) {
                    Intrinsics.m32189r("release");
                    throw null;
                }
                Long valueOf = Long.valueOf(release.getId());
                ReleaseCollectionsUiLogic releaseCollectionsUiLogic3 = ReleaseCollectionsPresenter.this.f27025c;
                releaseCollectionsUiController.setData(valueOf, releaseCollectionsUiLogic3.f29266f, Long.valueOf(releaseCollectionsUiLogic3.f29267g), Integer.valueOf(ReleaseCollectionsPresenter.this.f27025c.f29264d), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ReleaseCollectionsPresenter.this.f27024b);
                return Unit.f63088a;
            }
        }, 23), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.collections.ReleaseCollectionsPresenter$onReleaseCollections$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseCollectionsPresenter.this.getViewState().mo15081c();
                return Unit.f63088a;
            }
        }, 24), Functions.f59621b, Functions.f59622c);
    }
}
