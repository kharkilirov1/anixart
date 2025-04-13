package com.swiftsoft.anixartd.presentation.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.comments.CommentVotesUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.comments.CommentVotesUiLogic;
import com.swiftsoft.anixartd.presentation.auth.signup.verify.C2552b;
import com.swiftsoft.anixartd.repository.CommentVotesRepository;
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

/* compiled from: CommentVotesPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/comments/CommentVotesPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/comments/CommentVotesView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CommentVotesPresenter extends MvpPresenter<CommentVotesView> {

    /* renamed from: a */
    @NotNull
    public CommentVotesRepository f25932a;

    /* renamed from: b */
    @NotNull
    public CommentVotesUiLogic f25933b;

    /* renamed from: c */
    @NotNull
    public CommentVotesUiController f25934c;

    /* renamed from: d */
    @NotNull
    public Listener f25935d;

    /* compiled from: CommentVotesPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/comments/CommentVotesPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/comments/CommentVotesUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CommentVotesUiController.Listener {
    }

    @Inject
    public CommentVotesPresenter(@NotNull CommentVotesRepository commentVotesRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(commentVotesRepository, "commentVotesRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f25932a = commentVotesRepository;
        this.f25933b = new CommentVotesUiLogic();
        this.f25934c = new CommentVotesUiController();
        this.f25935d = new Listener() { // from class: com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentVotesModel.Listener
            /* renamed from: a */
            public void mo14303a(int i2) {
                CommentVotesPresenter commentVotesPresenter = CommentVotesPresenter.this;
                commentVotesPresenter.f25933b.f29029e = i2;
                commentVotesPresenter.getViewState().mo14311l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentProfileVoteModel.Listener
            /* renamed from: f */
            public void mo14304f(long j2) {
                CommentVotesPresenter.this.getViewState().mo14310f(j2);
            }
        };
    }

    /* renamed from: b */
    public static void m14300b(CommentVotesPresenter commentVotesPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = commentVotesPresenter.f25934c.isEmpty();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        commentVotesPresenter.m14301a(z, z2);
    }

    /* renamed from: a */
    public final void m14301a(final boolean z, final boolean z2) {
        Observable<PageableResponse<Profile>> m31369k;
        CommentVotesUiLogic commentVotesUiLogic = this.f25933b;
        if (commentVotesUiLogic.f29027c == 0) {
            CommentVotesRepository commentVotesRepository = this.f25932a;
            m31369k = commentVotesRepository.f27340a.releaseCommentVotes(commentVotesUiLogic.f29026b, commentVotesUiLogic.f29028d, Integer.valueOf(commentVotesUiLogic.f29029e), commentVotesRepository.f27341b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        } else {
            CommentVotesRepository commentVotesRepository2 = this.f25932a;
            m31369k = commentVotesRepository2.f27340a.collectionCommentVotes(commentVotesUiLogic.f29026b, commentVotesUiLogic.f29028d, Integer.valueOf(commentVotesUiLogic.f29029e), commentVotesRepository2.f27341b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a());
        }
        m31369k.m31367i(new C2552b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter$onCommentVotes$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    this.getViewState().mo14306b();
                }
                if (z2) {
                    this.getViewState().mo14308d();
                }
                return Unit.f63088a;
            }
        }, 5)).m31368j(new C2553a(z, this, z2, 0)).m31370l(new C2552b(new Function1<PageableResponse<Profile>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter$onCommentVotes$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<Profile> pageableResponse) {
                PageableResponse<Profile> pageableResponse2 = pageableResponse;
                CommentVotesUiLogic commentVotesUiLogic2 = CommentVotesPresenter.this.f25933b;
                List<Profile> profiles = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(commentVotesUiLogic2);
                Intrinsics.m32179h(profiles, "profiles");
                boolean z3 = commentVotesUiLogic2.f29032h;
                if (z3) {
                    commentVotesUiLogic2.f29030f.addAll(profiles);
                    commentVotesUiLogic2.f29031g = totalCount;
                } else {
                    if (z3) {
                        commentVotesUiLogic2.f29030f.clear();
                    }
                    commentVotesUiLogic2.f29030f.addAll(profiles);
                    commentVotesUiLogic2.f29031g = totalCount;
                    commentVotesUiLogic2.f29032h = true;
                }
                CommentVotesPresenter commentVotesPresenter = CommentVotesPresenter.this;
                CommentVotesUiController commentVotesUiController = commentVotesPresenter.f25934c;
                CommentVotesUiLogic commentVotesUiLogic3 = commentVotesPresenter.f25933b;
                commentVotesUiController.setData(commentVotesUiLogic3.f29030f, Long.valueOf(commentVotesUiLogic3.f29031g), Integer.valueOf(CommentVotesPresenter.this.f25933b.f29029e), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), CommentVotesPresenter.this.f25935d);
                return Unit.f63088a;
            }
        }, 6), new C2552b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.comments.CommentVotesPresenter$onCommentVotes$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CommentVotesPresenter.this.getViewState().mo14307c();
                return Unit.f63088a;
            }
        }, 7), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: c */
    public final void m14302c() {
        CommentVotesUiLogic commentVotesUiLogic = this.f25933b;
        if (commentVotesUiLogic.f28956a) {
            commentVotesUiLogic.f29028d = 0;
            commentVotesUiLogic.f29031g = 0L;
            commentVotesUiLogic.f29030f.clear();
            m14301a(false, true);
        }
    }
}
