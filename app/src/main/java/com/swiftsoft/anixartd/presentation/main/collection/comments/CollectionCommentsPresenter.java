package com.swiftsoft.anixartd.presentation.main.collection.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.network.Response;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentAddResponse;
import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentDeleteResponse;
import com.swiftsoft.anixartd.network.response.collection.comment.CollectionCommentEditResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.collection.CollectionCommentsUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.collection.CollectionCommentsUiLogic;
import com.swiftsoft.anixartd.presentation.comments.C2553a;
import com.swiftsoft.anixartd.presentation.main.bookmarks.C2557b;
import com.swiftsoft.anixartd.repository.CollectionCommentRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnFetchCollectionComment;
import com.swiftsoft.anixartd.utils.OnUpdateCollectionCommentCount;
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

/* compiled from: CollectionCommentsPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsView;", "Companion", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class CollectionCommentsPresenter extends MvpPresenter<CollectionCommentsView> {

    /* renamed from: a */
    @NotNull
    public CollectionCommentRepository f26091a;

    /* renamed from: b */
    @NotNull
    public Prefs f26092b;

    /* renamed from: c */
    @NotNull
    public Listener f26093c;

    /* renamed from: d */
    @NotNull
    public CollectionCommentsUiLogic f26094d;

    /* renamed from: e */
    @NotNull
    public CollectionCommentsUiController f26095e;

    /* compiled from: CollectionCommentsPresenter.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsPresenter$Companion;", "", "", "COMMENT_DELETED", "I", "COMMENT_SENT", "NOTHING", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    /* compiled from: CollectionCommentsPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/collection/comments/CollectionCommentsPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/collection/CollectionCommentsUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends CollectionCommentsUiController.Listener {
    }

    @Inject
    public CollectionCommentsPresenter(@NotNull CollectionCommentRepository collectionCommentRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(collectionCommentRepository, "collectionCommentRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26091a = collectionCommentRepository;
        this.f26092b = prefs;
        this.f26093c = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.comments.ExtraCommentsModel.Listener
            /* renamed from: a */
            public void mo14425a(int i2) {
                CollectionCommentsPresenter collectionCommentsPresenter = CollectionCommentsPresenter.this;
                collectionCommentsPresenter.f26094d.f28987e = i2;
                collectionCommentsPresenter.getViewState().mo14448l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: b */
            public void mo14426b(long j2) {
                Object obj;
                Iterator<T> it = CollectionCommentsPresenter.this.f26094d.f28988f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((CollectionComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                CollectionComment collectionComment = (CollectionComment) obj;
                if (collectionComment == null || collectionComment.getIsDeleted()) {
                    return;
                }
                CollectionCommentsPresenter.this.getViewState().mo14439R0(collectionComment);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: c */
            public void mo14427c(long j2) {
                Object obj;
                Iterator<T> it = CollectionCommentsPresenter.this.f26094d.f28988f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((CollectionComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                CollectionComment collectionComment = (CollectionComment) obj;
                if (collectionComment != null) {
                    CollectionCommentsPresenter.this.getViewState().mo14437L0(collectionComment);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: e */
            public void mo14428e(long j2) {
                Object obj;
                Iterator<T> it = CollectionCommentsPresenter.this.f26094d.f28988f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((CollectionComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                CollectionComment collectionComment = (CollectionComment) obj;
                if (collectionComment != null) {
                    CollectionCommentsPresenter.this.getViewState().mo14438O2(collectionComment);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: f */
            public void mo14429f(long j2) {
                CollectionCommentsPresenter.this.getViewState().mo14446f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.comments.CommentModel.Listener
            /* renamed from: h */
            public void mo14430h(long j2, int i2) {
                Object obj;
                if (CollectionCommentsPresenter.this.m14418c()) {
                    CollectionCommentsPresenter.this.getViewState().mo14449m();
                    return;
                }
                Iterator<T> it = CollectionCommentsPresenter.this.f26094d.f28988f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((CollectionComment) obj).getId() == j2) {
                            break;
                        }
                    }
                }
                CollectionComment collectionComment = (CollectionComment) obj;
                if (collectionComment != null) {
                    CollectionCommentsPresenter.this.getViewState().mo14444d1(collectionComment, i2);
                }
            }
        };
        this.f26094d = new CollectionCommentsUiLogic();
        this.f26095e = new CollectionCommentsUiController();
    }

    /* renamed from: a */
    public static void m14415a(CollectionCommentsPresenter collectionCommentsPresenter, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        CollectionCommentsUiController collectionCommentsUiController = collectionCommentsPresenter.f26095e;
        CollectionCommentsUiLogic collectionCommentsUiLogic = collectionCommentsPresenter.f26094d;
        collectionCommentsUiController.setData(collectionCommentsUiLogic.f28988f, Long.valueOf(collectionCommentsUiLogic.f28989g), Integer.valueOf(collectionCommentsPresenter.f26094d.f28987e), Boolean.valueOf(z), collectionCommentsPresenter.f26093c);
    }

    /* renamed from: e */
    public static void m14416e(final CollectionCommentsPresenter collectionCommentsPresenter, final int i2, final boolean z, final boolean z2, int i3) {
        if ((i3 & 1) != 0) {
            i2 = 1;
        }
        if ((i3 & 2) != 0) {
            z = collectionCommentsPresenter.f26095e.isEmpty();
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        CollectionCommentRepository collectionCommentRepository = collectionCommentsPresenter.f26091a;
        CollectionCommentsUiLogic collectionCommentsUiLogic = collectionCommentsPresenter.f26094d;
        collectionCommentRepository.f27334a.comments(collectionCommentsUiLogic.f28984b, collectionCommentsUiLogic.f28986d, collectionCommentsUiLogic.f28987e, collectionCommentRepository.f27335b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onComments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                if (z) {
                    collectionCommentsPresenter.getViewState().mo14441b();
                }
                if (z2) {
                    collectionCommentsPresenter.getViewState().mo14443d();
                }
                return Unit.f63088a;
            }
        }, 23)).m31368j(new C2553a(z, collectionCommentsPresenter, z2, 2)).m31370l(new C2557b(new Function1<PageableResponse<CollectionComment>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onComments$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(PageableResponse<CollectionComment> pageableResponse) {
                PageableResponse<CollectionComment> pageableResponse2 = pageableResponse;
                CollectionCommentsUiLogic collectionCommentsUiLogic2 = CollectionCommentsPresenter.this.f26094d;
                List<CollectionComment> collectionComments = pageableResponse2.getContent();
                long totalCount = pageableResponse2.getTotalCount();
                Objects.requireNonNull(collectionCommentsUiLogic2);
                Intrinsics.m32179h(collectionComments, "collectionComments");
                boolean z3 = collectionCommentsUiLogic2.f28991i;
                if (z3) {
                    collectionCommentsUiLogic2.f28988f.addAll(collectionComments);
                    collectionCommentsUiLogic2.f28989g = totalCount;
                } else {
                    if (z3) {
                        collectionCommentsUiLogic2.m15672a();
                    }
                    collectionCommentsUiLogic2.f28988f.addAll(collectionComments);
                    collectionCommentsUiLogic2.f28989g = totalCount;
                    collectionCommentsUiLogic2.f28991i = true;
                }
                CollectionCommentsPresenter collectionCommentsPresenter2 = CollectionCommentsPresenter.this;
                CollectionCommentsUiController collectionCommentsUiController = collectionCommentsPresenter2.f26095e;
                CollectionCommentsUiLogic collectionCommentsUiLogic3 = collectionCommentsPresenter2.f26094d;
                collectionCommentsUiController.setData(collectionCommentsUiLogic3.f28988f, Long.valueOf(collectionCommentsUiLogic3.f28989g), Integer.valueOf(CollectionCommentsPresenter.this.f26094d.f28987e), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), CollectionCommentsPresenter.this.f26093c);
                int i4 = i2;
                if (i4 == 2) {
                    CollectionCommentsPresenter.this.getViewState().mo14432B();
                } else if (i4 == 3) {
                    CollectionCommentsPresenter.this.getViewState().mo14434F();
                }
                return Unit.f63088a;
            }
        }, 24), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onComments$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                CollectionCommentsPresenter.this.getViewState().mo14442c();
                return Unit.f63088a;
            }
        }, 25), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: b */
    public final long m14417b() {
        return this.f26092b.m14061d();
    }

    /* renamed from: c */
    public final boolean m14418c() {
        return this.f26092b.m14083z();
    }

    /* renamed from: d */
    public final void m14419d(@NotNull String str) {
        CollectionCommentRepository collectionCommentRepository = this.f26091a;
        CollectionCommentsUiLogic collectionCommentsUiLogic = this.f26094d;
        collectionCommentRepository.m15279a(collectionCommentsUiLogic.f28984b, null, null, str, collectionCommentsUiLogic.f28990h).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onAddComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                CollectionCommentsPresenter.this.getViewState().mo14454s();
                return Unit.f63088a;
            }
        }, 14)).m31368j(new C2559a(this, 0)).m31370l(new C2557b(new Function1<CollectionCommentAddResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onAddComment$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CollectionCommentAddResponse collectionCommentAddResponse) {
                CollectionCommentAddResponse collectionCommentAddResponse2 = collectionCommentAddResponse;
                int code = collectionCommentAddResponse2.getCode();
                if (code == 7) {
                    CollectionCommentsPresenter.this.getViewState().mo14431A();
                } else if (code == 8) {
                    CollectionCommentsPresenter.this.getViewState().mo14436H();
                } else if (code == 402) {
                    CollectionCommentsPresenter.this.getViewState().mo14451o();
                } else if (collectionCommentAddResponse2.isSuccess()) {
                    CollectionCommentsPresenter collectionCommentsPresenter = CollectionCommentsPresenter.this;
                    CollectionCommentsUiLogic collectionCommentsUiLogic2 = collectionCommentsPresenter.f26094d;
                    int i2 = collectionCommentsUiLogic2.f28987e;
                    if ((i2 == 1 || i2 == 2 || i2 == 3) && collectionCommentsUiLogic2.f28956a) {
                        collectionCommentsUiLogic2.m15672a();
                        CollectionCommentsPresenter.m14416e(collectionCommentsPresenter, 2, false, false, 4);
                    }
                    EventBusKt.m16327a(new OnUpdateCollectionCommentCount(1));
                    CollectionCommentsPresenter.this.getViewState().mo14433D();
                }
                return Unit.f63088a;
            }
        }, 15), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onAddComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 16), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: f */
    public final void m14420f(@NotNull final CollectionComment collectionComment) {
        this.f26091a.m15280b(collectionComment.getId()).m31367i(new C2557b(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onDeleteComment$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Disposable disposable) {
                CollectionCommentsPresenter.this.getViewState().mo14453q();
                return Unit.f63088a;
            }
        }, 26)).m31368j(new C2559a(this, 1)).m31370l(new C2557b(new Function1<CollectionCommentDeleteResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onDeleteComment$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(CollectionCommentDeleteResponse collectionCommentDeleteResponse) {
                if (collectionCommentDeleteResponse.isSuccess()) {
                    CollectionComment.this.setDeleted(true);
                    CollectionCommentsPresenter collectionCommentsPresenter = this;
                    int i2 = collectionCommentsPresenter.f26094d.f28987e;
                    if (i2 == 1 || i2 == 2 || i2 == 3) {
                        collectionCommentsPresenter.getViewState().mo14434F();
                    }
                    EventBusKt.m16327a(new OnUpdateCollectionCommentCount(-1));
                    EventBusKt.m16327a(new OnFetchCollectionComment(CollectionComment.this));
                }
                return Unit.f63088a;
            }
        }, 27), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onDeleteComment$4
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 28), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: g */
    public final void m14421g(@NotNull final CollectionComment collectionComment, @NotNull final String message, boolean z) {
        Intrinsics.m32179h(collectionComment, "collectionComment");
        Intrinsics.m32179h(message, "message");
        this.f26091a.m15281c(collectionComment.getId(), message, z).m31370l(new C2557b(new Function1<CollectionCommentEditResponse, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onEditComment$1
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
        }, 19), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onEditComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 20), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: h */
    public final void m14422h(@NotNull CollectionComment collectionComment) {
        boolean z;
        Intrinsics.m32179h(collectionComment, "collectionComment");
        if (this.f26094d.f28956a) {
            if (collectionComment.getIsDeleted()) {
                z = this.f26094d.m15673b(collectionComment);
            } else {
                CollectionCommentsUiLogic collectionCommentsUiLogic = this.f26094d;
                Objects.requireNonNull(collectionCommentsUiLogic);
                Iterator<CollectionComment> it = collectionCommentsUiLogic.f28988f.iterator();
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
                    collectionCommentsUiLogic.f28988f.set(i2, collectionComment);
                }
                z = i2 >= 0;
            }
            if (z) {
                m14415a(this, false, 1);
            }
        }
    }

    /* renamed from: i */
    public final void m14423i(long j2, @NotNull final String str, @Nullable String str2, @Nullable Long l2, final boolean z, final boolean z2, boolean z3) {
        Object obj;
        Iterator<T> it = this.f26094d.f28988f.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((CollectionComment) obj).getId() == j2) {
                    break;
                }
            }
        }
        final CollectionComment collectionComment = (CollectionComment) obj;
        if (collectionComment == null) {
            return;
        }
        this.f26091a.m15282d(j2, str, str2, l2, z, z2, z3).m31370l(new C2557b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onProcessComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                if (response.isSuccess()) {
                    CollectionComment.this.setMessage(str);
                    CollectionComment.this.setSpoiler(z);
                    CollectionComment.this.setDeleted(z2);
                    CollectionComment.this.setEdited(true);
                    if (z2) {
                        CollectionCommentsPresenter collectionCommentsPresenter = this;
                        int i2 = collectionCommentsPresenter.f26094d.f28987e;
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            collectionCommentsPresenter.getViewState().mo14434F();
                        }
                    }
                    EventBusKt.m16327a(new OnFetchCollectionComment(CollectionComment.this));
                }
                return Unit.f63088a;
            }
        }, 17), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onProcessComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 18), Functions.f59621b, Functions.f59622c);
    }

    /* renamed from: j */
    public final void m14424j(@NotNull final CollectionComment collectionComment, final int i2) {
        this.f26091a.m15283e(collectionComment.getId(), i2).m31370l(new C2557b(new Function1<Response, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onVoteComment$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Response response) {
                Response response2 = response;
                int code = response2.getCode();
                if (code == 2) {
                    CollectionCommentsPresenter.this.getViewState().mo14455x();
                } else if (code == 402) {
                    CollectionCommentsPresenter.this.getViewState().mo14435G();
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
                    CollectionCommentsPresenter.this.m14422h(collectionComment);
                }
                return Unit.f63088a;
            }
        }, 21), new C2557b(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.collection.comments.CollectionCommentsPresenter$onVoteComment$2
            @Override // kotlin.jvm.functions.Function1
            public Unit invoke(Throwable th) {
                th.printStackTrace();
                return Unit.f63088a;
            }
        }, 22), Functions.f59621b, Functions.f59622c);
    }
}
