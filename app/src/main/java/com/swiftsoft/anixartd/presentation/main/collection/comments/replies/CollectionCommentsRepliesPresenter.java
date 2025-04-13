package com.swiftsoft.anixartd.presentation.main.collection.comments.replies;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.Profile;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentAddResponse;
import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentEditResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionCommentsRepliesUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionCommentsRepliesUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.bookmarks.C2557b;
import com.swiftsoft.anixartd.repository.CollectionCommentRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCollectionComment;
import io.reactivex.Observable;
import io.reactivex.Scheduler;
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
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectionCommentsRepliesPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionCommentsRepliesPresenter extends MvpPresenter<CollectionCommentsRepliesView> {

    /* renamed from: a */
    @NotNull
    public CollectionCommentRepository f26134a;

    /* renamed from: b */
    @NotNull
    public Prefs f26135b;

    /* renamed from: c */
    @NotNull
    public Listener f26136c;

    /* renamed from: d */
    @NotNull
    public CollectionCommentsRepliesUiLogic f26137d;

    /* renamed from: e */
    @NotNull
    public CollectionCommentsRepliesUiController f26138e;

    /* compiled from: CollectionCommentsRepliesPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesPresenter$Companion;", "", "", "COMMENT_DELETED", "I", "COMMENT_SENT", "NOTHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CollectionCommentsRepliesPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/replies/CollectionCommentsRepliesPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionCommentsRepliesUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionCommentsRepliesUiController.Listener {
    }

    @Inject
    public CollectionCommentsRepliesPresenter(@NotNull CollectionCommentRepository collectionCommentRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionCommentRepository, "collectionCommentRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26134a = collectionCommentRepository;
        this.f26135b = prefs;
        this.f26136c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentsModel.Listener
            /* renamed from: a */
            public void mo14425a(int i2) {
                CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter = CollectionCommentsRepliesPresenter.this;
                collectionCommentsRepliesPresenter.f26137d.f28978g = i2;
                collectionCommentsRepliesPresenter.getViewState().mo14485l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: b */
            public void mo14426b(long j2) {
                CollectionComment m15670c = CollectionCommentsRepliesPresenter.this.f26137d.m15670c(j2);
                if (m15670c == null || m15670c.getIsDeleted()) {
                    return;
                }
                CollectionCommentsRepliesPresenter.this.getViewState().mo14474R0(m15670c);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: c */
            public void mo14427c(long j2) {
                CollectionComment m15670c = CollectionCommentsRepliesPresenter.this.f26137d.m15670c(j2);
                if (m15670c != null) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14473L0(m15670c);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.replies.ExtraRepliesModel.Listener
            /* renamed from: d */
            public void mo14466d(long j2) {
                CollectionCommentsRepliesPresenter.this.getViewState().mo14480d0(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: e */
            public void mo14428e(long j2) {
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: f */
            public void mo14429f(long j2) {
                CollectionCommentsRepliesPresenter.this.getViewState().mo14483f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: h */
            public void mo14430h(long j2, int i2) {
                if (CollectionCommentsRepliesPresenter.this.m14459c()) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14486m();
                    return;
                }
                CollectionComment m15670c = CollectionCommentsRepliesPresenter.this.f26137d.m15670c(j2);
                if (m15670c != null) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14481d1(m15670c, i2);
                }
            }
        };
        this.f26137d = new CollectionCommentsRepliesUiLogic();
        this.f26138e = new CollectionCommentsRepliesUiController();
    }

    /* renamed from: a */
    public static void m14456a(CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        CollectionCommentsRepliesUiController collectionCommentsRepliesUiController = collectionCommentsRepliesPresenter.f26138e;
        CollectionComment m15671d = collectionCommentsRepliesPresenter.f26137d.m15671d();
        Boolean valueOf = Boolean.valueOf(collectionCommentsRepliesPresenter.f26137d.f28975d);
        CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = collectionCommentsRepliesPresenter.f26137d;
        collectionCommentsRepliesUiController.setData(m15671d, valueOf, collectionCommentsRepliesUiLogic.f28979h, Long.valueOf(collectionCommentsRepliesUiLogic.f28981j), Integer.valueOf(collectionCommentsRepliesPresenter.f26137d.f28978g), Boolean.valueOf(z), collectionCommentsRepliesPresenter.f26136c);
    }

    /* renamed from: i */
    public static void m14457i(final CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter, final int i2, final boolean z, final boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            z = collectionCommentsRepliesPresenter.f26138e.isEmpty();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        CollectionCommentRepository collectionCommentRepository = collectionCommentsRepliesPresenter.f26134a;
        Observable<CollectionComment> comment = collectionCommentRepository.f27334a.comment(collectionCommentsRepliesPresenter.f26137d.f28974c, collectionCommentRepository.f27335b.m14080w());
        Scheduler scheduler = Schedulers.f62901c;
        Observable<CollectionComment> m31369k = comment.m31372n(scheduler).m31369k(AndroidSchedulers.m31390a());
        CollectionCommentRepository collectionCommentRepository2 = collectionCommentsRepliesPresenter.f26134a;
        CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = collectionCommentsRepliesPresenter.f26137d;
        Observables.f62894a.m31860a(m31369k, collectionCommentRepository2.f27334a.replies(collectionCommentsRepliesUiLogic.f28974c, 0, collectionCommentsRepliesUiLogic.f28978g, collectionCommentRepository2.f27335b.m14080w()).m31372n(scheduler).m31369k(AndroidSchedulers.m31390a())).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onReplies$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    collectionCommentsRepliesPresenter.getViewState().mo14477b();
                }
                if (z2) {
                    collectionCommentsRepliesPresenter.getViewState().mo14479d();
                }
                return Unit.f63088a;
            }
        }, 29)).m31368j(new C2553a(z, collectionCommentsRepliesPresenter, z2, 3)).m31370l(new C2561b(new Function1<Pair<? extends CollectionComment, ? extends PageableResponse<CollectionComment>>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onReplies$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Pair<? extends CollectionComment, ? extends PageableResponse<CollectionComment>> pair) {
                Pair<? extends CollectionComment, ? extends PageableResponse<CollectionComment>> pair2 = pair;
                CollectionComment collectionComment = (CollectionComment) pair2.f63055b;
                PageableResponse pageableResponse = (PageableResponse) pair2.f63056c;
                CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic2 = CollectionCommentsRepliesPresenter.this.f26137d;
                Objects.requireNonNull(collectionCommentsRepliesUiLogic2);
                Intrinsics.m32179h(collectionComment, "<set-?>");
                collectionCommentsRepliesUiLogic2.f28977f = collectionComment;
                CollectionCommentsRepliesPresenter.this.f26137d.f28976e = collectionComment.getIsDeleted();
                CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic3 = CollectionCommentsRepliesPresenter.this.f26137d;
                List replies = pageableResponse.getContent();
                long totalCount = pageableResponse.getTotalCount();
                Objects.requireNonNull(collectionCommentsRepliesUiLogic3);
                Intrinsics.m32179h(replies, "replies");
                boolean z3 = collectionCommentsRepliesUiLogic3.f28980i;
                if (z3) {
                    collectionCommentsRepliesUiLogic3.f28979h.addAll(replies);
                    collectionCommentsRepliesUiLogic3.f28981j = totalCount;
                } else {
                    if (z3) {
                        collectionCommentsRepliesUiLogic3.m15668a();
                    }
                    collectionCommentsRepliesUiLogic3.f28979h.addAll(replies);
                    collectionCommentsRepliesUiLogic3.f28981j = totalCount;
                    collectionCommentsRepliesUiLogic3.f28980i = true;
                }
                CollectionCommentsRepliesPresenter.m14456a(CollectionCommentsRepliesPresenter.this, false, 1);
                int i4 = i2;
                if (i4 == 2) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14468B();
                } else if (i4 == 3) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14470F();
                }
                CollectionCommentsRepliesPresenter.this.getViewState().mo14475R3(collectionComment);
                return Unit.f63088a;
            }
        }, 0), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onReplies$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CollectionCommentsRepliesPresenter.this.getViewState().mo14478c();
                return Unit.f63088a;
            }
        }, 1), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final long m14458b() {
        return this.f26135b.m14061d();
    }

    /* renamed from: c */
    public final boolean m14459c() {
        return this.f26135b.m14083z();
    }

    /* renamed from: d */
    public final void m14460d(@NotNull String str) {
        CollectionCommentRepository collectionCommentRepository = this.f26134a;
        CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = this.f26137d;
        long j2 = collectionCommentsRepliesUiLogic.f28973b;
        Long valueOf = Long.valueOf(collectionCommentsRepliesUiLogic.m15671d().getId());
        Profile profile = this.f26137d.f28982k;
        collectionCommentRepository.m15279a(j2, valueOf, profile != null ? Long.valueOf(profile.getId()) : null, str, this.f26137d.f28983l).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onAddComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                CollectionCommentsRepliesPresenter.this.getViewState().mo14491s();
                return Unit.f63088a;
            }
        }, 8)).m31368j(new C2560a(this, 0)).m31370l(new C2561b(new Function1<CollectionCommentAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onAddComment$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CollectionCommentAddResponse collectionCommentAddResponse) {
                CollectionComment comment;
                CollectionCommentAddResponse collectionCommentAddResponse2 = collectionCommentAddResponse;
                int code = collectionCommentAddResponse2.getCode();
                if (code == 7) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14467A();
                } else if (code == 8) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14472H();
                } else if (code == 402) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14488o();
                } else if (collectionCommentAddResponse2.isSuccess() && (comment = collectionCommentAddResponse2.getComment()) != null) {
                    CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic2 = CollectionCommentsRepliesPresenter.this.f26137d;
                    int i2 = collectionCommentsRepliesUiLogic2.f28978g;
                    if (i2 == 1) {
                        collectionCommentsRepliesUiLogic2.f28979h.add(0, comment);
                    } else if (i2 == 2 || i2 == 3) {
                        collectionCommentsRepliesUiLogic2.f28979h.add(comment);
                    }
                    CollectionComment m15671d = CollectionCommentsRepliesPresenter.this.f26137d.m15671d();
                    CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic3 = CollectionCommentsRepliesPresenter.this.f26137d;
                    long j3 = collectionCommentsRepliesUiLogic3.f28981j + 1;
                    collectionCommentsRepliesUiLogic3.f28981j = j3;
                    m15671d.setReplyCount(j3);
                    CollectionCommentsRepliesPresenter.m14456a(CollectionCommentsRepliesPresenter.this, false, 1);
                    EventBusKt.m16327a(new OnFetchCollectionComment(CollectionCommentsRepliesPresenter.this.f26137d.m15671d()));
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14469D();
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14468B();
                }
                return Unit.f63088a;
            }
        }, 9), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onAddComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 10), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: e */
    public final void m14461e(@NotNull final CollectionComment collectionComment) {
        this.f26134a.m15280b(collectionComment.getId()).m31367i(new C2561b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onDeleteComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                CollectionCommentsRepliesPresenter.this.getViewState().mo14490q();
                return Unit.f63088a;
            }
        }, 11)).m31368j(new C2560a(this, 1)).m31370l(new C2561b(new Function1<CollectionCommentDeleteResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onDeleteComment$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CollectionCommentDeleteResponse collectionCommentDeleteResponse) {
                if (collectionCommentDeleteResponse.isSuccess()) {
                    CollectionComment.this.setDeleted(true);
                    CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter = this;
                    int i2 = collectionCommentsRepliesPresenter.f26137d.f28978g;
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        collectionCommentsRepliesPresenter.getViewState().mo14470F();
                    }
                    EventBusKt.m16327a(new OnFetchCollectionComment(CollectionComment.this));
                    long id2 = CollectionComment.this.getId();
                    CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = this.f26137d;
                    if (id2 != collectionCommentsRepliesUiLogic.f28974c) {
                        EventBusKt.m16327a(new OnFetchCollectionComment(collectionCommentsRepliesUiLogic.m15671d()));
                    }
                }
                return Unit.f63088a;
            }
        }, 12), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onDeleteComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 13), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m14462f(@NotNull final CollectionComment collectionComment, @NotNull final String message, boolean z) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        Intrinsics.m32179h(message, "message");
        this.f26134a.m15281c(collectionComment.getId(), message, z).m31370l(new C2561b(new Function1<CollectionCommentEditResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onEditComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CollectionCommentEditResponse collectionCommentEditResponse) {
                if (collectionCommentEditResponse.isSuccess()) {
                    CollectionComment.this.setMessage(message);
                    CollectionComment.this.setEdited(true);
                    EventBusKt.m16327a(new OnFetchCollectionComment(CollectionComment.this));
                }
                return Unit.f63088a;
            }
        }, 6), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onEditComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 7), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m14463g(@NotNull CollectionComment collectionComment) {
        boolean m15669b;
        Intrinsics.m32179h(collectionComment, "collectionComment");
        if (this.f26137d.f28956a) {
            if (collectionComment.getIsDeleted()) {
                long id2 = collectionComment.getId();
                CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = this.f26137d;
                if (id2 != collectionCommentsRepliesUiLogic.f28974c) {
                    Objects.requireNonNull(collectionCommentsRepliesUiLogic);
                    Iterator<CollectionComment> it = collectionCommentsRepliesUiLogic.f28979h.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        } else {
                            if (it.next().getId() == collectionComment.getId()) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    if (i2 >= 0) {
                        CollectionComment m15671d = collectionCommentsRepliesUiLogic.m15671d();
                        long j2 = collectionCommentsRepliesUiLogic.f28981j - 1;
                        collectionCommentsRepliesUiLogic.f28981j = j2;
                        m15671d.setReplyCount(j2);
                        collectionCommentsRepliesUiLogic.f28979h.remove(i2);
                    }
                    if (i2 >= 0) {
                        m15669b = true;
                    }
                    m15669b = false;
                } else if (collectionCommentsRepliesUiLogic.f28976e) {
                    m15669b = collectionCommentsRepliesUiLogic.m15669b(collectionComment);
                } else {
                    getViewState().mo14492v0();
                    m15669b = false;
                }
            } else {
                m15669b = this.f26137d.m15669b(collectionComment);
            }
            if (m15669b) {
                m14456a(this, false, 1);
            }
        }
    }

    /* renamed from: h */
    public final void m14464h(long j2, @NotNull final String str, @Nullable String str2, @Nullable Long l2, final boolean z, final boolean z2, boolean z3) {
        final CollectionComment m15670c = this.f26137d.m15670c(j2);
        if (m15670c == null) {
            return;
        }
        this.f26134a.m15282d(j2, str, str2, l2, z, z2, z3).m31370l(new C2561b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onProcessComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    CollectionComment.this.setMessage(str);
                    CollectionComment.this.setDeleted(z2);
                    CollectionComment.this.setSpoiler(z);
                    CollectionComment.this.setEdited(true);
                    if (z2) {
                        CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter = this;
                        int i2 = collectionCommentsRepliesPresenter.f26137d.f28978g;
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            collectionCommentsRepliesPresenter.getViewState().mo14470F();
                        }
                    }
                    EventBusKt.m16327a(new OnFetchCollectionComment(CollectionComment.this));
                    long id2 = CollectionComment.this.getId();
                    CollectionCommentsRepliesPresenter collectionCommentsRepliesPresenter2 = this;
                    CollectionCommentsRepliesUiLogic collectionCommentsRepliesUiLogic = collectionCommentsRepliesPresenter2.f26137d;
                    if (id2 != collectionCommentsRepliesUiLogic.f28974c) {
                        EventBusKt.m16327a(new OnFetchCollectionComment(collectionCommentsRepliesUiLogic.m15671d()));
                    } else {
                        CollectionCommentsRepliesPresenter.m14456a(collectionCommentsRepliesPresenter2, false, 1);
                    }
                }
                return Unit.f63088a;
            }
        }, 2), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onProcessComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 3), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: j */
    public final void m14465j(@NotNull final CollectionComment collectionComment, final int i2) {
        this.f26134a.m15283e(collectionComment.getId(), i2).m31370l(new C2561b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onVoteComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                Response response2 = response;
                int code = response2.getCode();
                if (code == 2) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14493x();
                } else if (code == 402) {
                    CollectionCommentsRepliesPresenter.this.getViewState().mo14471G();
                } else if (response2.isSuccess()) {
                    int vote = collectionComment.getVote();
                    if (vote == 0) {
                        int i3 = i2;
                        if (i3 == 1) {
                            collectionComment.setVote(1);
                            CollectionComment collectionComment2 = collectionComment;
                            collectionComment2.setVoteCount(collectionComment2.getVoteCount() - 1);
                        } else if (i3 == 2) {
                            collectionComment.setVote(2);
                            CollectionComment collectionComment3 = collectionComment;
                            collectionComment3.setVoteCount(collectionComment3.getVoteCount() + 1);
                        }
                    } else if (vote == 1) {
                        int i4 = i2;
                        if (i4 == 1) {
                            collectionComment.setVote(0);
                            CollectionComment collectionComment4 = collectionComment;
                            collectionComment4.setVoteCount(collectionComment4.getVoteCount() + 1);
                        } else if (i4 == 2) {
                            collectionComment.setVote(2);
                            CollectionComment collectionComment5 = collectionComment;
                            collectionComment5.setVoteCount(collectionComment5.getVoteCount() + 2);
                        }
                    } else if (vote == 2) {
                        int i5 = i2;
                        if (i5 == 1) {
                            collectionComment.setVote(1);
                            CollectionComment collectionComment6 = collectionComment;
                            collectionComment6.setVoteCount(collectionComment6.getVoteCount() - 2);
                        } else if (i5 == 2) {
                            collectionComment.setVote(0);
                            CollectionComment collectionComment7 = collectionComment;
                            collectionComment7.setVoteCount(collectionComment7.getVoteCount() - 1);
                        }
                    }
                    CollectionCommentsRepliesPresenter.this.m14463g(collectionComment);
                }
                return Unit.f63088a;
            }
        }, 4), new C2561b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.replies.CollectionCommentsRepliesPresenter$onVoteComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 5), Functions.f59621b, Functions.f59622c);
    }
}
