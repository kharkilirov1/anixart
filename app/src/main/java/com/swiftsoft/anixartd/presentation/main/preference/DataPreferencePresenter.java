package com.swiftsoft.anixartd.presentation.main.preference;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.request.bookmarks.BookmarksExportRequest;
import com.swiftsoft.anixartd.network.request.bookmarks.BookmarksImportRequest;
import com.swiftsoft.anixartd.network.response.bookmarks.BookmarksExportResponse;
import com.swiftsoft.anixartd.network.response.bookmarks.BookmarksImportResponse;
import com.swiftsoft.anixartd.network.response.bookmarks.BookmarksImportStatusResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.export.ExportUiLogic;
import com.swiftsoft.anixartd.presentation.main.notifications.C2588a;
import com.swiftsoft.anixartd.repository.ExportRepository;
import com.swiftsoft.anixartd.repository.ImportRepository;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
import java.util.HashSet;
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

/* compiled from: DataPreferencePresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/preference/DataPreferencePresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/preference/DataPreferenceView;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DataPreferencePresenter extends MvpPresenter<DataPreferenceView> {

    /* renamed from: a */
    @NotNull
    public ImportRepository f26525a;

    /* renamed from: b */
    @NotNull
    public ExportRepository f26526b;

    /* renamed from: c */
    @NotNull
    public ExportUiLogic f26527c;

    @Inject
    public DataPreferencePresenter(@NotNull ImportRepository importRepository, @NotNull ExportRepository exportRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(importRepository, "importRepository");
        Intrinsics.m32179h(exportRepository, "exportRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26525a = importRepository;
        this.f26526b = exportRepository;
        this.f26527c = new ExportUiLogic();
    }

    /* renamed from: a */
    public final void m14745a(@NotNull String str, @NotNull HashSet<Long> hashSet, @NotNull HashSet<Long> hashSet2, @NotNull HashSet<Long> hashSet3, @NotNull HashSet<Long> hashSet4, @NotNull HashSet<Long> hashSet5) {
        BookmarksImportRequest bookmarksImportRequest = new BookmarksImportRequest(str, hashSet, hashSet2, hashSet3, hashSet4, hashSet5);
        ImportRepository importRepository = this.f26525a;
        Objects.requireNonNull(importRepository);
        importRepository.f27359a.bookmarks(bookmarksImportRequest, importRepository.f27360b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2588a(new Function1<BookmarksImportResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter$onBookmarksImport$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(BookmarksImportResponse bookmarksImportResponse) {
                BookmarksImportResponse bookmarksImportResponse2 = bookmarksImportResponse;
                if (bookmarksImportResponse2.isFailed()) {
                    DataPreferencePresenter.this.getViewState().mo14749i2();
                } else if (bookmarksImportResponse2.getCode() == 2) {
                    DataPreferencePresenter.this.getViewState().mo14752r1();
                } else {
                    DataPreferencePresenter.this.getViewState().mo14751m1();
                }
                return Unit.f63088a;
            }
        }, 13), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter$onBookmarksImport$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m14746b(final int i2, int i3, @NotNull List<Integer> list, @NotNull final List<Integer> list2) {
        ExportRepository exportRepository = this.f26526b;
        Objects.requireNonNull(exportRepository);
        exportRepository.f27352a.bookmarks(Integer.valueOf(i3), new BookmarksExportRequest(list), exportRepository.f27353b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2588a(new Function1<BookmarksExportResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter$onExportBookmarks$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(BookmarksExportResponse bookmarksExportResponse) {
                List<Release> releases = bookmarksExportResponse.getReleases();
                if (releases != null) {
                    DataPreferenceView viewState = DataPreferencePresenter.this.getViewState();
                    int i4 = i2;
                    List<Integer> list3 = list2;
                    viewState.mo14750j2(i4, list3, list3, releases);
                }
                return Unit.f63088a;
            }
        }, 15), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter$onExportBookmarks$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14747c() {
        ImportRepository importRepository = this.f26525a;
        importRepository.f27359a.status(importRepository.f27360b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31370l(new C2588a(new Function1<BookmarksImportStatusResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter$onImportStatus$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(BookmarksImportStatusResponse bookmarksImportStatusResponse) {
                BookmarksImportStatusResponse bookmarksImportStatusResponse2 = bookmarksImportStatusResponse;
                if (bookmarksImportStatusResponse2.isFailed()) {
                    DataPreferencePresenter.this.getViewState().mo14749i2();
                } else if (bookmarksImportStatusResponse2.getCode() == 2) {
                    DataPreferencePresenter.this.getViewState().mo14752r1();
                } else {
                    DataPreferencePresenter.this.getViewState().mo14748R2();
                }
                return Unit.f63088a;
            }
        }, 17), new C2588a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.preference.DataPreferencePresenter$onImportStatus$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }
}
