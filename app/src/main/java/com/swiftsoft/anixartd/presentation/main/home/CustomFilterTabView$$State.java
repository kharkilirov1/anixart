package com.swiftsoft.anixartd.presentation.main.home;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class CustomFilterTabView$$State extends MvpViewState<CustomFilterTabView> implements CustomFilterTabView {

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnCustomTabHintCommand extends ViewCommand<CustomFilterTabView> {
        public OnCustomTabHintCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onCustomTabHint", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14674l0();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnCustomTabSettingsCommand extends ViewCommand<CustomFilterTabView> {
        public OnCustomTabSettingsCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onCustomTabSettings", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14664J0();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnFailedCommand extends ViewCommand<CustomFilterTabView> {

        /* renamed from: a */
        public final String f26423a;

        public OnFailedCommand(CustomFilterTabView$$State customFilterTabView$$State, String str) {
            super("onFailed", OneExecutionStateStrategy.class);
            this.f26423a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14670c1(this.f26423a);
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnFullVersionCommand extends ViewCommand<CustomFilterTabView> {
        public OnFullVersionCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onFullVersion", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14665T();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnHideCustomTabInfoCommand extends ViewCommand<CustomFilterTabView> {
        public OnHideCustomTabInfoCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onHideCustomTabInfo", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14662E3();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<CustomFilterTabView> {
        public OnHideProgressViewCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14667a();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<CustomFilterTabView> {
        public OnHideRefreshViewCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14672e();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnImpMessageOpenLinkCommand extends ViewCommand<CustomFilterTabView> {

        /* renamed from: a */
        public final String f26424a;

        public OnImpMessageOpenLinkCommand(CustomFilterTabView$$State customFilterTabView$$State, String str) {
            super("onImpMessageOpenLink", OneExecutionStateStrategy.class);
            this.f26424a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14668a0(this.f26424a);
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnReleaseCommand extends ViewCommand<CustomFilterTabView> {

        /* renamed from: a */
        public final Release f26425a;

        public OnReleaseCommand(CustomFilterTabView$$State customFilterTabView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26425a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14673i(this.f26425a);
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnShowCustomTabInfoCommand extends ViewCommand<CustomFilterTabView> {
        public OnShowCustomTabInfoCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onShowCustomTabInfo", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14663H3();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<CustomFilterTabView> {
        public OnShowProgressViewCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14669b();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<CustomFilterTabView> {
        public OnShowRefreshViewCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14671d();
        }
    }

    /* compiled from: CustomFilterTabView$$State.java */
    public class OnUpdateCommand extends ViewCommand<CustomFilterTabView> {
        public OnUpdateCommand(CustomFilterTabView$$State customFilterTabView$$State) {
            super("onUpdate", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(CustomFilterTabView customFilterTabView) {
            customFilterTabView.mo14666V();
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: E3 */
    public void mo14662E3() {
        OnHideCustomTabInfoCommand onHideCustomTabInfoCommand = new OnHideCustomTabInfoCommand(this);
        this.viewCommands.beforeApply(onHideCustomTabInfoCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14662E3();
        }
        this.viewCommands.afterApply(onHideCustomTabInfoCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: H3 */
    public void mo14663H3() {
        OnShowCustomTabInfoCommand onShowCustomTabInfoCommand = new OnShowCustomTabInfoCommand(this);
        this.viewCommands.beforeApply(onShowCustomTabInfoCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14663H3();
        }
        this.viewCommands.afterApply(onShowCustomTabInfoCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: J0 */
    public void mo14664J0() {
        OnCustomTabSettingsCommand onCustomTabSettingsCommand = new OnCustomTabSettingsCommand(this);
        this.viewCommands.beforeApply(onCustomTabSettingsCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14664J0();
        }
        this.viewCommands.afterApply(onCustomTabSettingsCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: T */
    public void mo14665T() {
        OnFullVersionCommand onFullVersionCommand = new OnFullVersionCommand(this);
        this.viewCommands.beforeApply(onFullVersionCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14665T();
        }
        this.viewCommands.afterApply(onFullVersionCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: V */
    public void mo14666V() {
        OnUpdateCommand onUpdateCommand = new OnUpdateCommand(this);
        this.viewCommands.beforeApply(onUpdateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14666V();
        }
        this.viewCommands.afterApply(onUpdateCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: a */
    public void mo14667a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14667a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: a0 */
    public void mo14668a0(String str) {
        OnImpMessageOpenLinkCommand onImpMessageOpenLinkCommand = new OnImpMessageOpenLinkCommand(this, str);
        this.viewCommands.beforeApply(onImpMessageOpenLinkCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14668a0(str);
        }
        this.viewCommands.afterApply(onImpMessageOpenLinkCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: b */
    public void mo14669b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14669b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: c1 */
    public void mo14670c1(String str) {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this, str);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14670c1(str);
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: d */
    public void mo14671d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14671d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: e */
    public void mo14672e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14672e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: i */
    public void mo14673i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14673i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.home.CustomFilterTabView
    /* renamed from: l0 */
    public void mo14674l0() {
        OnCustomTabHintCommand onCustomTabHintCommand = new OnCustomTabHintCommand(this);
        this.viewCommands.beforeApply(onCustomTabHintCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((CustomFilterTabView) it.next()).mo14674l0();
        }
        this.viewCommands.afterApply(onCustomTabHintCommand);
    }
}
