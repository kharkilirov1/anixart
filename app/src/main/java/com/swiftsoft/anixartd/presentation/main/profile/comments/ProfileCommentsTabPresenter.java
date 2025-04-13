package com.swiftsoft.anixartd.presentation.main.profile.comments;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.CollectionComment;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.comments.ProfileCommentsTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.comments.ProfileCommentsTabUiLogic;
import com.swiftsoft.anixartd.presentation.main.profile.C2600c;
import com.swiftsoft.anixartd.repository.CollectionCommentRepository;
import com.swiftsoft.anixartd.repository.ReleaseCommentRepository;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
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

/* compiled from: ProfileCommentsTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/comments/ProfileCommentsTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/comments/ProfileCommentsTabView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileCommentsTabPresenter extends MvpPresenter<ProfileCommentsTabView> {

    /* renamed from: a */
    @NotNull
    public ReleaseCommentRepository f26697a;

    /* renamed from: b */
    @NotNull
    public CollectionCommentRepository f26698b;

    /* renamed from: c */
    @NotNull
    public Prefs f26699c;

    /* renamed from: d */
    @NotNull
    public ProfileCommentsTabUiLogic f26700d;

    /* renamed from: e */
    @NotNull
    public ProfileCommentsTabUiController f26701e;

    /* renamed from: f */
    @NotNull
    public Listener f26702f;

    /* compiled from: ProfileCommentsTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/comments/ProfileCommentsTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/comments/ProfileCommentsTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileCommentsTabUiController.Listener {
    }

    @Inject
    public ProfileCommentsTabPresenter(@NotNull ReleaseCommentRepository releaseCommentRepository, @NotNull CollectionCommentRepository collectionCommentRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(releaseCommentRepository, "releaseCommentRepository");
        Intrinsics.m32179h(collectionCommentRepository, "collectionCommentRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26697a = releaseCommentRepository;
        this.f26698b = collectionCommentRepository;
        this.f26699c = prefs;
        this.f26700d = new ProfileCommentsTabUiLogic();
        this.f26701e = new ProfileCommentsTabUiController();
        this.f26702f = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.profile.comments.ProfileReleaseCommentModel.Listener
            /* renamed from: N */
            public void mo14864N(long j2, long j3, long j4) {
                ProfileCommentsTabPresenter.this.getViewState().mo14868N(j2, j3, j4);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.comments.ExtraProfileCommentsModel.Listener
            /* renamed from: a */
            public void mo14865a(int i2) {
                ProfileCommentsTabPresenter profileCommentsTabPresenter = ProfileCommentsTabPresenter.this;
                profileCommentsTabPresenter.f26700d.f29189f = i2;
                profileCommentsTabPresenter.getViewState().mo14875l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.comments.ProfileReleaseCommentModel.Listener, com.swiftsoft.anixartd.ui.model.main.profile.comments.ProfileCollectionCommentModel.Listener
            /* renamed from: f */
            public void mo14866f(long j2) {
                ProfileCommentsTabPresenter.this.getViewState().mo14874f(j2);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.profile.comments.ProfileCollectionCommentModel.Listener
            /* renamed from: y0 */
            public void mo14867y0(long j2, long j3, long j4) {
                ProfileCommentsTabPresenter.this.getViewState().mo14876y0(j2, j3, j4);
            }
        };
    }

    /* renamed from: c */
    public static /* synthetic */ void m14859c(ProfileCommentsTabPresenter profileCommentsTabPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileCommentsTabPresenter.m14860a();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileCommentsTabPresenter.m14861b(z, z2);
    }

    /* renamed from: a */
    public final boolean m14860a() {
        return this.f26701e.isEmpty();
    }

    /* renamed from: b */
    public final void m14861b(final boolean z, final boolean z2) {
        String str = this.f26700d.f29186c;
        if (Intrinsics.m32174c(str, "INNER_TAB_PROFILE_COMMENTS_RELEASE")) {
            ReleaseCommentRepository releaseCommentRepository = this.f26697a;
            ProfileCommentsTabUiLogic profileCommentsTabUiLogic = this.f26700d;
            Observable<PageableResponse<ReleaseComment>> m31367i = releaseCommentRepository.f27380a.profileComments(profileCommentsTabUiLogic.f29185b, profileCommentsTabUiLogic.f29187d, profileCommentsTabUiLogic.f29189f, releaseCommentRepository.f27381b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2600c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$onProfileReleaseComments$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14870b();
                    }
                    if (z2) {
                        this.getViewState().mo14872d();
                    }
                    return Unit.f63088a;
                }
            }, 19));
            final int i2 = 0;
            m31367i.m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.a

                /* renamed from: c */
                public final /* synthetic */ ProfileCommentsTabPresenter f26725c;

                {
                    this.f26725c = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    switch (i2) {
                        case 0:
                            ProfileCommentsTabPresenter this$0 = this.f26725c;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.getViewState().mo14869a();
                            this$0.getViewState().mo14873e();
                            break;
                        default:
                            ProfileCommentsTabPresenter this$02 = this.f26725c;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.getViewState().mo14869a();
                            this$02.getViewState().mo14873e();
                            break;
                    }
                }
            }).m31370l(new C2600c(new Function1<PageableResponse<ReleaseComment>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$onProfileReleaseComments$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(PageableResponse<ReleaseComment> pageableResponse) {
                    PageableResponse<ReleaseComment> pageableResponse2 = pageableResponse;
                    ProfileCommentsTabUiLogic profileCommentsTabUiLogic2 = ProfileCommentsTabPresenter.this.f26700d;
                    List<ReleaseComment> releaseComments = pageableResponse2.getContent();
                    Objects.requireNonNull(profileCommentsTabUiLogic2);
                    Intrinsics.m32179h(releaseComments, "releaseComments");
                    boolean z3 = profileCommentsTabUiLogic2.f29192i;
                    if (z3) {
                        profileCommentsTabUiLogic2.f29190g.addAll(releaseComments);
                    } else {
                        if (z3) {
                            profileCommentsTabUiLogic2.m15687a();
                        }
                        profileCommentsTabUiLogic2.f29190g.addAll(releaseComments);
                        profileCommentsTabUiLogic2.f29192i = true;
                    }
                    ProfileCommentsTabPresenter.this.f26700d.f29188e = pageableResponse2.getTotalCount();
                    ProfileCommentsTabPresenter profileCommentsTabPresenter = ProfileCommentsTabPresenter.this;
                    ProfileCommentsTabUiController profileCommentsTabUiController = profileCommentsTabPresenter.f26701e;
                    Integer valueOf = Integer.valueOf(profileCommentsTabPresenter.f26699c.m14081x());
                    ProfileCommentsTabUiLogic profileCommentsTabUiLogic3 = ProfileCommentsTabPresenter.this.f26700d;
                    profileCommentsTabUiController.setData(valueOf, profileCommentsTabUiLogic3.f29190g, profileCommentsTabUiLogic3.f29191h, profileCommentsTabUiLogic3.f29186c, Long.valueOf(profileCommentsTabUiLogic3.f29188e), Integer.valueOf(ProfileCommentsTabPresenter.this.f26700d.f29189f), Boolean.valueOf(ProfileCommentsTabPresenter.this.f26700d.f29194k), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileCommentsTabPresenter.this.f26702f);
                    if (pageableResponse2.getContent().isEmpty()) {
                        ProfileCommentsTabUiLogic profileCommentsTabUiLogic4 = ProfileCommentsTabPresenter.this.f26700d;
                        profileCommentsTabUiLogic4.f29187d--;
                    }
                    return Unit.f63088a;
                }
            }, 20), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$onProfileReleaseComments$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    if (ProfileCommentsTabPresenter.this.m14860a()) {
                        ProfileCommentsTabPresenter.this.getViewState().mo14871c();
                    }
                    return Unit.f63088a;
                }
            }, 21), Functions.f59621b, Functions.f59622c);
            return;
        }
        if (Intrinsics.m32174c(str, "INNER_TAB_PROFILE_COMMENTS_COLLECTIONS")) {
            CollectionCommentRepository collectionCommentRepository = this.f26698b;
            ProfileCommentsTabUiLogic profileCommentsTabUiLogic2 = this.f26700d;
            Observable<PageableResponse<CollectionComment>> m31367i2 = collectionCommentRepository.f27334a.profileComments(profileCommentsTabUiLogic2.f29185b, profileCommentsTabUiLogic2.f29187d, profileCommentsTabUiLogic2.f29189f, collectionCommentRepository.f27335b.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2600c(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$onProfileCollectionComments$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Disposable disposable) {
                    if (z) {
                        this.getViewState().mo14870b();
                    }
                    if (z2) {
                        this.getViewState().mo14872d();
                    }
                    return Unit.f63088a;
                }
            }, 22));
            final int i3 = 1;
            m31367i2.m31368j(new Action(this) { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.a

                /* renamed from: c */
                public final /* synthetic */ ProfileCommentsTabPresenter f26725c;

                {
                    this.f26725c = this;
                }

                @Override // io.reactivex.functions.Action
                public final void run() {
                    switch (i3) {
                        case 0:
                            ProfileCommentsTabPresenter this$0 = this.f26725c;
                            Intrinsics.m32179h(this$0, "this$0");
                            this$0.getViewState().mo14869a();
                            this$0.getViewState().mo14873e();
                            break;
                        default:
                            ProfileCommentsTabPresenter this$02 = this.f26725c;
                            Intrinsics.m32179h(this$02, "this$0");
                            this$02.getViewState().mo14869a();
                            this$02.getViewState().mo14873e();
                            break;
                    }
                }
            }).m31370l(new C2600c(new Function1<PageableResponse<CollectionComment>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$onProfileCollectionComments$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(PageableResponse<CollectionComment> pageableResponse) {
                    PageableResponse<CollectionComment> pageableResponse2 = pageableResponse;
                    ProfileCommentsTabUiLogic profileCommentsTabUiLogic3 = ProfileCommentsTabPresenter.this.f26700d;
                    List<CollectionComment> collectionComments = pageableResponse2.getContent();
                    Objects.requireNonNull(profileCommentsTabUiLogic3);
                    Intrinsics.m32179h(collectionComments, "collectionComments");
                    boolean z3 = profileCommentsTabUiLogic3.f29193j;
                    if (z3) {
                        profileCommentsTabUiLogic3.f29191h.addAll(collectionComments);
                    } else {
                        if (z3) {
                            profileCommentsTabUiLogic3.f29191h.clear();
                        }
                        profileCommentsTabUiLogic3.f29191h.addAll(collectionComments);
                        profileCommentsTabUiLogic3.f29193j = true;
                    }
                    ProfileCommentsTabPresenter.this.f26700d.f29188e = pageableResponse2.getTotalCount();
                    ProfileCommentsTabPresenter profileCommentsTabPresenter = ProfileCommentsTabPresenter.this;
                    ProfileCommentsTabUiController profileCommentsTabUiController = profileCommentsTabPresenter.f26701e;
                    Integer valueOf = Integer.valueOf(profileCommentsTabPresenter.f26699c.m14081x());
                    ProfileCommentsTabUiLogic profileCommentsTabUiLogic4 = ProfileCommentsTabPresenter.this.f26700d;
                    profileCommentsTabUiController.setData(valueOf, profileCommentsTabUiLogic4.f29190g, profileCommentsTabUiLogic4.f29191h, profileCommentsTabUiLogic4.f29186c, Long.valueOf(profileCommentsTabUiLogic4.f29188e), Integer.valueOf(ProfileCommentsTabPresenter.this.f26700d.f29189f), Boolean.valueOf(ProfileCommentsTabPresenter.this.f26700d.f29194k), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileCommentsTabPresenter.this.f26702f);
                    if (pageableResponse2.getContent().isEmpty()) {
                        ProfileCommentsTabUiLogic profileCommentsTabUiLogic5 = ProfileCommentsTabPresenter.this.f26700d;
                        profileCommentsTabUiLogic5.f29187d--;
                    }
                    return Unit.f63088a;
                }
            }, 23), new C2600c(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabPresenter$onProfileCollectionComments$4
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public Unit invoke(Throwable th) {
                    th.printStackTrace();
                    if (ProfileCommentsTabPresenter.this.m14860a()) {
                        ProfileCommentsTabPresenter.this.getViewState().mo14871c();
                    }
                    return Unit.f63088a;
                }
            }, 24), Functions.f59621b, Functions.f59622c);
        }
    }

    /* renamed from: d */
    public final void m14862d() {
        ProfileCommentsTabUiLogic profileCommentsTabUiLogic = this.f26700d;
        if (profileCommentsTabUiLogic.f28956a) {
            profileCommentsTabUiLogic.m15687a();
            if (m14860a()) {
                m14859c(this, false, false, 3);
            } else {
                m14861b(false, true);
            }
        }
    }

    /* renamed from: e */
    public final void m14863e() {
        ProfileCommentsTabUiLogic profileCommentsTabUiLogic = this.f26700d;
        if (profileCommentsTabUiLogic.f28956a) {
            profileCommentsTabUiLogic.m15687a();
            if (m14860a()) {
                m14859c(this, false, false, 3);
            } else {
                m14859c(this, false, false, 2);
            }
        }
    }
}
