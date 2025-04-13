package com.swiftsoft.anixartd.presentation.main.update;

import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleTagStrategy;

/* loaded from: classes2.dex */
public class UpdateView$$State extends MvpViewState<UpdateView> implements UpdateView {

    /* compiled from: UpdateView$$State.java */
    public class OnFailedCommand extends ViewCommand<UpdateView> {
        public OnFailedCommand(UpdateView$$State updateView$$State) {
            super("onFailed", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(UpdateView updateView) {
            updateView.mo15253c();
        }
    }

    /* compiled from: UpdateView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<UpdateView> {
        public OnHideProgressViewCommand(UpdateView$$State updateView$$State) {
            super("onHideProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(UpdateView updateView) {
            updateView.mo15251a();
        }
    }

    /* compiled from: UpdateView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<UpdateView> {
        public OnShowProgressViewCommand(UpdateView$$State updateView$$State) {
            super("onShowProgressView", AddToEndSingleTagStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(UpdateView updateView) {
            updateView.mo15252b();
        }
    }

    /* compiled from: UpdateView$$State.java */
    public class OnUpdateCommand extends ViewCommand<UpdateView> {

        /* renamed from: a */
        public final boolean f27279a;

        /* renamed from: b */
        public final int f27280b;

        /* renamed from: c */
        public final int f27281c;

        /* renamed from: d */
        public final String f27282d;

        /* renamed from: e */
        public final String f27283e;

        public OnUpdateCommand(UpdateView$$State updateView$$State, boolean z, int i2, int i3, String str, String str2) {
            super("onUpdate", AddToEndSingleTagStrategy.class);
            this.f27279a = z;
            this.f27280b = i2;
            this.f27281c = i3;
            this.f27282d = str;
            this.f27283e = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(UpdateView updateView) {
            updateView.mo15254g4(this.f27279a, this.f27280b, this.f27281c, this.f27282d, this.f27283e);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: a */
    public void mo15251a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((UpdateView) it.next()).mo15251a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: b */
    public void mo15252b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((UpdateView) it.next()).mo15252b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: c */
    public void mo15253c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((UpdateView) it.next()).mo15253c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.update.UpdateView
    /* renamed from: g4 */
    public void mo15254g4(boolean z, int i2, int i3, String str, String str2) {
        OnUpdateCommand onUpdateCommand = new OnUpdateCommand(this, z, i2, i3, str, str2);
        this.viewCommands.beforeApply(onUpdateCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((UpdateView) it.next()).mo15254g4(z, i2, i3, str, str2);
        }
        this.viewCommands.afterApply(onUpdateCommand);
    }
}
