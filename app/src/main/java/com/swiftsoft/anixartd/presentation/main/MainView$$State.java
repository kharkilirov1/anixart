package com.swiftsoft.anixartd.presentation.main;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class MainView$$State extends MvpViewState<MainView> implements MainView {

    /* compiled from: MainView$$State.java */
    public class OnAndroidTvHintCommand extends ViewCommand<MainView> {
        public OnAndroidTvHintCommand(MainView$$State mainView$$State) {
            super("onAndroidTvHint", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14350o1();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnAuthCommand extends ViewCommand<MainView> {
        public OnAuthCommand(MainView$$State mainView$$State) {
            super("onAuth", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14338S2();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnCheckForInAppUpdatesCommand extends ViewCommand<MainView> {
        public OnCheckForInAppUpdatesCommand(MainView$$State mainView$$State) {
            super("onCheckForInAppUpdates", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14343f1();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnGoogleAlreadyBoundCommand extends ViewCommand<MainView> {
        public OnGoogleAlreadyBoundCommand(MainView$$State mainView$$State) {
            super("onGoogleAlreadyBound", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14348n1();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnGoogleLoginFailedCommand extends ViewCommand<MainView> {
        public OnGoogleLoginFailedCommand(MainView$$State mainView$$State) {
            super("onGoogleLoginFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14352w0();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnGoogleNotBoundCommand extends ViewCommand<MainView> {
        public OnGoogleNotBoundCommand(MainView$$State mainView$$State) {
            super("onGoogleNotBound", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14340Y1();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnHideLoadingViewCommand extends ViewCommand<MainView> {
        public OnHideLoadingViewCommand(MainView$$State mainView$$State) {
            super("onHideLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14346j();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnImmediateUpdateCommand extends ViewCommand<MainView> {
        public OnImmediateUpdateCommand(MainView$$State mainView$$State) {
            super("onImmediateUpdate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14342e0();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnInvalidRequestCommand extends ViewCommand<MainView> {
        public OnInvalidRequestCommand(MainView$$State mainView$$State) {
            super("onInvalidRequest", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14337P();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnNotificationCountCommand extends ViewCommand<MainView> {
        public OnNotificationCountCommand(MainView$$State mainView$$State) {
            super("onNotificationCount", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14341c2();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnPermBannedCommand extends ViewCommand<MainView> {
        public OnPermBannedCommand(MainView$$State mainView$$State) {
            super("onPermBanned", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14339V3();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnShowLoadingViewCommand extends ViewCommand<MainView> {
        public OnShowLoadingViewCommand(MainView$$State mainView$$State) {
            super("onShowLoadingView", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14345h();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnShowRateAppCommand extends ViewCommand<MainView> {
        public OnShowRateAppCommand(MainView$$State mainView$$State) {
            super("onShowRateApp", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14336M3();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnShowSubscribeVKCommand extends ViewCommand<MainView> {
        public OnShowSubscribeVKCommand(MainView$$State mainView$$State) {
            super("onShowSubscribeVK", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14347l3();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnShowTooltipBookmarksCommand extends ViewCommand<MainView> {
        public OnShowTooltipBookmarksCommand(MainView$$State mainView$$State) {
            super("onShowTooltipBookmarks", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14351o3();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnShowTooltipNewSectionCollectionCommand extends ViewCommand<MainView> {
        public OnShowTooltipNewSectionCollectionCommand(MainView$$State mainView$$State) {
            super("onShowTooltipNewSectionCollection", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14353x2();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnVkAlreadyBoundCommand extends ViewCommand<MainView> {
        public OnVkAlreadyBoundCommand(MainView$$State mainView$$State) {
            super("onVkAlreadyBound", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14335F1();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnVkLoginFailedCommand extends ViewCommand<MainView> {
        public OnVkLoginFailedCommand(MainView$$State mainView$$State) {
            super("onVkLoginFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14349o0();
        }
    }

    /* compiled from: MainView$$State.java */
    public class OnVkNotBoundCommand extends ViewCommand<MainView> {
        public OnVkNotBoundCommand(MainView$$State mainView$$State) {
            super("onVkNotBound", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(MainView mainView) {
            mainView.mo14344g1();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: F1 */
    public void mo14335F1() {
        OnVkAlreadyBoundCommand onVkAlreadyBoundCommand = new OnVkAlreadyBoundCommand(this);
        this.viewCommands.beforeApply(onVkAlreadyBoundCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14335F1();
        }
        this.viewCommands.afterApply(onVkAlreadyBoundCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: M3 */
    public void mo14336M3() {
        OnShowRateAppCommand onShowRateAppCommand = new OnShowRateAppCommand(this);
        this.viewCommands.beforeApply(onShowRateAppCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14336M3();
        }
        this.viewCommands.afterApply(onShowRateAppCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: P */
    public void mo14337P() {
        OnInvalidRequestCommand onInvalidRequestCommand = new OnInvalidRequestCommand(this);
        this.viewCommands.beforeApply(onInvalidRequestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14337P();
        }
        this.viewCommands.afterApply(onInvalidRequestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: S2 */
    public void mo14338S2() {
        OnAuthCommand onAuthCommand = new OnAuthCommand(this);
        this.viewCommands.beforeApply(onAuthCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14338S2();
        }
        this.viewCommands.afterApply(onAuthCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: V3 */
    public void mo14339V3() {
        OnPermBannedCommand onPermBannedCommand = new OnPermBannedCommand(this);
        this.viewCommands.beforeApply(onPermBannedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14339V3();
        }
        this.viewCommands.afterApply(onPermBannedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: Y1 */
    public void mo14340Y1() {
        OnGoogleNotBoundCommand onGoogleNotBoundCommand = new OnGoogleNotBoundCommand(this);
        this.viewCommands.beforeApply(onGoogleNotBoundCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14340Y1();
        }
        this.viewCommands.afterApply(onGoogleNotBoundCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: c2 */
    public void mo14341c2() {
        OnNotificationCountCommand onNotificationCountCommand = new OnNotificationCountCommand(this);
        this.viewCommands.beforeApply(onNotificationCountCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14341c2();
        }
        this.viewCommands.afterApply(onNotificationCountCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: e0 */
    public void mo14342e0() {
        OnImmediateUpdateCommand onImmediateUpdateCommand = new OnImmediateUpdateCommand(this);
        this.viewCommands.beforeApply(onImmediateUpdateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14342e0();
        }
        this.viewCommands.afterApply(onImmediateUpdateCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: f1 */
    public void mo14343f1() {
        OnCheckForInAppUpdatesCommand onCheckForInAppUpdatesCommand = new OnCheckForInAppUpdatesCommand(this);
        this.viewCommands.beforeApply(onCheckForInAppUpdatesCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14343f1();
        }
        this.viewCommands.afterApply(onCheckForInAppUpdatesCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: g1 */
    public void mo14344g1() {
        OnVkNotBoundCommand onVkNotBoundCommand = new OnVkNotBoundCommand(this);
        this.viewCommands.beforeApply(onVkNotBoundCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14344g1();
        }
        this.viewCommands.afterApply(onVkNotBoundCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: h */
    public void mo14345h() {
        OnShowLoadingViewCommand onShowLoadingViewCommand = new OnShowLoadingViewCommand(this);
        this.viewCommands.beforeApply(onShowLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14345h();
        }
        this.viewCommands.afterApply(onShowLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: j */
    public void mo14346j() {
        OnHideLoadingViewCommand onHideLoadingViewCommand = new OnHideLoadingViewCommand(this);
        this.viewCommands.beforeApply(onHideLoadingViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14346j();
        }
        this.viewCommands.afterApply(onHideLoadingViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: l3 */
    public void mo14347l3() {
        OnShowSubscribeVKCommand onShowSubscribeVKCommand = new OnShowSubscribeVKCommand(this);
        this.viewCommands.beforeApply(onShowSubscribeVKCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14347l3();
        }
        this.viewCommands.afterApply(onShowSubscribeVKCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: n1 */
    public void mo14348n1() {
        OnGoogleAlreadyBoundCommand onGoogleAlreadyBoundCommand = new OnGoogleAlreadyBoundCommand(this);
        this.viewCommands.beforeApply(onGoogleAlreadyBoundCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14348n1();
        }
        this.viewCommands.afterApply(onGoogleAlreadyBoundCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: o0 */
    public void mo14349o0() {
        OnVkLoginFailedCommand onVkLoginFailedCommand = new OnVkLoginFailedCommand(this);
        this.viewCommands.beforeApply(onVkLoginFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14349o0();
        }
        this.viewCommands.afterApply(onVkLoginFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: o1 */
    public void mo14350o1() {
        OnAndroidTvHintCommand onAndroidTvHintCommand = new OnAndroidTvHintCommand(this);
        this.viewCommands.beforeApply(onAndroidTvHintCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14350o1();
        }
        this.viewCommands.afterApply(onAndroidTvHintCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: o3 */
    public void mo14351o3() {
        OnShowTooltipBookmarksCommand onShowTooltipBookmarksCommand = new OnShowTooltipBookmarksCommand(this);
        this.viewCommands.beforeApply(onShowTooltipBookmarksCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14351o3();
        }
        this.viewCommands.afterApply(onShowTooltipBookmarksCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: w0 */
    public void mo14352w0() {
        OnGoogleLoginFailedCommand onGoogleLoginFailedCommand = new OnGoogleLoginFailedCommand(this);
        this.viewCommands.beforeApply(onGoogleLoginFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14352w0();
        }
        this.viewCommands.afterApply(onGoogleLoginFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.MainView
    /* renamed from: x2 */
    public void mo14353x2() {
        OnShowTooltipNewSectionCollectionCommand onShowTooltipNewSectionCollectionCommand = new OnShowTooltipNewSectionCollectionCommand(this);
        this.viewCommands.beforeApply(onShowTooltipNewSectionCollectionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((MainView) it.next()).mo14353x2();
        }
        this.viewCommands.afterApply(onShowTooltipNewSectionCollectionCommand);
    }
}
