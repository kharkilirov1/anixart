package com.swiftsoft.anixartd.presentation.main.release;

import android.widget.ImageView;
import com.swiftsoft.anixartd.database.entity.Collection;
import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.database.entity.ReleaseComment;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class ReleaseView$$State extends MvpViewState<ReleaseView> implements ReleaseView {

    /* compiled from: ReleaseView$$State.java */
    public class OnAddShortcutCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final Release f27000a;

        public OnAddShortcutCommand(ReleaseView$$State releaseView$$State, Release release) {
            super("onAddShortcut", OneExecutionStateStrategy.class);
            this.f27000a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15065q1(this.f27000a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnAddShortcutFailedCommand extends ViewCommand<ReleaseView> {
        public OnAddShortcutFailedCommand(ReleaseView$$State releaseView$$State) {
            super("onAddShortcutFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15043T2();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnBannedCommand extends ViewCommand<ReleaseView> {
        public OnBannedCommand(ReleaseView$$State releaseView$$State) {
            super("onBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15063o();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnChooseTypeDialogCommand extends ViewCommand<ReleaseView> {
        public OnChooseTypeDialogCommand(ReleaseView$$State releaseView$$State) {
            super("onChooseTypeDialog", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15042P3();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCollectionReleaseAddedCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final Collection f27001a;

        public OnCollectionReleaseAddedCommand(ReleaseView$$State releaseView$$State, Collection collection) {
            super("onCollectionReleaseAdded", OneExecutionStateStrategy.class);
            this.f27001a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15035C3(this.f27001a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCollectionReleaseAlreadyInCollectionCommand extends ViewCommand<ReleaseView> {
        public OnCollectionReleaseAlreadyInCollectionCommand(ReleaseView$$State releaseView$$State) {
            super("onCollectionReleaseAlreadyInCollection", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15061m3();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCollectionReleaseLimitReachedCommand extends ViewCommand<ReleaseView> {
        public OnCollectionReleaseLimitReachedCommand(ReleaseView$$State releaseView$$State) {
            super("onCollectionReleaseLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15070w3();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCommentCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final ReleaseComment f27002a;

        public OnCommentCommand(ReleaseView$$State releaseView$$State, ReleaseComment releaseComment) {
            super("onComment", OneExecutionStateStrategy.class);
            this.f27002a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15044U(this.f27002a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCommentDeletedCommand extends ViewCommand<ReleaseView> {
        public OnCommentDeletedCommand(ReleaseView$$State releaseView$$State) {
            super("onCommentDeleted", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15037F();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCommentLimitReachedCommand extends ViewCommand<ReleaseView> {
        public OnCommentLimitReachedCommand(ReleaseView$$State releaseView$$State) {
            super("onCommentLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15033A();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCommentNegativeVoteLimitReachedCommand extends ViewCommand<ReleaseView> {
        public OnCommentNegativeVoteLimitReachedCommand(ReleaseView$$State releaseView$$State) {
            super("onCommentNegativeVoteLimitReached", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15071x();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCommentSentCommand extends ViewCommand<ReleaseView> {
        public OnCommentSentCommand(ReleaseView$$State releaseView$$State) {
            super("onCommentSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15034B();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnCommentVoteBannedCommand extends ViewCommand<ReleaseView> {
        public OnCommentVoteBannedCommand(ReleaseView$$State releaseView$$State) {
            super("onCommentVoteBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15038G();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnDelVoteFailedCommand extends ViewCommand<ReleaseView> {
        public OnDelVoteFailedCommand(ReleaseView$$State releaseView$$State) {
            super("onDelVoteFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15064p1();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnFailedCommand extends ViewCommand<ReleaseView> {
        public OnFailedCommand(ReleaseView$$State releaseView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15051c();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnHideDelVoteProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnHideDelVoteProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onHideDelVoteProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15075z1();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<ReleaseView> {
        public OnHideLoadingViewCommand(ReleaseView$$State releaseView$$State) {
            super("onHideLoadingView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15059j();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnHideProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15049a();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<ReleaseView> {
        public OnHideRefreshViewCommand(ReleaseView$$State releaseView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15054e();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnHideSendingCommentProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnHideSendingCommentProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onHideSendingCommentProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15036D();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnHideVotingProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnHideVotingProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onHideVotingProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15048Z1();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnProfileCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final long f27003a;

        public OnProfileCommand(ReleaseView$$State releaseView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f27003a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15056f(this.f27003a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnReleaseCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final long f27004a;

        public OnReleaseCommand(ReleaseView$$State releaseView$$State, long j2) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f27004a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15057g(this.f27004a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnReleaseLoadedCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final Release f27005a;

        public OnReleaseLoadedCommand(ReleaseView$$State releaseView$$State, Release release) {
            super("onReleaseLoaded", OneExecutionStateStrategy.class);
            this.f27005a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15072x3(this.f27005a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnReleaseUnavailableCommand extends ViewCommand<ReleaseView> {
        public OnReleaseUnavailableCommand(ReleaseView$$State releaseView$$State) {
            super("onReleaseUnavailable", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15066q2();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnRepliesCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final ReleaseComment f27006a;

        public OnRepliesCommand(ReleaseView$$State releaseView$$State, ReleaseComment releaseComment) {
            super("onReplies", OneExecutionStateStrategy.class);
            this.f27006a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15074z0(this.f27006a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnReplyCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final ReleaseComment f27007a;

        public OnReplyCommand(ReleaseView$$State releaseView$$State, ReleaseComment releaseComment) {
            super("onReply", OneExecutionStateStrategy.class);
            this.f27007a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15046X(this.f27007a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnReportSentCommand extends ViewCommand<ReleaseView> {
        public OnReportSentCommand(ReleaseView$$State releaseView$$State) {
            super("onReportSent", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15062n();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnScreenshotCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final String f27008a;

        /* renamed from: b */
        public final ImageView f27009b;

        public OnScreenshotCommand(ReleaseView$$State releaseView$$State, String str, ImageView imageView) {
            super("onScreenshot", OneExecutionStateStrategy.class);
            this.f27008a = str;
            this.f27009b = imageView;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15041P0(this.f27008a, this.f27009b);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowCommentReportFragmentCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final ReleaseComment f27010a;

        public OnShowCommentReportFragmentCommand(ReleaseView$$State releaseView$$State, ReleaseComment releaseComment) {
            super("onShowCommentReportFragment", OneExecutionStateStrategy.class);
            this.f27010a = releaseComment;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15052c0(this.f27010a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowDelVoteProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnShowDelVoteProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onShowDelVoteProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15068s1();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<ReleaseView> {
        public OnShowLoadingViewCommand(ReleaseView$$State releaseView$$State) {
            super("onShowLoadingView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15058h();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowNeedAuthCommand extends ViewCommand<ReleaseView> {
        public OnShowNeedAuthCommand(ReleaseView$$State releaseView$$State) {
            super("onShowNeedAuth", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15060m();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnShowProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15050b();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<ReleaseView> {
        public OnShowRefreshViewCommand(ReleaseView$$State releaseView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15053d();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowReleaseReportFragmentCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final Release f27011a;

        public OnShowReleaseReportFragmentCommand(ReleaseView$$State releaseView$$State, Release release) {
            super("onShowReleaseReportFragment", OneExecutionStateStrategy.class);
            this.f27011a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15040I3(this.f27011a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowSendingCommentProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnShowSendingCommentProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onShowSendingCommentProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15067s();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowTooltipRandomReleaseCommand extends ViewCommand<ReleaseView> {
        public OnShowTooltipRandomReleaseCommand(ReleaseView$$State releaseView$$State) {
            super("onShowTooltipRandomRelease", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15055e3();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnShowVotingProgressViewCommand extends ViewCommand<ReleaseView> {
        public OnShowVotingProgressViewCommand(ReleaseView$$State releaseView$$State) {
            super("onShowVotingProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15073y1();
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnVideoCategoryBannerCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final long f27012a;

        /* renamed from: b */
        public final long f27013b;

        /* renamed from: c */
        public final String f27014c;

        /* renamed from: d */
        public final String f27015d;

        public OnVideoCategoryBannerCommand(ReleaseView$$State releaseView$$State, long j2, long j3, String str, String str2) {
            super("onVideoCategoryBanner", OneExecutionStateStrategy.class);
            this.f27012a = j2;
            this.f27013b = j3;
            this.f27014c = str;
            this.f27015d = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15039I0(this.f27012a, this.f27013b, this.f27014c, this.f27015d);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnVideoCategoryBannerMoreCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final long f27016a;

        public OnVideoCategoryBannerMoreCommand(ReleaseView$$State releaseView$$State, long j2) {
            super("onVideoCategoryBannerMore", OneExecutionStateStrategy.class);
            this.f27016a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15047Y0(this.f27016a);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnVoteCommentCommand extends ViewCommand<ReleaseView> {

        /* renamed from: a */
        public final ReleaseComment f27017a;

        /* renamed from: b */
        public final int f27018b;

        public OnVoteCommentCommand(ReleaseView$$State releaseView$$State, ReleaseComment releaseComment, int i2) {
            super("onVoteComment", OneExecutionStateStrategy.class);
            this.f27017a = releaseComment;
            this.f27018b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15045W(this.f27017a, this.f27018b);
        }
    }

    /* compiled from: ReleaseView$$State.java */
    public class OnVoteFailedCommand extends ViewCommand<ReleaseView> {
        public OnVoteFailedCommand(ReleaseView$$State releaseView$$State) {
            super("onVoteFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(ReleaseView releaseView) {
            releaseView.mo15069u1();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: A */
    public void mo15033A() {
        OnCommentLimitReachedCommand onCommentLimitReachedCommand = new OnCommentLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15033A();
        }
        this.viewCommands.afterApply(onCommentLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: B */
    public void mo15034B() {
        OnCommentSentCommand onCommentSentCommand = new OnCommentSentCommand(this);
        this.viewCommands.beforeApply(onCommentSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15034B();
        }
        this.viewCommands.afterApply(onCommentSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: C3 */
    public void mo15035C3(Collection collection) {
        OnCollectionReleaseAddedCommand onCollectionReleaseAddedCommand = new OnCollectionReleaseAddedCommand(this, collection);
        this.viewCommands.beforeApply(onCollectionReleaseAddedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15035C3(collection);
        }
        this.viewCommands.afterApply(onCollectionReleaseAddedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: D */
    public void mo15036D() {
        OnHideSendingCommentProgressViewCommand onHideSendingCommentProgressViewCommand = new OnHideSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15036D();
        }
        this.viewCommands.afterApply(onHideSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: F */
    public void mo15037F() {
        OnCommentDeletedCommand onCommentDeletedCommand = new OnCommentDeletedCommand(this);
        this.viewCommands.beforeApply(onCommentDeletedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15037F();
        }
        this.viewCommands.afterApply(onCommentDeletedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: G */
    public void mo15038G() {
        OnCommentVoteBannedCommand onCommentVoteBannedCommand = new OnCommentVoteBannedCommand(this);
        this.viewCommands.beforeApply(onCommentVoteBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15038G();
        }
        this.viewCommands.afterApply(onCommentVoteBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: I0 */
    public void mo15039I0(long j2, long j3, String str, String str2) {
        OnVideoCategoryBannerCommand onVideoCategoryBannerCommand = new OnVideoCategoryBannerCommand(this, j2, j3, str, str2);
        this.viewCommands.beforeApply(onVideoCategoryBannerCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15039I0(j2, j3, str, str2);
        }
        this.viewCommands.afterApply(onVideoCategoryBannerCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: I3 */
    public void mo15040I3(Release release) {
        OnShowReleaseReportFragmentCommand onShowReleaseReportFragmentCommand = new OnShowReleaseReportFragmentCommand(this, release);
        this.viewCommands.beforeApply(onShowReleaseReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15040I3(release);
        }
        this.viewCommands.afterApply(onShowReleaseReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: P0 */
    public void mo15041P0(String str, ImageView imageView) {
        OnScreenshotCommand onScreenshotCommand = new OnScreenshotCommand(this, str, imageView);
        this.viewCommands.beforeApply(onScreenshotCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15041P0(str, imageView);
        }
        this.viewCommands.afterApply(onScreenshotCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: P3 */
    public void mo15042P3() {
        OnChooseTypeDialogCommand onChooseTypeDialogCommand = new OnChooseTypeDialogCommand(this);
        this.viewCommands.beforeApply(onChooseTypeDialogCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15042P3();
        }
        this.viewCommands.afterApply(onChooseTypeDialogCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: T2 */
    public void mo15043T2() {
        OnAddShortcutFailedCommand onAddShortcutFailedCommand = new OnAddShortcutFailedCommand(this);
        this.viewCommands.beforeApply(onAddShortcutFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15043T2();
        }
        this.viewCommands.afterApply(onAddShortcutFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: U */
    public void mo15044U(ReleaseComment releaseComment) {
        OnCommentCommand onCommentCommand = new OnCommentCommand(this, releaseComment);
        this.viewCommands.beforeApply(onCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15044U(releaseComment);
        }
        this.viewCommands.afterApply(onCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: W */
    public void mo15045W(ReleaseComment releaseComment, int i2) {
        OnVoteCommentCommand onVoteCommentCommand = new OnVoteCommentCommand(this, releaseComment, i2);
        this.viewCommands.beforeApply(onVoteCommentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15045W(releaseComment, i2);
        }
        this.viewCommands.afterApply(onVoteCommentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: X */
    public void mo15046X(ReleaseComment releaseComment) {
        OnReplyCommand onReplyCommand = new OnReplyCommand(this, releaseComment);
        this.viewCommands.beforeApply(onReplyCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15046X(releaseComment);
        }
        this.viewCommands.afterApply(onReplyCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: Y0 */
    public void mo15047Y0(long j2) {
        OnVideoCategoryBannerMoreCommand onVideoCategoryBannerMoreCommand = new OnVideoCategoryBannerMoreCommand(this, j2);
        this.viewCommands.beforeApply(onVideoCategoryBannerMoreCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15047Y0(j2);
        }
        this.viewCommands.afterApply(onVideoCategoryBannerMoreCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: Z1 */
    public void mo15048Z1() {
        OnHideVotingProgressViewCommand onHideVotingProgressViewCommand = new OnHideVotingProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideVotingProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15048Z1();
        }
        this.viewCommands.afterApply(onHideVotingProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: a */
    public void mo15049a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15049a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: b */
    public void mo15050b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15050b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: c */
    public void mo15051c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15051c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: c0 */
    public void mo15052c0(ReleaseComment releaseComment) {
        OnShowCommentReportFragmentCommand onShowCommentReportFragmentCommand = new OnShowCommentReportFragmentCommand(this, releaseComment);
        this.viewCommands.beforeApply(onShowCommentReportFragmentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15052c0(releaseComment);
        }
        this.viewCommands.afterApply(onShowCommentReportFragmentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: d */
    public void mo15053d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15053d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: e */
    public void mo15054e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15054e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: e3 */
    public void mo15055e3() {
        OnShowTooltipRandomReleaseCommand onShowTooltipRandomReleaseCommand = new OnShowTooltipRandomReleaseCommand(this);
        this.viewCommands.beforeApply(onShowTooltipRandomReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15055e3();
        }
        this.viewCommands.afterApply(onShowTooltipRandomReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: f */
    public void mo15056f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15056f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: g */
    public void mo15057g(long j2) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15057g(j2);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: h */
    public void mo15058h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15058h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: j */
    public void mo15059j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15059j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: m */
    public void mo15060m() {
        OnShowNeedAuthCommand onShowNeedAuthCommand = new OnShowNeedAuthCommand(this);
        this.viewCommands.beforeApply(onShowNeedAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15060m();
        }
        this.viewCommands.afterApply(onShowNeedAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: m3 */
    public void mo15061m3() {
        OnCollectionReleaseAlreadyInCollectionCommand onCollectionReleaseAlreadyInCollectionCommand = new OnCollectionReleaseAlreadyInCollectionCommand(this);
        this.viewCommands.beforeApply(onCollectionReleaseAlreadyInCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15061m3();
        }
        this.viewCommands.afterApply(onCollectionReleaseAlreadyInCollectionCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: n */
    public void mo15062n() {
        OnReportSentCommand onReportSentCommand = new OnReportSentCommand(this);
        this.viewCommands.beforeApply(onReportSentCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15062n();
        }
        this.viewCommands.afterApply(onReportSentCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: o */
    public void mo15063o() {
        OnBannedCommand onBannedCommand = new OnBannedCommand(this);
        this.viewCommands.beforeApply(onBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15063o();
        }
        this.viewCommands.afterApply(onBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: p1 */
    public void mo15064p1() {
        OnDelVoteFailedCommand onDelVoteFailedCommand = new OnDelVoteFailedCommand(this);
        this.viewCommands.beforeApply(onDelVoteFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15064p1();
        }
        this.viewCommands.afterApply(onDelVoteFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: q1 */
    public void mo15065q1(Release release) {
        OnAddShortcutCommand onAddShortcutCommand = new OnAddShortcutCommand(this, release);
        this.viewCommands.beforeApply(onAddShortcutCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15065q1(release);
        }
        this.viewCommands.afterApply(onAddShortcutCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: q2 */
    public void mo15066q2() {
        OnReleaseUnavailableCommand onReleaseUnavailableCommand = new OnReleaseUnavailableCommand(this);
        this.viewCommands.beforeApply(onReleaseUnavailableCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15066q2();
        }
        this.viewCommands.afterApply(onReleaseUnavailableCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: s */
    public void mo15067s() {
        OnShowSendingCommentProgressViewCommand onShowSendingCommentProgressViewCommand = new OnShowSendingCommentProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowSendingCommentProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15067s();
        }
        this.viewCommands.afterApply(onShowSendingCommentProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: s1 */
    public void mo15068s1() {
        OnShowDelVoteProgressViewCommand onShowDelVoteProgressViewCommand = new OnShowDelVoteProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowDelVoteProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15068s1();
        }
        this.viewCommands.afterApply(onShowDelVoteProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: u1 */
    public void mo15069u1() {
        OnVoteFailedCommand onVoteFailedCommand = new OnVoteFailedCommand(this);
        this.viewCommands.beforeApply(onVoteFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15069u1();
        }
        this.viewCommands.afterApply(onVoteFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: w3 */
    public void mo15070w3() {
        OnCollectionReleaseLimitReachedCommand onCollectionReleaseLimitReachedCommand = new OnCollectionReleaseLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCollectionReleaseLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15070w3();
        }
        this.viewCommands.afterApply(onCollectionReleaseLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: x */
    public void mo15071x() {
        OnCommentNegativeVoteLimitReachedCommand onCommentNegativeVoteLimitReachedCommand = new OnCommentNegativeVoteLimitReachedCommand(this);
        this.viewCommands.beforeApply(onCommentNegativeVoteLimitReachedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15071x();
        }
        this.viewCommands.afterApply(onCommentNegativeVoteLimitReachedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: x3 */
    public void mo15072x3(Release release) {
        OnReleaseLoadedCommand onReleaseLoadedCommand = new OnReleaseLoadedCommand(this, release);
        this.viewCommands.beforeApply(onReleaseLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15072x3(release);
        }
        this.viewCommands.afterApply(onReleaseLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: y1 */
    public void mo15073y1() {
        OnShowVotingProgressViewCommand onShowVotingProgressViewCommand = new OnShowVotingProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowVotingProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15073y1();
        }
        this.viewCommands.afterApply(onShowVotingProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: z0 */
    public void mo15074z0(ReleaseComment releaseComment) {
        OnRepliesCommand onRepliesCommand = new OnRepliesCommand(this, releaseComment);
        this.viewCommands.beforeApply(onRepliesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15074z0(releaseComment);
        }
        this.viewCommands.afterApply(onRepliesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.release.ReleaseView
    /* renamed from: z1 */
    public void mo15075z1() {
        OnHideDelVoteProgressViewCommand onHideDelVoteProgressViewCommand = new OnHideDelVoteProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideDelVoteProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((ReleaseView) it.next()).mo15075z1();
        }
        this.viewCommands.afterApply(onHideDelVoteProgressViewCommand);
    }
}
