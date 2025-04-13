package com.swiftsoft.anixartd.presentation.main.bookmarks;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.bookmarks.BookmarksTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.bookmarks.BookmarksTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.C2558c;
import com.swiftsoft.anixartd.repository.BookmarksRepository;
import com.swiftsoft.anixartd.repository.CollectionRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: BookmarksTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksTabView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class BookmarksTabPresenter extends MvpPresenter<BookmarksTabView> {

    /* renamed from: a */
    @NotNull
    public BookmarksRepository f26026a;

    /* renamed from: b */
    @NotNull
    public CollectionRepository f26027b;

    /* renamed from: c */
    @NotNull
    public Prefs f26028c;

    /* renamed from: d */
    @NotNull
    public BookmarksTabUiLogic f26029d;

    /* renamed from: e */
    @NotNull
    public BookmarksTabUiController f26030e;

    /* renamed from: f */
    @NotNull
    public Listener f26031f;

    /* compiled from: BookmarksTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/bookmarks/BookmarksTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/bookmarks/BookmarksTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends BookmarksTabUiController.Listener {
    }

    @Inject
    public BookmarksTabPresenter(@NotNull BookmarksRepository bookmarksRepository, @NotNull CollectionRepository collectionRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(bookmarksRepository, "bookmarksRepository");
        Intrinsics.m32179h(collectionRepository, "collectionRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26026a = bookmarksRepository;
        this.f26027b = collectionRepository;
        this.f26028c = prefs;
        this.f26029d = new BookmarksTabUiLogic();
        this.f26030e = new BookmarksTabUiController();
        this.f26031f = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.bookmarks.ExtraBookmarksModel.Listener
            /* renamed from: Y */
            public void mo14361Y() {
                BookmarksTabPresenter.this.getViewState().mo14373p2(BookmarksTabPresenter.this.f26029d.f28964b);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.bookmarks.ExtraBookmarksModel.Listener
            /* renamed from: a */
            public void mo14362a(int i2) {
                BookmarksTabPresenter bookmarksTabPresenter = BookmarksTabPresenter.this;
                bookmarksTabPresenter.f26029d.f28967e = i2;
                bookmarksTabPresenter.getViewState().mo14372l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.collections.CollectionModel.Listener
            /* renamed from: d0 */
            public void mo14363d0(long j2) {
                Object obj;
                Iterator<T> it = BookmarksTabPresenter.this.f26029d.f28969g.iterator();
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
                    BookmarksTabPresenter.this.getViewState().mo14374v(collection);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = BookmarksTabPresenter.this.f26029d.f28968f.iterator();
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
                    BookmarksTabPresenter.this.getViewState().mo14371i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = BookmarksTabPresenter.this.f26029d.f28968f.iterator();
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

    /* renamed from: c */
    public static /* synthetic */ void m14354c(BookmarksTabPresenter bookmarksTabPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = bookmarksTabPresenter.m14355a();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        bookmarksTabPresenter.m14356b(z, z2);
    }

    /* renamed from: a */
    public final boolean m14355a() {
        return this.f26030e.isEmpty();
    }

    /* renamed from: b */
    public final void m14356b(final boolean z, final boolean z2) {
        String str = this.f26029d.f28964b;
        final int i2 = 1;
        final int i3 = 0;
        switch (str.hashCode()) {
            case -2109617152:
                if (str.equals("INNER_TAB_BOOKMARKS_COLLECTIONS")) {
                    CollectionRepository collectionRepository = this.f26027b;
                    Observable<PageableResponse<Collection>> m31367i = collectionRepository.f27338c.favorites(this.f26029d.f28965c, collectionRepository.f27339d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFavoriteCollections$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14367b();
                            }
                            if (z2) {
                                this.getViewState().mo14369d();
                            }
                            return Unit.f63088a;
                        }
                    }, 0));
                    final int i4 = 2;
                    m31367i.m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.a

                        /* renamed from: c */
                        public final /* synthetic */ BookmarksTabPresenter f26064c;

                        {
                            this.f26064c = this;
                        }

                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    BookmarksTabPresenter this$0 = this.f26064c;
                                    Intrinsics.m32179h(this$0, "this$0");
                                    this$0.getViewState().mo14366a();
                                    this$0.getViewState().mo14370e();
                                    break;
                                case 1:
                                    BookmarksTabPresenter this$02 = this.f26064c;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.getViewState().mo14366a();
                                    this$02.getViewState().mo14370e();
                                    break;
                                case 2:
                                    BookmarksTabPresenter this$03 = this.f26064c;
                                    Intrinsics.m32179h(this$03, "this$0");
                                    this$03.getViewState().mo14366a();
                                    this$03.getViewState().mo14370e();
                                    break;
                                default:
                                    BookmarksTabPresenter this$04 = this.f26064c;
                                    Intrinsics.m32179h(this$04, "this$0");
                                    this$04.getViewState().mo14366a();
                                    this$04.getViewState().mo14370e();
                                    break;
                            }
                        }
                    }).m31370l(new C2557b(new Function1<PageableResponse<Collection>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFavoriteCollections$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Collection> pageableResponse) {
                            PageableResponse<Collection> pageableResponse2 = pageableResponse;
                            BookmarksTabUiLogic bookmarksTabUiLogic = BookmarksTabPresenter.this.f26029d;
                            List<Collection> collections = pageableResponse2.getContent();
                            Objects.requireNonNull(bookmarksTabUiLogic);
                            Intrinsics.m32179h(collections, "collections");
                            boolean z3 = bookmarksTabUiLogic.f28971i;
                            if (z3) {
                                bookmarksTabUiLogic.f28969g.addAll(collections);
                            } else {
                                if (z3) {
                                    bookmarksTabUiLogic.f28969g.clear();
                                }
                                bookmarksTabUiLogic.f28969g.addAll(collections);
                                bookmarksTabUiLogic.f28971i = true;
                            }
                            BookmarksTabPresenter.this.f26029d.f28966d = pageableResponse2.getTotalCount();
                            BookmarksTabPresenter bookmarksTabPresenter = BookmarksTabPresenter.this;
                            BookmarksTabUiController bookmarksTabUiController = bookmarksTabPresenter.f26030e;
                            Integer valueOf = Integer.valueOf(bookmarksTabPresenter.f26028c.m14081x());
                            BookmarksTabUiLogic bookmarksTabUiLogic2 = BookmarksTabPresenter.this.f26029d;
                            bookmarksTabUiController.setData(valueOf, bookmarksTabUiLogic2.f28968f, bookmarksTabUiLogic2.f28969g, bookmarksTabUiLogic2.f28964b, Long.valueOf(bookmarksTabUiLogic2.f28966d), Integer.valueOf(BookmarksTabPresenter.this.f26029d.f28967e), Boolean.valueOf(BookmarksTabPresenter.this.f26029d.f28972j), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), BookmarksTabPresenter.this.f26031f);
                            if (pageableResponse2.getContent().isEmpty()) {
                                BookmarksTabUiLogic bookmarksTabUiLogic3 = BookmarksTabPresenter.this.f26029d;
                                bookmarksTabUiLogic3.f28965c--;
                            }
                            return Unit.f63088a;
                        }
                    }, 1), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFavoriteCollections$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (BookmarksTabPresenter.this.m14355a()) {
                                BookmarksTabPresenter.this.getViewState().mo14368c();
                            }
                            return Unit.f63088a;
                        }
                    }, 2), Functions.f59621b, Functions.f59622c);
                    return;
                }
                return;
            case -2012826750:
                if (str.equals("INNER_TAB_BOOKMARKS_FAVORITES")) {
                    BookmarksRepository bookmarksRepository = this.f26026a;
                    BookmarksTabUiLogic bookmarksTabUiLogic = this.f26029d;
                    bookmarksRepository.f27331b.favorites(bookmarksTabUiLogic.f28965c, Integer.valueOf(bookmarksTabUiLogic.f28967e), bookmarksRepository.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2558c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFavorites$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14367b();
                            }
                            if (z2) {
                                this.getViewState().mo14369d();
                            }
                            return Unit.f63088a;
                        }
                    }, 24)).m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.a

                        /* renamed from: c */
                        public final /* synthetic */ BookmarksTabPresenter f26064c;

                        {
                            this.f26064c = this;
                        }

                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    BookmarksTabPresenter this$0 = this.f26064c;
                                    Intrinsics.m32179h(this$0, "this$0");
                                    this$0.getViewState().mo14366a();
                                    this$0.getViewState().mo14370e();
                                    break;
                                case 1:
                                    BookmarksTabPresenter this$02 = this.f26064c;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.getViewState().mo14366a();
                                    this$02.getViewState().mo14370e();
                                    break;
                                case 2:
                                    BookmarksTabPresenter this$03 = this.f26064c;
                                    Intrinsics.m32179h(this$03, "this$0");
                                    this$03.getViewState().mo14366a();
                                    this$03.getViewState().mo14370e();
                                    break;
                                default:
                                    BookmarksTabPresenter this$04 = this.f26064c;
                                    Intrinsics.m32179h(this$04, "this$0");
                                    this$04.getViewState().mo14366a();
                                    this$04.getViewState().mo14370e();
                                    break;
                            }
                        }
                    }).m31370l(new C2558c(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFavorites$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            BookmarksTabPresenter.this.f26029d.m15666c(pageableResponse2.getContent());
                            BookmarksTabPresenter.this.f26029d.f28966d = pageableResponse2.getTotalCount();
                            BookmarksTabPresenter bookmarksTabPresenter = BookmarksTabPresenter.this;
                            BookmarksTabUiController bookmarksTabUiController = bookmarksTabPresenter.f26030e;
                            Integer valueOf = Integer.valueOf(bookmarksTabPresenter.f26028c.m14081x());
                            BookmarksTabUiLogic bookmarksTabUiLogic2 = BookmarksTabPresenter.this.f26029d;
                            bookmarksTabUiController.setData(valueOf, bookmarksTabUiLogic2.f28968f, bookmarksTabUiLogic2.f28969g, bookmarksTabUiLogic2.f28964b, Long.valueOf(bookmarksTabUiLogic2.f28966d), Integer.valueOf(BookmarksTabPresenter.this.f26029d.f28967e), Boolean.valueOf(BookmarksTabPresenter.this.f26029d.f28972j), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), BookmarksTabPresenter.this.f26031f);
                            if (pageableResponse2.getContent().isEmpty()) {
                                BookmarksTabUiLogic bookmarksTabUiLogic3 = BookmarksTabPresenter.this.f26029d;
                                bookmarksTabUiLogic3.f28965c--;
                            }
                            return Unit.f63088a;
                        }
                    }, 25), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFavorites$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (BookmarksTabPresenter.this.m14355a()) {
                                BookmarksTabPresenter.this.getViewState().mo14368c();
                            }
                            return Unit.f63088a;
                        }
                    }, 26), Functions.f59621b, Functions.f59622c);
                    return;
                }
                return;
            case -1817489912:
                if (!str.equals("INNER_TAB_BOOKMARKS_WATCHING")) {
                    return;
                }
                break;
            case -1630519434:
                if (!str.equals("INNER_TAB_BOOKMARKS_COMPLETED")) {
                    return;
                }
                break;
            case -119111553:
                if (str.equals("INNER_TAB_BOOKMARKS_HISTORY")) {
                    BookmarksRepository bookmarksRepository2 = this.f26026a;
                    bookmarksRepository2.f27330a.history(this.f26029d.f28965c, bookmarksRepository2.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2558c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onHistory$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14367b();
                            }
                            if (z2) {
                                this.getViewState().mo14369d();
                            }
                            return Unit.f63088a;
                        }
                    }, 27)).m31365g(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.a

                        /* renamed from: c */
                        public final /* synthetic */ BookmarksTabPresenter f26064c;

                        {
                            this.f26064c = this;
                        }

                        @Override // io.reactivex.functions.Action
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    BookmarksTabPresenter this$0 = this.f26064c;
                                    Intrinsics.m32179h(this$0, "this$0");
                                    this$0.getViewState().mo14366a();
                                    this$0.getViewState().mo14370e();
                                    break;
                                case 1:
                                    BookmarksTabPresenter this$02 = this.f26064c;
                                    Intrinsics.m32179h(this$02, "this$0");
                                    this$02.getViewState().mo14366a();
                                    this$02.getViewState().mo14370e();
                                    break;
                                case 2:
                                    BookmarksTabPresenter this$03 = this.f26064c;
                                    Intrinsics.m32179h(this$03, "this$0");
                                    this$03.getViewState().mo14366a();
                                    this$03.getViewState().mo14370e();
                                    break;
                                default:
                                    BookmarksTabPresenter this$04 = this.f26064c;
                                    Intrinsics.m32179h(this$04, "this$0");
                                    this$04.getViewState().mo14366a();
                                    this$04.getViewState().mo14370e();
                                    break;
                            }
                        }
                    }).m31370l(new C2558c(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onHistory$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            BookmarksTabPresenter.this.f26029d.m15666c(pageableResponse2.getContent());
                            BookmarksTabPresenter.this.f26029d.f28966d = pageableResponse2.getTotalCount();
                            BookmarksTabPresenter bookmarksTabPresenter = BookmarksTabPresenter.this;
                            BookmarksTabUiController bookmarksTabUiController = bookmarksTabPresenter.f26030e;
                            Integer valueOf = Integer.valueOf(bookmarksTabPresenter.f26028c.m14081x());
                            BookmarksTabUiLogic bookmarksTabUiLogic2 = BookmarksTabPresenter.this.f26029d;
                            bookmarksTabUiController.setData(valueOf, bookmarksTabUiLogic2.f28968f, bookmarksTabUiLogic2.f28969g, bookmarksTabUiLogic2.f28964b, Long.valueOf(bookmarksTabUiLogic2.f28966d), Integer.valueOf(BookmarksTabPresenter.this.f26029d.f28967e), Boolean.valueOf(BookmarksTabPresenter.this.f26029d.f28972j), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), BookmarksTabPresenter.this.f26031f);
                            if (pageableResponse2.getContent().isEmpty()) {
                                BookmarksTabUiLogic bookmarksTabUiLogic3 = BookmarksTabPresenter.this.f26029d;
                                bookmarksTabUiLogic3.f28965c--;
                            }
                            return Unit.f63088a;
                        }
                    }, 28), new C2558c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onHistory$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (BookmarksTabPresenter.this.m14355a()) {
                                BookmarksTabPresenter.this.getViewState().mo14368c();
                            }
                            return Unit.f63088a;
                        }
                    }, 29), Functions.f59621b, Functions.f59622c);
                    return;
                }
                return;
            case 45737322:
                if (!str.equals("INNER_TAB_BOOKMARKS_HOLD_ON")) {
                    return;
                }
                break;
            case 879690667:
                if (!str.equals("INNER_TAB_BOOKMARKS_DROPPED")) {
                    return;
                }
                break;
            case 2121300245:
                if (!str.equals("INNER_TAB_BOOKMARKS_PLANS")) {
                    return;
                }
                break;
            default:
                return;
        }
        BookmarksRepository bookmarksRepository3 = this.f26026a;
        int m15667d = this.f26029d.m15667d();
        BookmarksTabUiLogic bookmarksTabUiLogic2 = this.f26029d;
        Observable<PageableResponse<Release>> m31369k = bookmarksRepository3.f27332c.profileList(m15667d, bookmarksTabUiLogic2.f28965c, Integer.valueOf(bookmarksTabUiLogic2.f28967e), bookmarksRepository3.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        Function1<Disposable, Unit> function1 = new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onProfileList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14367b();
                }
                if (z2) {
                    this.getViewState().mo14369d();
                }
                return Unit.f63088a;
            }
        };
        final int i5 = 3;
        m31369k.m31367i(new C2557b(function1, 3)).m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.a

            /* renamed from: c */
            public final /* synthetic */ BookmarksTabPresenter f26064c;

            {
                this.f26064c = this;
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                switch (i5) {
                    case 0:
                        BookmarksTabPresenter this$0 = this.f26064c;
                        Intrinsics.m32179h(this$0, "this$0");
                        this$0.getViewState().mo14366a();
                        this$0.getViewState().mo14370e();
                        break;
                    case 1:
                        BookmarksTabPresenter this$02 = this.f26064c;
                        Intrinsics.m32179h(this$02, "this$0");
                        this$02.getViewState().mo14366a();
                        this$02.getViewState().mo14370e();
                        break;
                    case 2:
                        BookmarksTabPresenter this$03 = this.f26064c;
                        Intrinsics.m32179h(this$03, "this$0");
                        this$03.getViewState().mo14366a();
                        this$03.getViewState().mo14370e();
                        break;
                    default:
                        BookmarksTabPresenter this$04 = this.f26064c;
                        Intrinsics.m32179h(this$04, "this$0");
                        this$04.getViewState().mo14366a();
                        this$04.getViewState().mo14370e();
                        break;
                }
            }
        }).m31370l(new C2557b(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onProfileList$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Release> pageableResponse) {
                PageableResponse<Release> pageableResponse2 = pageableResponse;
                BookmarksTabPresenter.this.f26029d.m15666c(pageableResponse2.getContent());
                BookmarksTabPresenter.this.f26029d.f28966d = pageableResponse2.getTotalCount();
                BookmarksTabPresenter bookmarksTabPresenter = BookmarksTabPresenter.this;
                BookmarksTabUiController bookmarksTabUiController = bookmarksTabPresenter.f26030e;
                Integer valueOf = Integer.valueOf(bookmarksTabPresenter.f26028c.m14081x());
                BookmarksTabUiLogic bookmarksTabUiLogic3 = BookmarksTabPresenter.this.f26029d;
                bookmarksTabUiController.setData(valueOf, bookmarksTabUiLogic3.f28968f, bookmarksTabUiLogic3.f28969g, bookmarksTabUiLogic3.f28964b, Long.valueOf(bookmarksTabUiLogic3.f28966d), Integer.valueOf(BookmarksTabPresenter.this.f26029d.f28967e), Boolean.valueOf(BookmarksTabPresenter.this.f26029d.f28972j), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), BookmarksTabPresenter.this.f26031f);
                if (pageableResponse2.getContent().isEmpty()) {
                    BookmarksTabUiLogic bookmarksTabUiLogic4 = BookmarksTabPresenter.this.f26029d;
                    bookmarksTabUiLogic4.f28965c--;
                }
                return Unit.f63088a;
            }
        }, 4), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onProfileList$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                if (BookmarksTabPresenter.this.m14355a()) {
                    BookmarksTabPresenter.this.getViewState().mo14368c();
                }
                return Unit.f63088a;
            }
        }, 5), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m14357d(@NotNull final Collection collection) {
        Intrinsics.m32179h(collection, "collection");
        BookmarksTabUiLogic bookmarksTabUiLogic = this.f26029d;
        if (bookmarksTabUiLogic.f28956a && Intrinsics.m32174c(bookmarksTabUiLogic.f28964b, "INNER_TAB_BOOKMARKS_COLLECTIONS")) {
            int i2 = 0;
            if (collection.getDelete() || !collection.getIsFavorite()) {
                List<Collection> list = this.f26029d.f28969g;
                if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    int i3 = 0;
                    while (it.hasNext()) {
                        if ((((Collection) it.next()).getId() == collection.getId()) && (i3 = i3 + 1) < 0) {
                            CollectionsKt.m32021g0();
                            throw null;
                        }
                    }
                    i2 = i3;
                }
                BookmarksTabUiLogic bookmarksTabUiLogic2 = this.f26029d;
                bookmarksTabUiLogic2.f28966d -= i2;
                CollectionsKt.m32005R(bookmarksTabUiLogic2.f28969g, new Function1<Collection, Boolean>() { // from class: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFetchCollection$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public Boolean invoke(Collection collection2) {
                        Collection it2 = collection2;
                        Intrinsics.m32179h(it2, "it");
                        return Boolean.valueOf(it2.getId() == Collection.this.getId());
                    }
                });
            } else {
                BookmarksTabUiLogic bookmarksTabUiLogic3 = this.f26029d;
                Objects.requireNonNull(bookmarksTabUiLogic3);
                Iterator<Collection> it2 = bookmarksTabUiLogic3.f28969g.iterator();
                int i4 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (it2.next().getId() == collection.getId()) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                }
                if (i4 < 0) {
                    bookmarksTabUiLogic3.f28969g.add(0, collection);
                } else {
                    bookmarksTabUiLogic3.f28969g.set(i4, collection);
                }
            }
            BookmarksTabUiController bookmarksTabUiController = this.f26030e;
            Integer valueOf = Integer.valueOf(this.f26028c.m14081x());
            BookmarksTabUiLogic bookmarksTabUiLogic4 = this.f26029d;
            bookmarksTabUiController.setData(valueOf, bookmarksTabUiLogic4.f28968f, bookmarksTabUiLogic4.f28969g, bookmarksTabUiLogic4.f28964b, Long.valueOf(bookmarksTabUiLogic4.f28966d), Integer.valueOf(this.f26029d.f28967e), Boolean.valueOf(this.f26029d.f28972j), Boolean.FALSE, this.f26031f);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x00c4, code lost:
    
        if (r13.getProfileListStatus() != r12.f26029d.m15667d()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00c6, code lost:
    
        r0 = r12.f26029d;
        r0.f28966d++;
        r0.m15665b(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00d2, code lost:
    
        r0 = r12.f26029d.f28968f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d8, code lost:
    
        if ((r0 instanceof java.util.Collection) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00de, code lost:
    
        if (r0.isEmpty() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x010d, code lost:
    
        r0 = r12.f26029d;
        r0.f28966d -= r6;
        kotlin.collections.CollectionsKt.m32005R(r0.f28968f, new com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter$onFetchRelease$3(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e1, code lost:
    
        r0 = r0.iterator();
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
    
        if (r0.hasNext() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00fc, code lost:
    
        if (((com.swiftsoft.anixartd.database.entity.Release) r0.next()).getId() != r13.getId()) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00fe, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0101, code lost:
    
        if (r4 == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0103, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0105, code lost:
    
        if (r1 < 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0108, code lost:
    
        kotlin.collections.CollectionsKt.m32021g0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x010b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0100, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x002f, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_DROPPED") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0039, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_HOLD_ON") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ac, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_COMPLETED") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b6, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_WATCHING") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r0.equals("INNER_TAB_BOOKMARKS_PLANS") == false) goto L98;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m14358e(@org.jetbrains.annotations.NotNull final com.swiftsoft.anixartd.database.entity.Release r13) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swiftsoft.anixartd.presentation.main.bookmarks.BookmarksTabPresenter.m14358e(com.swiftsoft.anixartd.database.entity.Release):void");
    }

    /* renamed from: f */
    public final void m14359f() {
        BookmarksTabUiLogic bookmarksTabUiLogic = this.f26029d;
        if (bookmarksTabUiLogic.f28956a) {
            bookmarksTabUiLogic.m15664a();
            if (m14355a()) {
                m14354c(this, false, false, 3);
            } else {
                m14356b(false, true);
            }
        }
    }

    /* renamed from: g */
    public final void m14360g() {
        BookmarksTabUiLogic bookmarksTabUiLogic = this.f26029d;
        if (bookmarksTabUiLogic.f28956a) {
            bookmarksTabUiLogic.m15664a();
            if (m14355a()) {
                m14354c(this, false, false, 3);
            } else {
                m14354c(this, false, false, 2);
            }
        }
    }
}
