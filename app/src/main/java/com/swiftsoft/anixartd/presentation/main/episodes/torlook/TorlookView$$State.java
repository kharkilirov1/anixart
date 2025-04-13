package com.swiftsoft.anixartd.presentation.main.episodes.torlook;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class TorlookView$$State extends MvpViewState<TorlookView> implements TorlookView {

    /* compiled from: TorlookView$$State.java */
    public class OnFailedCommand extends ViewCommand<TorlookView> {
        public OnFailedCommand(TorlookView$$State torlookView$$State) {
            super("onFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14626c();
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<TorlookView> {
        public OnHideProgressViewCommand(TorlookView$$State torlookView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14624a();
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<TorlookView> {
        public OnHideRefreshViewCommand(TorlookView$$State torlookView$$State) {
            super("onHideRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14628e();
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnLinkCommand extends ViewCommand<TorlookView> {

        /* renamed from: a */
        public final String f26363a;

        public OnLinkCommand(TorlookView$$State torlookView$$State, String str) {
            super("onLink", OneExecutionStateStrategy.class);
            this.f26363a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14623N0(this.f26363a);
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnMagnetLinkCommand extends ViewCommand<TorlookView> {

        /* renamed from: a */
        public final String f26364a;

        public OnMagnetLinkCommand(TorlookView$$State torlookView$$State, String str) {
            super("onMagnetLink", OneExecutionStateStrategy.class);
            this.f26364a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14630n0(this.f26364a);
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnMagnetLinkFailedCommand extends ViewCommand<TorlookView> {
        public OnMagnetLinkFailedCommand(TorlookView$$State torlookView$$State) {
            super("onMagnetLinkFailed", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14631t1();
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<TorlookView> {
        public OnShowProgressViewCommand(TorlookView$$State torlookView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14625b();
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<TorlookView> {
        public OnShowRefreshViewCommand(TorlookView$$State torlookView$$State) {
            super("onShowRefreshView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14627d();
        }
    }

    /* compiled from: TorlookView$$State.java */
    public class OnUpdateSearchQueryTextCommand extends ViewCommand<TorlookView> {

        /* renamed from: a */
        public final String f26365a;

        public OnUpdateSearchQueryTextCommand(TorlookView$$State torlookView$$State, String str) {
            super("onUpdateSearchQueryText", OneExecutionStateStrategy.class);
            this.f26365a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(TorlookView torlookView) {
            torlookView.mo14629m2(this.f26365a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: N0 */
    public void mo14623N0(String str) {
        OnLinkCommand onLinkCommand = new OnLinkCommand(this, str);
        this.viewCommands.beforeApply(onLinkCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14623N0(str);
        }
        this.viewCommands.afterApply(onLinkCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: a */
    public void mo14624a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14624a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: b */
    public void mo14625b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14625b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: c */
    public void mo14626c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14626c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: d */
    public void mo14627d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14627d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: e */
    public void mo14628e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14628e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: m2 */
    public void mo14629m2(String str) {
        OnUpdateSearchQueryTextCommand onUpdateSearchQueryTextCommand = new OnUpdateSearchQueryTextCommand(this, str);
        this.viewCommands.beforeApply(onUpdateSearchQueryTextCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14629m2(str);
        }
        this.viewCommands.afterApply(onUpdateSearchQueryTextCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: n0 */
    public void mo14630n0(String str) {
        OnMagnetLinkCommand onMagnetLinkCommand = new OnMagnetLinkCommand(this, str);
        this.viewCommands.beforeApply(onMagnetLinkCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14630n0(str);
        }
        this.viewCommands.afterApply(onMagnetLinkCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.episodes.torlook.TorlookView
    /* renamed from: t1 */
    public void mo14631t1() {
        OnMagnetLinkFailedCommand onMagnetLinkFailedCommand = new OnMagnetLinkFailedCommand(this);
        this.viewCommands.beforeApply(onMagnetLinkFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((TorlookView) it.next()).mo14631t1();
        }
        this.viewCommands.afterApply(onMagnetLinkFailedCommand);
    }
}
