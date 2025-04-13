package com.swiftsoft.anixartd.presentation.main.profile.lists;

import com.swiftsoft.anixartd.Prefs;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.response.PageableResponse;
import com.swiftsoft.anixartd.p015ui.controller.main.profile.lists.ProfileListsTabUiController;
import com.swiftsoft.anixartd.p015ui.logic.main.profile.lists.ProfileListsTabUiLogic;
import com.swiftsoft.anixartd.presentation.auth.restore.C2549a;
import com.swiftsoft.anixartd.presentation.main.profile.friends.C2604a;
import com.swiftsoft.anixartd.repository.BookmarksRepository;
import com.swiftsoft.anixartd.utils.EventBusKt;
import com.swiftsoft.anixartd.utils.OnBottomSheet;
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

/* compiled from: ProfileListsTabPresenter.kt */
@InjectViewState
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/lists/ProfileListsTabPresenter;", "Lmoxy/MvpPresenter;", "Lcom/swiftsoft/anixartd/presentation/main/profile/lists/ProfileListsTabView;", "Listener", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class ProfileListsTabPresenter extends MvpPresenter<ProfileListsTabView> {

    /* renamed from: a */
    @NotNull
    public BookmarksRepository f26793a;

    /* renamed from: b */
    @NotNull
    public Prefs f26794b;

    /* renamed from: c */
    @NotNull
    public ProfileListsTabUiLogic f26795c;

    /* renamed from: d */
    @NotNull
    public ProfileListsTabUiController f26796d;

    /* renamed from: e */
    @NotNull
    public Listener f26797e;

    /* compiled from: ProfileListsTabPresenter.kt */
    @Metadata(m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/presentation/main/profile/lists/ProfileListsTabPresenter$Listener;", "Lcom/swiftsoft/anixartd/ui/controller/main/profile/lists/ProfileListsTabUiController$Listener;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
    public interface Listener extends ProfileListsTabUiController.Listener {
    }

    @Inject
    public ProfileListsTabPresenter(@NotNull BookmarksRepository bookmarksRepository, @NotNull Prefs prefs) {
        Intrinsics.m32179h(bookmarksRepository, "bookmarksRepository");
        Intrinsics.m32179h(prefs, "prefs");
        this.f26793a = bookmarksRepository;
        this.f26794b = prefs;
        this.f26795c = new ProfileListsTabUiLogic();
        this.f26796d = new ProfileListsTabUiController();
        this.f26797e = new Listener() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$listener$1
            @Override // com.swiftsoft.anixartd.ui.model.main.bookmarks.ExtraBookmarksModel.Listener
            /* renamed from: Y */
            public void mo14361Y() {
                ProfileListsTabView viewState = ProfileListsTabPresenter.this.getViewState();
                ProfileListsTabUiLogic profileListsTabUiLogic = ProfileListsTabPresenter.this.f26795c;
                viewState.mo14925b4(profileListsTabUiLogic.f29214b, profileListsTabUiLogic.f29215c);
            }

            @Override // com.swiftsoft.anixartd.ui.model.main.bookmarks.ExtraBookmarksModel.Listener
            /* renamed from: a */
            public void mo14362a(int i2) {
                ProfileListsTabPresenter profileListsTabPresenter = ProfileListsTabPresenter.this;
                profileListsTabPresenter.f26795c.f29218f = i2;
                profileListsTabPresenter.getViewState().mo14931l();
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: g */
            public void mo14364g(long j2) {
                Object obj;
                Iterator<T> it = ProfileListsTabPresenter.this.f26795c.f29219g.iterator();
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
                    ProfileListsTabPresenter.this.getViewState().mo14930i(release);
                }
            }

            @Override // com.swiftsoft.anixartd.ui.model.common.ReleaseModel.Listener, com.swiftsoft.anixartd.ui.model.common.ReleaseHistoryModel.Listener
            /* renamed from: k */
            public void mo14365k(long j2) {
                Object obj;
                Iterator<T> it = ProfileListsTabPresenter.this.f26795c.f29219g.iterator();
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
    public static /* synthetic */ void m14918c(ProfileListsTabPresenter profileListsTabPresenter, boolean z, boolean z2, int i2) {
        if ((i2 & 1) != 0) {
            z = profileListsTabPresenter.m14919a();
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        profileListsTabPresenter.m14920b(z, z2);
    }

    /* renamed from: a */
    public final boolean m14919a() {
        return this.f26796d.isEmpty();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* renamed from: b */
    public final void m14920b(final boolean z, final boolean z2) {
        int i2;
        BookmarksRepository bookmarksRepository = this.f26793a;
        ProfileListsTabUiLogic profileListsTabUiLogic = this.f26795c;
        long j2 = profileListsTabUiLogic.f29214b;
        String str = profileListsTabUiLogic.f29215c;
        switch (str.hashCode()) {
            case -202987277:
                if (str.equals("INNER_TAB_PROFILE_LIST_COMPLETED")) {
                    i2 = 3;
                    ProfileListsTabUiLogic profileListsTabUiLogic2 = this.f26795c;
                    bookmarksRepository.f27332c.profileListByProfile(j2, i2, profileListsTabUiLogic2.f29216d, Integer.valueOf(profileListsTabUiLogic2.f29218f), bookmarksRepository.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14924b();
                            }
                            if (z2) {
                                this.getViewState().mo14927d();
                            }
                            return Unit.f63088a;
                        }
                    }, 19)).m31368j(new C2549a(this, 14)).m31370l(new C2604a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            ProfileListsTabUiLogic profileListsTabUiLogic3 = ProfileListsTabPresenter.this.f26795c;
                            List<Release> releases = pageableResponse2.getContent();
                            Objects.requireNonNull(profileListsTabUiLogic3);
                            Intrinsics.m32179h(releases, "releases");
                            boolean z3 = profileListsTabUiLogic3.f29220h;
                            if (z3) {
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                            } else {
                                if (z3) {
                                    profileListsTabUiLogic3.m15690a();
                                }
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                                profileListsTabUiLogic3.f29220h = true;
                            }
                            ProfileListsTabPresenter.this.f26795c.f29217e = pageableResponse2.getTotalCount();
                            ProfileListsTabPresenter profileListsTabPresenter = ProfileListsTabPresenter.this;
                            ProfileListsTabUiController profileListsTabUiController = profileListsTabPresenter.f26796d;
                            Integer valueOf = Integer.valueOf(profileListsTabPresenter.f26794b.m14081x());
                            ProfileListsTabUiLogic profileListsTabUiLogic4 = ProfileListsTabPresenter.this.f26795c;
                            profileListsTabUiController.setData(valueOf, profileListsTabUiLogic4.f29219g, profileListsTabUiLogic4.f29215c, Long.valueOf(profileListsTabUiLogic4.f29217e), Integer.valueOf(ProfileListsTabPresenter.this.f26795c.f29218f), Boolean.valueOf(ProfileListsTabPresenter.this.f26795c.f29221i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileListsTabPresenter.this.f26797e);
                            if (pageableResponse2.getContent().isEmpty()) {
                                ProfileListsTabUiLogic profileListsTabUiLogic5 = ProfileListsTabPresenter.this.f26795c;
                                profileListsTabUiLogic5.f29216d--;
                            }
                            return Unit.f63088a;
                        }
                    }, 20), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (ProfileListsTabPresenter.this.m14919a()) {
                                ProfileListsTabPresenter.this.getViewState().mo14926c();
                            }
                            return Unit.f63088a;
                        }
                    }, 21), Functions.f59621b, Functions.f59622c);
                    return;
                }
                break;
            case 275155495:
                if (str.equals("INNER_TAB_PROFILE_LIST_HOLD_ON")) {
                    i2 = 4;
                    ProfileListsTabUiLogic profileListsTabUiLogic22 = this.f26795c;
                    bookmarksRepository.f27332c.profileListByProfile(j2, i2, profileListsTabUiLogic22.f29216d, Integer.valueOf(profileListsTabUiLogic22.f29218f), bookmarksRepository.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14924b();
                            }
                            if (z2) {
                                this.getViewState().mo14927d();
                            }
                            return Unit.f63088a;
                        }
                    }, 19)).m31368j(new C2549a(this, 14)).m31370l(new C2604a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            ProfileListsTabUiLogic profileListsTabUiLogic3 = ProfileListsTabPresenter.this.f26795c;
                            List<Release> releases = pageableResponse2.getContent();
                            Objects.requireNonNull(profileListsTabUiLogic3);
                            Intrinsics.m32179h(releases, "releases");
                            boolean z3 = profileListsTabUiLogic3.f29220h;
                            if (z3) {
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                            } else {
                                if (z3) {
                                    profileListsTabUiLogic3.m15690a();
                                }
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                                profileListsTabUiLogic3.f29220h = true;
                            }
                            ProfileListsTabPresenter.this.f26795c.f29217e = pageableResponse2.getTotalCount();
                            ProfileListsTabPresenter profileListsTabPresenter = ProfileListsTabPresenter.this;
                            ProfileListsTabUiController profileListsTabUiController = profileListsTabPresenter.f26796d;
                            Integer valueOf = Integer.valueOf(profileListsTabPresenter.f26794b.m14081x());
                            ProfileListsTabUiLogic profileListsTabUiLogic4 = ProfileListsTabPresenter.this.f26795c;
                            profileListsTabUiController.setData(valueOf, profileListsTabUiLogic4.f29219g, profileListsTabUiLogic4.f29215c, Long.valueOf(profileListsTabUiLogic4.f29217e), Integer.valueOf(ProfileListsTabPresenter.this.f26795c.f29218f), Boolean.valueOf(ProfileListsTabPresenter.this.f26795c.f29221i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileListsTabPresenter.this.f26797e);
                            if (pageableResponse2.getContent().isEmpty()) {
                                ProfileListsTabUiLogic profileListsTabUiLogic5 = ProfileListsTabPresenter.this.f26795c;
                                profileListsTabUiLogic5.f29216d--;
                            }
                            return Unit.f63088a;
                        }
                    }, 20), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (ProfileListsTabPresenter.this.m14919a()) {
                                ProfileListsTabPresenter.this.getViewState().mo14926c();
                            }
                            return Unit.f63088a;
                        }
                    }, 21), Functions.f59621b, Functions.f59622c);
                    return;
                }
                break;
            case 999506155:
                if (str.equals("INNER_TAB_PROFILE_LIST_WATCHING")) {
                    i2 = 1;
                    ProfileListsTabUiLogic profileListsTabUiLogic222 = this.f26795c;
                    bookmarksRepository.f27332c.profileListByProfile(j2, i2, profileListsTabUiLogic222.f29216d, Integer.valueOf(profileListsTabUiLogic222.f29218f), bookmarksRepository.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14924b();
                            }
                            if (z2) {
                                this.getViewState().mo14927d();
                            }
                            return Unit.f63088a;
                        }
                    }, 19)).m31368j(new C2549a(this, 14)).m31370l(new C2604a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            ProfileListsTabUiLogic profileListsTabUiLogic3 = ProfileListsTabPresenter.this.f26795c;
                            List<Release> releases = pageableResponse2.getContent();
                            Objects.requireNonNull(profileListsTabUiLogic3);
                            Intrinsics.m32179h(releases, "releases");
                            boolean z3 = profileListsTabUiLogic3.f29220h;
                            if (z3) {
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                            } else {
                                if (z3) {
                                    profileListsTabUiLogic3.m15690a();
                                }
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                                profileListsTabUiLogic3.f29220h = true;
                            }
                            ProfileListsTabPresenter.this.f26795c.f29217e = pageableResponse2.getTotalCount();
                            ProfileListsTabPresenter profileListsTabPresenter = ProfileListsTabPresenter.this;
                            ProfileListsTabUiController profileListsTabUiController = profileListsTabPresenter.f26796d;
                            Integer valueOf = Integer.valueOf(profileListsTabPresenter.f26794b.m14081x());
                            ProfileListsTabUiLogic profileListsTabUiLogic4 = ProfileListsTabPresenter.this.f26795c;
                            profileListsTabUiController.setData(valueOf, profileListsTabUiLogic4.f29219g, profileListsTabUiLogic4.f29215c, Long.valueOf(profileListsTabUiLogic4.f29217e), Integer.valueOf(ProfileListsTabPresenter.this.f26795c.f29218f), Boolean.valueOf(ProfileListsTabPresenter.this.f26795c.f29221i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileListsTabPresenter.this.f26797e);
                            if (pageableResponse2.getContent().isEmpty()) {
                                ProfileListsTabUiLogic profileListsTabUiLogic5 = ProfileListsTabPresenter.this.f26795c;
                                profileListsTabUiLogic5.f29216d--;
                            }
                            return Unit.f63088a;
                        }
                    }, 20), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (ProfileListsTabPresenter.this.m14919a()) {
                                ProfileListsTabPresenter.this.getViewState().mo14926c();
                            }
                            return Unit.f63088a;
                        }
                    }, 21), Functions.f59621b, Functions.f59622c);
                    return;
                }
                break;
            case 1109108840:
                if (str.equals("INNER_TAB_PROFILE_LIST_DROPPED")) {
                    i2 = 5;
                    ProfileListsTabUiLogic profileListsTabUiLogic2222 = this.f26795c;
                    bookmarksRepository.f27332c.profileListByProfile(j2, i2, profileListsTabUiLogic2222.f29216d, Integer.valueOf(profileListsTabUiLogic2222.f29218f), bookmarksRepository.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14924b();
                            }
                            if (z2) {
                                this.getViewState().mo14927d();
                            }
                            return Unit.f63088a;
                        }
                    }, 19)).m31368j(new C2549a(this, 14)).m31370l(new C2604a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            ProfileListsTabUiLogic profileListsTabUiLogic3 = ProfileListsTabPresenter.this.f26795c;
                            List<Release> releases = pageableResponse2.getContent();
                            Objects.requireNonNull(profileListsTabUiLogic3);
                            Intrinsics.m32179h(releases, "releases");
                            boolean z3 = profileListsTabUiLogic3.f29220h;
                            if (z3) {
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                            } else {
                                if (z3) {
                                    profileListsTabUiLogic3.m15690a();
                                }
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                                profileListsTabUiLogic3.f29220h = true;
                            }
                            ProfileListsTabPresenter.this.f26795c.f29217e = pageableResponse2.getTotalCount();
                            ProfileListsTabPresenter profileListsTabPresenter = ProfileListsTabPresenter.this;
                            ProfileListsTabUiController profileListsTabUiController = profileListsTabPresenter.f26796d;
                            Integer valueOf = Integer.valueOf(profileListsTabPresenter.f26794b.m14081x());
                            ProfileListsTabUiLogic profileListsTabUiLogic4 = ProfileListsTabPresenter.this.f26795c;
                            profileListsTabUiController.setData(valueOf, profileListsTabUiLogic4.f29219g, profileListsTabUiLogic4.f29215c, Long.valueOf(profileListsTabUiLogic4.f29217e), Integer.valueOf(ProfileListsTabPresenter.this.f26795c.f29218f), Boolean.valueOf(ProfileListsTabPresenter.this.f26795c.f29221i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileListsTabPresenter.this.f26797e);
                            if (pageableResponse2.getContent().isEmpty()) {
                                ProfileListsTabUiLogic profileListsTabUiLogic5 = ProfileListsTabPresenter.this.f26795c;
                                profileListsTabUiLogic5.f29216d--;
                            }
                            return Unit.f63088a;
                        }
                    }, 20), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (ProfileListsTabPresenter.this.m14919a()) {
                                ProfileListsTabPresenter.this.getViewState().mo14926c();
                            }
                            return Unit.f63088a;
                        }
                    }, 21), Functions.f59621b, Functions.f59622c);
                    return;
                }
                break;
            case 1871259922:
                if (str.equals("INNER_TAB_PROFILE_LIST_PLANS")) {
                    i2 = 2;
                    ProfileListsTabUiLogic profileListsTabUiLogic22222 = this.f26795c;
                    bookmarksRepository.f27332c.profileListByProfile(j2, i2, profileListsTabUiLogic22222.f29216d, Integer.valueOf(profileListsTabUiLogic22222.f29218f), bookmarksRepository.f27333d.m14080w()).m31372n(Schedulers.f62901c).m31369k(AndroidSchedulers.m31390a()).m31367i(new C2604a(new Function1<Disposable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Disposable disposable) {
                            if (z) {
                                this.getViewState().mo14924b();
                            }
                            if (z2) {
                                this.getViewState().mo14927d();
                            }
                            return Unit.f63088a;
                        }
                    }, 19)).m31368j(new C2549a(this, 14)).m31370l(new C2604a(new Function1<PageableResponse<Release>, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(PageableResponse<Release> pageableResponse) {
                            PageableResponse<Release> pageableResponse2 = pageableResponse;
                            ProfileListsTabUiLogic profileListsTabUiLogic3 = ProfileListsTabPresenter.this.f26795c;
                            List<Release> releases = pageableResponse2.getContent();
                            Objects.requireNonNull(profileListsTabUiLogic3);
                            Intrinsics.m32179h(releases, "releases");
                            boolean z3 = profileListsTabUiLogic3.f29220h;
                            if (z3) {
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                            } else {
                                if (z3) {
                                    profileListsTabUiLogic3.m15690a();
                                }
                                profileListsTabUiLogic3.f29219g.addAll(releases);
                                profileListsTabUiLogic3.f29220h = true;
                            }
                            ProfileListsTabPresenter.this.f26795c.f29217e = pageableResponse2.getTotalCount();
                            ProfileListsTabPresenter profileListsTabPresenter = ProfileListsTabPresenter.this;
                            ProfileListsTabUiController profileListsTabUiController = profileListsTabPresenter.f26796d;
                            Integer valueOf = Integer.valueOf(profileListsTabPresenter.f26794b.m14081x());
                            ProfileListsTabUiLogic profileListsTabUiLogic4 = ProfileListsTabPresenter.this.f26795c;
                            profileListsTabUiController.setData(valueOf, profileListsTabUiLogic4.f29219g, profileListsTabUiLogic4.f29215c, Long.valueOf(profileListsTabUiLogic4.f29217e), Integer.valueOf(ProfileListsTabPresenter.this.f26795c.f29218f), Boolean.valueOf(ProfileListsTabPresenter.this.f26795c.f29221i), Boolean.valueOf(pageableResponse2.getContent().size() >= 25), ProfileListsTabPresenter.this.f26797e);
                            if (pageableResponse2.getContent().isEmpty()) {
                                ProfileListsTabUiLogic profileListsTabUiLogic5 = ProfileListsTabPresenter.this.f26795c;
                                profileListsTabUiLogic5.f29216d--;
                            }
                            return Unit.f63088a;
                        }
                    }, 20), new C2604a(new Function1<Throwable, Unit>() { // from class: com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabPresenter$onProfileLists$4
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public Unit invoke(Throwable th) {
                            th.printStackTrace();
                            if (ProfileListsTabPresenter.this.m14919a()) {
                                ProfileListsTabPresenter.this.getViewState().mo14926c();
                            }
                            return Unit.f63088a;
                        }
                    }, 21), Functions.f59621b, Functions.f59622c);
                    return;
                }
                break;
        }
        throw new Exception("Invalid inner position");
    }

    /* renamed from: d */
    public final void m14921d() {
        ProfileListsTabUiLogic profileListsTabUiLogic = this.f26795c;
        if (profileListsTabUiLogic.f28956a) {
            profileListsTabUiLogic.m15690a();
            if (m14919a()) {
                m14918c(this, false, false, 3);
            } else {
                m14920b(false, true);
            }
        }
    }

    /* renamed from: e */
    public final void m14922e() {
        ProfileListsTabUiLogic profileListsTabUiLogic = this.f26795c;
        if (profileListsTabUiLogic.f28956a) {
            profileListsTabUiLogic.m15690a();
            if (m14919a()) {
                m14918c(this, false, false, 3);
            } else {
                m14918c(this, false, false, 2);
            }
        }
    }
}
