package com.swiftsoft.anixartd.presentation.main.report;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.database.entity.ReportReason;
import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.network.request.report.ReportRequest;
import com.swiftsoft.anixartd.network.response.report.ReportResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.report.ReportUiLogic;
import com.swiftsoft.anixartd.presentation.main.release.video.C2619b;
import com.swiftsoft.anixartd.repository.ReportRepository;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: ReportPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/report/ReportPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/report/ReportView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReportPresenter extends MvpPresenter<ReportView> {

    /* renamed from: a */
    @NotNull
    public ReportRepository f27179a;

    /* renamed from: b */
    @NotNull
    public Prefs f27180b;

    /* renamed from: c */
    @NotNull
    public ReportUiLogic f27181c;

    /* compiled from: ReportPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/report/ReportPresenter$Listener;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener {
    }

    @Inject
    public ReportPresenter(@NotNull ReportRepository reportRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(reportRepository, "reportRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27179a = reportRepository;
        this.f27180b = prefs;
        this.f27181c = new ReportUiLogic();
    }

    /* renamed from: a */
    public final void m15190a() {
        Observable<List<ReportReason>> m31369k;
        int i2 = this.f27181c.f29330c;
        if (i2 == 0) {
            ReportRepository reportRepository = this.f27179a;
            m31369k = reportRepository.f27390a.releaseReasons(reportRepository.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 1) {
            ReportRepository reportRepository2 = this.f27179a;
            m31369k = reportRepository2.f27390a.collectionReasons(reportRepository2.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 2) {
            ReportRepository reportRepository3 = this.f27179a;
            m31369k = reportRepository3.f27390a.releaseCommentsReasons(reportRepository3.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 3) {
            ReportRepository reportRepository4 = this.f27179a;
            m31369k = reportRepository4.f27390a.collectionCommentsReasons(reportRepository4.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 4) {
            ReportRepository reportRepository5 = this.f27179a;
            m31369k = reportRepository5.f27390a.episodeReasons(reportRepository5.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 != 5) {
            getViewState().mo15197c();
            return;
        } else {
            ReportRepository reportRepository6 = this.f27179a;
            m31369k = reportRepository6.f27390a.profileReasons(reportRepository6.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        m31369k.m31367i(new C2619b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.report.ReportPresenter$onReport$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReportPresenter.this.getViewState().mo15196b();
                return Unit.f63088a;
            }
        }, 13)).m31368j(new C2620a(this, 1)).m31370l(new C2619b(new Function1<List<? extends ReportReason>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.report.ReportPresenter$onReport$3
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(List<? extends ReportReason> list) {
                List<? extends ReportReason> reasons = list;
                ReportUiLogic reportUiLogic = ReportPresenter.this.f27181c;
                Intrinsics.m32178g(reasons, "reasons");
                Objects.requireNonNull(reportUiLogic);
                if (reportUiLogic.f29332e) {
                    reportUiLogic.f29331d.clear();
                }
                reportUiLogic.f29331d.addAll(reasons);
                reportUiLogic.f29332e = true;
                ReportPresenter.this.getViewState().mo15200o2(reasons);
                return Unit.f63088a;
            }
        }, 14), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.report.ReportPresenter$onReport$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReportPresenter.this.getViewState().mo15197c();
                return Unit.f63088a;
            }
        }, 15), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final void m15191b(@NotNull String str, long j2) {
        Observable<ReportResponse> m31369k;
        ReportUiLogic reportUiLogic = this.f27181c;
        int i2 = reportUiLogic.f29330c;
        if (i2 == 0) {
            Release release = (Release) reportUiLogic.m15704a();
            ReportRepository reportRepository = this.f27179a;
            long id2 = release.getId();
            Objects.requireNonNull(reportRepository);
            m31369k = reportRepository.f27390a.release(new ReportRequest<>(Long.valueOf(id2), str, j2), reportRepository.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 1) {
            Collection collection = (Collection) reportUiLogic.m15704a();
            ReportRepository reportRepository2 = this.f27179a;
            long id3 = collection.getId();
            Objects.requireNonNull(reportRepository2);
            m31369k = reportRepository2.f27390a.collection(new ReportRequest<>(Long.valueOf(id3), str, j2), reportRepository2.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 2) {
            ReleaseComment releaseComment = (ReleaseComment) reportUiLogic.m15704a();
            ReportRepository reportRepository3 = this.f27179a;
            long id4 = releaseComment.getId();
            Objects.requireNonNull(reportRepository3);
            m31369k = reportRepository3.f27390a.releaseComment(new ReportRequest<>(Long.valueOf(id4), str, j2), reportRepository3.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 3) {
            CollectionComment collectionComment = (CollectionComment) reportUiLogic.m15704a();
            ReportRepository reportRepository4 = this.f27179a;
            long id5 = collectionComment.getId();
            Objects.requireNonNull(reportRepository4);
            m31369k = reportRepository4.f27390a.collectionComment(new ReportRequest<>(Long.valueOf(id5), str, j2), reportRepository4.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else if (i2 == 4) {
            Episode episode = (Episode) reportUiLogic.m15704a();
            ReportRepository reportRepository5 = this.f27179a;
            Objects.requireNonNull(reportRepository5);
            m31369k = reportRepository5.f27390a.episode(new ReportRequest<>(episode, str, j2), reportRepository5.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else {
            if (i2 != 5) {
                getViewState().mo15197c();
                return;
            }
            Profile profile = (Profile) reportUiLogic.m15704a();
            ReportRepository reportRepository6 = this.f27179a;
            long id6 = profile.getId();
            Objects.requireNonNull(reportRepository6);
            m31369k = reportRepository6.f27390a.profile(new ReportRequest<>(Long.valueOf(id6), str, j2), reportRepository6.f27391b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        m31369k.m31367i(new C2619b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.report.ReportPresenter$onReportSend$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReportPresenter.this.getViewState().mo15202q();
                return Unit.f63088a;
            }
        }, 10)).m31368j(new C2620a(this, 0)).m31370l(new C2619b(new Function1<ReportResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.report.ReportPresenter$onReportSend$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReportResponse reportResponse) {
                ReportResponse reportResponse2 = reportResponse;
                if (reportResponse2.isSuccess()) {
                    ReportPresenter.this.getViewState().mo15198n();
                } else {
                    int code = reportResponse2.getCode();
                    if (code == 2) {
                        ReportPresenter.this.getViewState().mo15197c();
                    } else if (code == 3) {
                        ReportPresenter.this.getViewState().mo15192B2();
                    } else if (code == 4) {
                        ReportPresenter.this.getViewState().mo15199n2();
                    }
                }
                return Unit.f63088a;
            }
        }, 11), new C2619b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.report.ReportPresenter$onReportSend$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReportPresenter.this.getViewState().mo15197c();
                return Unit.f63088a;
            }
        }, 12), Functions.f59621b, Functions.f59622c);
    }
}
