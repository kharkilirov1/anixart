package com.swiftsoft.anixartd.presentation.main.release.comments.replies;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentAddResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentEditResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseCommentsRepliesUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseCommentsRepliesUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.release.comments.C2616b;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchReleaseComment;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.rxkotlin.Observables;
import io.reactivex.schedulers.Schedulers;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseCommentsRepliesPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentsRepliesPresenter extends MvpPresenter<ReleaseCommentsRepliesView> {

    /* renamed from: a */
    @NotNull
    public ReleaseCommentRepository f27081a;

    /* renamed from: b */
    @NotNull
    public Prefs f27082b;

    /* renamed from: c */
    @NotNull
    public Listener f27083c;

    /* renamed from: d */
    @NotNull
    public ReleaseCommentsRepliesUiLogic f27084d;

    /* renamed from: e */
    @NotNull
    public ReleaseCommentsRepliesUiController f27085e;

    /* compiled from: ReleaseCommentsRepliesPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesPresenter$Companion;", "", "", "COMMENT_DELETED", "I", "COMMENT_SENT", "NOTHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseCommentsRepliesPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/replies/ReleaseCommentsRepliesPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsRepliesUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseCommentsRepliesUiController.Listener {
    }

    @Inject
    public ReleaseCommentsRepliesPresenter(@NotNull ReleaseCommentRepository releaseCommentRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseCommentRepository, "releaseCommentRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27081a = releaseCommentRepository;
        this.f27082b = prefs;
        this.f27083c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentsModel.Listener
            /* renamed from: a */
            public void mo14425a(int i2) {
                ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter = ReleaseCommentsRepliesPresenter.this;
                releaseCommentsRepliesPresenter.f27084d.f29274g = i2;
                releaseCommentsRepliesPresenter.getViewState().mo15145l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: b */
            public void mo14426b(long j2) {
                ReleaseComment m15697c = ReleaseCommentsRepliesPresenter.this.f27084d.m15697c(j2);
                if (m15697c == null || m15697c.getIsDeleted()) {
                    return;
                }
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15134U(m15697c);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: c */
            public void mo14427c(long j2) {
                ReleaseComment m15697c = ReleaseCommentsRepliesPresenter.this.f27084d.m15697c(j2);
                if (m15697c != null) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15136X(m15697c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.replies.ExtraRepliesModel.Listener
            /* renamed from: d */
            public void mo14466d(long j2) {
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15144g(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: e */
            public void mo14428e(long j2) {
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: f */
            public void mo14429f(long j2) {
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15143f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: h */
            public void mo14430h(long j2, int i2) {
                if (ReleaseCommentsRepliesPresenter.this.m15121b()) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15146m();
                    return;
                }
                ReleaseComment m15697c = ReleaseCommentsRepliesPresenter.this.f27084d.m15697c(j2);
                if (m15697c != null) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15135W(m15697c, i2);
                }
            }
        };
        this.f27084d = new ReleaseCommentsRepliesUiLogic();
        this.f27085e = new ReleaseCommentsRepliesUiController();
    }

    /* renamed from: a */
    public static void m15119a(ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        ReleaseCommentsRepliesUiController releaseCommentsRepliesUiController = releaseCommentsRepliesPresenter.f27085e;
        ReleaseComment m15698d = releaseCommentsRepliesPresenter.f27084d.m15698d();
        Boolean valueOf = Boolean.valueOf(releaseCommentsRepliesPresenter.f27084d.f29271d);
        ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = releaseCommentsRepliesPresenter.f27084d;
        releaseCommentsRepliesUiController.setData(m15698d, valueOf, releaseCommentsRepliesUiLogic.f29275h, Long.valueOf(releaseCommentsRepliesUiLogic.f29277j), Integer.valueOf(releaseCommentsRepliesPresenter.f27084d.f29274g), Boolean.valueOf(z), releaseCommentsRepliesPresenter.f27083c);
    }

    /* renamed from: g */
    public static void m15120g(final ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter, final int i2, final boolean z, final boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            z = releaseCommentsRepliesPresenter.f27085e.isEmpty();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        ReleaseCommentRepository releaseCommentRepository = releaseCommentsRepliesPresenter.f27081a;
        Observable<ReleaseComment> comment = releaseCommentRepository.f27380a.comment(releaseCommentsRepliesPresenter.f27084d.f29270c, releaseCommentRepository.f27381b.m14080w());
        Scheduler scheduler = Schedulers.f62901c;
        Observable<ReleaseComment> m31369k = comment.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        ReleaseCommentRepository releaseCommentRepository2 = releaseCommentsRepliesPresenter.f27081a;
        ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = releaseCommentsRepliesPresenter.f27084d;
        Observables.f62894a.m31860a(m31369k, releaseCommentRepository2.f27380a.replies(releaseCommentsRepliesUiLogic.f29270c, 0, releaseCommentsRepliesUiLogic.f29274g, releaseCommentRepository2.f27381b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a())).m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onReplies$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    releaseCommentsRepliesPresenter.getViewState().mo15138b();
                }
                if (z2) {
                    releaseCommentsRepliesPresenter.getViewState().mo15141d();
                }
                return Unit.f63088a;
            }
        }, 12)).m31368j(new C2553a(z, releaseCommentsRepliesPresenter, z2, 18)).m31370l(new C2616b(new Function1<Pair<? extends ReleaseComment, ? extends PageableResponse<ReleaseComment>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onReplies$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends ReleaseComment, ? extends PageableResponse<ReleaseComment>> pair) {
                Pair<? extends ReleaseComment, ? extends PageableResponse<ReleaseComment>> pair2 = pair;
                ReleaseComment releaseComment = (ReleaseComment) pair2.f63055b;
                PageableResponse pageableResponse = (PageableResponse) pair2.f63056c;
                ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic2 = ReleaseCommentsRepliesPresenter.this.f27084d;
                Objects.requireNonNull(releaseCommentsRepliesUiLogic2);
                Intrinsics.m32179h(releaseComment, "<set-?>");
                releaseCommentsRepliesUiLogic2.f29273f = releaseComment;
                ReleaseCommentsRepliesPresenter.this.f27084d.f29272e = releaseComment.getIsDeleted();
                ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic3 = ReleaseCommentsRepliesPresenter.this.f27084d;
                List replies = pageableResponse.getContent();
                long totalCount = pageableResponse.getTotalCount();
                Objects.requireNonNull(releaseCommentsRepliesUiLogic3);
                Intrinsics.m32179h(replies, "replies");
                boolean z3 = releaseCommentsRepliesUiLogic3.f29276i;
                if (z3) {
                    releaseCommentsRepliesUiLogic3.f29275h.addAll(replies);
                    releaseCommentsRepliesUiLogic3.f29277j = totalCount;
                } else {
                    if (z3) {
                        releaseCommentsRepliesUiLogic3.m15695a();
                    }
                    releaseCommentsRepliesUiLogic3.f29275h.addAll(replies);
                    releaseCommentsRepliesUiLogic3.f29277j = totalCount;
                    releaseCommentsRepliesUiLogic3.f29276i = true;
                }
                ReleaseCommentsRepliesPresenter.m15119a(ReleaseCommentsRepliesPresenter.this, false, 1);
                int i4 = i2;
                if (i4 == 2) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15128B();
                } else if (i4 == 3) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15130F();
                }
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15133K2(releaseComment);
                return Unit.f63088a;
            }
        }, 13), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onReplies$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15139c();
                return Unit.f63088a;
            }
        }, 14), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final boolean m15121b() {
        return this.f27082b.m14083z();
    }

    /* renamed from: c */
    public final void m15122c(@NotNull String str) {
        ReleaseCommentRepository releaseCommentRepository = this.f27081a;
        ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = this.f27084d;
        long j2 = releaseCommentsRepliesUiLogic.f29269b;
        Long valueOf = Long.valueOf(releaseCommentsRepliesUiLogic.m15698d().getId());
        Profile profile = this.f27084d.f29278k;
        releaseCommentRepository.m15308a(j2, valueOf, profile != null ? Long.valueOf(profile.getId()) : null, str, this.f27084d.f29279l).m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onAddComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15151s();
                return Unit.f63088a;
            }
        }, 15)).m31368j(new C2617a(this, 0)).m31370l(new C2616b(new Function1<ReleaseCommentAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onAddComment$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentAddResponse releaseCommentAddResponse) {
                ReleaseComment comment;
                ReleaseCommentAddResponse releaseCommentAddResponse2 = releaseCommentAddResponse;
                int code = releaseCommentAddResponse2.getCode();
                if (code == 7) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15127A();
                } else if (code == 8) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15132H();
                } else if (code == 402) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15148o();
                } else if (releaseCommentAddResponse2.isSuccess() && (comment = releaseCommentAddResponse2.getComment()) != null) {
                    ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic2 = ReleaseCommentsRepliesPresenter.this.f27084d;
                    int i2 = releaseCommentsRepliesUiLogic2.f29274g;
                    if (i2 == 1) {
                        releaseCommentsRepliesUiLogic2.f29275h.add(0, comment);
                    } else if (i2 == 2 || i2 == 3) {
                        releaseCommentsRepliesUiLogic2.f29275h.add(comment);
                    }
                    ReleaseComment m15698d = ReleaseCommentsRepliesPresenter.this.f27084d.m15698d();
                    ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic3 = ReleaseCommentsRepliesPresenter.this.f27084d;
                    long j3 = releaseCommentsRepliesUiLogic3.f29277j + 1;
                    releaseCommentsRepliesUiLogic3.f29277j = j3;
                    m15698d.setReplyCount(j3);
                    ReleaseCommentsRepliesPresenter.m15119a(ReleaseCommentsRepliesPresenter.this, false, 1);
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseCommentsRepliesPresenter.this.f27084d.m15698d()));
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15129D();
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15128B();
                }
                return Unit.f63088a;
            }
        }, 16), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onAddComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 17), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: d */
    public final void m15123d(@NotNull final ReleaseComment releaseComment) {
        this.f27081a.m15309c(releaseComment.getId()).m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onDeleteComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleaseCommentsRepliesPresenter.this.getViewState().mo15150q();
                return Unit.f63088a;
            }
        }, 22)).m31368j(new C2617a(this, 1)).m31370l(new C2616b(new Function1<ReleaseCommentDeleteResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onDeleteComment$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentDeleteResponse releaseCommentDeleteResponse) {
                if (releaseCommentDeleteResponse.isSuccess()) {
                    ReleaseComment.this.setDeleted(true);
                    ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter = this;
                    int i2 = releaseCommentsRepliesPresenter.f27084d.f29274g;
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        releaseCommentsRepliesPresenter.getViewState().mo15130F();
                    }
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                    long id2 = ReleaseComment.this.getId();
                    ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = this.f27084d;
                    if (id2 != releaseCommentsRepliesUiLogic.f29270c) {
                        EventBusKt.m16327a(new OnFetchReleaseComment(releaseCommentsRepliesUiLogic.m15698d()));
                    }
                }
                return Unit.f63088a;
            }
        }, 23), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onDeleteComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 24), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m15124e(@NotNull final ReleaseComment releaseComment, @NotNull final String message, boolean z) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        Intrinsics.m32179h(message, "message");
        this.f27081a.m15310d(releaseComment.getId(), message, z).m31370l(new C2616b(new Function1<ReleaseCommentEditResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onEditComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentEditResponse releaseCommentEditResponse) {
                if (releaseCommentEditResponse.isSuccess()) {
                    ReleaseComment.this.setMessage(message);
                    ReleaseComment.this.setEdited(true);
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                }
                return Unit.f63088a;
            }
        }, 18), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onEditComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 19), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m15125f(long j2, @NotNull final String str, @Nullable String str2, @Nullable Long l2, final boolean z, final boolean z2, boolean z3) {
        final ReleaseComment m15697c = this.f27084d.m15697c(j2);
        if (m15697c == null) {
            return;
        }
        this.f27081a.m15311e(j2, str, str2, l2, z, z2, z3).m31370l(new C2616b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onProcessComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    ReleaseComment.this.setMessage(str);
                    ReleaseComment.this.setDeleted(z2);
                    ReleaseComment.this.setSpoiler(z);
                    ReleaseComment.this.setEdited(true);
                    if (z2) {
                        ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter = this;
                        int i2 = releaseCommentsRepliesPresenter.f27084d.f29274g;
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            releaseCommentsRepliesPresenter.getViewState().mo15130F();
                        }
                    }
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                    long id2 = ReleaseComment.this.getId();
                    ReleaseCommentsRepliesPresenter releaseCommentsRepliesPresenter2 = this;
                    ReleaseCommentsRepliesUiLogic releaseCommentsRepliesUiLogic = releaseCommentsRepliesPresenter2.f27084d;
                    if (id2 != releaseCommentsRepliesUiLogic.f29270c) {
                        EventBusKt.m16327a(new OnFetchReleaseComment(releaseCommentsRepliesUiLogic.m15698d()));
                    } else {
                        ReleaseCommentsRepliesPresenter.m15119a(releaseCommentsRepliesPresenter2, false, 1);
                    }
                }
                return Unit.f63088a;
            }
        }, 20), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onProcessComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 21), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m15126h(@NotNull final ReleaseComment releaseComment, final int i2) {
        this.f27081a.m15312f(releaseComment.getId(), i2).m31370l(new C2616b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onVoteComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                Response response2 = response;
                int code = response2.getCode();
                if (code == 2) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15153x();
                } else if (code == 402) {
                    ReleaseCommentsRepliesPresenter.this.getViewState().mo15131G();
                } else if (response2.isSuccess()) {
                    int vote = releaseComment.getVote();
                    if (vote == 0) {
                        int i3 = i2;
                        if (i3 == 1) {
                            releaseComment.setVote(1);
                            ReleaseComment releaseComment2 = releaseComment;
                            releaseComment2.setVoteCount(releaseComment2.getVoteCount() - 1);
                        } else if (i3 == 2) {
                            releaseComment.setVote(2);
                            ReleaseComment releaseComment3 = releaseComment;
                            releaseComment3.setVoteCount(releaseComment3.getVoteCount() + 1);
                        }
                    } else if (vote == 1) {
                        int i4 = i2;
                        if (i4 == 1) {
                            releaseComment.setVote(0);
                            ReleaseComment releaseComment4 = releaseComment;
                            releaseComment4.setVoteCount(releaseComment4.getVoteCount() + 1);
                        } else if (i4 == 2) {
                            releaseComment.setVote(2);
                            ReleaseComment releaseComment5 = releaseComment;
                            releaseComment5.setVoteCount(releaseComment5.getVoteCount() + 2);
                        }
                    } else if (vote == 2) {
                        int i5 = i2;
                        if (i5 == 1) {
                            releaseComment.setVote(1);
                            ReleaseComment releaseComment6 = releaseComment;
                            releaseComment6.setVoteCount(releaseComment6.getVoteCount() - 2);
                        } else if (i5 == 2) {
                            releaseComment.setVote(0);
                            ReleaseComment releaseComment7 = releaseComment;
                            releaseComment7.setVoteCount(releaseComment7.getVoteCount() - 1);
                        }
                    }
                    EventBusKt.m16327a(new OnFetchReleaseComment(releaseComment));
                }
                return Unit.f63088a;
            }
        }, 10), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.replies.ReleaseCommentsRepliesPresenter$onVoteComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 11), Functions.f59621b, Functions.f59622c);
    }
}
