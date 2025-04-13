package com.swiftsoft.anixartd.presentation.main.release.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentAddResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.release.comment.ReleaseCommentEditResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.release.ReleaseCommentsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.release.ReleaseCommentsUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.release.C2614b;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchReleaseComment;
import io.reactivex.Observable;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: ReleaseCommentsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ReleaseCommentsPresenter extends MvpPresenter<ReleaseCommentsView> {

    /* renamed from: a */
    @NotNull
    public ReleaseCommentRepository f27036a;

    /* renamed from: b */
    @NotNull
    public Prefs f27037b;

    /* renamed from: c */
    @NotNull
    public Listener f27038c;

    /* renamed from: d */
    @NotNull
    public ReleaseCommentsUiLogic f27039d;

    /* renamed from: e */
    @NotNull
    public ReleaseCommentsUiController f27040e;

    /* compiled from: ReleaseCommentsPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsPresenter$Companion;", "", "", "COMMENT_DELETED", "I", "COMMENT_SENT", "NOTHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: ReleaseCommentsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/release/comments/ReleaseCommentsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/release/ReleaseCommentsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ReleaseCommentsUiController.Listener {
    }

    @Inject
    public ReleaseCommentsPresenter(@NotNull ReleaseCommentRepository releaseCommentRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseCommentRepository, "releaseCommentRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f27036a = releaseCommentRepository;
        this.f27037b = prefs;
        this.f27038c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentsModel.Listener
            /* renamed from: a */
            public void mo14425a(int i2) {
                ReleaseCommentsPresenter releaseCommentsPresenter = ReleaseCommentsPresenter.this;
                releaseCommentsPresenter.f27039d.f29283e = i2;
                releaseCommentsPresenter.getViewState().mo15110l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: b */
            public void mo14426b(long j2) {
                Object obj;
                Iterator<T> it = ReleaseCommentsPresenter.this.f27039d.f29284f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment == null || releaseComment.getIsDeleted()) {
                    return;
                }
                ReleaseCommentsPresenter.this.getViewState().mo15100U(releaseComment);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: c */
            public void mo14427c(long j2) {
                Object obj;
                Iterator<T> it = ReleaseCommentsPresenter.this.f27039d.f29284f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment != null) {
                    ReleaseCommentsPresenter.this.getViewState().mo15102X(releaseComment);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: e */
            public void mo14428e(long j2) {
                Object obj;
                Iterator<T> it = ReleaseCommentsPresenter.this.f27039d.f29284f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment != null) {
                    ReleaseCommentsPresenter.this.getViewState().mo15118z0(releaseComment);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: f */
            public void mo14429f(long j2) {
                ReleaseCommentsPresenter.this.getViewState().mo15109f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: h */
            public void mo14430h(long j2, int i2) {
                Object obj;
                if (ReleaseCommentsPresenter.this.m15088b()) {
                    ReleaseCommentsPresenter.this.getViewState().mo15111m();
                    return;
                }
                Iterator<T> it = ReleaseCommentsPresenter.this.f27039d.f29284f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((ReleaseComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                ReleaseComment releaseComment = (ReleaseComment) obj;
                if (releaseComment != null) {
                    ReleaseCommentsPresenter.this.getViewState().mo15101W(releaseComment, i2);
                }
            }
        };
        this.f27039d = new ReleaseCommentsUiLogic();
        this.f27040e = new ReleaseCommentsUiController();
    }

    /* renamed from: a */
    public static void m15086a(ReleaseCommentsPresenter releaseCommentsPresenter, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        ReleaseCommentsUiController releaseCommentsUiController = releaseCommentsPresenter.f27040e;
        ReleaseCommentsUiLogic releaseCommentsUiLogic = releaseCommentsPresenter.f27039d;
        releaseCommentsUiController.setData(releaseCommentsUiLogic.f29284f, Long.valueOf(releaseCommentsUiLogic.f29285g), Integer.valueOf(releaseCommentsPresenter.f27039d.f29283e), Boolean.valueOf(z), releaseCommentsPresenter.f27038c);
    }

    /* renamed from: d */
    public static void m15087d(final ReleaseCommentsPresenter releaseCommentsPresenter, final int i2, final boolean z, final boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            z = releaseCommentsPresenter.f27040e.isEmpty();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        ReleaseCommentRepository releaseCommentRepository = releaseCommentsPresenter.f27036a;
        ReleaseCommentsUiLogic releaseCommentsUiLogic = releaseCommentsPresenter.f27039d;
        releaseCommentRepository.f27380a.comments(releaseCommentsUiLogic.f29280b, releaseCommentsUiLogic.f29282d, releaseCommentsUiLogic.f29283e, releaseCommentRepository.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2614b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onComments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    releaseCommentsPresenter.getViewState().mo15104b();
                }
                if (z2) {
                    releaseCommentsPresenter.getViewState().mo15107d();
                }
                return Unit.f63088a;
            }
        }, 29)).m31368j(new C2553a(z, releaseCommentsPresenter, z2, 17)).m31370l(new C2616b(new Function1<PageableResponse<ReleaseComment>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onComments$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<ReleaseComment> pageableResponse) {
                PageableResponse<ReleaseComment> pageableResponse2 = pageableResponse;
                ReleaseCommentsUiLogic releaseCommentsUiLogic2 = ReleaseCommentsPresenter.this.f27039d;
                List<ReleaseComment> releaseComments = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(releaseCommentsUiLogic2);
                Intrinsics.m32179h(releaseComments, "releaseComments");
                boolean z3 = releaseCommentsUiLogic2.f29287i;
                if (z3) {
                    releaseCommentsUiLogic2.f29284f.addAll(releaseComments);
                    releaseCommentsUiLogic2.f29285g = totalCount;
                } else {
                    if (z3) {
                        releaseCommentsUiLogic2.m15699a();
                    }
                    releaseCommentsUiLogic2.f29284f.addAll(releaseComments);
                    releaseCommentsUiLogic2.f29285g = totalCount;
                    releaseCommentsUiLogic2.f29287i = true;
                }
                ReleaseCommentsPresenter releaseCommentsPresenter2 = ReleaseCommentsPresenter.this;
                ReleaseCommentsUiController releaseCommentsUiController = releaseCommentsPresenter2.f27040e;
                ReleaseCommentsUiLogic releaseCommentsUiLogic3 = releaseCommentsPresenter2.f27039d;
                releaseCommentsUiController.setData(releaseCommentsUiLogic3.f29284f, Long.valueOf(releaseCommentsUiLogic3.f29285g), Integer.valueOf(ReleaseCommentsPresenter.this.f27039d.f29283e), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ReleaseCommentsPresenter.this.f27038c);
                int i4 = i2;
                if (i4 == 2) {
                    ReleaseCommentsPresenter.this.getViewState().mo15095B();
                } else if (i4 == 3) {
                    ReleaseCommentsPresenter.this.getViewState().mo15097F();
                }
                return Unit.f63088a;
            }
        }, 0), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onComments$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                ReleaseCommentsPresenter.this.getViewState().mo15105c();
                return Unit.f63088a;
            }
        }, 1), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final boolean m15088b() {
        return this.f27037b.m14083z();
    }

    /* renamed from: c */
    public final void m15089c(@NotNull String str) {
        Observable m15308a;
        ReleaseCommentRepository releaseCommentRepository = this.f27036a;
        ReleaseCommentsUiLogic releaseCommentsUiLogic = this.f27039d;
        m15308a = releaseCommentRepository.m15308a(releaseCommentsUiLogic.f29280b, null, null, str, releaseCommentsUiLogic.f29286h);
        m15308a.m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onAddComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleaseCommentsPresenter.this.getViewState().mo15116s();
                return Unit.f63088a;
            }
        }, 4)).m31368j(new C2615a(this, 0)).m31370l(new C2616b(new Function1<ReleaseCommentAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onAddComment$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentAddResponse releaseCommentAddResponse) {
                ReleaseCommentAddResponse releaseCommentAddResponse2 = releaseCommentAddResponse;
                int code = releaseCommentAddResponse2.getCode();
                if (code == 7) {
                    ReleaseCommentsPresenter.this.getViewState().mo15094A();
                } else if (code == 8) {
                    ReleaseCommentsPresenter.this.getViewState().mo15099H();
                } else if (code == 402) {
                    ReleaseCommentsPresenter.this.getViewState().mo15113o();
                } else if (releaseCommentAddResponse2.isSuccess()) {
                    ReleaseCommentsPresenter releaseCommentsPresenter = ReleaseCommentsPresenter.this;
                    ReleaseCommentsUiLogic releaseCommentsUiLogic2 = releaseCommentsPresenter.f27039d;
                    int i2 = releaseCommentsUiLogic2.f29283e;
                    if ((i2 == 1 || i2 == 2 || i2 == 3) && releaseCommentsUiLogic2.f28956a) {
                        releaseCommentsUiLogic2.m15699a();
                        ReleaseCommentsPresenter.m15087d(releaseCommentsPresenter, 2, false, false, 4);
                    }
                    ReleaseCommentsPresenter.this.getViewState().mo15096D();
                }
                return Unit.f63088a;
            }
        }, 5), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onAddComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 6), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m15090e(@NotNull final ReleaseComment releaseComment) {
        this.f27036a.m15309c(releaseComment.getId()).m31367i(new C2616b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onDeleteComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                ReleaseCommentsPresenter.this.getViewState().mo15115q();
                return Unit.f63088a;
            }
        }, 7)).m31368j(new C2615a(this, 1)).m31370l(new C2616b(new Function1<ReleaseCommentDeleteResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onDeleteComment$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(ReleaseCommentDeleteResponse releaseCommentDeleteResponse) {
                if (releaseCommentDeleteResponse.isSuccess()) {
                    ReleaseComment.this.setDeleted(true);
                    ReleaseCommentsPresenter releaseCommentsPresenter = this;
                    int i2 = releaseCommentsPresenter.f27039d.f29283e;
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        releaseCommentsPresenter.getViewState().mo15097F();
                    }
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                }
                return Unit.f63088a;
            }
        }, 8), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onDeleteComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 9), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m15091f(@NotNull final ReleaseComment releaseComment, @NotNull final String message, boolean z) {
        Intrinsics.m32179h(releaseComment, "releaseComment");
        Intrinsics.m32179h(message, "message");
        this.f27036a.m15310d(releaseComment.getId(), message, z).m31370l(new C2616b(new Function1<ReleaseCommentEditResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onEditComment$1
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
        }, 2), new C2616b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onEditComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m15092g(long j2, @NotNull final String str, @Nullable String str2, @Nullable Long l2, final boolean z, final boolean z2, boolean z3) {
        Object obj;
        Iterator<T> it = this.f27039d.f29284f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((ReleaseComment) obj).getId() == j2) {
                    break;
                }
            }
        }
        final ReleaseComment releaseComment = (ReleaseComment) obj;
        if (releaseComment == null) {
            return;
        }
        this.f27036a.m15311e(j2, str, str2, l2, z, z2, z3).m31370l(new C2614b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onProcessComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    ReleaseComment.this.setMessage(str);
                    ReleaseComment.this.setSpoiler(z);
                    ReleaseComment.this.setDeleted(z2);
                    ReleaseComment.this.setEdited(true);
                    if (z2) {
                        ReleaseCommentsPresenter releaseCommentsPresenter = this;
                        int i2 = releaseCommentsPresenter.f27039d.f29283e;
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            releaseCommentsPresenter.getViewState().mo15097F();
                        }
                    }
                    EventBusKt.m16327a(new OnFetchReleaseComment(ReleaseComment.this));
                }
                return Unit.f63088a;
            }
        }, 27), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onProcessComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m15093h(@NotNull final ReleaseComment releaseComment, final int i2) {
        this.f27036a.m15312f(releaseComment.getId(), i2).m31370l(new C2614b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onVoteComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                Response response2 = response;
                int code = response2.getCode();
                if (code == 2) {
                    ReleaseCommentsPresenter.this.getViewState().mo15117x();
                } else if (code == 402) {
                    ReleaseCommentsPresenter.this.getViewState().mo15098G();
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
        }, 25), new C2614b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.release.comments.ReleaseCommentsPresenter$onVoteComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 26), Functions.f59621b, Functions.f59622c);
    }
}
