package com.swiftsoft.anixartd.presentation.main.profile.comments;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ProfileCommentsTabView$$State extends MvpViewState<ProfileCommentsTabView> implements ProfileCommentsTabView {

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnCollectionCommentCommand extends ViewCommand<ProfileCommentsTabView> {

        /* renamed from: a */
        public final long f26717a;

        /* renamed from: b */
        public final long f26718b;

        /* renamed from: c */
        public final long f26719c;

        public OnCollectionCommentCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State, long j2, long j3, long j4) {
            super("onCollectionComment", OneExecutionStateStrategy.class);
            this.f26717a = j2;
            this.f26718b = j3;
            this.f26719c = j4;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14876y0(this.f26717a, this.f26718b, this.f26719c);
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnFailedCommand extends ViewCommand<ProfileCommentsTabView> {
        public OnFailedCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14871c();
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ProfileCommentsTabView> {
        public OnHideProgressViewCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14869a();
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ProfileCommentsTabView> {
        public OnHideRefreshViewCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14873e();
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnProfileCommand extends ViewCommand<ProfileCommentsTabView> {

        /* renamed from: a */
        public final long f26720a;

        public OnProfileCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26720a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14874f(this.f26720a);
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnRefreshAfterSortCommand extends ViewCommand<ProfileCommentsTabView> {
        public OnRefreshAfterSortCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State) {
            super("onRefreshAfterSort", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14875l();
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnReleaseCommentCommand extends ViewCommand<ProfileCommentsTabView> {

        /* renamed from: a */
        public final long f26721a;

        /* renamed from: b */
        public final long f26722b;

        /* renamed from: c */
        public final long f26723c;

        public OnReleaseCommentCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State, long j2, long j3, long j4) {
            super("onReleaseComment", OneExecutionStateStrategy.class);
            this.f26721a = j2;
            this.f26722b = j3;
            this.f26723c = j4;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14868N(this.f26721a, this.f26722b, this.f26723c);
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ProfileCommentsTabView> {
        public OnShowProgressViewCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14870b();
        }
    }

    /* compiled from: ProfileCommentsTabView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ProfileCommentsTabView> {
        public OnShowRefreshViewCommand(ProfileCommentsTabView$$State profileCommentsTabView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ProfileCommentsTabView profileCommentsTabView) {
            profileCommentsTabView.mo14872d();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: N */
    public void mo14868N(long j2, long j3, long j4) {
        OnReleaseCommentCommand onReleaseCommentCommand = new OnReleaseCommentCommand(this, j2, j3, j4);
        this.viewCommands.beforeApply(onReleaseCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14868N(j2, j3, j4);
        }
        this.viewCommands.afterApply(onReleaseCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: a */
    public void mo14869a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14869a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: b */
    public void mo14870b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14870b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: c */
    public void mo14871c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14871c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: d */
    public void mo14872d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14872d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: e */
    public void mo14873e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14873e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: f */
    public void mo14874f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14874f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: l */
    public void mo14875l() {
        OnRefreshAfterSortCommand onRefreshAfterSortCommand = new OnRefreshAfterSortCommand(this);
        this.viewCommands.beforeApply(onRefreshAfterSortCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14875l();
        }
        this.viewCommands.afterApply(onRefreshAfterSortCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.profile.comments.ProfileCommentsTabView
    /* renamed from: y0 */
    public void mo14876y0(long j2, long j3, long j4) {
        OnCollectionCommentCommand onCollectionCommentCommand = new OnCollectionCommentCommand(this, j2, j3, j4);
        this.viewCommands.beforeApply(onCollectionCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ProfileCommentsTabView) it.next()).mo14876y0(j2, j3, j4);
        }
        this.viewCommands.afterApply(onCollectionCommentCommand);
    }
}
