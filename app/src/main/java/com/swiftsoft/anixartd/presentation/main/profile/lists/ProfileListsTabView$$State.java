package com.swiftsoft.anixartd.presentation.main.profile.lists;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileListsTabView$$State extends MvpViewState<ProfileListsTabView> implements ProfileListsTabView {

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileListsTabView> {
        public OnFailedCommand(ProfileListsTabView$$State profileListsTabView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14926c();
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileListsTabView> {
        public OnHideProgressViewCommand(ProfileListsTabView$$State profileListsTabView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14923a();
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileListsTabView> {
        public OnHideRefreshViewCommand(ProfileListsTabView$$State profileListsTabView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14928e();
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileListsTabView> {

        /* renamed from: a */
        public final long f26806a;

        public OnProfileCommand(ProfileListsTabView$$State profileListsTabView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26806a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14929f(this.f26806a);
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnRandomCommand extends ViewCommand<ProfileListsTabView> {

        /* renamed from: a */
        public final long f26807a;

        /* renamed from: b */
        public final String f26808b;

        public OnRandomCommand(ProfileListsTabView$$State profileListsTabView$$State, long j2, String str) {
            super("onRandom", OneExecutionStateStrategy.class);
            this.f26807a = j2;
            this.f26808b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14925b4(this.f26807a, this.f26808b);
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ProfileListsTabView> {
        public OnRefreshAfterSortCommand(ProfileListsTabView$$State profileListsTabView$$State) {
            super("onRefreshAfterSort", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14931l();
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ProfileListsTabView> {

        /* renamed from: a */
        public final Release f26809a;

        public OnReleaseCommand(ProfileListsTabView$$State profileListsTabView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26809a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14930i(this.f26809a);
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileListsTabView> {
        public OnShowProgressViewCommand(ProfileListsTabView$$State profileListsTabView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14924b();
        }
    }

    /* compiled from: ProfileListsTabView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileListsTabView> {
        public OnShowRefreshViewCommand(ProfileListsTabView$$State profileListsTabView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileListsTabView profileListsTabView) {
            profileListsTabView.mo14927d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: a */
    public void mo14923a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14923a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: b */
    public void mo14924b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14924b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: b4 */
    public void mo14925b4(long j2, String str) {
        OnRandomCommand onRandomCommand = new OnRandomCommand(this, j2, str);
        this.viewCommands.beforeApply(onRandomCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14925b4(j2, str);
        }
        this.viewCommands.afterApply(onRandomCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: c */
    public void mo14926c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14926c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: d */
    public void mo14927d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14927d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: e */
    public void mo14928e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14928e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: f */
    public void mo14929f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14929f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: i */
    public void mo14930i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14930i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.lists.ProfileListsTabView
    /* renamed from: l */
    public void mo14931l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileListsTabView) it.next()).mo14931l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }
}
