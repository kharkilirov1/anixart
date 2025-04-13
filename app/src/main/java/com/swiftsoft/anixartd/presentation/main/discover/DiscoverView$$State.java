package com.swiftsoft.anixartd.presentation.main.discover;

import com.swiftsoft.anixartd.database.entity.Release;
import java.util.Iterator;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;

/* loaded from: classes2.dex */
public class DiscoverView$$State extends MvpViewState<DiscoverView> implements DiscoverView {

    /* compiled from: DiscoverView$$State.java */
    public class OnCollectionIdCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final long f26250a;

        public OnCollectionIdCommand(DiscoverView$$State discoverView$$State, long j2) {
            super("onCollectionId", OneExecutionStateStrategy.class);
            this.f26250a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14553I1(this.f26250a);
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnFailedCommand extends ViewCommand<DiscoverView> {
        public OnFailedCommand(DiscoverView$$State discoverView$$State) {
            super("onFailed", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14558c();
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnHideProgressViewCommand extends ViewCommand<DiscoverView> {
        public OnHideProgressViewCommand(DiscoverView$$State discoverView$$State) {
            super("onHideProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14556a();
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnHideRefreshViewCommand extends ViewCommand<DiscoverView> {
        public OnHideRefreshViewCommand(DiscoverView$$State discoverView$$State) {
            super("onHideRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14560e();
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnInterestCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final long f26251a;

        /* renamed from: b */
        public final int f26252b;

        /* renamed from: c */
        public final String f26253c;

        public OnInterestCommand(DiscoverView$$State discoverView$$State, long j2, int i2, String str) {
            super("onInterest", OneExecutionStateStrategy.class);
            this.f26251a = j2;
            this.f26252b = i2;
            this.f26253c = str;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14563q0(this.f26251a, this.f26252b, this.f26253c);
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnLoadedCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final int f26254a;

        /* renamed from: b */
        public final int f26255b;

        /* renamed from: c */
        public final int f26256c;

        /* renamed from: d */
        public final int f26257d;

        /* renamed from: e */
        public final int f26258e;

        /* renamed from: f */
        public final int f26259f;

        public OnLoadedCommand(DiscoverView$$State discoverView$$State, int i2, int i3, int i4, int i5, int i6, int i7) {
            super("onLoaded", AddToEndStrategy.class);
            this.f26254a = i2;
            this.f26255b = i3;
            this.f26256c = i4;
            this.f26257d = i5;
            this.f26258e = i6;
            this.f26259f = i7;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14554J2(this.f26254a, this.f26255b, this.f26256c, this.f26257d, this.f26258e, this.f26259f);
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnProfileCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final long f26260a;

        public OnProfileCommand(DiscoverView$$State discoverView$$State, long j2) {
            super("onProfile", OneExecutionStateStrategy.class);
            this.f26260a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14561f(this.f26260a);
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnReleaseCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final Release f26261a;

        public OnReleaseCommand(DiscoverView$$State discoverView$$State, Release release) {
            super("onRelease", OneExecutionStateStrategy.class);
            this.f26261a = release;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14562i(this.f26261a);
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnReleaseIdCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final long f26262a;

        public OnReleaseIdCommand(DiscoverView$$State discoverView$$State, long j2) {
            super("onReleaseId", OneExecutionStateStrategy.class);
            this.f26262a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14555M2(this.f26262a);
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnShowProgressViewCommand extends ViewCommand<DiscoverView> {
        public OnShowProgressViewCommand(DiscoverView$$State discoverView$$State) {
            super("onShowProgressView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14557b();
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnShowRefreshViewCommand extends ViewCommand<DiscoverView> {
        public OnShowRefreshViewCommand(DiscoverView$$State discoverView$$State) {
            super("onShowRefreshView", AddToEndStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14559d();
        }
    }

    /* compiled from: DiscoverView$$State.java */
    public class OnSuperMenuCommand extends ViewCommand<DiscoverView> {

        /* renamed from: a */
        public final long f26263a;

        public OnSuperMenuCommand(DiscoverView$$State discoverView$$State, long j2) {
            super("onSuperMenu", OneExecutionStateStrategy.class);
            this.f26263a = j2;
        }

        @Override // moxy.viewstate.ViewCommand
        public void apply(DiscoverView discoverView) {
            discoverView.mo14564r2(this.f26263a);
        }
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: I1 */
    public void mo14553I1(long j2) {
        OnCollectionIdCommand onCollectionIdCommand = new OnCollectionIdCommand(this, j2);
        this.viewCommands.beforeApply(onCollectionIdCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14553I1(j2);
        }
        this.viewCommands.afterApply(onCollectionIdCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: J2 */
    public void mo14554J2(int i2, int i3, int i4, int i5, int i6, int i7) {
        OnLoadedCommand onLoadedCommand = new OnLoadedCommand(this, i2, i3, i4, i5, i6, i7);
        this.viewCommands.beforeApply(onLoadedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14554J2(i2, i3, i4, i5, i6, i7);
        }
        this.viewCommands.afterApply(onLoadedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: M2 */
    public void mo14555M2(long j2) {
        OnReleaseIdCommand onReleaseIdCommand = new OnReleaseIdCommand(this, j2);
        this.viewCommands.beforeApply(onReleaseIdCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14555M2(j2);
        }
        this.viewCommands.afterApply(onReleaseIdCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: a */
    public void mo14556a() {
        OnHideProgressViewCommand onHideProgressViewCommand = new OnHideProgressViewCommand(this);
        this.viewCommands.beforeApply(onHideProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14556a();
        }
        this.viewCommands.afterApply(onHideProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: b */
    public void mo14557b() {
        OnShowProgressViewCommand onShowProgressViewCommand = new OnShowProgressViewCommand(this);
        this.viewCommands.beforeApply(onShowProgressViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14557b();
        }
        this.viewCommands.afterApply(onShowProgressViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: c */
    public void mo14558c() {
        OnFailedCommand onFailedCommand = new OnFailedCommand(this);
        this.viewCommands.beforeApply(onFailedCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14558c();
        }
        this.viewCommands.afterApply(onFailedCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: d */
    public void mo14559d() {
        OnShowRefreshViewCommand onShowRefreshViewCommand = new OnShowRefreshViewCommand(this);
        this.viewCommands.beforeApply(onShowRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14559d();
        }
        this.viewCommands.afterApply(onShowRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: e */
    public void mo14560e() {
        OnHideRefreshViewCommand onHideRefreshViewCommand = new OnHideRefreshViewCommand(this);
        this.viewCommands.beforeApply(onHideRefreshViewCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14560e();
        }
        this.viewCommands.afterApply(onHideRefreshViewCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: f */
    public void mo14561f(long j2) {
        OnProfileCommand onProfileCommand = new OnProfileCommand(this, j2);
        this.viewCommands.beforeApply(onProfileCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14561f(j2);
        }
        this.viewCommands.afterApply(onProfileCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: i */
    public void mo14562i(Release release) {
        OnReleaseCommand onReleaseCommand = new OnReleaseCommand(this, release);
        this.viewCommands.beforeApply(onReleaseCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14562i(release);
        }
        this.viewCommands.afterApply(onReleaseCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: q0 */
    public void mo14563q0(long j2, int i2, String str) {
        OnInterestCommand onInterestCommand = new OnInterestCommand(this, j2, i2, str);
        this.viewCommands.beforeApply(onInterestCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14563q0(j2, i2, str);
        }
        this.viewCommands.afterApply(onInterestCommand);
    }

    @Override // com.swiftsoft.anixartd.presentation.main.discover.DiscoverView
    /* renamed from: r2 */
    public void mo14564r2(long j2) {
        OnSuperMenuCommand onSuperMenuCommand = new OnSuperMenuCommand(this, j2);
        this.viewCommands.beforeApply(onSuperMenuCommand);
        if (hasNotView().booleanValue()) {
            return;
        }
        Iterator it = this.views.iterator();
        while (it.hasNext()) {
            ((DiscoverView) it.next()).mo14564r2(j2);
        }
        this.viewCommands.afterApply(onSuperMenuCommand);
    }
}
